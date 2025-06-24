/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sony
 */
public class UserTest {
    
    public UserTest() {
    }
    
   
    @Test
    public void testValid_email() {
        System.out.println("valid_email");
        User i = new User ("laim0280@gmail.com","123");

        boolean result = i.valid_email();
        assertEquals(true, result);
        
    }
    
}
