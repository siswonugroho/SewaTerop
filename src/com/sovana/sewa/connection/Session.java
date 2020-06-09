/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sovana.sewa.connection;

//Created by Sovana S

public class Session {

    private static String username, level;
    public static String getUsername(){
        return username;
    }
    public static void setUsername(String username){
        Session.username = username;
    }
    public static String getLevel(){
        return level;
    }
    public static void setLevel(String level){
        Session.level = level;
    }

}
