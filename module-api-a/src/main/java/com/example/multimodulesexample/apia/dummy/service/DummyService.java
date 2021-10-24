package com.example.multimodulesexample.apia.dummy.service;

import com.example.multimodulesexample.apia.dummy.dto.DummyDto;
import com.example.multimodulesexample.domain.repository.DummyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class DummyService {

    private final DummyRepository dummyRepository;

    public List<DummyDto> findDummyAll() {
        return dummyRepository.findAll().stream()
                .map(DummyDto::of)
                .collect(Collectors.toList());
    }
}
