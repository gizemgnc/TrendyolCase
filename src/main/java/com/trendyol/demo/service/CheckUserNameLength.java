package com.trendyol.demo.service;

public class CheckUserNameLength extends UserNameChecker {

    public CheckUserNameLength(UserNameCheckerManager userNameCheckerManager) {
        userNameCheckerManager.addChecker(this);
    }

    @Override
    public boolean check(String userName) {
        if (userName.length() < 15) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Kullanıcı adı en fazla 15 karakterli olabilir.";
    }
}
