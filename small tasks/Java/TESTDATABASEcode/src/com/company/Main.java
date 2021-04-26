package com.company;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

class FirstExample {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/matador";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Kolort231100";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Halløj Skipper");

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM field");
            ResultSet rsPlayer = conn.createStatement().executeQuery("SELECT * FROM player");

            //STEP 5: Extract data from result set
            System.out.println("-----------FIELDS-----------");
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String fieldType = rs.getString("type");
                String label = rs.getString("label");
                int cost  = rs.getInt("cost");
                int income  = rs.getInt("income");
                int seriesID  = rs.getInt("SeriesID");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(",type: " + fieldType);
                System.out.print(",label: " + label);
                System.out.print(",cost: " + cost);
                System.out.print(",income: " + income);
                System.out.print(",seriesID: " + seriesID);
                System.out.println();
            }

            System.out.println("-----------PLAYERS-----------");
            while(rsPlayer.next()){
                //Retrieve by column name
                int id  = rsPlayer.getInt("id");
                String name = rsPlayer.getString("name");
                int balance  = rsPlayer.getInt("balance");
                int position  = rsPlayer.getInt("position");
                int turnsleft = rsPlayer.getInt("turnsleft");
                boolean next = rsPlayer.getBoolean("next");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", name: " + name);
                System.out.print(", balance: " + balance);
                System.out.print(", position: " + position);
                System.out.print(", turnsleft: " + turnsleft);
                System.out.print(", next: " + next);
                System.out.println();

            }
            //STEP 6: Clean-up environment
           rs.close();
            rsPlayer.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end FirstExample
