import java.util.Arrays;

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

        int[] pwCheckArray = {0,0,0,0,0,0};
        //Check all the Statements
        if (pwValidateMinLength(passwort)==true){
            pwCheckArray[0]=1;
        }
        if (pwValidateForSpecialChar(passwort)==true){
            pwCheckArray[1]=1;
        }
        if (pwValidateForNumber(passwort)==true){
            pwCheckArray[2]=1;
        }
        if (pwValidateForUpperChaseChar(passwort)==true){
            pwCheckArray[3]=1;
        }
        if (pwValidateForLowerChaseChar(passwort)==true){
            pwCheckArray[4]=1;
        }
        if (pwValidateMaxLength(passwort)==true){
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
