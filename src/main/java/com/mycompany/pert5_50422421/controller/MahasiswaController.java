/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_50422421.controller;

import com.mycompany.pert5_50422421.model.ModelMahasiswa;
import com.mycompany.pert5_50422421.repository.MahasiswaRepository;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ASUS
 */
@Controller // Menandakan bahwa class ini adalah Controller di Spring Boot
public class MahasiswaController {

    @Autowired // Spring menginject repository secara otomatis
    private MahasiswaRepository mahasiswaRepository;

    public void tampilkanMenu() {
        Scanner scanner = new Scanner(System.in);
        int opsi;

        // Perulangan menu CLI
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua mahasiswa");
            System.out.println("2. Tambah mahasiswa baru");
            System.out.println("3. Cek koneksi database");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            opsi = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer ENTER

            switch (opsi) {
                case 1:
                    tampilkanSemuaMahasiswa(); // menampilkan data
                    break;
                case 2:
                    tambahMahasiswa(scanner); // input data baru
                    break;
                case 3:
                    cekKoneksi(); // testing koneksi DB
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }

        } while (opsi != 4);
    }

    private void tampilkanSemuaMahasiswa() {
        // Mengambil seluruh data mahasiswa dari database
        List<ModelMahasiswa> mahasiswaList = mahasiswaRepository.findAll();

        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            // Menampilkan setiap mahasiswa dengan toString()
            mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa));
        }
    }

    private void tambahMahasiswa(Scanner scanner) {
        // Input dari user
        System.out.print("Masukkan NPM : ");
        String npm = scanner.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Semester : ");
        int semester = scanner.nextInt();
        System.out.print("Masukkan IPK : ");
        float ipk = scanner.nextFloat();

        // Membuat object ModelMahasiswa
        ModelMahasiswa mahasiswa = new ModelMahasiswa(0, npm, nama, semester, ipk);

        // Menyimpan ke database melalui repository
        mahasiswaRepository.save(mahasiswa);

        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    private void cekKoneksi() {
        try {
            mahasiswaRepository.findAll(); // mencoba query
            System.out.println("Koneksi ke database berhasil.");
        } catch (Exception e) {
            System.out.println("Gagal terhubung ke database.");
        }
    }
}