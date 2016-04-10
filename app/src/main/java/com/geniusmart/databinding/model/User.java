package com.geniusmart.databinding.model;

import android.databinding.BaseObservable;

public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    public boolean isFriend = true;
    public boolean isAdult = true;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, boolean isFriend) {
        this(firstName, lastName);
        this.isFriend = isFriend;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
