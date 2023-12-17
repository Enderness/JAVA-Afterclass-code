package cn.jxufe.cn;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Problem2  {
    public static void setProperty(Object obj, String propertyName, Object value) {
        try {
            // 获取对象的类
            Class<?> clazz = obj.getClass();


            String setterMethodName = "set" + capitalize(propertyName);
            Method setterMethod = findSetterMethod(clazz, setterMethodName);

            if (setterMethod != null) {
                setterMethod.invoke(obj, value);
                System.out.println("属性 " + propertyName + " 设置成功");
            } else {

                Field field = clazz.getDeclaredField(propertyName);
                field.setAccessible(true);
                field.set(obj, value);
                System.out.println("属性 " + propertyName + " 设置成功");
            }

        } catch (Exception e) {
            System.err.println("设置属性值时发生异常：" + e.getMessage());
        }
    }

    private static Method findSetterMethod(Class<?> clazz, String setterMethodName) {
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(setterMethodName) && method.getParameterCount() == 1) {
                return method;
            }
        }
        return null;
    }

    private static String capitalize(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("修改前：" + person);


        setProperty(person, "name", "John Doe");
        setProperty(person, "age", 25);

        System.out.println("修改后：" + person);
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
