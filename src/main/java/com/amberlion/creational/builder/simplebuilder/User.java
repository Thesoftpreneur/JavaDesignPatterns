package com.amberlion.creational.builder.simplebuilder;

public class User
{
    //All final attributes

    private final String address; // optional

    private User(UserBuilder builder) {

        this.address = builder.address;
    }

    //All getter, and NO setter to provde immutability

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User:  "+this.address;
    }

    public static class UserBuilder
    {
        private String address;

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        //Return the finally consrcuted User object
        public User build() {
            User user =  new User(this);
            return user;
        }
    }
}