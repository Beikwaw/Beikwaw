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
public class ProgramTest {
    
    public ProgramTest() {
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
     * Test of main method, of class Program.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Program.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of Menu method, of class Program.
     */
    @Test
    public void testMenu() {
        System.out.println("Menu");
        Program instance = new Program();
        int expResult = 0;
        int result = instance.Menu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of GetTaskData method, of class Program.
     */
    @Test
    public void testGetTaskData() {
        System.out.println("GetTaskData");
        Program instance = new Program();
        instance.GetTaskData();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
