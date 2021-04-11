package com.userregistrationvalidation;

import java.util.regex.Pattern;

public class UserRegistrationValidation {

    // UC1 - to check first name
    public String firstName(String name)
    {
        boolean result = (Pattern.matches("^[A-Z]{1}[a-z]{3,}$", name) == true);
        if(result == true)
            return "Happy";
        else
            return "Sad";
    }

    // UC2-to validate last name
    public String lastName(String name)
    {
        boolean check = (Pattern.matches("^[A-Z]{1}[a-z]{3,}", name));
        if(check == true)
            return "Happy";
        else
            return "Sad";
    }

    /*UC 3 - enter a valid email
     *@description-validating emailId is valid or not
     * @return string:- return boolean value true or false
     * Email has 3 parts abc, bl & co
     */
    public String emailId(String email)
    {
        boolean check = (Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email) == true);
        if(check == true)
            return "Happy";
        else
            return "Sad";
    }

    // UC4-validating mobile number
    public String mobileNo(String number)
    {
        boolean check = (Pattern.matches("(0|91)?\\s{1}[6-9][0-9]{9}", number) == true);
        if(check == true)
            return "Happy";
        else
            return "Sad";
    }

    //UC5-validating password with minimum 8 characters
    public String passwordCheck(String password)
    {
        boolean check = (Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", password) == true);
        if(check == true)
            return "Happy";
        else
            return "Sad";
    }

    //UC6-validating password having atleast 1 upperCase character should return true
    public String passwordCheck_ForAtLeast_OneUpperCase(String password)
    {
        boolean result = ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", password)
                && Pattern.matches(".*[A-Z].*", password)) == true);
        if(result == true)
            return "Happy";
        else
            return "Sad";
    }

   /*UC-7-validating password having atleast 8 character
   * password having minimum 1 uppeCase character and
   * password will have minimum 1 numeric value
   */
    public String passwordCheck_ForAtLeast_OneNumericCharacter(String number)
    {
        boolean check = ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", number)
                && Pattern.matches(".*[A-Z].*", number)
                && Pattern.matches(".*[0-9].*", number)) == true);
        if(check == true)
            return "Happy";
        else
            return "Sad";
    }

    //UC8-validating password for exactly 1 special character should return Happy
    public String passwordCheck_ForExactly_OneSpecialCharacter(String password) {
        boolean check = ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", password)
                && Pattern.matches(".*[A-Z].*", password)
                && Pattern.matches(".*[0-9].*", password)
                && Pattern.matches(".*[\\W]{1}.*", password)) == true);
        if(check == true)
            return "Happy";
        else
            return "Sad";
    }

}

