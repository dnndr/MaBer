/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maber;

/**
 *
 * @author Danin
 */
public class MaBer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menti m1 = new Menti ("asdf", "asdf", 1, "asdf@maber.com");
        Menti m2 = new Menti ("a mimir", "turu", 3, "slep@maber.com");
        Menti m3 = new Menti ("le baguette", "francum", 4, "a@g.c");
        Absen am1 = new Absen (m1);
        Absen am2 = new Absen (m2);
        Absen am3 = new Absen (m3);
        Pelatih p1 = new Pelatih ("qwer","qwer",2,"qwer@maber.com");
        Kelas k1 = new Kelas(1, "PBO", "Inheritance"
                , "Besok", "zoom.us", 100000.00, 5.00, p1);
        
        k1.setMenti(am1, m1);
        k1.setMenti(am2, m2);
        k1.setMenti(am3, m3);
        
        k1.showDaftarMenti();
        
        System.out.println(k1.getHarga());
        
        Ulasan i1 = new Ulasan (m1, 5.00, "sangat keren pengajarannya");
        Ulasan i2 = new Ulasan (m3, 4.25, "kurang ah");
        k1.setUlasan(i1);
        k1.setUlasan(i2);
        
        k1.showUlasan();
        System.out.println("Rating Kelas : " + k1.getRating());
    }
}
