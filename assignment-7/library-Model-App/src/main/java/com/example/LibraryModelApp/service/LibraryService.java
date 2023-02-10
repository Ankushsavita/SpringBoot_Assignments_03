package com.example.LibraryModelApp.service;

import com.example.LibraryModelApp.LibraryModelAppApplication;
import com.example.LibraryModelApp.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private static List<Library> libraries = new ArrayList<>();
    private static int libraryCount = 0;

    static{
        libraries.add(new Library("R S Library","DayalBagh Road, Agra",++libraryCount,"Reading, Study & Book bank Centre"));
        libraries.add(new Library("ECON library","Gwalior Road, Agra",++libraryCount,"Digital & Internet Facility Centre"));
        libraries.add(new Library("Smart library Centre","Mg Road, Agra",++libraryCount,"Photography & Printing Facility Centre"));
        libraries.add(new Library("Shanti library","Sikandra Road, Agra",++libraryCount,"Separate Reading Hall with 100 Seating Capacity Centre"));
        libraries.add(new Library("Adhyan library"," Shahganj, Agra",++libraryCount,"Departmental Study Centre"));
    }

    public void addLibrary(Library library){
        libraries.add(library);
    }

    public List<Library> findAll(){ // business logic
        return libraries;
    }

    public Library findByName(String name){
        for(Library library : libraries){
            if(library.getName().equals(name)){
                return library;
            }
        }
       return null;
    }

}
