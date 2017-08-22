package org.paumard.collections;

import org.paumard.collections.model.Actor;
import org.paumard.collections.model.Movie;
import org.paumard.collections.model.MovieReader;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jingshanyin on 8/21/17.
 */
public class ConcurrentHashMapParallelPatterns {

    public static void main(String[] args) {
        ConcurrentHashMap<Actor, Set<Movie>> map = new ConcurrentHashMap<>();

        MovieReader reader = new MovieReader();
        reader.addActorsToMap(map);

        System.out.println("# Actors = " + map.size());

        Integer maxMoviesForOneActor = map.reduce(10, (actor, movies) -> movies.size(), Integer::max);
        System.out.println("Max movies for one actor = " + maxMoviesForOneActor);

        Actor mostSeenActor = map.search(10, (actor, movies) -> movies.size() == maxMoviesForOneActor ? actor : null);
        System.out.println("Most seen acotr = " + mostSeenActor);

        Integer numberOfMoviesReferences = map.reduce(10, (actor, movies) -> movies.size(), Integer::sum);
        System.out.println("Average movies per actor = " + numberOfMoviesReferences / map.size());

    }
}
