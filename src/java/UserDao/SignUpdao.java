/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDao;

import Beans.UserBean;
import Connection.dbconnection;

/**
 *
 * @author DELL
 */
public class SignUpdao {

    public String insertuerdata(UserBean ubean) {
        String n = ubean.getName();
        String e = ubean.getEmail();
        String p = ubean.getPhone();
        String pp = ubean.getPass();
        dbconnection con = null;

        try {
            con = new dbconnection();
            String qry = "insert into signup(name,email,phone,pass)values('" + n + "','" + e + "','" + p + "','" + pp + "')";
            int rs = con.putData(qry);
            if (rs > 0) {
                return "success";
            } else {
                return "Sign Up Failed Try Again..";
            }
        } catch (Exception ea) {

        }
        return "something went wrong";
    }
    
}
