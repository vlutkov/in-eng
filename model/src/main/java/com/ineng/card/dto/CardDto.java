package com.ineng.card.dto;

import lombok.Builder;

@Builder
public record CardDto(Long id,
                      String ru,
                      String eng,
                      Long speechPartId) {
}
