package mieibeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String;
import java.lang.Thread.State;
import java.io.*;
import java.util.*;

public class Delete implements java.io.Serializable{
    private String parola;
    private String result;


public String getDelete(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/vlIGVKqVUg?user=vlIGVKqVUg&password=R6OA2FGr12");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM WORDS WHERE parola='"+parola+"'");
        result = "parola";
        if(result != null){
        return "Parola eliminata correttamente";
        }
        else{
            return "parola rimossa!";
        }
    }catch(Exception e){
        return e.toString();
    }
}
    public void setParola(String p){
        parola = p;
    }
}
