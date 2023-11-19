/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */
public class Album {
    private String artist ;
    private String genre ;
    
    public Album(String art,String gen){
        this.artist=art;
        this.genre=gen;
        
    }
    public String getArt(){
        return this.artist;
    }
    
    public String getGenre(){
        return this.genre;
    }
    public boolean hasRock(){
       if(this.genre.equals("rock"))
           return true ;
       else 
           return false ;
        
    }
}
