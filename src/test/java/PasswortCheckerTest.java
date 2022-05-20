import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortCheckerTest {

    //Check Min Length of 8 and max 20
    @Test
    void shouldPasswortBeBetween8and20CharactersItShouldBeTrue(){
        //given
        String passwort = "123456789";
        //when
        boolean actual = PasswortChecker.pwValidateMinLength(passwort);
        //then
        assertTrue(actual);

    }

    @Test
    void shouldPasswortBeShorterAs8CharactersItShouldBeFalse(){
        //given
        String passwort = "1234567";
        //when
        boolean actual = PasswortChecker.pwValidateMinLength(passwort);
        //then
        assertFalse(actual);

    }

    @Test
    void shouldPasswortBeLongerAs20CharactersItShouldBeFalse(){
        //given
        String passwort = "123456789012345678901";
        //when
        boolean actual = PasswortChecker.pwValidateMaxLength(passwort);
        //then
        assertFalse(actual);

    }



    @Test
    void shouldPasswortBeExactly8CharactersItShouldBeTrue(){
        //given
        String passwort = "12345678";
        //when
        boolean actual = PasswortChecker.pwValidateMinLength(passwort);
        //then
        assertTrue(actual);

    }


    //Check for Number
    @Test
    void ShouldPasswortContainsANumberItShouldBeTrue(){
        //given
        String passwort = "pass1234wort";
        //when
        boolean actual = PasswortChecker.pwValidateForNumber(passwort);
        //then
        assertTrue(actual);
    }

    @Test
    void ShouldPasswortContainsNoNumberItShouldBeFalse(){
        //given
        String passwort = "passwort";
        //when
        boolean actual = PasswortChecker.pwValidateForNumber(passwort);
        //then
        assertFalse(actual);
    }

    //Check for LowerCaseChar
    @Test
    void ShouldPasswortContainsLowerCaseCharItShouldBeTrue(){
        //given
        String passwort = "pass1234wort";
        //when
        boolean actual = PasswortChecker.pwValidateForLowerChaseChar(passwort);
        //then
        assertTrue(actual);
    }

    @Test
    void ShouldPasswortNotContainsLowerCaseCharItShouldBeFalse(){
        //given
        String passwort = "PASSWORT";
        //when
        boolean actual = PasswortChecker.pwValidateForLowerChaseChar(passwort);
        //then
        assertFalse(actual);
    }

    //Check for UpperCaseChar
    @Test
    void ShouldPasswortContainsUpperCaseCharItShouldBeTrue(){
        //given
        String passwort = "PASS1234WORT";
        //when
        boolean actual = PasswortChecker.pwValidateForUpperChaseChar(passwort);
        //then
        assertTrue(actual);
    }

    @Test
    void ShouldPasswortNotContainsUpperCaseCharItShouldBeFalse(){
        //given
        String passwort = "passwort";
        //when
        boolean actual = PasswortChecker.pwValidateForUpperChaseChar(passwort);
        //then
        assertFalse(actual);
    }

    //Check for Special Char
    @Test
    void ShouldPasswortContainsSpecialCharItShouldBeTrue(){
        //given
        String passwort = "Plasdfn!42";
        //when
        boolean actual = PasswortChecker.pwValidateForSpecialChar(passwort);
        //then
        assertTrue(actual);
    }

    @Test
    void ShouldPasswortNotContainsSpecialCharItShouldBeFalse(){
        //given
        String passwort = "passwort";
        //when
        boolean actual = PasswortChecker.pwValidateForSpecialChar(passwort);
        //then
        assertFalse(actual);
    }

    //Check if Passwort is valid
    @Test
    void ShouldPasswortBeValidPrintValidMessage(){
        //given
        String passwort = "PASSwort1234!";
        String expected = "Passwort ist zulässig.";
        //when
        String actual = PasswortChecker.pwCheck(passwort);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPasswortBeMissingLowerCharPrintFailMessage(){
        //given
        String passwort = "PASSWORT1234!";
        String expected = "Passwort ist nicht zulässig.";
        //when
        String actual = PasswortChecker.pwCheck(passwort);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPasswortBeMissingUpperCharPrintFailMessage(){
        //given
        String passwort = "passwort1234!";
        String expected = "Passwort ist nicht zulässig.";
        //when
        String actual = PasswortChecker.pwCheck(passwort);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPasswortBeMissingSpecialCharPrintFailMessage(){
        //given
        String passwort = "Passwort1234";
        String expected = "Passwort ist nicht zulässig.";
        //when
        String actual = PasswortChecker.pwCheck(passwort);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPasswortBeMissingNumberPrintFailMessage(){
        //given
        String passwort = "Passwort!";
        String expected = "Passwort ist nicht zulässig.";
        //when
        String actual = PasswortChecker.pwCheck(passwort);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPasswortBeTooShortPrintFailMessage(){
        //given
        String passwort = "Pas123!";
        String expected = "Passwort ist nicht zulässig.";
        //when
        String actual = PasswortChecker.pwCheck(passwort);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPasswortBeTooLongPrintFailMessage(){
        //given
        String passwort = "PASSwort1234!PASSWORT";
        String expected = "Passwort ist nicht zulässig.";
        //when
        String actual = PasswortChecker.pwCheck(passwort);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPasswortBeArray(){
        //given
        String pwCheckPos = "Passwort ist zulässig.";
        String pwCheckNeg = "Passwort ist nicht zulässig.";
        String[] passwort = {"PASSwort1234!", "PASSWORT1234!","passwort1234!","PASSwort1234","PaSW12!","P" };
        String[][] expected = {{"PASSwort1234!",pwCheckPos},{"PASSWORT1234!", pwCheckNeg},{"passwort1234!",pwCheckNeg},{"PASSwort1234",pwCheckNeg},{"PaSW12!",pwCheckNeg},{"P",pwCheckNeg}};
        //when
        String[][] actual = PasswortChecker.pwCheck(passwort);
        //then
        assertArrayEquals(expected, actual);
    }



}