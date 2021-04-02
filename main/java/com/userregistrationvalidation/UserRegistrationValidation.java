package com.userregistrationvalidation;

import java.util.regex.Pattern;

public class UserRegistrationValidation {

    // UC1 - to check first name
    public boolean firstName(String name)
    {
        return (Pattern.matches("^[A-Z]{1}[a-z]{3,}$", name) == true);
    }

    // UC2-to validate last name
    public boolean lastName(String name)
    {
        return (Pattern.matches("^[A-Z]{1}[a-z]{3,}", name));
    }

    /*UC 3 - enter a valid email
     *@description-validating emailId is valid or not
     * @return string:- return boolean value true or false
     * Email has 3 parts abc, bl & co
     */
    public boolean emailId(String email)
    {
        return (Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email) == true);
    }

    // UC4-validating mobile number
    public boolean mobileNo(String number)
    {
        return(Pattern.matches("(0|91)?\\s{1}[6-9][0-9]{9}", number) == true);
    }

    //UC5-validating password with minimum 8 characters
    public boolean passwordCheck(String password)
    {
        return (Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", password) == true);
    }

    //UC6-validating password having atleast 1 upperCase character should return true
    public boolean passwordCheckForAtLeastOneUpperCase(String password)
    {
        return ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", password)
                && Pattern.matches(".*[A-Z].*", password)) == true);
    }
}
