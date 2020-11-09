package com.example.jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class JobsApplication {

    public static void main(String[] args) {



//        SpringApplication.run(JobsApplication.class, args);



        String url = "jdbc:postgresql://192.168.1.21:5432/mebs_test?autoReconnect =true&useSSL=false";
        String user = "postgres";
        String password ="";
        try {
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt  = myConn.createStatement();
            String sql = "select * from red_list";
            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next())

                System.out.println(rs.getString("slug"));

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}
