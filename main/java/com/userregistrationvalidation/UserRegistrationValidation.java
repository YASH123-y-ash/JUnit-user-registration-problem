package com.userregistrationvalidation;

import java.util.regex.Pattern;

public class UserRegistrationValidation {

    // UC1 - to check first name
    public boolean firstName(String name) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", name) == true);

    }
}
