package com.intur.user.controller;

import com.intur.user.model.User;
import com.intur.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

// Controlador responsável pelo upload da imagem de perfil do usuário
@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    @Autowired
    private UserService userService;

    // Endpoint para upload da imagem de perfil do usuário logado
    @PostMapping("/upload-image")
    public ResponseEntity<User> uploadProfileImage(@RequestParam("file") MultipartFile file,
                                               @AuthenticationPrincipal UserDetails userDetails) {
    String email = userDetails.getUsername();
    User user = userService.findByEmail(email).orElseThrow();

    // Apenas salva o nome do arquivo como imagemPerfilUrl (ou um valor fixo)
    String url = "local/" + file.getOriginalFilename();
    user.setImagemPerfilUrl(url);
    userService.save(user);

    // Retorna o perfil do usuário atualizado
    return ResponseEntity.ok(user);
}
} 