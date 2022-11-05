package com.server.hng.model;

public class User {
    private String slackUsername;
    private Boolean backend;
    private int age;
    private String bio;

    public User(String slackUsername, Boolean backend, int age, String bio) {
        this.slackUsername = slackUsername;
        this.backend = backend;
        this.age = age;
        this.bio = bio;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public Boolean getBackend() {
        return backend;
    }

    public void setBackend(Boolean backend) {
        this.backend = backend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
