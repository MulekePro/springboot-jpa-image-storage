package com.example.jpaestudo.Controller;


import com.example.jpaestudo.DTO.ImgRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Convert")
public class RTController {


    @PostMapping
    public ResponseEntity<String>ReceberImagem(@RequestBody ImgRequest imagem){

        return ResponseEntity.ok("Imagem recebida: " + imagem.nome());

    }



}
