package com.example.multimodulesexample.admin.dto;

import com.example.multimodulesexample.domain.entity.Dummy;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
public class DummyDto {
    private Long id;
    private String text;

    static public DummyDto of(Dummy dummy){
        return DummyDto.builder()
                .id(dummy.getId())
                .text(dummy.getText())
                .build();
    }
}
