package com.chmmaestro.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {

}
