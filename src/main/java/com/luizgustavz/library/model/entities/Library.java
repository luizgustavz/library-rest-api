package com.luizgustavz.library.model.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table( name = "tb_library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "image_url")
    private String imageUrl;
    private String title;
//    private Author author; // associacao ( ainda fazer )

    @Column( length = 1000, name = "short_description")
    private String shortDescription;
    @Column( length = 3000, name = "long_description")
    private String longDescription;
    private String publisher;

    public Library(){
    }

    public Library(final UUID aUuid, String aImageUrl, String aTitle, String aShortDescription, String aLongDescription, String aPublisher) {
        this.uuid = aUuid;
        this.imageUrl = aImageUrl;
        this.title = aTitle;
        this.shortDescription = aShortDescription;
        this.longDescription = aLongDescription;
        this.publisher = aPublisher;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(uuid, library.uuid) && Objects.equals(title, library.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, title);
    }
}
