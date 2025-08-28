package com.luizgustavz.library.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Table(name = "tb_list_book")
@Data
public class ListBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "list_name", nullable = false)
    private String name;
    }
}
