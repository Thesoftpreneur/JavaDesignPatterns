package com.amberlion.otherStuff.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class WithCounter {

    public static void main(String[] args) {
        System.out.println(getRankingsWithStream(IMDB_TOP_MOVIES.stream()));
    }

    public static final List<String> IMDB_TOP_MOVIES = Arrays.asList("The Shawshank Redemption",
            "The Godfather", "The Godfather II", "The Dark Knight");


    public static List<String> getRankingsWithStream(Stream<String> movies) {
        List<String> rankings = new ArrayList<>();
        movies.forEach(withCounter((i, movie) -> {
            String ranking = (i + 1) + ": " + movie;
            rankings.add(ranking);
        }));

        return rankings;
    }

    public static <T> Consumer<T> withCounter(BiConsumer<Integer, T> consumer) {
        AtomicInteger counter = new AtomicInteger(0);
        return item -> consumer.accept(counter.getAndIncrement(), item);
    }
}