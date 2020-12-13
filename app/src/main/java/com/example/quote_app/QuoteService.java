package com.example.quote_app;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteService {
    @GET("/random")
    Call<QuoteFeed> getRandomQuote();
}
