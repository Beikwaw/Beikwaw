
package poepart1st10442249;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Registration
{
    // String for  Register
    private String userName;
    private String password;
    private String userFirstName; 
    private String userLastName;

    public Registration() 
    // Get user  set method 
    {
         
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setUserFirstName(String userFirstName) 
    {
        
       this.userFirstName = userFirstName;
    }
    public void setUserLastName(String userLastName) 
    {
        this.userLastName = userLastName;
    }
     //Methods for firstname,Username,last name,password   
        
    public String getUserLastName() 
    {
       return userLastName;
    }
    public String getRegistrationUserName() 
    {
        return userName;
    }

    public String getRegistrationPassword() 
    {
        return password;
    }

    public String getUserFirstName() 
    {
       return userFirstName;
    }
    //__________________________________________________________________________Getters and setters for Sign In ___________________________________________________
   public Boolean CreateUserPassword() 
   {
        Boolean valid = true;
        String Password = "";
        do 
        {
            Password = JOptionPane.showInputDialog(null, """
                                                    Please Enter A Password 
                                                    Hint: Must Contain a Capital Letter 
                                                    Be at least 8 Characters longer 
                                                    Contain a number 
                                                    Contain a special Character""");
            if (Password != null)
            {
                // check if   
                if  (checkPasswordComplexity(Password))
                {
                    System.out.println("Password successfully captured");
                    valid = true;
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Password is not correctly formatted,"
                            + "please ensure that the password contains 8 characters,"
                            + "a capital letter, a number and a special character");
                }    
            }
        } while (!valid);

        
       this.password = Password;
       
       return valid;
    }  
//______________________________________________________________________________Password complexity check_________________________________________________________   
   
   public boolean checkPasswordComplexity(String password){
       Boolean containCapital = false;
                for (int i = 0; i < password.length(); i++) 
                {
                    char capital = password.charAt(i);
                    if (Character.isUpperCase(capital))
                    {
                        containCapital = true;
                        break;
                    }
                }
                //check if user password contains a  capital
                Pattern norm = Pattern.compile("[^a-zA-Z0-9\\s]");
                Matcher match = norm.matcher(password);
                Boolean containSpecial = match.find();
                
                Pattern numPattern = Pattern.compile("\\d");
                Matcher numMatcher = numPattern.matcher(password);
                Boolean containNumber = numMatcher.find();
                if (containSpecial && containNumber && containCapital) 
                    return true;
                else return false;
 //____________________________________________________________________________Username conditions__________________________________________________________________                           
   }
    public void CreateUserName() 
    {
        Boolean checkUserName = false;
        String userName = "";
        while (!checkUserName)
        {
            userName = JOptionPane.showInputDialog(null, """
                                                    Please Enter A UserName 
                                                    Hint: Must Contain an Underscore 
                                                    Be no longer than 5 Characters""");
       
            if (userNameCheck(userName)) 
            {
                System.out.println("UserName successfully captured");
                checkUserName = true ;
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"UserName is not correctly formatted, please ensure that "
                        + "your UserName contains an underscore and"
                        + " is no more than 5 characters in length");
            }    
        }
        this.userName = userName;
    } 
    
    {
        
    }
    public Boolean userNameCheck(String userName)
    {Boolean valid = false;
    
    if (userName != null && userName.contains("_") && userName.length() <= 5 ) 
            {
               
                valid = true ;
            }
        return valid;
    }
}


    
    

