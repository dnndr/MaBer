/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabasePelatih;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author yusuf haryo timur
 */
public class BaseDAO {
    protected static final String DB_NAME = "db_pelatih";
    protected static final String DB_HOST = "localhost";
    protected static final String DB_USER = "root";
    protected static final String DB_PASS = "QWERTYUIOP";
    
    public static Connection getCon() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + DB_HOST + ":3306/" + DB_NAME, DB_USER, DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeCon(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
