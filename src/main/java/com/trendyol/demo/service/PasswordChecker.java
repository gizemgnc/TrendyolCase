package com.trendyol.demo.service;

public abstract class PasswordChecker {
    private PasswordCheckerManager passwordCheckerManager;
    protected String errorMessage;

    public PasswordChecker(PasswordCheckerManager passwordCheckerManager) {
        this.passwordCheckerManager = passwordCheckerManager;
    }

    abstract boolean check(String password);

    abstract void setErrorMessage();

}
