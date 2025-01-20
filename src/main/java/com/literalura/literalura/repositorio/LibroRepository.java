package com.literalura.literalura.repositorio;

import com.literalura.literalura.modelos.Autor;
import com.literalura.literalura.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByIdioma(String idioma);
    List<Libro> findByTituloContainingIgnoreCase(String titulo);

    @Query("SELECT l FROM Libro l ")
    List<Libro> obtenerLibrosRegistrados();

}
