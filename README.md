java中三种变量 类变量、成员变量、局部变量，类变量存在方法区，成员变量存在堆内存中，局部变量存在栈内存中

三目运算符导致的空指针
```java
public class Test {
    public void unboxing() {
        Integer i = null;
        int j = 1;
        boolean flag = true;
        int rs = flag ? i : j;
        System.out.println(rs);
    }


    public static void main(String[] args) {
        Integer i = null;
        Integer j = 1;
        boolean flag = true;
        Integer rs = flag ? i : j;
        System.out.println(rs);
    }
}
```