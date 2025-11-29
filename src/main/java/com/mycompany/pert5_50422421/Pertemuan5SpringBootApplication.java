/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_50422421;

import com.mycompany.pert5_50422421.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author ASUS
 */
@SpringBootApplication // Mengaktifkan auto-configuration, component scan, dll.
public class Pertemuan5SpringBootApplication implements CommandLineRunner {

    @Autowired
    private MahasiswaController mhsController; // Inject Controller

    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5SpringBootApplication.class, args);
        // Menjalankan aplikasi Spring Boot
    }

    @Override
    public void run(String... args) throws Exception {
        // Dipanggil otomatis setelah Spring Boot berhasil jalan
        mhsController.tampilkanMenu(); // Menjalankan menu CLI
    }
}