package com.trendyol.demo.service;

public class CheckIsIncludeUpperCase extends PasswordChecker {

    public CheckIsIncludeUpperCase(PasswordCheckerManager passwordCheckerManager) {
        super(passwordCheckerManager);
        passwordCheckerManager.addChecker(this);
    }

    @Override
    boolean check(String password) {
        if (password.matches("(?=.*[A-Z]).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir büyük harf içermelidir.";
    }
}
