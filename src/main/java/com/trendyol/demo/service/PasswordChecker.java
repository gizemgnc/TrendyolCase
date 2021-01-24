package com.trendyol.demo.service;

public abstract class PasswordChecker {
    protected String errorMessage;
    abstract boolean check(String password);
    abstract void setErrorMessage();

}
