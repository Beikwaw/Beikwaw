package poepart1st10442249;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
//import  Method.printTaskDetails;


public class SignIn {  // User input 
    
    public static int Resp = 3;
    

    private String RegistrationUserName;
    private String RegistrationPassword;
    private String userFirstName;
    private String userLastName;
    // int  taskNum = Method.totalTasks;
    

    
    public SignIn() {
        this.RegistrationUserName = "";
        this.RegistrationPassword = "";
        this.userFirstName = "";
    }

    public SignIn(String userFirstName, String userLastName, String userName, String userPassword) {
        this.RegistrationUserName = userName;
        this.RegistrationPassword = userPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }

    // Sign in Method  for User  Sign in 
    public String UserSignIn() {
        String msg = "";
        String userNameInput = JOptionPane.showInputDialog(null, "Enter your username");
        String userPasswordInput = JOptionPane.showInputDialog(null, "Enter your password");

        boolean userFound = false;
        // loop  that  reoccurs when when user does or does not correctly enters a  password 
        if (LoggedIn(userNameInput, userPasswordInput)) {
            msg = "Welcome back:" + userFirstName + "\nIt is soo great to see you again";
            userFound = true;
            return msg;
        }

        if (!userFound) {
            msg = "Username or Password Incorrect \nPlease try Again";
            return msg;
        }
        return msg;
    }

    public Boolean LoggedIn(String uName, String pWord) {
        Boolean valid = false;

        if (RegistrationUserName.equals(uName) && RegistrationPassword.equals(pWord)) {

            valid = true;

        }
        return valid;
    }
//______________________________________________________________________________Getters and setters ________________________________________________________________
    public String getRegistrationUserName() {
        return RegistrationUserName;
    }

