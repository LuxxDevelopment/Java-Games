package de.lukas.tools.loginsystem;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords() {
        logininfo.put("Bro","pizza");
        logininfo.put("admin","admin");
        logininfo.put("lukas","passwort");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
