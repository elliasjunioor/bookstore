package com.elias.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {

    private Integer id;

    private String nome;

    private String descricao;

}
