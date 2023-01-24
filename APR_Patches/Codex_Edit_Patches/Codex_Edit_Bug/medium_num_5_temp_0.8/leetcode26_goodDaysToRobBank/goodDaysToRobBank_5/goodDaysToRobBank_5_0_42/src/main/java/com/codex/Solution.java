package com.codex;

import java.util.*;

public class Solution {
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/homework2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Connection con=DriverManager.getConnection(url,"root","1234");
            Statement stmt=con.createStatement();

            String query="select * from chinesepaladin";
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("英雄名称\t种族\t武器");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
            con.close();
        }
        catch(Exception e){ System.out.println(e);
        }
        return result;
    }

    
}