package com.luizgustavz.library.dto.library.response;

import java.util.UUID;

public record LibraryByIdLongDescriptionDto(
        String imageUrl,
        String title,
        String shortDescription,
        String longDescription,
        String publisher
) {
}
