/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
public class LoginServletTest {

   
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request =  mock (HttpServletRequest.class);
        HttpServletResponse response = mock (HttpServletResponse.class);
        RequestDispatcher dispatcher = mock ( RequestDispatcher.class);
  when(request.getParameter("email")).thenReturn("laim028@gmail.com");
   when(request.getParameter("password")).thenReturn("123");     
 when(request.getRequestDispatcher("succes.jsp")).thenReturn(dispatcher);
       LoginServlet ser= new LoginServlet();
     ser.doPost(request, response);
 verify (request).setAttribute("result",false);     
      verify (dispatcher).forward(request, response);
       
    }
    
}
