package com.luizgustavz.library.model.repository.library;

import com.luizgustavz.library.model.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ILibraryRepository extends JpaRepository<Library, UUID> {

}
