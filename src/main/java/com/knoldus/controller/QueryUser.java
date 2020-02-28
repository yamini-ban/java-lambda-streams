package com.knoldus.controller;

import com.knoldus.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class QueryUser {

    /**
     * This method lists all the users with age more than given above age
     * and address equals to given address.
     * @param listOfUser to be traversed.
     * @param aboveAge to compare age.
     * @param address to check address.
     * @return list of type user.
     */
    public static List<User> aboveAgeAndGivenAddress(List<User> listOfUser, Integer aboveAge, String address) {
        return listOfUser.stream().filter(user ->
                user.getAge() > aboveAge && user.getAddress().equalsIgnoreCase(address)).collect(Collectors.toList());
    }

    /**
     * The method lists all the users with id above given id and
     * age below given age.
     * @param listOfUser to be traversed.
     * @param aboveId to compare id.
     * @param belowAge to compare age.
     * @return list of type user.
     */
    public static List<User> idAndAge(List<User> listOfUser, Integer aboveId, Integer belowAge) {
        return listOfUser.stream().filter(user ->
                user.getId() > aboveId && user.getAge() < belowAge).collect(Collectors.toList());
    }

    /**
     * This method lists all the users with even age.
     * @param listOfUser to be traversed.
     * @return list of type user.
     */
    public static List<User> evenAge(List<User> listOfUser) {
        return listOfUser.stream().filter(user -> user.getAge() % 2 == 0).collect(Collectors.toList());
    }

    /**
     * This method lists users with given age and address.
     * @param listOfUser to be traversed.
     * @param age to check age.
     * @param address to check address.
     * @return list of type user.
     */
    public static List<User> ageAndAddress(List<User> listOfUser, Integer age, String address) {
        return listOfUser.stream().filter(user ->
                user.getAge().equals(age) && user.getAddress().equalsIgnoreCase(address)).collect(Collectors.toList());
    }
}
