package com.finder.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    SongController(){

    }

    @PostMapping("/songStats")
    public Song songStats(@RequestBody String lyrics){
        return new Song(lyrics);
    }

    @PostMapping("/translate")
    public String translate(@RequestBody String lyrics){
        return "";
    }

}
