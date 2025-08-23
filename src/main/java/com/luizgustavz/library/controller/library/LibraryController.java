package com.luizgustavz.library.controller.library;

import com.luizgustavz.library.dto.library.request.LibrarySaveLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryByIdShortDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllLongDescriptionDto;
import com.luizgustavz.library.dto.library.response.LibraryFindAllShortDescriptionDto;
import com.luizgustavz.library.services.library.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/library")
public class LibraryController {

    private final LibraryService service;
    public LibraryController(LibraryService aService) {
         this.service = aService;
    }

    @PostMapping("/save")
    public LibrarySaveLongDescriptionDto save(@RequestBody LibrarySaveLongDescriptionDto librarySave){
        return service.save(librarySave);
    }

    @GetMapping("/list/short")
    public List<LibraryFindAllShortDescriptionDto> findAllShortDescription(){
        return service.findAllShortDescription();
    }

    @GetMapping("/list/short/{uuid}")
    public LibraryByIdShortDescriptionDto findByIdShortDescription(@PathVariable UUID uuid){
        return service.findByIdShortDescription(uuid);
    }

    @GetMapping("/list/long")
    public List<LibraryFindAllLongDescriptionDto> findAllLongDescription(){
        return service.findAllLongDescription();
    }

    @GetMapping("/list/long/{uuid}")
    public LibraryByIdLongDescriptionDto findByIdLongDescription(@PathVariable UUID uuid){
        return service.findByIdLongDescription(uuid);
    }

    @DeleteMapping("/delete/{uuid}")
    public void deleteById(@PathVariable UUID uuid){
        service.deleteById(uuid);
    }




}