package com.trendyol.demo.service;

import java.util.ArrayList;
import java.util.List;

public class UserNameCheckerManager {
    private List<UserNameChecker> userNameCheckerList = new ArrayList<>();
    private StringBuilder errorMessageBuilder = new StringBuilder();

    public void addChecker(UserNameChecker userNameChecker) {
        userNameCheckerList.add(userNameChecker);
    }

    public boolean check(String userName) {
        boolean result = true;
        for (UserNameChecker checker : userNameCheckerList) {
            if (!checker.check(userName)) {
                errorMessageBuilder.append(checker.errorMessage);
                result = false;
            }
        }
        return result;
    }

    public StringBuilder getErrorMessageBuilder() {
        return errorMessageBuilder;
    }

}
