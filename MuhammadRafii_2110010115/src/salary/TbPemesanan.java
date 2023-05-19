/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
    public class TbPemesanan {
    private int idPemesanan;
    private int idMember;
    private int idKendaraan;
    private String tanggalPemesanan;

    // Constructor
    public TbPemesanan(int idPemesanan, int idMember, int idKendaraan, String tanggalPemesanan) {
        this.idPemesanan = idPemesanan;
        this.idMember = idMember;
        this.idKendaraan = idKendaraan;
        this.tanggalPemesanan = tanggalPemesanan;
    }

    // Getters and setters
    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(String tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }
}

