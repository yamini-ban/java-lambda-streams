package com.knoldus;

import com.knoldus.controller.QueryUser;
import com.knoldus.model.Sum;
import com.knoldus.model.User;
import com.knoldus.utilities.Query;

import java.util.Arrays;
import java.util.List;


public class AppDriver {
    public static void main(String[] args) {
        System.out.println("**********Question 1**********");
        Sum add = ((num1, num2, num3, num4, num5) -> (num1 + num2 + num3 + num4 + num5));
        System.out.println("Functional Interface Implemented: " + add.sum(1, 2, 3, 4, 5));

        System.out.println("**********Question 2**********");
        List<String> cities = Arrays.asList("Delhi", "Chandigarh", "New Delhi", "Ahmadabad", "Dwarka", "Chapra");
        System.out.println("Cities Starting With 'c'= " + Query.startWith(cities, "c"));

        System.out.println("**********Question 3**********");
        List<Integer> list1 = Arrays.asList(2, 1, 4, 9, 10);
        List<Integer> list2 = Arrays.asList(0, 5, 1, 9, -1);
        System.out.println("Product of two lists= " + Query.multiply(list1, list2));

        System.out.println("**********Question 4**********");
        User user1 = new User(12, "Chandler", "paris", 20);
        User user2 = new User(9, "Phoebe", "delhi", 30);
        User user3 = new User(1, "Rachel", "delhi", 15);
        User user4 = new User(6, "Monica", "las vegas", 10);
        User user5 = new User(13, "Ross", "texas", 18);
        User user6 = new User(23, "Joey", "california", 33);
        User user7 = new User(5, "Gunther", "los angeles", 30);
        User user8 = new User(10, "Janice", "delhi", 18);

        List<User> listOfUser = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8);

        System.out.println("\nQuery 1. Above age= 18 and address= Delhi"
                + QueryUser.aboveAgeAndGivenAddress(listOfUser, 18, "delhi"));

        System.out.println("\nQuery 2. Above id= 10 and below age= 20"
                + QueryUser.idAndAge(listOfUser, 10, 20));

        System.out.println("\nQuery 3. Age as even number"
                + QueryUser.evenAge(listOfUser));

        System.out.println("\nQuery 4. Age= 18 and address= Delhi"
                + QueryUser.ageAndAddress(listOfUser, 18, "DeLhI"));

    }

}
