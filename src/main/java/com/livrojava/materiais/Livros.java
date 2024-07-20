package com.livrojava.materiais;

public class Livros extends Biblioteca{
    private final String editora;
    private final int edicao;
    private final String isbn;
    private final String autor;

    public Livros(String assunto, String titulo, String editora, int edicao, String isbn, String autor) {
        super(assunto, titulo);
        this.editora = editora;
        this.edicao = edicao;
        this.isbn = isbn;
        this.autor = autor;
    }
    
    @Override
    public void mostrarGeral(){
        super.mostrarGeral();
        System.out.println("Editora: "+ editora);
        System.out.println("Edição: "+ edicao);
        System.out.println("ISBN: "+ isbn);
        System.out.println("Autor: "+ autor);
    }
}


