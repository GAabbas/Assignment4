/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Amar
 */
public class LoginBeanTest {
    
    public LoginBeanTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Verify method, of class LoginBean.
     */
    @Test
    public void testVerify() {
        System.out.println("Verify");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.Verify();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class LoginBean.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class LoginBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        LoginBean instance = new LoginBean();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LoginBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LoginBean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginBean instance = new LoginBean();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyMsg method, of class LoginBean.
     */
    @Test
    public void testGetMyMsg() {
        System.out.println("getMyMsg");
        LoginBean instance = new LoginBean();
        String expResult = "";
        String result = instance.getMyMsg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyMsg method, of class LoginBean.
     */
    @Test
    public void testSetMyMsg() {
        System.out.println("setMyMsg");
        String myMsg = "";
        LoginBean instance = new LoginBean();
        instance.setMyMsg(myMsg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
