package com.portfolioweb.moranjonathan.Repository;

import com.portfolioweb.moranjonathan.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
