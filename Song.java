/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;


public class Song {
    private String title;
    private int lenInSec;
    private Album albums ;
    
    public Song(String title,int x,Album albums){
        this.title=title;
        this.lenInSec=x;
        this.albums=albums;
    }
    
    public boolean onSameAlbum(Song anotherSong){
        if(this.albums.equals(anotherSong.albums))
            return true ;
        else 
            return false;
    }
}
