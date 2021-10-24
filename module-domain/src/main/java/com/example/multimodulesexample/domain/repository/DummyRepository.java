package com.example.multimodulesexample.domain.repository;

import com.example.multimodulesexample.domain.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
