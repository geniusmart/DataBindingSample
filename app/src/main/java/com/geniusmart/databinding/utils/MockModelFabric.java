package com.geniusmart.databinding.utils;

import com.geniusmart.databinding.model.User;

import java.util.ArrayList;
import java.util.List;

public class MockModelFabric {

    public static User newUser(String name) {
        return new User(name, name + "^_^");
    }

    public static List<User> newListOfUser(int num){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(newUser("geniusmart " + i));
        }
        return list;
    }
}
