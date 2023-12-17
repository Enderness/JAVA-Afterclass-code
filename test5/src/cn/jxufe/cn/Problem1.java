package cn.jxufe.cn;

import java.lang.reflect.*;

public class Problem1 {
    public static void showMessage(String className) {
        try {
            // 获取类对象
            Class<?> clazz = Class.forName(className);

            // 打印构造方法信息
            printConstructors(clazz);

            // 打印方法信息
            printMethods(clazz);

            // 打印属性信息
            printFields(clazz);

        } catch (ClassNotFoundException e) {
            System.err.println("类未找到：" + className);
        }
    }

    private static void printConstructors(Class<?> clazz) {
        System.out.println("**************************** 构造方法的信息 ****************************");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println();
    }

    private static void printMethods(Class<?> clazz) {
        System.out.println("**************************** 类中方法的信息 ****************************");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println();
    }

    private static void printFields(Class<?> clazz) {
        System.out.println("**************************** 类中属性的信息 ****************************");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showMessage("java.util.ArrayList");
    }
}

