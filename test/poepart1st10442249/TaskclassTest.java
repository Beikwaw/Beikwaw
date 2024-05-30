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
public class TaskclassTest {
    
    public TaskclassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTaskDur method, of class Method.
     */
    @Test
    public void testSetTaskDur() {
        System.out.println("setTaskDur");
        int taskDur = 0;
        Method instance = new Method();
        instance.setTaskDur(taskDur);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of checkTaskDescription method, of class Method.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String str = "";
        Method instance = new Method();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of createTaskID method, of class Method.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "";
        String devName = "";
        int taskNum = 0;
        Method instance = new Method();
        String expResult = "";
        String result = instance.createTaskID(taskName, devName, taskNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Method method, of class Method.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Method instance = new Method();
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            }
    
}
