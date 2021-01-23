package com.trendyol.demo.service;

public class SignUpValidityFacade {
    private String userName;
    private String pw ;
    PasswordCheckerManager passwordChecker;
    UserNameCheckerManager usernameChecker;

    public SignUpValidityFacade(String userName,String pw) {
        this.userName = userName;
        this.pw = pw;
        passwordChecker = new PasswordCheckerManager();
        usernameChecker = new UserNameCheckerManager();
        new CheckIsIncludeDigit(passwordChecker);
        new CheckIsIncludeLowerCase(passwordChecker);
        new CheckIsIncludeSpecialChr(passwordChecker);
        new CheckIsIncludeUpperCase(passwordChecker);
        new CheckUserNameLength(usernameChecker);
        new CheckUserNameRegex(usernameChecker);
    }

    public boolean checkValidity (){
        if(usernameChecker.check(userName) &&
                passwordChecker.check(pw) ) return true;
        return false;
    }

    public StringBuilder getErrorMessage(){
        return new StringBuilder()
                .append(usernameChecker.getErrorMessageBuilder())
                .append(passwordChecker.getErrorMessageBuilder());
    }

}
