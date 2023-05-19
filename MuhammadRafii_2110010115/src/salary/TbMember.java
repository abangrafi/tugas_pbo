/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ACER
 */
    public class TbMember {
    private int idMember;
    private String namaMember;
    private String alamat;
    private String noTelepon;

    // Constructor
    public TbMember(int idMember, String namaMember, String alamat, String noTelepon) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    // Getters and setters
    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
}

