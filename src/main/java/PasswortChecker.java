public class PasswortChecker {

    public static boolean pwValidateMinLength(String passwort) {

        if (passwort.length() >=8){
            return true;

        }else {
            return false;
        }
    }

    public static boolean pwValidateMaxLength(String passwort) {
        if (passwort.length() <=20){
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

    public static boolean pwValidateForUpperChaseChar(String passwort) {

        if (passwort.matches("(.*[A-Z].*)")){
            return true;

        }else {

            return false;
        }

    }

    public static boolean pwValidateForSpecialChar(String passwort) {

        if (passwort.matches(".*[@,#,$,%,!].*")){
            return true;

        }else {

            return false;
        }
    }

    public static String pwCheck(String passwort) {

        if (pwValidateMinLength(passwort)==true){

            if (pwValidateMaxLength(passwort)==true){

                if (pwValidateForLowerChaseChar(passwort)==true){

                    if (pwValidateForUpperChaseChar(passwort)==true){

                        if (pwValidateForNumber(passwort)==true){

                            if (pwValidateForSpecialChar(passwort)==true){

                                return "Passwort ist zulässig.";

                            }else{
                                System.out.println("Es fehlen Sonderzeichen.");
                                return "Passwort ist nicht zulässig.";
                            }
                        }else{
                            System.out.println("Es fehlen Nummern.");
                            return "Passwort ist nicht zulässig.";
                        }
                    }else{
                        System.out.println("Es fehlen Großbuchstaben.");
                        return "Passwort ist nicht zulässig.";
                    }
                }else{
                    System.out.println("Es fehlen Kleinbuchstaben.");
                    return "Passwort ist nicht zulässig.";
                }
            }else{
                System.out.println("Das Passwort ist zu lang.");
                return "Passwort ist nicht zulässig.";
            }
        }else{
            System.out.println("Das Passwort ist zu kurz.");
            return "Passwort ist nicht zulässig.";
        }
    }
}
