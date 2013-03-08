/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maverick
 */
public class Caesar_1Test {
    
    public Caesar_1Test() {
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
     * Test of encrypt method, of class Caesar_1.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String encryptText = "";
        int shift = 0;
        String expResult = "";
        String result = Caesar_1.encrypt(encryptText, shift);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class Caesar_1.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String encryptText = "";
        int shift = 0;
        String expResult = "";
        String result = Caesar_1.decrypt(encryptText, shift);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCharPosition method, of class Caesar_1.
     */
    @Test
    public void testFindCharPosition() {
        System.out.println("findCharPosition");
        char ch = ' ';
        int expResult = 0;
        int result = Caesar_1.findCharPosition(ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAlphabet method, of class Caesar_1.
     */
    @Test
    public void testGetAlphabet() {
        System.out.println("GetAlphabet");
        String expResult = "";
        String result = Caesar_1.GetAlphabet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cryptChar method, of class Caesar_1.
     */
    @Test
    public void testCryptChar() {
        System.out.println("cryptChar");
        char ch = ' ';
        int shift = 0;
        char expResult = ' ';
        char result = Caesar_1.cryptChar(ch, shift);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
