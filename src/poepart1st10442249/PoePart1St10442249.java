package poepart1st10442249;

//import javax.swing.JOptionPane;
//
//
//public class PoePart1St10442249 
//{
// 
//{
//    
//     
//    //Part of  assignment 2  which prompts the user to enter the number of users 
//        int totalUsers = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of users"));
//        
//       // String arrays for user inputs 
//        String[] FirstName = new String[totalUsers];
//        String[] LastName = new String[totalUsers];
//        String[] UserName = new String[totalUsers];
//        String[] UserPassword = new String[totalUsers];
//
//        Registration registration = new Registration();
//        
//        for (int i = 0; i < totalUsers; i++) 
//        { 
//        
//            FirstName[i] = registration.getUserFirstName();
//            LastName[i] = registration.getUserLastName();
//            UserName[i] = registration.getRegistrationUserName();
//            UserPassword[i] = registration.getRegistrationPassword(); 
//        }
//        
//        String userNameInput = JOptionPane.showInputDialog(null, "Enter your username");
//        String userPasswordInput = JOptionPane.showInputDialog(null, "Enter your password");
//
//        boolean userFound = false;
//        for (int i = 0; i < totalUsers; i++) 
//        {
//            if (UserName[i].equals(userNameInput) && UserPassword[i].equals(userPasswordInput)) 
//            {
//                JOptionPane.showMessageDialog(null, "Welcome back: " + FirstName[i] + " " + LastName[i] + "\nIt is great to see you again");
//                userFound = true;
//                break;
//            }
//        }
////Condition for if the username and password are not found 
//    if (!userFound) 
//        {
//            JOptionPane.showMessageDialog(null, "Username or Password Incorrect \nPlease try Again");
//        }
//        // Part of assignment 2
//        JOptionPane.showMessageDialog(null, "UserName and Password Captured");
//        int selection = JOptionPane.showConfirmDialog(null, "Do you want to continue to log your profile?", "LOG_IN", JOptionPane.YES_NO_OPTION);
//        boolean isYes = (selection == JOptionPane.YES_OPTION);
//        if (isYes)  
//        {
//            JOptionPane.showMessageDialog(null, "WELCOME TO EasyKanban ");
//
//            boolean loginUser = false;
//            while (!loginUser) 
//            {
//                Registration verify = new Registration();
//                String existingUser = verify.getRegistrationUserName();
//                String existingPassword = verify.getRegistrationPassword();
//
//                if (existingUser.equals(userNameInput) && existingPassword.equals(userPasswordInput))
//                {
//                    int i = 0;
//                    JOptionPane.showMessageDialog(null, "Welcome back: " + FirstName[i] + " " + LastName[i] + "\nIt is great to see you again");
//                    loginUser = true;
//                } 
//                else 
//                {
//                    JOptionPane.showMessageDialog(null, "UserName or Password Incorrect \nPlease try Again");
//                   //userNameInput = registration.CreateUserName();
//                   //userPasswordInput = registration.CreateUserPassword();
//                }
//            }
//        }                                                              
//    }
//
//    private static String[] returnLoginStatus(Registration registration) 
//    {
//        String PASS = "Welcome back: " + registration.getUserFirstName() + " " + registration.getUserLastName() + "\nIt is great to see you again";
//        String FAIL = "UserName or Password Incorrect \nPlease try Again";
//        return new String[]{PASS, FAIL};
//    }
//}
