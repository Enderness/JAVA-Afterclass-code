package cn.jxufe.cn;

import java.lang.reflect.Field;

public class Problem3 {

    public static Object createObject(String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 解析字符串
        String[] parts = str.split(";");
        String className = null;
        String[] propertyStrings = new String[parts.length - 1];
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i].trim();
            if (i == 0) {
                className = part.split(":")[1].trim();
            } else {
                propertyStrings[i - 1] = part;
            }
        }

        // 通过反射创建对象
        Class<?> clazz = Class.forName(className);
        Object obj = clazz.newInstance();

        // 设置属性值
        for (String propertyString : propertyStrings) {
            String[] propertyParts = propertyString.split(":");
            String propertyName = propertyParts[0].trim();
            String propertyValue = propertyParts[1].trim();

            // 使用反射设置属性值
            try {
                Field field = clazz.getDeclaredField(propertyName);
                field.setAccessible(true);

                // 根据属性类型进行转换，这里简单处理了字符串、整数和布尔类型
                Class<?> fieldType = field.getType();
                if (fieldType == String.class) {
                    field.set(obj, propertyValue);
                } else if (fieldType == int.class || fieldType == Integer.class) {
                    field.set(obj, Integer.parseInt(propertyValue));
                } else if (fieldType == boolean.class || fieldType == Boolean.class) {
                    field.set(obj, Boolean.parseBoolean(propertyValue));
                }
            } catch (NoSuchFieldException ignored) {
                // 忽略未找到的属性
            }
        }

        return obj;
    }

    // 示例类
    public static class ExampleClass {
        private String name;
        private int age;
        private boolean isActive;

        // Getters and setters...

        @Override
        public String toString() {
            return "ExampleClass{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", isActive=" + isActive +
                    '}';
        }
    }

    public static void main(String[] args) {
        try {
            // 示例字符串
            String inputString = "className:cn.jxufe.cn.Problem3$ExampleClass; name:张三; age:18; isActive:true;";

            // 创建对象
            Object createdObject = createObject(inputString);

            // 输出对象信息
            System.out.println(createdObject);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
