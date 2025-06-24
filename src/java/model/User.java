/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sony
 */
public class User {
      private String email;
      private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public boolean valid_email(){
        return this.email.equals("laim0280@gmail.com")
                && this.password.equals("123");
    }
      
}
