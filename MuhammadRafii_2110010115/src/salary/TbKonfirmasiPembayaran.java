/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
    public class TbKonfirmasiPembayaran {
    private int idPemesanan;
    private String tanggalPembayaran;
    private double jumlahPembayaran;

    // Constructor
    public TbKonfirmasiPembayaran(int idPemesanan, String tanggalPembayaran, double jumlahPembayaran) {
        this.idPemesanan = idPemesanan;
        this.tanggalPembayaran = tanggalPembayaran;
        this.jumlahPembayaran = jumlahPembayaran;
    }

    // Getters and setters
    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public double getJumlahPembayaran() {
        return jumlahPembayaran;
    }

    public void setJumlahPembayaran(double jumlahPembayaran) {
        this.jumlahPembayaran = jumlahPembayaran;
    }
}
