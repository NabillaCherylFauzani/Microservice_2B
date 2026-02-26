package com.nabilla.produk.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nabilla.produk.model.produk;

@Repository
public interface ProdukRepository extends JpaRepository<produk, Long> {


    
}