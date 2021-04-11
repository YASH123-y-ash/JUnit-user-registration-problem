package com.userregistrationvalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationValidationTest {

    UserRegistrationValidation user= new UserRegistrationValidation();

    @Test
    //UC1-to validate first name should return Happy
    public void firstNameValidation_ShouldReturnHappy() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String result = userRegistrationValidation.firstName("Yash");
        Assertions.assertEquals("Happy",result);
    }
    @Test
    //UC1-to validate first name should return Sad
    public void givenFirstName_WhereLowerCase_ShouldReturnSad() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String  result = userRegistrationValidation.firstName("yas");
        Assertions.assertEquals("Sad", result);
    }

    @Test
    // UC2-to validate last name if first letter is in upperCase should retrun happy
    public void givenLastName_WhereCapitaLetter_ShouldReturnHappy()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String result = userRegistrationValidation.lastName("Ward");
        Assertions.assertEquals("Happy",result);
    }

    @Test
    //UC2-to validate last name if first letter is in lowerCase should return sad
    public void givenLastName_WhereLowerCase_ShouldReturnSad()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String result = userRegistrationValidation.lastName("wardhan");
        Assertions.assertEquals("Sad",result);
    }

    @Test
    //UC3-to validate emailID should return Happy
    public void givenEmailId_ShouldReturnHappy()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String  result = userRegistrationValidation.emailId("wardhan123@gmail.com");
        Assertions.assertEquals("Happy",result);
    }

    @Test
    //UC3-to validate emailID should return Sad
    public void givenEmailId_ShouldReturnSad()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String  result = userRegistrationValidation.emailId("@123@gmail.com");
        Assertions.assertEquals("Sad",result);
    }

    @Test
    // UC4-validating mobile number with country code followed by space and number should return Happy
    public void givenMobileNumber_ShouldReturnHappy()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String check = userRegistrationValidation.mobileNo("91 9134567872");
        Assertions.assertEquals("Happy",check);
    }

    //UC4-validating mobile number without country code followed by space should return Sad
    @Test
    public void givenMobileNumber_ShouldReturnSad()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String check = userRegistrationValidation.mobileNo("9123456624");
        Assertions.assertEquals("Sad",check);
    }

    @Test
    //UC5-validating for password with minimum 8 characters should return Happy
    public void givenPassword_ShouldReturnHappy()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String check = userRegistrationValidation.passwordCheck("qwerty123@");
        Assertions.assertEquals("Happy",check);
    }

    @Test
    //UC5-validating password having less than 8 characters should return Sad
    public void givenPassword_ShouldReturnSad()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String check = userRegistrationValidation.passwordCheck("yetet@");
        Assertions.assertEquals("Sad",check);
    }

    @Test
    //UC6-validating password having minimum 1 upperCase character should return Happy
    public void givenPassword_ForMinimumOneUpperCase_ShouldReturnHappy()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String check = userRegistrationValidation.passwordCheck_ForAtLeast_OneUpperCase("Qwerty123@");
        Assertions.assertEquals("Happy",check);
    }

    @Test
    //UC6-validating password having no upperCase character should return Sad
    public void givenPassword_WithNoUpperCase_ShouldReturnSad()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String check = userRegistrationValidation.passwordCheck_ForAtLeast_OneUpperCase("qwerty123@");
        Assertions.assertEquals("Sad",check);
    }

    @Test
    /*UC7-validating password having minimum 8 character
     * password having minimum 1 upperCase character and
     * password will have minimum 1 numeric value
     */
    public void givenPassword_WithMinimumOneNumber_ShouldReturnHappy() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String check = userRegistrationValidation.passwordCheck_ForAtLeast_OneNumericCharacter("Qwerty123@");
        Assertions.assertEquals("Happy", check);
    }

    @Test
    /*UC8-validating password for exactly one special character should return true
    * and all rule should passed
    */
    public void givenPassword_WithExactlyOneSpecialCharacter_ShouldReturnHappy()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String  check = userRegistrationValidation.passwordCheck_ForExactly_OneSpecialCharacter("Qwerty12@");
        Assertions.assertEquals("Happy",check);
    }

    @Test
    /*UC8-validating password for exactly no special character should return sad
     * and all rule should passed
     */
    public void givenPassword_WithExactlyOneSpecialCharacter_ShouldReturnSad()
    {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String  check = userRegistrationValidation.passwordCheck_ForExactly_OneSpecialCharacter("Qwerty12");
        Assertions.assertEquals("Sad",check);
    }

}