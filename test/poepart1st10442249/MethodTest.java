/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poepart1st10442249;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davdminlah
 */
public class MethodTest {
    
    public MethodTest() {
    }
    //_________________________________________________________________________Test Data for Task description _______________________________________________________
    public void testGetTaskDescrip_success() {
        System.out.println("getTaskDescrip");
        Method instance = new Method();
        String expResult = "Task successfully captured ";
        String result = instance.getTaskDescrip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

   
    @Test
    public void testSetTaskDescrip_fail() {
        System.out.println("setTaskDescrip");
        String taskDescrip = "";
        Method instance = new Method();
        instance.setTaskDescrip(taskDescrip);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    // _________________________________________________________________________Test data for taskID________________________________________________________________
    @Test
    public void testCreateTaskID() {
        Method instance = new Method();
        String expResult = "LO:1:SON";
        String result = instance.createTaskID("Login Feature", "Robyn Harrison", 1,1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
    // ___________________________________________________________________________test data for total duration______________________________________________________ 
    @Test
    public void testGetTotalDurations_succes() {
         Method instance = new Method();
         int[] array= {8,10};// duration for test data 1 and 2 
        for (int i = 0; i < array.length; i++) {
           instance.setTaskDur(i);
        }
         int result= instance.getTotalDurations();
         int expResult = 18;
         
    }
    
    @Test
    public void testisDescrip_succes() {
         Method instance = new Method();
         String d = "Task successfully captured";
        
         Boolean result = instance.checkTaskDescription(d);
         Boolean expResult = true;
         
         assertEquals(expResult, result);
         
         
         
    }
    
        @Test
    public void testisDescrip_fail() {
         Method instance = new Method();
         String d = "Please enter a task description of less than 50 characters";
        
         Boolean result = instance.checkTaskDescription(d);
         Boolean expResult = false;
         
         assertEquals(expResult, result);
         
         
         
    }
}
