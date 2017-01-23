/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallagherspos;

/**
 *
 * @author TrollOutpost
 */
public class Users {
    private String name;
    private int code;
    
   Users(String username, int usercode) {
       name = username;
       code = usercode;
    } 
   String getName() {
       return name;
   }
   int getCode() {
       return code;
   }
   void setName(String username)  {
       name = username;
   }
   void setCode(int usercode) {
       code = usercode;
   }
}


