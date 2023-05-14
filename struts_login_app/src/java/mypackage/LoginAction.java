/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import com.opensymphony.xwork2.ActionSupport;


/**
 *
 * @author Shubham
 */
public class LoginAction extends ActionSupport {
    String name;
    String mobileno;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public LoginAction() {
    }
    
    public String execute() throws Exception {
        if(name.equals("admin") && mobileno.equals("9999999999") && email.equals("admin@admin.com"))
        {
            return "success";
        }
        else
            return "error";
    }
    
}
