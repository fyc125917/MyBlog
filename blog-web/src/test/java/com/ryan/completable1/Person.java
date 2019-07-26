package com.ryan.completable1;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2019/7/17 17:01
 * @Created by fyc
 */
public class Person {

    private String name;

    private Integer age;

    private boolean sex;

    public Person() {
    }

    public Person(String name, Integer age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}