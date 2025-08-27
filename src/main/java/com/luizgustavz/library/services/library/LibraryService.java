package com.luizgustavz.library.services.library;

import com.luizgustavz.library.dto.library.request.LibrarySaveLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdShortDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllShortDescriptionDto;
import com.luizgustavz.library.mapper.LibraryMapper;
import com.luizgustavz.library.model.repository.library.ILibraryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class LibraryService {

    private final ILibraryRepository repository;
    private final LibraryMapper mapper;

    public LibraryService(ILibraryRepository aRpository, LibraryMapper aMapper) {
        this.repository = aRpository;
        this.mapper = aMapper;
    }

    // SAVE -> Method to save a new Library entity using a DTO for complete details.
    @Transactional
    public LibrarySaveLongDescriptionDto save(LibrarySaveLongDescriptionDto requestSave) {
        return mapper.forLibrarySaveLongDescriptionDto(
                repository.save(
                        mapper.forLibrarySave(requestSave)
                ));
    }

    // FIND ALL -> Method to retrieve all library short description dtos.
    public List<LibraryFindAllShortDescriptionDto> findAllShortDescription(){
        return mapper.toLibraryFindAllShortDescriptionDtoList(
                repository.findAll());
    }

    // FIND ALL -> Method to retrieve all library long description dtos.
    public List<LibraryFindAllLongDescriptionDto> findAllLongDescription(){
        return mapper.toLibraryFindAllLongDescriptionDtoList(
                repository.findAll());
    }

    // FIND BY ID -> method to find a short description library entity by its UUID using dtos.
    public LibraryByIdShortDescriptionDto findByIdShortDescription(UUID uuid) {
        return mapper.forLibraryFindByIdShortDescriotionDto(
                repository.findById(uuid).get());
    }

    // FIND BY ID -> Method to find a long description library entity by its UUID using dtos.
    public LibraryByIdLongDescriptionDto findByIdLongDescription(UUID  uuid){
            return mapper.forLibraryFindByIdLongDescriptionDto(
                    repository.findById(uuid).get());
    }

    // DELETE BY ID -> Method to delete a library entity by its UUID.
    @Transactional
    public void deleteById(UUID uuid){
        repository.deleteById(uuid);
    }

    // FIND BY TITLE -> Method to find all librarys by title short descroiption using dtos.
    public List<LibraryFindAllShortDescriptionDto> findAllByTitleShortDescription(String title){
        return mapper.forLibraryQueryListAllByNameShortDescriptionDto(
                repository.findByTitle(title));
    }

    // FIND BY TITLE -> Method to find all librarys by title long description using dtos.s
    public List<LibraryFindAllLongDescriptionDto> findAllByTitleLongDescription(String title){
        return mapper.forLibraryQueryListAllByNameLongDescriptionDto(
                repository.findByTitle(title));
    }
}
