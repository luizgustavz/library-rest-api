package com.luizgustavz.library.dto.library.request;

public record LibrarySaveLongDescriptionDto(
        String imageUrl,
        String title,
        String shortDescription,
        String longDescription,
        String publisher
) {
}
