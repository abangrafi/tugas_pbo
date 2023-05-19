/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadrafii_2110010115;

import salary.TbDetailPemesanan;
import salary.TbKendaraan;
import salary.TbKonfirmasiPembayaran;
import salary.TbMember;
import salary.TbPemesanan;
import salary.TbPerpanjangan;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan class dan objek
        TbPerpanjangan perpanjangan = new TbPerpanjangan(1, 1, "2023-05-18", 3);

        TbMember member = new TbMember(1, "John Doe", "Jl. ABC No. 123", "08123456789");

        TbPemesanan pemesanan = new TbPemesanan(1, 1, 1, "2023-05-18");

        TbDetailPemesanan detailPemesanan = new TbDetailPemesanan(1, "John Doe", "Avanza", "2023-05-18");

        TbKendaraan kendaraan = new TbKendaraan(1, "Avanza", "Toyota", "2021");

        TbKonfirmasiPembayaran konfirmasipembayaran = new TbKonfirmasiPembayaran(1, "2023-05-18", 500000.0);
    }
}
