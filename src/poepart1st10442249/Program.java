package poepart1st10442249;

import javax.swing.JOptionPane;

public class Program {

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
     
       //SignIn s = new SignIn();
       JOptionPane.showMessageDialog(null, s.UserSignIn());
      
        s.Menu();
        
 

    }
    // Assignment two
 
    // Method for JOptionpane menu for options 

    
//    public int Menu() {
//        JOptionPane.showMessageDialog(null, "Welcome   to EasyKanban");
//        String[] options = {"Option 1 - Add task\n", "Option 2 - Coming soon \n", "Option 3- Quit "};
//
//        int Response = JOptionPane.showOptionDialog(null, "Please select an option", "Option Menu",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
//        //Options  1 -3   
//        if (Response == 0) {
//            JOptionPane.showMessageDialog(null, "Add  a task ");
//            //int numTask = Integer.parseInt( JOptionPane.showInputDialog (null, "Please   define the  amount  of task that you would like to perform  "));
//
//            GetTaskData();
//
//        }
//        if (Response == 1) {
//            JOptionPane.showMessageDialog(null, "Coming soon !");
//            System.exit(1);
//
//        } else if (Response == 2) {
//            JOptionPane.showMessageDialog(null, " Are you  want to Quit?");
//            System.exit(2);
//        }
//
//        return Response;
//    }

    public void GetTaskData() {
        
        Method taskObj = new Method();
       
        String description = "";
        String tname = "";
        String taskID = "";
        String developerDetails = "";
        int numTask = Integer.parseInt(JOptionPane.showInputDialog("Please define the  amount  of task that you would like to perform  "));

        for (int i = 0; i < numTask; i++) {
            tname = JOptionPane.showInputDialog("Enter the task name");

            description = JOptionPane.showInputDialog("Enter the task description");
            boolean validDesc = taskObj.checkTaskDescription(description);

            while (validDesc == false) {
                JOptionPane.showMessageDialog(null, "Invalid  description .(Description should be less than 50 characters  ");
                description = JOptionPane.showInputDialog("Enter the task description");
                validDesc = taskObj.checkTaskDescription(description);
            }

        }

    }
}
