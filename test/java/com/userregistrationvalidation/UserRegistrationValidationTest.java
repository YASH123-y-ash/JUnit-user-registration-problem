package com.userregistrationvalidation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.xml.namespace.QName;

public class UserRegistrationValidationTest {

    UserRegistrationValidation user= new UserRegistrationValidation();
    private Assertions Assert;
    @Test
    //UC1-to validate first name
    public void fNValidation() {
        Assert.assertTrue(user.firstName("Yash"));
    }
    @Test
    //UC1-to validate first name
    public void givenFirstName_WhereLowerCase_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.firstName("yas");
        Assert.assertEquals(false, check);
    }
    @Test
    // UC2-to validate last name if first letter is in upperCase
    public void givenLastName_WhereCapitaLetter_ShouldReturnTrue()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.lastName("Ward");
        Assert.assertEquals(true,check);
    }
    @Test
    //UC2-to validate last name if first letter is in lowerCase
    public void givenLastName_WhereLowerCase_ShouldReturnFalse()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.lastName("wardhan");
        Assert.assertEquals(false,check);
    }
    @Test
    //UC3-to validate emailID
    public void givenEmailId_ShouldReturnTrue()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.emailId("wardhan123@gmail.com");
        Assert.assertEquals(true,check);
    }

    @Test
    // UC4-validating mobile number with country code followed by space and number
    public void givenMobileNumber_ShouldReturnTrue()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.mobileNo("91 9134567872");
        Assert.assertEquals(true,check);
    }
    //UC4-validating mobile number without country code followed by space
    @Test
    public void givenMobileNumber_ShouldReturnFalse()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.mobileNo("9123456624");
        Assert.assertEquals(false,check);
    }

    @Test
    //UC5-validating for password with minimum 8 characters should return true
    public void givenPassword_ShouldReturnTrue()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.passwordCheck("qwerty123@");
        Assert.assertEquals(true,check);
    }
    @Test
    //UC5-validating password having less than 8 characters should return false
    public void givenPassword_ShouldReturnFalse()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.passwordCheck("yetet@");
        Assert.assertEquals(false,check);
    }
    @Test
    //UC6-validating password having minimum 1 upperCase character should return true
    public void givenPassword_ForMinimumOneUpperCase_ShouldReturnTrue()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.passwordCheck_ForAtLeast_OneUpperCase("Qwerty123@");
        Assert.assertEquals(true,check);
    }
    @Test
    //UC6-validating password having no upperCase character should return false
    public void givenPassword_WithNoUpperCase_ShouldReturnFalse()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.passwordCheck_ForAtLeast_OneUpperCase("qwerty123@");
        Assert.assertEquals(false,check);
    }

    @Test
    /*UC-7-validating password having minimum 8 character
     * password having minimum 1 upperCase character and
     * password will have minimum 1 numeric value
     */
    public void givenPassword_WithMinimumOneNumber_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        boolean check = userRegistrationValidation.passwordCheck_ForAtLeast_OneNumericCharacter("Qwerty123@");
        Assert.assertEquals(true, check);
    }
}
