
package com.example.jpaestudo.Models;

import jakarta.persistence.*;
import org.hibernate.tool.schema.internal.ColumnDefinitions;

@Entity
@Table(name = "imagens")
public class imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, columnDefinition = "String")
    private String nome;

    @Column(name = "tipo", nullable = false, columnDefinition = "String")
    private String tipo;

    @Lob
    @Column(name = "base64", nullable = false, columnDefinition = "String")
    private String base64;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
