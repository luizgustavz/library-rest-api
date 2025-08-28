package com.luizgustavz.library.mapper;

import com.luizgustavz.library.dto.library.request.LibrarySaveLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdShortDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllShortDescriptionDto;
import com.luizgustavz.library.model.entities.Library;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface LibraryMapper {

    // save
    Library forLibrarySave(LibrarySaveLongDescriptionDto librarySaveLognDescriptionDto);
    LibrarySaveLongDescriptionDto forLibrarySaveLongDescriptionDto(Library librarySave);

    // findAllShortDescription
    List<LibraryFindAllShortDescriptionDto> toLibraryFindAllShortDescriptionDtoList(List<Library> libraryShortList);

    // findByIdShortDescription
    LibraryByIdShortDescriptionDto forLibraryFindByIdShortDescriotionDto(Library library);
    @Mapping(target = "longDescription", ignore = true)
    Library forLibraryFindByIdShortDescription(LibraryByIdShortDescriptionDto libraryFindByIdShortDescriptionDto);

    // queryListAllByNameShortDescription
    List<LibraryFindAllShortDescriptionDto> forLibraryQueryListAllByNameShortDescriptionDto(List<Library> lib);

    // findAllLongDescription
    List<LibraryFindAllLongDescriptionDto> toLibraryFindAllLongDescriptionDtoList(List<Library> libraryLongList);

    // findByIdLongDescription
    LibraryByIdLongDescriptionDto forLibraryFindByIdLongDescriptionDto(Library library);
    Library forLibraryFindById(LibraryFindAllLongDescriptionDto libraryFindAllLongDescriptionDto);

    // queryListALlByNameLongDescription
    List<LibraryFindAllLongDescriptionDto> forLibraryQueryListAllByNameLongDescriptionDto(List<Library> libraryList);

    // queryPublisher
    Library queryPublisher(LibraryFindAllLongDescriptionDto libraryFindAllLongDescriptionDto);
    LibraryFindAllLongDescriptionDto forLibraryQueryPublisherDto(Library libraryOptional);

}
