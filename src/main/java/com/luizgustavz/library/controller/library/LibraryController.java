package com.luizgustavz.library.controller.library;

import com.luizgustavz.library.dto.library.request.LibrarySaveLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdShortDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllShortDescriptionDto;
import com.luizgustavz.library.services.library.LibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/library",  produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public class LibraryController {

    private final LibraryService service;
    public LibraryController(LibraryService aService) {
         this.service = aService;
    }

    @PostMapping("/save")
    public ResponseEntity<LibrarySaveLongDescriptionDto> save(@RequestBody LibrarySaveLongDescriptionDto librarySave){
        return ResponseEntity.status(HttpStatus.CREATED)
                    .body(service.save(librarySave));
    }

    @GetMapping("/list/short")
    public ResponseEntity<List<LibraryFindAllShortDescriptionDto>> findAllShortDescription(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findAllShortDescription());
    }

    @GetMapping("/list/short/{uuid}")
    public ResponseEntity<LibraryByIdShortDescriptionDto> findByIdShortDescription(@PathVariable UUID uuid){
        return ResponseEntity.status(HttpStatus.OK)
                        .body(service.findByIdShortDescription(uuid));
    }

    @GetMapping("/list/short/t/{title}")
    public ResponseEntity<List<LibraryFindAllShortDescriptionDto>> findByTitleShortDescription(@PathVariable String title){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findAllByTitleShortDescription(title));
    }

    @GetMapping("/list/long")
    public ResponseEntity<List<LibraryFindAllLongDescriptionDto>> findAllLongDescription(){
        return ResponseEntity.status(HttpStatus.OK)
                        .body(service.findAllLongDescription());
    }

    @GetMapping("/list/long/{uuid}")
    public ResponseEntity<LibraryByIdLongDescriptionDto> findByIdLongDescription(@PathVariable UUID uuid){
        return ResponseEntity.status(HttpStatus.OK)
                        .body(service.findByIdLongDescription(uuid));
    }

    @GetMapping("/list/long/t/{title}")
    public ResponseEntity<List<LibraryFindAllLongDescriptionDto>> findByTitleLongDescription(@PathVariable String title){
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findAllByTitleLongDescription(title));
    }

    @DeleteMapping("/delete/{uuid}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID uuid){
        service.deleteById(uuid);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}