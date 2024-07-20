package com.livrojava.materiais;

public class Revista extends Biblioteca {
    private final String colecao;
    private final String editora;
    
    public Revista(String assunto, String titulo, String colecao, String editora) {
        super(assunto, titulo);
        this.colecao = colecao;
        this.editora = editora;
    }
    
    @Override
    public void mostrarGeral(){
        super.mostrarGeral();
        System.out.println("Coleção: "+ colecao);
        System.out.println("Editora: "+ editora);
    }
}
