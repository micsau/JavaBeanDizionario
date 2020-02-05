package mieibeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String;
import java.io.*;
import java.util.*;
public class Find implements java.io.Serializable{
    private String parola;
    private String result;
    private String significato;
public Find(){

}

public String getFind(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com/vlIGVKqVUg?user=vlIGVKqVUg&password=bcMVQ0ApRc");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select parola,significato FROM Words WHERE parola = '"+parola+"'");
        while(rs.next()){
            result=rs.getString("significato");
        }
        if(result!=null){
            return result;
        }
        else{
            return("la seguente parola '"+parola+"' non è presente nel nostro database");
        }
    } catch (Exception e) {
        return e.toString();
    }
}
    public void setParola(String p){
        parola = p;
    }
}