package com.trendyol.demo.service;

public class CheckIsIncludeLowerCase extends PasswordChecker {

    public CheckIsIncludeLowerCase(PasswordCheckerManager passwordCheckerManager) {
        super(passwordCheckerManager);
        passwordCheckerManager.addChecker(this);
    }

    @Override
    boolean check(String password) {
        if (password.matches("^(?=.*[a-z]).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir küçük harf içermelidir.";
    }
}
