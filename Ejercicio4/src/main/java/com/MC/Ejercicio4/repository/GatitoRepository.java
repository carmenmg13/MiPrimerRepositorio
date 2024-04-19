package com.MC.Ejercicio4.repository;

import com.MC.Ejercicio4.entity.Gatito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GatitoRepository extends JpaRepository<Gatito, Long> {
   // List<Gatito> findAll();
}
