package Connecto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
// @author octacilio

public class Conexao {
  public static String status = "";

  public static Connection getConnection(){
    Connection con = null;
    try{
      Class.forName("com.mysql.jdbc.Driver").newInstance();
     String url = "jdbc:mysql://localhost/helpondesk?user=root";
   //  String url = "jdbc:mysql://23.229.177.8/helpondesk?user=remote&password=remote";
      con = DriverManager.getConnection(url);
      status = "Conexão Aberta!";
     // System.out.println(status);
    }
    catch(SQLException e){ 
      status = e.getMessage();
        System.out.println(status);
    }catch (ClassNotFoundException e){
      status =e.getMessage();
        System.out.println(status);
    }catch (Exception e){
      status = e.getMessage();
        System.out.println(status);
    }
    return con;
  }
}
