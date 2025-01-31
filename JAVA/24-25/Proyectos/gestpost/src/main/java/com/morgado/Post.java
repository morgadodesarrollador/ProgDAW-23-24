package com.morgado;
public class Post {
    private int id;
    private int userId;
    private String title;
    private String body;


    
    Post(int id, int userid, String title, String body){
        this.setId(id);
        this.setUserId(userid);
        this.setBody(body);
        this.setTitle(title);
    }


    public int getId(){
        return this.id;
    }

    public int getUserId(){
        return this.userId;
    }

    public String getTitle(){
        return this.title;
    }
    public String getBody(){
        return this.body;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setUserId(int userid){
        this.userId = id;
    }
    public void setBody(String body){
        this.body = body;
    }

    public void setTitle(String title){
        this.title = title.toUpperCase();
    }


    
    
}