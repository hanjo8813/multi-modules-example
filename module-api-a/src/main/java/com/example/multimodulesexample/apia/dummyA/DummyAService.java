package com.example.multimodulesexample.apia.dummyA;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class DummyAService {

    private final DummyARepository dummyARepository;

    public List<DummyADto> findDummyAll() {
        return dummyARepository.findAll().stream()
                .map(DummyADto::of)
                .collect(Collectors.toList());
    }
}
