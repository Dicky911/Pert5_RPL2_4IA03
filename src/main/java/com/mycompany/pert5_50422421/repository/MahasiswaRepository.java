/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_50422421.repository;

import com.mycompany.pert5_50422421.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */

@Repository // Menandakan sebagai bean repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {
    // Tidak perlu menulis query — semua CRUD otomatis tersedia dari JpaRepository
}