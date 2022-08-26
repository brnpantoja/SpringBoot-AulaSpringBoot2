package academy.devdojo.springboot2.util;

import academy.devdojo.springboot2.domain.Anime;

public class AnimeCreator {
    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("DBZ")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .id(1L)
                .name("DBZ")
                .build();
    }

    public static Anime createValidUpdateAnime() {
        return Anime.builder()
                .name("DBZ")
                .build();
    }

}
