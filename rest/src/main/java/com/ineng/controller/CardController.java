package com.ineng.controller;

import com.ineng.card.CardService;
import com.ineng.card.dto.CardDto;
import com.ineng.card.filter.CardFilter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cards")
@RequiredArgsConstructor
public class CardController {

    private CardService cardService;

    @GetMapping
    public List<CardDto> findCards(CardFilter filter,
                                   @ParameterObject
                                   @PageableDefault Pageable page) {

        return cardService.getCards(filter, page);
    }

    @GetMapping("/{id}")
    public CardDto findCard(@NotNull(message = "Не передан ИД карточки")
                            @PathVariable("id") Long id) {

        return cardService.getCard(id);
    }

    @PostMapping
    public CardDto addCard(@Valid
                           @NotNull(message = "Не передан объект карточки")
                           @RequestBody CardDto card) {

        return cardService.addCard(id);
    }

    @PutMapping
    public CardDto updateCard(@Valid
                              @NotNull(message = "Не передан объект карточки")
                              @RequestBody CardDto card) {

        return cardService.updateCard(id);
    }

    @DeleteMapping("/{id}")
    public CardDto deleteCard(@Valid
                              @NotNull(message = "Не передан ИД карточки")
                              @PathVariable Long id) {

        return cardService.deleteСard(id);
    }
}