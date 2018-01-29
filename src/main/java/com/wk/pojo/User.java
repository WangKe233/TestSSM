package com.wk.pojo;

/**
 * Created by WK on 2018/1/25.
 */
public class User {
    private int userId;
    private String user_name;
    private int age;

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", user_name='" + user_name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String password;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
