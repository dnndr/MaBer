/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabasePelatih;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yusuf haryo timur
 */
public class MentiDAO {
    private Connection con;
    private String url;
    private String uname;
    private String pass;
    private Statement stmt;
    
    public MentiDAO()
    {
        url = "jdbc:mysql://localhost:3306/db_pelatih";
        uname = "root";
        pass = "QWERTYUIOP";
        setConnectionAndStatement();
    }
    
    private void save (Menti menti){
        try{
            query = "INSERT INTO menti VALUES ('%s', '%s', '%s', '%s', '%s')";
            query = String.format(query,
                    p.getId(),
                    p.getNama(),
                    p.getAsalDaerah(),
                    p.getTanggalLahir(),
                    p.getJenisKelamin());
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            System.err.print ("Error inserting data: " + ex.getMessage());
            System.exit(1);
        }
    }
}
