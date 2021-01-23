package com.trendyol.demo.service;

public class CheckUserNameRegex extends UserNameChecker{

    public CheckUserNameRegex(UserNameCheckerManager userNameCheckerManager) {
        super(userNameCheckerManager);
        userNameCheckerManager.addChecker(this);
    }

    @Override
    public boolean check(String userName) {
        if(userName.matches("(?=.*[a-zA-Z0-9.\\-_]).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Kullanıcı adı büyük ve küçük harf ve sayı içermelidir.";
    }

}
