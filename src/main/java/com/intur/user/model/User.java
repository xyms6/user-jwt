package com.intur.user.model;

import jakarta.persistence.*;

// Entidade que representa um usuário do sistema
@Entity
public class User {
    // Identificador único do usuário (gerado automaticamente)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome do usuário
    private String nome;
    // E-mail do usuário (usado para login)
    private String email;
    // Senha do usuário (armazenada de forma segura)
    private String senha;
    // Papel do usuário: ADMIN, INSTRUTOR ou ALUNO
    private String role;
    // URL da imagem de perfil armazenada na nuvem (ex: Azure Blob Storage)
    private String imagemPerfilUrl;

    // Construtores
    public User() {}
    public User(Long id, String nome, String email, String senha, String role, String imagemPerfilUrl) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
        this.imagemPerfilUrl = imagemPerfilUrl;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getImagemPerfilUrl() { return imagemPerfilUrl; }
    public void setImagemPerfilUrl(String imagemPerfilUrl) { this.imagemPerfilUrl = imagemPerfilUrl; }
} 