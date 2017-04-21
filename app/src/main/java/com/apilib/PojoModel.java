package com.apilib;

import com.google.gson.Gson;

/**
 * Created by Vihas on 17-03-2017.
 */

class PojoModel {

    /**
     * id : 1
     * title : dajngo package
     * description : django-debug-toolbar-force

     django-jsrender

     Render Django templates into Javascript functions.
     Emotion emojione for django app

     django-channels-jsonrpc

     django-cerberus-ac

     Django access control app, using OBAC and separation of privileg...
     * post_pic : 1.png
     * no_like : 0
     * no_comments : 0
     * cat_id : 1
     * user_id : 4
     * user_name : 1
     */

    private int id;
    private String title;
    private String description;
    private String post_pic;
    private int no_like;
    private int no_comments;
    private int cat_id;
    private int user_id;
    private int user_name;

    public PojoModel(int id, String title, String description, String post_pic, int no_like, int no_comments, int cat_id, int user_id, int user_name) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.post_pic = post_pic;
        this.no_like = no_like;
        this.no_comments = no_comments;
        this.cat_id = cat_id;
        this.user_id = user_id;
        this.user_name = user_name;
    }

    public static PojoModel objectFromData(String str) {

        return new Gson().fromJson(str, PojoModel.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPost_pic() {
        return post_pic;
    }

    public void setPost_pic(String post_pic) {
        this.post_pic = post_pic;
    }

    public int getNo_like() {
        return no_like;
    }

    public void setNo_like(int no_like) {
        this.no_like = no_like;
    }

    public int getNo_comments() {
        return no_comments;
    }

    public void setNo_comments(int no_comments) {
        this.no_comments = no_comments;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_name() {
        return user_name;
    }

    public void setUser_name(int user_name) {
        this.user_name = user_name;
    }
}
