package com.luizgustavz.library.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Author {

    @Column(name = "name_author")
    private String name;

    @Column(name = "sobrename_author")
    private String sobrename;

    @Column(name = "age_author")
    private int age,

    private String birthCity,
    private String birthState,
    private int birthday,
}
