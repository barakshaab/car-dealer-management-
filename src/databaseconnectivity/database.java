/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author dbit
 */
public class database {
    public static String url="jdbc:derby://localhost:1527/vishal";
    public static String drivername="org.apache.derby.jdbc.ClientDriver";
    public static String username="vishal";
    public static String password="vishal";
    public static Connection con ;
    public static Statement statement;
    public static PreparedStatement ps;
    public static ResultSet rs;
public static Connection getConnection(){
    try{
        Class.forName(drivername);
        con=DriverManager.getConnection(url,username,password);
         }
    catch(SQLException se)
    {
    se.printStackTrace();
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
return con;
}
}
