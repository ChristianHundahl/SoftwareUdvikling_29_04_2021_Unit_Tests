import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PasswordValidatorNemIDTest {
    @Test
    void isValidPassword()

    {
        //Arrange
        PasswordValidatorNemID passwordTest = new PasswordValidatorNemID();
        //Act
        boolean expected = true;
        boolean correctPassword = passwordTest.isValidPassword("Hej12345");

        //Assert
        assertTrue(correctPassword);
    }
}