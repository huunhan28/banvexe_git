/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banvexe;

import java.sql.*;

/**
 *
 * @author Huu Nhan
 */
public class Banvexe {

    /**
     * @param args the command line arguments
     */
    public static Connection layKetNoi(){
        Connection ketNoi=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QLVEXE1","sa","123");
            System.out.println("thanh cong");
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("that bai");
        }
        return ketNoi;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Banvexe vx= new Banvexe();
        vx.layKetNoi();
    }
    
}
