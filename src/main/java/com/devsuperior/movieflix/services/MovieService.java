package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.dto.MovieGenreDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Autowired
    private GenreRepository  genreRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findByGenreAndSortTitle(Pageable pageable, Long genreId) {
        List<Genre> genres = (genreId == 0L) ? null : Arrays.asList(genreRepository.getOne(genreId));
        Page<Movie> page = repository.findByGenreAndSortTitle(genres, pageable);
        return page.map(x -> new MovieDTO(x));
    }

    @Transactional(readOnly = true)
    public MovieGenreDTO findById(Long id) {
        Optional<Movie> obj = repository.findById(id);
        Movie entity = obj.orElseThrow(()  -> new ResourceNotFoundException("Entity not found"));
        return new MovieGenreDTO(entity);
    }

}
