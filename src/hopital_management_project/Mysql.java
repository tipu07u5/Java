
package hopital_management_project;

import java.sql.*;
public class Mysql {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Hospital_Management.sqlite");
            System.out.println("Connected");
            return conn;
        }
        catch(Exception e){
            
            System.out.println("Not connected");
            return null;
        }
        
    
    }
}
