package com.luizgustavz.library.repository.library;

import com.luizgustavz.library.model.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LibraryRepository extends JpaRepository<Library, UUID> {

}
