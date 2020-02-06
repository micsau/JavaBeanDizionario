package mieibeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Add implements java.io.Serializable{
    private String parola;
    private String significato;
    private String result;


public String getAdd(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/vlIGVKqVUg?user=vlIGVKqVUg&password=R6OA2FGr12");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select parola FROM Words WHERE parola='"+parola+"'");
        while(rs.next()){
            result=rs.getString("parola");
        }
        if(result!=null){
            return "AVVISO, il termine da te cercato esiste già all'interno del database! riprova con altri termini.";
        }
        else{
            stmt.executeUpdate("INSERT into Words(parola,significato) VALUES('"+parola+"','"+significato+"')");
        }
        return "Parola inserita correttamente";
    }catch(Exception e){
        return e.toString();
    }
}


    public void setParola(String p){
        parola = p;
    }

    public void setSignificato(String p){
        significato = p;
    }
}