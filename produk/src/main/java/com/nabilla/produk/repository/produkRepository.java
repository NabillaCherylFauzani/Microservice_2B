package com.nabilla.produk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nabilla.produk.model.produk;
@Repository

public interface produkRepository extends JpaRepository<produk, Long> {

}