package com.MC.Ejercicio4.repository;

import com.MC.Ejercicio4.entity.Gatito;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GatitoRepository extends JpaRepository<Gatito, Long> {
    List<Gatito> findAll();
}
