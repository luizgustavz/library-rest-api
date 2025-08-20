package com.luizgustavz.library.model.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_list_book")
public class ListBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public ListBooks(){

    }

    public ListBooks(
            String name,
            Long id
    ) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListBooks listBooks = (ListBooks) o;
        return Objects.equals(id, listBooks.id) && Objects.equals(name, listBooks.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
