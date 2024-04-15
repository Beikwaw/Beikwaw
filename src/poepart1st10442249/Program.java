
package poepart1st10442249;

import javax.swing.JOptionPane;


public class Program 
{
    //  Strings for user inputs 
    static String firstNameInput;
    static String lastNameInput;
    static String userNameInput;
    static String userPasswordInput;
    
  
  public static void main(String[] args) 
  {
      //  method  for registration 
      Registration r = new Registration();
      
          // Prompt the user to enter their first name
        firstNameInput = JOptionPane.showInputDialog(null, "Enter your name");

        // Set the user's first name in the object
        r.setUserFirstName(firstNameInput);

        // Prompt the user to enter their last name

        lastNameInput = JOptionPane.showInputDialog(null, "Enter your last name");
        // Set the user's last name in the object
        r.setUserLastName(lastNameInput);

        // Call the CreateUserName method to set the username
        r.CreateUserName();

        // Call the CreateUserPassword method to set the user password
        r.CreateUserPassword();
     
      // Call the UserSignIn method to sign in the user
      SignIn s = new SignIn(r.getUserFirstName(), r.getUserLastName(), r.getRegistrationUserName(), r.getRegistrationPassword());
      JOptionPane.showMessageDialog(null, s.UserSignIn()); 
      
     
   
   
  }
    
}
