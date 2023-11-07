package com.example.wutmongojpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaEntityRepository extends JpaRepository<JpaEntity, Long> {
}
