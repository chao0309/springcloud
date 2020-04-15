package cn.how2j.springcloud.test;

public class Uesr {
    private String name;
    private int age;

    public Uesr(){}
    public Uesr(String name,int age){
        this.name = name;
        this.age = age;
    }
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
}
