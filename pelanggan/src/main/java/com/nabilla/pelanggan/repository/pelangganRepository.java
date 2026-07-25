package com.nabilla.pelanggan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nabilla.pelanggan.model.pelanggan;

@Repository
public interface pelangganRepository extends JpaRepository<pelanggan, Long> {
}