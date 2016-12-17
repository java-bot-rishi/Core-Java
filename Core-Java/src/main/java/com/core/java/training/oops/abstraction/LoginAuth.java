package com.core.java.training.oops.abstraction;

/**
 * input: user name/password
 * output: success if userid/pwd is valid, failure if user/pwd is invalid
 * 
 * @author 
 *
 */
public abstract class LoginAuth
{
    public void encryptPassword(String pass)
    {
        //TODO// implement encryption logic.
    }

    public abstract String checkDBforUser(String username, String password);
}