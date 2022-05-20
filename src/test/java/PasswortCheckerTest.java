import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortCheckerTest {

    //Check Min Length of 8
    @Test
    void shouldPasswortBeExactly8CharactersItShouldBeTrue(){
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
    void shouldPasswortBeLongerAs8CharactersItShouldBeTrue(){
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


}