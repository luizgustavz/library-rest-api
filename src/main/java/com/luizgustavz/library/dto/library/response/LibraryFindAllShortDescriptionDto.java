package com.luizgustavz.library.dto.library.response;

import java.util.UUID;

public record LibraryFindAllShortDescriptionDto(
        UUID uuid,
        String imageUrl,
        String title,
        String shortDescription,
        String publisher
) {
}
