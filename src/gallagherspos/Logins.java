/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallagherspos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TrollOutpost
 */
public class Logins {
    ArrayList<Users> logins = new ArrayList<>();
   

    public Logins() {
  //      Scanner scanuser = new Scanner("users.txt");
        int usercode;
        String name;
        /*while(scanuser.hasNext()) {
            usercode = scanuser.nextInt();
            name = scanuser.nextLine();
            logins.add(new Users(name, usercode));
        }*/
        name = "James H.";
        Users james = new Users(name, 145);
        name = "Chase L.";
        Users chase = new Users(name, 15);
        name = "Epic11Hunter AKA Matthew";
        Users epic = new Users(name, 908);
        logins.add(james);
        logins.add(chase);
        logins.add(epic);
    }
    public String checkLogin(int usercode) {
        String name = "";
        for(int i = 0; i < logins.size(); i++) {
            if(usercode == logins.get(i).getCode()) {
                name= logins.get(i).getName();
            }
        }
        return name;
    }
    public int addLogin(int usercode, String name) {
        if(!checkLogin(usercode).equals("")) {
            return -1;
        }
        logins.add(new Users(name, usercode));
        return 1;
    }

}
