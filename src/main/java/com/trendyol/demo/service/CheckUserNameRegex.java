package com.trendyol.demo.service;

public class CheckUserNameRegex extends UserNameChecker{

    public CheckUserNameRegex(UserNameCheckerManager userNameCheckerManager) {
        super(userNameCheckerManager);
        userNameCheckerManager.addChecker(this);
    }

    @Override
    public boolean check(String userName) {
        if(userName.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Kullanıcı adı büyük ve küçük harf ve sayı içermelidir.";
    }

}
