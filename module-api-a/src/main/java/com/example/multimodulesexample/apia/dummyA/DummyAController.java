package com.example.multimodulesexample.apia.dummyA;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DummyAController {

    private final DummyAService dummyAService;

    @GetMapping("/dummy-a")
    public ResponseEntity<List<DummyADto>> getAll(){
        List<DummyADto> response = dummyAService.findDummyAll();
        return ResponseEntity.ok(response);
    }

}