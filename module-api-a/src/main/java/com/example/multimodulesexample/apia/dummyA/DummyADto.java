package com.example.multimodulesexample.apia.dummyA;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DummyADto {
    private Long id;
    private String text;

    static public DummyADto of(DummyA dummyA){
        return DummyADto.builder()
                .id(dummyA.getId())
                .text(dummyA.getText())
                .build();
    }
}