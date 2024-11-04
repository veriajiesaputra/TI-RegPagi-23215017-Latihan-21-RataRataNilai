/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/*Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */
import java.util.Scanner;

public class Latihan_21_RataRataNilai {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Inisialisasi variabel total nilai
        double totalNilai = 0;

        // Loop untuk input nilai setiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // Menghitung rata-rata nilai
        double rataRata = totalNilai / jumlahMahasiswa;

        // Menampilkan hasil rata-rata
        System.out.printf("Maka, Rata-rata Nilainya adalah %.2f\n", rataRata);
        
        // Menutup scanner
        input.close();
    }
}

