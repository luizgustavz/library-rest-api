package com.luizgustavz.library.dto.library.response;

import java.util.UUID;

public record LibraryFindAllLongDescriptionDto(
        UUID uuid,
        String imageUrl,
        String title,
        String shortDescription,
        String longDescription,
        String publisher
) {
}
