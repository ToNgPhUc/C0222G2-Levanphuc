package validate;

public class CheckRegex {
    private static final String REGEX_PHONE ="^((09)|(849))[0-9]{7}$";
    private static final String REGEX_EMAIL = "^(([a-z]|[A-z])|([a-z]|[A-Z]|[0-9]){1,})@gmail.com$";
    private static final String REGEX_ID_CARD = "^[0-9]{9}|| [0-9]{12}$";
    private static final String REGEX_SALARY= "^[0-9]{1,}\\.[0-9]{1,}$";


    public static boolean checkRegexPhone(String value){
        if(value.matches(REGEX_PHONE)){
            return true;
        }
        return false;
    }
    public static boolean checkRegexEmail(String value){
        if(value.matches(REGEX_EMAIL)){
            return true;
        }
        return false;
    }
    public static boolean checkRegexCard (String value){
        if(value.matches(REGEX_ID_CARD)){
            return true;
        }
        return false;
    }
}
