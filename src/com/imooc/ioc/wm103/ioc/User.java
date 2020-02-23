package com.imooc.ioc.wm103.ioc;

/**
 * Created by DreamBoy on 2018/3/17.
 */
public class User {
    public void add() {
        System.out.println("User Add Method.");
    }

    @Override
    public String toString() {
        return "This is a user object.";
    }
}
