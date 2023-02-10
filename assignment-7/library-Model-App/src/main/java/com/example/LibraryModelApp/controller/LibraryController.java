package com.example.LibraryModelApp.controller;

import com.example.LibraryModelApp.model.Library;
import com.example.LibraryModelApp.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vi/library-app")
public class LibraryController {

    @Autowired
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService){ // Dependency Injection
        this.libraryService = libraryService;
    }

    // addLibrary
    @PostMapping("/add-library")
    public void addLibrary(@RequestBody Library library){
        libraryService.addLibrary(library);
    }

    // getAllLibrary-endpoint
    // http://localhost:8080/api/vi/library-app/find-all
    @GetMapping("/find-all")
    public List<Library> findAllLibrary(){
        return libraryService.findAll();
    }


    // getLibraryByName- endpoint
    // http://localhost:8080/api/vi/library-app/find-library/libraryName/R%20S%20Library
    @GetMapping("/find-library/libraryName/{libraryName}")
    public Library findLibraryByName(@PathVariable("libraryName") String name){
        return libraryService.findByName(name);
    }


}
