package com.userregistrationvalidation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.xml.namespace.QName;

public class UserRegistrationValidationTest {

    UserRegistrationValidation user= new UserRegistrationValidation();
    private Assertions Assert;
    @Test
    // to validate first name
    public void fNValidation() {
        Assert.assertTrue(user.firstName("Yas"));
    }

}
