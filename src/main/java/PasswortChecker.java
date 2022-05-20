import java.util.Arrays;

public class PasswortChecker {

    public static boolean pwValidateMinLength(String passwort) {

        return passwort.length() >= 8;
    }

    public static boolean pwValidateMaxLength(String passwort) {

        return passwort.length() <= 20;
    }


    public static boolean pwValidateForNumber(String passwort) {

        return passwort.matches("(.*[0-9].*)");
    }

    public static boolean pwValidateForLowerChaseChar(String passwort) {

        return passwort.matches("(.*[a-z].*)");

    }

    public static boolean pwValidateForUpperChaseChar(String passwort) {

        return passwort.matches("(.*[A-Z].*)");

    }

    public static boolean pwValidateForSpecialChar(String passwort) {

        return passwort.matches(".*[@,#,$,%,!].*");

    }

    public static String pwCheck(String passwort) {

        int[] pwCheckArray = {0,0,0,0,0,0};
        //Check all the Statements
        if (pwValidateMinLength(passwort)){
            pwCheckArray[0]=1;
        }
        if (pwValidateForSpecialChar(passwort)){
            pwCheckArray[1]=1;
        }
        if (pwValidateForNumber(passwort)){
            pwCheckArray[2]=1;
        }
        if (pwValidateForUpperChaseChar(passwort)){
            pwCheckArray[3]=1;
        }
        if (pwValidateForLowerChaseChar(passwort)){
            pwCheckArray[4]=1;
        }
        if (pwValidateMaxLength(passwort)){
            pwCheckArray[5]=1;
        }
        //Print individual Fail Message
        if (pwCheckArray[0]==0){
            System.out.println("Das Passwort ist zu kurz.");
        }
        if (pwCheckArray[1]==0){
            System.out.println("Es fehlen Sonderzeichen.");
        }
        if (pwCheckArray[2]==0){
            System.out.println("Es fehlen Nummern.");
        }
        if (pwCheckArray[3]==0){
            System.out.println("Es fehlen Großbuchstaben.");
        }
        if (pwCheckArray[4]==0){
            System.out.println("Es fehlen Kleinbuchstaben.");
        }
        if (pwCheckArray[5]==0){
            System.out.println("Das Passwort ist zu lang.");
        }

        for (int i = 0; i < 6; i++) {
            if (pwCheckArray[i]==0){
                return "Passwort ist nicht zulässig.";
            }
        }
        return "Passwort ist zulässig.";
    }

    public static String[][] pwCheck (String[] passwort){

        String [][] result = new String[passwort.length][2];

        for (int i=0; i<passwort.length; i++){
            result[i][0]=passwort[i];
            result[i][1]=PasswortChecker.pwCheck(passwort[i]);
        }
        return result;
    }

}
