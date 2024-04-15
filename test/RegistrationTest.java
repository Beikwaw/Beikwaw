import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import poepart1st10442249.Registration;
import poepart1st10442249.SignIn;

public class RegistrationTest {

    //Success Password
    @Test
    public void testValidPassword() 
    {
        System.out.println("UserPassword Test - Valid Password");
        Registration instance = new Registration();
        String password = "Ch&&sec@ke99!";
        Boolean result = instance.checkPasswordComplexity(password);
        
        assertTrue(result); // Assuming valid password is entered
    }
    
    @Test
    public void testValidUserName() 
    {
        System.out.println("test UserName");
        Registration instance = new Registration();
        String username  = "kyl_1";
        Boolean result = instance.userNameCheck(username);
        
        assertTrue(result);
        
    }
    @Test
    public void testValidUser() 
    {
        System.out.println("Logged In ");
        SignIn instance = new SignIn();
        String username  = "kyl_1";
        String password = "Ch&&sec@ke99!";
        Boolean result = instance.LoggedIn(username, password);
        
        assertTrue(result);
    }
     @Test
    public void WelcomeMsg() 
    {
        System.out.println("Welcome");
        SignIn instance = new SignIn();
        String exp  = "Welcome back:Kyle\nIt is great to see you again";
        String actual = instance.UserSignIn();
        
        assertEquals(exp, actual);
    }
    @Test
    public void FailMsg() 
    {
        System.out.println("Fail Test");
        SignIn instance = new SignIn();
        String exp  = "Username or Password Incorrect \nPlease try Again";
        String actual = instance.UserSignIn();
        
        assertEquals(exp, actual);
    }
    
    
}
