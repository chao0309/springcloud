package cn.how2j.springcloud.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Vector;

public class Test {
    public static void main(String[] args) throws  Exception{
        Uesr uesr = new Uesr("wangchao",18);
        Class cl = uesr.getClass();
        Method[] methods = cl.getMethods();
        for(Method m : methods){
            System.out.println(m.toString());
        }
        Field[] fields = cl.getDeclaredFields();
        Field field = cl.getDeclaredField("name");
        field.setAccessible(true);
        field.set(uesr,"waa");
        System.out.println(uesr.getName());
    }
}
