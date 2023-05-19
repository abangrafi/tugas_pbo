/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
    public class TbPerpanjangan {
    private int idPerpanjangan;
    private int idPemesanan;
    private String tanggalPerpanjangan;
    private int lamaPerpanjangan;

    // Constructor
    public TbPerpanjangan(int idPerpanjangan, int idPemesanan, String tanggalPerpanjangan, int lamaPerpanjangan) {
        this.idPerpanjangan = idPerpanjangan;
        this.idPemesanan = idPemesanan;
        this.tanggalPerpanjangan = tanggalPerpanjangan;
        this.lamaPerpanjangan = lamaPerpanjangan;
    }

    // Getters and setters
    public int getIdPerpanjangan() {
        return idPerpanjangan;
    }

    public void setIdPerpanjangan(int idPerpanjangan) {
        this.idPerpanjangan = idPerpanjangan;
    }

    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getTanggalPerpanjangan() {
        return tanggalPerpanjangan;
    }

    public void setTanggalPerpanjangan(String tanggalPerpanjangan) {
        this.tanggalPerpanjangan = tanggalPerpanjangan;
    }

    public int getLamaPerpanjangan() {
        return lamaPerpanjangan;
    }

    public void setLamaPerpanjangan(int lamaPerpanjangan) {
        this.lamaPerpanjangan = lamaPerpanjangan;
    }
}

