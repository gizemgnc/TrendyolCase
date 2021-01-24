package com.trendyol.demo.service;

public abstract class UserNameChecker {
    protected String errorMessage;
    abstract boolean check(String userName);
    abstract void setErrorMessage();
}
