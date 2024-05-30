
package poepart1st10442249;
 import javax.swing.JOptionPane;

// All four methods for assignment 2 
public class Method {
    // declaration 
    String taskName;
    String devDetails ="";
    int numTask;
    String taskDescrip;
    String taskDev;
    static String taskStatus;
    int taskDur;
    int taskID;
   
    public static int totalDurations;
    public static int totalTasks;

    public Method(String TaskName, String DevDetails, int numTask) 
    {
       this.taskName = TaskName; 
       this.devDetails = DevDetails;
       this.numTask = numTask;
    }
    
    public Method(){
        
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDevDetails() {
        return devDetails;
    }

    public void setDevDetails(String devDetails) {
        this.devDetails = devDetails;
    }

    public int getNextTaskNumber() {
        return numTask;
    }

    public void setNextTaskNumber(int nextTaskNumber) {
        this.numTask = nextTaskNumber;
    }

    public String getTaskDescrip() {
        return taskDescrip;
    }

    public void setTaskDescrip(String taskDescrip) {
        this.taskDescrip = taskDescrip;
    }

    public String getTaskDev() {
        return taskDev;
    }

    public void setTaskDev(String taskDev) {
        this.taskDev = taskDev;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskDur() {
        return taskDur;
    }

    public void setTaskDur(int taskDur) {
        this.taskDur = taskDur;
        totalDurations += taskDur;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }
//same as poe getTotal HOurs 
    public static int getTotalDurations() {
        return totalDurations;
    }

    public static void setTotalDurations(int totalDurations) {
        Method.totalDurations = totalDurations;
        
    }

    
    public Method(String taskName, String taskDescrip, int taskNum, String taskDev, String taskStatus, int taskDur) 
    {
        this.taskName = taskName;
        this.taskDescrip = taskDescrip;
        this.taskDev = taskDev;
        this.taskStatus = taskStatus;
        this.taskDur = taskDur;
        this.taskID = taskID;
        
        
        
    }
    
    

    
    //check description method ()
public boolean checkTaskDescription(String str)
{
    if (str.length() <= 50) 
    {
        return true;
    } 
    else 
    {
        return false;
        
    }
}
// create task ID()
public  String createTaskID(String taskName, String devName , int taskNum,int input  )
{ 
    taskName  = taskName.substring(0,2).toUpperCase(); // to get the first two letters of task name 
    devName = devName.substring(devName.length()-3).toUpperCase(); // to get the last 3 letters devoloper details
     return taskName  + ":" + input + ":" +devName ; // what will be displayed 
  }
     

   
   
    
    
 
}     






   




    

    





