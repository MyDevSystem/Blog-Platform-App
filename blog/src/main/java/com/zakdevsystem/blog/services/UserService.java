package com.zakdevsystem.blog.services;

import com.zakdevsystem.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
