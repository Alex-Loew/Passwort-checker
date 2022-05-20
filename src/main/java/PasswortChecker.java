public class PasswortChecker {

    public static boolean pwValidateMinLength(String passwort) {

        if (passwort.length() >=8 ){
            return true;

        }else {
            return false;
        }
    }
}
