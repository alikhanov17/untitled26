package com.company;

public class User {
    String name;
    int age;
    String address;
    int password;


    public User() {
    }


    public User(String name, int age, String address, int password) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.password = password;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


}
