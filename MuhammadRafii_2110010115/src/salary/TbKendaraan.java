/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
    public class TbKendaraan {
    private int idKendaraan;
    private String namaKendaraan;
    private String merk;
    private String tahun;

    // Constructor
    public TbKendaraan(int idKendaraan, String namaKendaraan, String merk, String tahun) {
        this.idKendaraan = idKendaraan;
        this.namaKendaraan = namaKendaraan;
        this.merk = merk;
        this.tahun = tahun;
    }

    // Getters and setters
    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}
