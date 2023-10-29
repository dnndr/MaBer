package maber;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author othma
 */
public class Pelatih extends User {
    private double rating;
    private int jumlahRating;

    public Pelatih(String n, String p, int i, String e) {
        super (n, p, i, e);
    }

    public void setRating(double rating) {
        this.rating = this.rating * jumlahRating + rating;
        jumlahRating ++;
        this.rating = this.rating / jumlahRating;
    }
    
    public double getRating() {
        return rating;
    }
}
