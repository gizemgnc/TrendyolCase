package com.trendyol.demo.service;

public class CheckIsIncludeDigit extends PasswordChecker {

    public CheckIsIncludeDigit(PasswordCheckerManager passwordCheckerManager) {
        super(passwordCheckerManager);
        passwordCheckerManager.addChecker(this);
    }

    @Override
    boolean check(String password) {
        if (password.matches("^(?=.*\\d).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir rakam içermelidir.";
    }
}
