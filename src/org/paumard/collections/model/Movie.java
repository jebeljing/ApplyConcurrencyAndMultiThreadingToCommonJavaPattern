package org.paumard.collections.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jingshanyin on 8/21/17.
 */
public class Movie {

    private String title;
    private int releaseYear;

    private Set<Actor> actors = new HashSet<>();

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String title() {
        return this.title;
    }

    public int releaseYear() {
        return this.releaseYear;
    }

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public Set<Actor> actors() {
        return this.actors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (releaseYear != movie.releaseYear) return false;
        if (!title.equals(movie.title)) return false;
        return actors.equals(movie.actors);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + releaseYear;
        result = 31 * result + actors.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", actors=" + actors +
                '}';
    }
}

