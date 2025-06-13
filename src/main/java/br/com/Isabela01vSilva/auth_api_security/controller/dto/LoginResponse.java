package br.com.Isabela01vSilva.auth_api_security.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
