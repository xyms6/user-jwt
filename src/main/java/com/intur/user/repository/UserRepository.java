package com.intur.user.repository;

import com.intur.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// Interface responsável por acessar o banco de dados de usuários
public interface UserRepository extends JpaRepository<User, Long> {
    // Busca um usuário pelo e-mail
    Optional<User> findByEmail(String email);
} 