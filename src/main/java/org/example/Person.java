package org.example;

public class Person {

    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", address=" + address +
                ", age=" + age +
                '}';
    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void show() {
        System.out.println("Name : " + this.getName() + " Address : " + this.getAddress() + " Age : " + this.getAge());
    }
}
