package com.knoldus.model;

import java.util.stream.Stream;

public class User {
    Integer id;
    String name;
    String address;
    Integer age;

    public User(Integer id, String name, String address, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", address='" + address + '\''
                + ", age=" + age
                + '}';
    }
}
