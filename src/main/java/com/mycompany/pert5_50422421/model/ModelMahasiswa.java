/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_50422421.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity // Menandakan class ini adalah tabel di database
@Table(name = "mahasiswa") // Nama tabel di DB
public class ModelMahasiswa {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    @Column(name = "id")
    private int id;

    @Column(name = "npm", nullable = false, length = 10)
    private String npm;

    @Column(name = "nama", nullable = false, length = 50)
    private String nama;

    @Column(name = "semester", nullable = false, length = 2)
    private int semester;

    @Column(name = "ipk", nullable = false, length = 4)
    private float ipk;

    public ModelMahasiswa() {} // Constructor kosong untuk Hibernate

    // Constructor lengkap
    public ModelMahasiswa(int id, String npm, String nama, int semester, float ipk) {
        this.id = id;
        this.npm = npm;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
    
    @Override
    public String toString() {
        // Menampilkan data ketika dicetak
        return "Mahasiswa{" +
                "id=" + id +
                ", npm='" + npm + '\'' +
                ", nama='" + nama + '\'' +
                ", semester=" + semester +
                ", ipk=" + ipk +
                '}';
    }
}
