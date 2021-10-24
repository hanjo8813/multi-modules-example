package com.example.multimodulesexample.apia.dummy.controller;

import com.example.multimodulesexample.apia.dummy.dto.DummyDto;
import com.example.multimodulesexample.apia.dummy.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DummyController {

    private final DummyService dummyService;

    @GetMapping("/dummy")
    public ResponseEntity<List<DummyDto>> getAll(){
        List<DummyDto> response = dummyService.findDummyAll();
        return ResponseEntity.ok(response);
    }

}
