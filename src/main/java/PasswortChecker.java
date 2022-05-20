public class PasswortChecker {

    public static boolean pwValidateLength(String passwort) {

        if (passwort.length() >=8 && passwort.length() <=20){
            return true;

        }else {
            return false;
        }
    }

    public static boolean pwValidateForNumber(String passwort) {

        if (passwort.matches("(.*[0-9].*)")){
            return true;

        }else {

            return false;
        }
    }

    public static boolean pwValidateForLowerChaseChar(String passwort) {

        if (passwort.matches("(.*[a-z].*)")){
            return true;

        }else {

            return false;
        }

    }
}
