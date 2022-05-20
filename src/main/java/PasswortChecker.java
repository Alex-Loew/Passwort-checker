public class PasswortChecker {

    public static boolean pwValidateMinLength(String passwort) {

        if (passwort.length() >=8 ){
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
}
