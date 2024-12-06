package pe.edu.cibertec.DAWI_BRUNO_VILLAFANA_RICARDO.service;

import pe.edu.cibertec.DAWI_BRUNO_VILLAFANA_RICARDO.dto.FilmDetailDto;
import pe.edu.cibertec.DAWI_BRUNO_VILLAFANA_RICARDO.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findFilmById(int id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);
}
