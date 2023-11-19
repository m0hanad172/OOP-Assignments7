/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
       Album a1=new Album("Art1","rock");
       Album a2=new Album("Art2","pop");
       
       Song s1=new Song ("song1",3,a1);
       Song s2=new Song ("song2",4,a2);
        System.out.println(a1.hasRock());
        System.out.println(a2.hasRock());
        
        System.out.println(s1.onSameAlbum(s2));
    }
}
