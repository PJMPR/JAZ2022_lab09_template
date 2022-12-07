package com.westeros.movies.updater;


import com.westeros.data.repositories.ICatalogData;
import com.westeros.moviesclient.IMoviesClient;
import com.westeros.tools.safeinvoker.SafeInvoking;

import java.time.LocalDate;

public class MoviesUpdater implements IUpdateMovies{

    private final ICatalogData dbCatalog;
    private final IMoviesClient moviesClient;
    private final SafeInvoking invoker;

    public MoviesUpdater(ICatalogData dbCatalog, IMoviesClient moviesClient, SafeInvoking invoker) {
        this.dbCatalog = dbCatalog;
        this.moviesClient = moviesClient;
        this.invoker = invoker;
    }

    @Override
    public void updateByDateRange(LocalDate from, LocalDate to) {

    }
}
