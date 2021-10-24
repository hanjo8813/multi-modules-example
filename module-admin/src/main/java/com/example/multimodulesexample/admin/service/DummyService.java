package com.example.multimodulesexample.admin.service;

import com.example.multimodulesexample.admin.dto.DummyDto;
import com.example.multimodulesexample.domain.repository.DummyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@Service
public class DummyService {

    private final DummyRepository dummyRepository;

    public DummyService(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public List<DummyDto> findDummyAll() {
        return dummyRepository.findAll().stream()
                .map(DummyDto::of)
                .collect(Collectors.toList());
    }
}
