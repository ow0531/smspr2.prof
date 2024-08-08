package com.thc.smspr2.repository;

import com.thc.smspr2.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String> {
    Optional<RefreshToken> findByContent(String Content);
    List<RefreshToken> findByTbuserId(String TbuserId);
}
