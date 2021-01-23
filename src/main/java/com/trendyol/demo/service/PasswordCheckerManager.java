package com.trendyol.demo.service;

import java.util.ArrayList;
import java.util.List;

public class PasswordCheckerManager {
    private List<PasswordChecker> passwordCheckerList = new ArrayList<>();
    private StringBuilder errorMessageBuilder = new StringBuilder();

    public void addChecker(PasswordChecker passwordChecker) {
        passwordCheckerList.add(passwordChecker);
    }

    public boolean check(String password) {
        boolean result = true;
        for (PasswordChecker checker : passwordCheckerList) {
            if (!checker.check(password)) {
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
