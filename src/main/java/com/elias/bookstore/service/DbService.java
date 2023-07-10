package com.elias.bookstore.service;

import com.elias.bookstore.domain.Categoria;
import com.elias.bookstore.domain.Livro;
import com.elias.bookstore.repositories.CategoriaRepository;
import com.elias.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DbService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instaciaBancoDeDados(){

        Categoria categoria = new Categoria();
        categoria.setDescricao("Informática");
        categoria.setNome("Livros de TI");

        Categoria categoria2 = new Categoria();
        categoria2.setDescricao("Ficção");
        categoria2.setNome("Roupa Suja");

        Categoria categoria3 = new Categoria();
        categoria3.setDescricao("Arroz com Carne");
        categoria3.setNome("Feijão");

        Livro livro = new Livro(null, "CleanCode", "Garafinha", categoria);
        Livro livro2 = new Livro(null, "Monitor", "Sujo", categoria2);
        Livro livro3 = new Livro(null, "Celular", "Novo", categoria2);
        Livro livro4 = new Livro(null, "Cartão", "MasterCard", categoria3);
        Livro livro5 = new Livro(null, "Luva de Pedreiro", "Receba", categoria);

        categoria.setLivro(List.of(livro));
        categoria2.setLivro(List.of(livro2));
        categoria2.setLivro(List.of(livro3));
        categoria3.setLivro(List.of(livro4));
        categoria.setLivro(List.of(livro5));
        categoriaRepository.saveAll(Arrays.asList(categoria, categoria2, categoria3));
        livroRepository.saveAll(Arrays.asList(livro, livro2, livro3, livro4, livro5));

    }
}
