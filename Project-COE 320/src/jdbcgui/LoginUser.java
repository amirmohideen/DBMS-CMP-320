/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcgui;


// needed for menu
public class LoginUser {
    public String username;
    public int Type;
    public String Name;
    LoginUser (String username, String Name, int type){
        this.username= username;
        this.Name=Name;
        Type = type;
    }
}
