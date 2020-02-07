package ru.alishev.springcourse.genres;

import ru.alishev.springcourse.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
