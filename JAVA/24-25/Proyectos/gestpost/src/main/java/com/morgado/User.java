package com.morgado;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String website;

 
    User(int id, String name, String username, String email, String website){
        this.setId(id);
        this.setName(name);
        this.setUsername(username);
        this.setEmail(email);
        this.setWebsite(website);
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }
    public String getWebsite(){
        return this.website;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username.toUpperCase();
    }
    public void setName(String name){
        this.name = name.toUpperCase();
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setWebsite(String website){
        this.website = website;
    }


   
    
    
}