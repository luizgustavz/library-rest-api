package com.luizgustavz.library.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table( name = "tb_library")
@Data
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(length = 500, name = "book_short_description", nullable = false)
    private String shortDescription;

    @Column(length = 800, name = "book_long_description", nullable = false)
    private String longDescription;

    private String publisher;

    @Embedded
    private Author author;
}
