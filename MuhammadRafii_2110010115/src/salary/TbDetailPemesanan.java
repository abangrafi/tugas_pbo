/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
    public class TbDetailPemesanan {
    private int idPemesanan;
    private String namaPemesan;
    private String namaKendaraan;
    private String tanggalPemesanan;

    // Constructor
    public TbDetailPemesanan(int idPemesanan, String namaPemesan, String namaKendaraan, String tanggalPemesanan) {
        this.idPemesanan = idPemesanan;
        this.namaPemesan = namaPemesan;
        this.namaKendaraan = namaKendaraan;
        this.tanggalPemesanan = tanggalPemesanan;
    }

    // Getters and setters
    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(String tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }
}
