package com.trendyol.demo.service;

public abstract class UserNameChecker {
    private UserNameCheckerManager userNameCheckerManager;
    protected String errorMessage;

    public UserNameChecker(UserNameCheckerManager userNameCheckerManager) {
        this.userNameCheckerManager = userNameCheckerManager;
    }

    abstract boolean check(String userName);

    abstract void setErrorMessage();
}
