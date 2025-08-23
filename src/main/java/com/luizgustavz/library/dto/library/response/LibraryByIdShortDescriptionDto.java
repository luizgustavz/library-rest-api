package com.luizgustavz.library.dto.library.response;

public record LibraryByIdShortDescriptionDto(
        String imageUrl,
        String title,
        String shortDescription,
        String publisher
) {
}
