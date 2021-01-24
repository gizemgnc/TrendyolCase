package com.trendyol.demo.service;

public class CheckIsIncludeSpecialChr extends PasswordChecker {

    public CheckIsIncludeSpecialChr(PasswordCheckerManager passwordCheckerManager) {
        passwordCheckerManager.addChecker(this);
    }

    @Override
    boolean check(String password) {
        if (password.matches("^(?=.*[@#$%^!&+=]).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir özel karakter içermelidir";
    }
}
