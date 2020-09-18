package com.eventxorizons;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightService {

    public Stream<CompletableFuture<Quote>> getQuotes(){

        var websites = List.of("website1", "website2", "website3");
       return websites.stream().map(this::getQuote);


    }

    public CompletableFuture<Quote> getQuote(String website) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote for: "  + website);

            var random = new Random();

            LongTask.simulate(1_000 + random.nextInt(2_000));

            var price = 100 + random.nextInt(10);
            return new Quote(website, price);
        });

    }
}
