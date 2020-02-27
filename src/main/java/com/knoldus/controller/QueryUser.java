package com.knoldus.controller;

import com.knoldus.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class QueryUser {
    public static List<User> aboveAgeAndGivenAddress(List<User> listOfUser, Integer aboveAge, String address) {
        return listOfUser.stream().filter(user ->
                user.getAge() > aboveAge && user.getAddress().equalsIgnoreCase(address)).collect(Collectors.toList());
    }

    public static List<User> idAndAge(List<User> listOfUser, Integer aboveId, Integer belowAge) {
        return listOfUser.stream().filter(user ->
                user.getId() > aboveId && user.getAge() < belowAge).collect(Collectors.toList());
    }

    public static List<User> evenAge(List<User> listOfUser) {
        return listOfUser.stream().filter(user -> user.getAge() % 2 == 0).collect(Collectors.toList());
    }

    public static List<User> ageAndAddress(List<User> listOfUser, Integer age, String address) {
        return listOfUser.stream().filter(user ->
                user.getAge().equals(age) && user.getAddress().equalsIgnoreCase(address)).collect(Collectors.toList());
    }
}
