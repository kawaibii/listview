package com.example.bt1;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class view  implements Serializable {
    private String name;
    private String srcimage;
    private String description;
    public view(String name , String srcimage, String description){
        this.name = name;
        this.srcimage = srcimage;
        this.description = description;
    }
    public String getName(){
        return  this.name;
    }
    public String getSrcimage(){
        return this.srcimage;
    }
    public String getDescription(){
        return this.description;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSrcimage(String srcimage){
        this.srcimage =  srcimage;
    }

    @NonNull
    @Override
    public String toString() {
        return  this.name;
    }
}
