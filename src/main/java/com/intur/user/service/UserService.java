package com.intur.user.service;

import com.intur.user.model.User;
import com.intur.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Serviço responsável pela lógica de negócio dos usuários
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Retorna todos os usuários cadastrados
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // Busca um usuário pelo ID
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    // Busca um usuário pelo e-mail
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Salva (cria ou atualiza) um usuário
    public User save(User user) {
        return userRepository.save(user);
    }

    // Remove um usuário pelo ID
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
} 