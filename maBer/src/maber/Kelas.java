/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maber;

/**
 *
 * @author mfebr
 */
public class Kelas {
    private int id;
    private String namaKelas;
    private String deskripsiKelas;
    private String jadwalKelas;
    private String linkZoom; 
    private double harga;
    private double rating;
    private Pelatih pelatih;
    private Menti [] menti = new Menti [100];
    private int jumlahMenti;
    private Absen [] absenMenti = new Absen [100];
    private Ulasan [] ulasan = new Ulasan [100];
    private int jumlahUlasan;

    public Kelas(int id, String namaKelas, String deskripsiKelas, String jadwalKelas, String linkZoom, double harga, double rating, Pelatih pelatih) {
        this.id = id;
        this.namaKelas = namaKelas;
        this.deskripsiKelas = deskripsiKelas;
        this.jadwalKelas = jadwalKelas;
        this.linkZoom = linkZoom;
        this.harga = harga;
        this.rating = rating;
        this.pelatih = pelatih;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public void setDeskripsiKelas(String deskripsiKelas) {
        this.deskripsiKelas = deskripsiKelas;
    }

    public void setJadwalKelas(String jadwalKelas) {
        this.jadwalKelas = jadwalKelas;
    }

    public void setLinkZoom(String linkZoom) {
        this.linkZoom = linkZoom;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void setPelatih(Pelatih pelatih){
        this.pelatih = pelatih;
    }

    public void setMenti(Absen absen, Menti menti) {
        this.absenMenti[jumlahMenti] = absen;
        this.menti [jumlahMenti] = menti;
        jumlahMenti++;
    }

    public void setUlasan(Ulasan ulasan) {
        this.ulasan [jumlahUlasan] = ulasan;
        if (jumlahUlasan < 1) {
            this.rating = ulasan.getRating();
        }
        else {
            this.rating = (this.rating + ulasan.getRating()) / (jumlahUlasan + 1);
        }
        jumlahUlasan++;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNamaKelas() {
        return namaKelas;
    }

    public String getDeskripsiKelas() {
        return deskripsiKelas;
    }

    public String getJadwalKelas() {
        return jadwalKelas;
    }

    public String getLinkZoom() {
        return linkZoom;
    }

    public double getHarga() {
        return harga;
    }

    public double getRating() {
        return rating;
    }
    
    public void getPelatih (){
        System.out.println(pelatih.getName());
    }

    public void showDaftarMenti() {
        for (int i = 0; i < jumlahMenti ; i++) {
            System.out.println(i+1 + ". " + menti[i].getName());
        }
    }
    
    public void showUlasan()
   {
       for (int i = 0; i < jumlahUlasan; i++) {
           System.out.println("ULASAN\n" +
                   "==============================");
           System.out.println(ulasan[i].getPengirim() + "\n" +
                   "Rating : " + ulasan[i].getRating() + "\n" +
                   "Komentar : " + ulasan [i].getKomentar() + "\n");
       }
       System.out.println("==============================");
   }
}
