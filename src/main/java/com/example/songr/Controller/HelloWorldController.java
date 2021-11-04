package com.example.songr.Controller;

import com.example.songr.Model.Album;
import com.example.songr.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


import java.util.List;

        @Controller
public class HelloWorldController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/capitalize/{sentence}")
    public String capitalize(@PathVariable String sentence){
        return "capitalize";
    }

    @GetMapping("/album")
    public String album(Model model){
        List<Album> albumList = albumRepository.findAll();
        model.addAttribute("album", albumList);
        return "album";
    }
    @GetMapping ("/")
    public String home(){
        return "home";
    }
    @GetMapping("/addalbums")
    public String addAlbumPage() {
        return "addAlbum";
    }


            @PostMapping("/addalbums")
            public RedirectView createAlbum(Album album){
                albumRepository.save(album);
                return new RedirectView("/albums");
            }
}
