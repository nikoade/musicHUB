package dao;

import java.util.HashMap;

public class AccountManager {
    private HashMap<String, String> data;
    private static AccountManager singleton;

    private AccountManager(){
        data = new HashMap<>();
        data.put("Patrick", "1234");
        data.put("Molly", "FloPup");
    }

    public boolean addUser(String userName, String password){
        if(data.containsKey(userName)) return false;
        data.put(userName, password);
        return true;
    }

    public boolean checkPassoword(String userName, String password){
        if(!data.containsKey(userName) || !data.get(userName).equals(password)) return false;
        return true;
    }

    public static AccountManager getInstance(){
        if(singleton == null){
            singleton = new AccountManager();
        }
        return singleton;
    }
}
