package com.example.jpaestudo.Repository;

import com.example.jpaestudo.Models.imagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<imagem, Long> {
}
