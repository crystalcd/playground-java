package com.crystalcd._20210316;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public void boxingAndUnboxing() {
        Integer i = 1; // 自动装箱
        int j = i; // 自动拆箱
        Boolean flagA = true;
        boolean flagB = flagA;
        Byte byteA = 0;
        byte byteB = byteA;
        Short shortA = 0;
        short shortB = shortA;
        Long longA = 0l;
        long longB = longA;
        Float floatA = 0f;
        float floatB = floatA;
        Double doubleA = 0d;
        double doubleB = doubleA;
        Character charA = 'a';
        char charB = charA;
    }

    public static void scene() {
        // 自动装箱拆箱场景
        // 场景一、将基本数据类型放入集合类中
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // 场景二、包装类型和基本数据类型比较
        Integer a = 1;
        System.out.println(a == 1 ? "等于" : "不等于");
        Boolean b = false;
        System.out.println(b == false ? "等于" : "不等于");

        // 场景三、包装类型的基本运算
        Integer integerA = 0;
        Integer integerB = 1;
        System.out.println(integerA + integerB);

        // 场景四、三目运算的使用
        boolean flag = true;
        Integer i = null;
        int j = 1;
        int k = flag ? i : j;
    }

    // 场景五、方法参数与返回值
    public int unboxing(Integer i) {
        return i;
    }

    public Integer boxing(int i) {
        return i;
    }

    public static void main(String[] args) {
//        Test.scene();

        Integer integer1 = 3;
        Integer integer2 = 3;

        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        Integer integer3 = 300;
        Integer integer4 = 300;

        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");

        Integer integer5 = new Integer(3);
        Integer integer6 = new Integer(3);

        if (integer5 == integer6)
            System.out.println("integer5 == integer6");
        else
            System.out.println("integer5 != integer6");

        Boolean flagA = false;
        Boolean flagB = false;
        System.out.println(flagA == flagB);
    }
}
