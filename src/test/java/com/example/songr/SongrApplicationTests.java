

package com.example.songr;

import com.example.songr.Model.Album;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

    @Test
    void contextLoads() {
        Album newAlbum = new Album("Bat Out of Hell", "meat Loaf", 7,2785,"https://upload.wikimedia.org/wikipedia/en/thumb/0/00/Bat_out_of_Hell.jpg/220px-Bat_out_of_Hell.jpg");
        Assertions.assertEquals("Bat Out of Hell", newAlbum.getTitle());
        Assertions.assertEquals("meat Loaf", newAlbum.getArtist());
        Assertions.assertEquals(7, newAlbum.getSongCount());
        Assertions.assertEquals(2785, newAlbum.getLength());
        Assertions.assertEquals("https://upload.wikimedia.org/wikipedia/en/thumb/0/00/Bat_out_of_Hell.jpg/220px-Bat_out_of_Hell.jpg", newAlbum.getImageUrl());
    }

}