    public String getRegistrationPassword() {
        return RegistrationPassword;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
//___________________________________________________Method used   to check if  user input corresponds with the requirments _______________________________________

    //Method used   to check if  user input corresponds with the requirments 
    public static String UserName() {
        Boolean checkUserName = false;
        String userName = "";
        while (!checkUserName) {
            userName = JOptionPane.showInputDialog(null, """
                                                    Please Enter A UserName 
                                                    Hint: Must Contain an Underscore 
                                                    Be no longer than 5 Characters""");

            // conditions and output  if the user does not meet requirments 
            if (userName != null && userName.contains("_") && userName.length() <= 5) {
                System.out.println("UserName successfully captured");
                checkUserName = true;
            }
            // Conditions and output for if the user  does not meet the requirment 
            {
                JOptionPane.showMessageDialog(null, "UserName is not correctly formatted, please ensure that "
                        + "your UserName contains an underscore and"
                        + " is no more than 5 characters in length");
            }
        }
        return userName;
    }

   //___________________________________________________________________________User password_______________________________________________________________________
    public static String UserPassword() {
        Boolean checkPasswordComplexity = false;
        String userPassword = "";
        while (!checkPasswordComplexity) {
            userPassword = JOptionPane.showInputDialog(null, """
                                                    Please Enter A Password 
                                                    Hint: Must Contain a Capital Letter 
                                                    Be at least 8 Characters longer 
                                                    Contain a number 
                                               Contain a special Character""");
            //Condition and methods for Character name length 
            if (userPassword != null) {
                Boolean containCapital = false;
                for (int i = 0; i < userPassword.length(); i++) {
                    // condition for Upper case and special characters 
                    char capital = userPassword.charAt(i);
                    if (Character.isUpperCase(capital)) {
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
                if (userPassword.length() >= 8 && containCapital && containSpecial && containNumber) {
                    System.out.println("Password successfully captured");
                    checkPasswordComplexity = true;
                } /// Condition and output for if the user has not  met all requirment 
                else {
                    JOptionPane.showMessageDialog(null, "Password is not correctly formatted,"
                            + "please ensure that the password contains 8 characters,"
                            + "a capital letter, a number and a special character");
                }
            }
        }
        return userPassword;
    }
 //________________________________________________________________Assignment two__________________________________________________________________________________
    // Method for JOptionpane menu for options 
    public static void Menu() {
         // Declaration 
            String description = "";
            String taskName = "";
            String TaskID = "";
            String developerDetails = "";
            int duration  = 0;
            int taskNum = 0;
            int totalhours = 0;
            String  TaskStatus ="";          
  
            

          // Welcome display and Options 
        JOptionPane.showMessageDialog(null, "Welcome   to EasyKanban");
        boolean Response;
        
        while (Resp == 3 || Resp == 0 || Resp == 1){
            
            
        
        String[] options = {"Option 1 - Add task\n", "Option 2 - Coming soon \n", "Option 3- Quit "};
        
        Resp = JOptionPane.showOptionDialog(null, "Please select an option", "Option Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
      
        if (Resp == 0) {
            JOptionPane.showMessageDialog(null, "Add  a task ");
            
            //Instance Task Object
            Method taskObj = new Method();
                       
            int numTask = Integer.parseInt(JOptionPane.showInputDialog( "Please  define the  amount  of task that you would like to perform  "));

           
            taskNum = Method.totalTasks;

            for (int i = 0; i < numTask; i++) {
                taskName = JOptionPane.showInputDialog("Enter the task name");
                taskObj.setTaskName(taskName);
                

                description = JOptionPane.showInputDialog("Enter a  task description ");
                boolean validDesc = taskObj.checkTaskDescription(description);
                

                while (validDesc == false) {
                    JOptionPane.showMessageDialog(null, "Please try again and enter a task description (less than 50 characters):");
                    description = JOptionPane.showInputDialog("Enter the task description");
                    validDesc = taskObj.checkTaskDescription(description);
                }
                taskObj.setTaskDescrip(description);
                
          developerDetails =  JOptionPane.showInputDialog("Please enter  the  developer details (First and last name )  " );
        int input = Integer.parseInt(JOptionPane.showInputDialog(" Enter in the task number").trim());;


    duration =Integer.parseInt(JOptionPane.showInputDialog("Please enter task duration in hours " ).trim());
        taskObj.setTaskDur(duration);
          
        
          TaskStatus = JOptionPane.showInputDialog("Enter An Option" + "\nTo do" + "\nDoing " +"\nDone " ) .toUpperCase();
         
          
          //Method callToMethod = new Method(taskName,developerDetails,numTask);
          
          JOptionPane.showMessageDialog(null, "Task succesfully captured ");
          
         
      // method to call taskID   
          TaskID = taskObj.createTaskID(taskName,developerDetails, numTask,input );

JOptionPane.showMessageDialog(null,"1) Task status  :"+ TaskStatus+ "\n 2) Developer detail  :" + developerDetails + "\n 3 )Task number : " + input + "\n 4) "
                  + "Task description : " + description + "\n 5) Task ID:" + TaskID +  " \n  6) Duration : " + duration + "Hours" );
                
               JOptionPane.showMessageDialog(null,printTaskDetails(TaskStatus,developerDetails,numTask,description,TaskID,duration));
                 JOptionPane.showMessageDialog(null,"Total Task Hours: "+ Method.totalDurations);

          
          
          
      
}
    }
  // ______________________________________________________________________End of add task Option 1 ________________________________________________________________

    
    if (Resp == 1) {
            JOptionPane.showMessageDialog(null, "Coming soon !");
        

}
    // ____________________________________________________________________________End of  Option 2 ________________________________________________________________
    else if (Resp  == 2) {
            JOptionPane.showMessageDialog(null, " Are you sure   want to Quit?");
        System.exit(0);
    }
    
       
    
          
         
         
   // ____________________________________________________________________________End Option 3 _____________________________________________________________________
      
}
    
    }

    // Print TasDetail method 
 public  static String printTaskDetails(String TaskStatus, String developerDetails, int numTask, String description, String TaskID, int duration)
{

   String Display = "1) Task status  :"+ TaskStatus+ "\n 2) Developer detail  :" + developerDetails + "\n 3 )Task number : " + numTask + "\n 4) "
                  + "Task description : " + description + "\n 5) Task ID:" + TaskID +  " \n  6) Duration : " + duration + "Hours" ;
                
  
   return Display;     
}
 
    
   
    
}           
       

      

       
       
        
    
      



        
        
        
        
        
      
      
    
    
               

            

