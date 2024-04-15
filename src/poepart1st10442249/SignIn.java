package poepart1st10442249;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class SignIn
{  // User input 
    private String RegistrationUserName;
    private String RegistrationPassword;
    private String userFirstName; 
    private String userLastName;
  
    public SignIn()
    {
        this.RegistrationUserName = "kyl_1";
        this.RegistrationPassword = "Ch&&sec@ke99!";
        this.userFirstName = "Kyle";
    }
    public SignIn( String userFirstName, String userLastName,String userName, String userPassword)
    {
        this.RegistrationUserName = userName;
        this.RegistrationPassword = userPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }
    // Sign in Method  for User  Sign in 
    public String UserSignIn()
    {
        String msg = "";
        String userNameInput = JOptionPane.showInputDialog(null, "Enter your username");
        String userPasswordInput = JOptionPane.showInputDialog(null, "Enter your password");

        boolean userFound = false;
        // loop  that  reoccurs when when user does or doews not correctly enters a  password 
        if (LoggedIn(userNameInput,userPasswordInput )) 
        {
                msg = "Welcome back:"+ userFirstName+"\nIt is great to see you again";
                userFound = true;
                return msg;
        }
        

        if (!userFound) {
            msg = "Username or Password Incorrect \nPlease try Again";
            return msg;
        }
        return msg;
    }
    public Boolean LoggedIn(String uName, String pWord)
    { Boolean valid = false;
    
    if (RegistrationUserName.equals(uName) && RegistrationPassword.equals(pWord)) 
        {
               
               valid = true;
               
        }
        return valid;
    }
    
    

    public String getRegistrationUserName() 
    {
        return RegistrationUserName;
    }

    public String getRegistrationPassword() 
    {
        return RegistrationPassword;
    }

    public String getUserFirstName() 
    {
       return userFirstName;
    }

    public void setUserFirstName(String userFirstName) 
    {
       this.userFirstName = userFirstName;
    }

    public String getUserLastName() 
    {
       return userLastName;
    }

    public void setUserLastName(String userLastName) 
    {
        this.userLastName = userLastName;
    }

    
    //Method used   to check if  user input corresponds with the requirments 
    public static String UserName() 
    {
        Boolean checkUserName = false;
        String userName = "";
        while (!checkUserName)
        {
            userName = JOptionPane.showInputDialog(null, """
                                                    Please Enter A UserName 
                                                    Hint: Must Contain an Underscore 
                                                    Be no longer than 5 Characters""");
       
            // conditions and output  if the user does not meet requirments 
            if (userName != null && userName.contains("_") && userName.length() <= 5 ) 
            {
                System.out.println("UserName successfully captured");
                checkUserName = true ;
            }
            // Conditions and output for if the user  does not meet the requirment 
            {
                JOptionPane.showMessageDialog(null,"UserName is not correctly formatted, please ensure that "
                        + "your UserName contains an underscore and"
                        + " is no more than 5 characters in length");
            }    
        }
        return userName;
    }  
    // User input for password 
    public static String UserPassword() 
    {
        Boolean checkPasswordComplexity = false;
        String userPassword = "";
        while (!checkPasswordComplexity)
        {
            userPassword = JOptionPane.showInputDialog(null, """
                                                    Please Enter A Password 
                                                    Hint: Must Contain a Capital Letter 
                                                    Be at least 8 Characters longer 
                                                    Contain a number 
                                               Contain a special Character""");
            //Condition and methods for Character name length 
            if (userPassword != null)
            {
                Boolean containCapital = false;
                for (int i = 0; i < userPassword.length(); i++) 
                {
                    // condition for Upper case and special characters 
                    char capital = userPassword.charAt(i);
                    if (Character.isUpperCase(capital))
                    {
                        containCapital = true;
                        break;
                    }
                }
                // matcher method used to check if password contains any special characters or numbers
                Pattern norm = Pattern.compile("[^a-zA-Z0-9\\s]");
                Matcher match = norm.matcher(userPassword);
                Boolean containSpecial = match.find();
                
                Pattern numPattern = Pattern.compile("\\d");
                Matcher numMatcher = numPattern.matcher(userPassword);
                Boolean containNumber = numMatcher.find();
                // Condition and output for if the user has met all requirment 
                if  ( userPassword.length() >= 8  && containCapital && containSpecial && containNumber)
                {
                    System.out.println("Password successfully captured");
                    checkPasswordComplexity = true;
                }
                /// Condition and output for if the user has not  met all requirment 
                else
                {
                    JOptionPane.showMessageDialog(null,"Password is not correctly formatted,"
                            + "please ensure that the password contains 8 characters,"
                            + "a capital letter, a number and a special character");
                }    
            }
        }
        return userPassword;
    }  
}
