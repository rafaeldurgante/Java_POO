package com.livrojava.materiais;

public class Materiais {
    
    public static void main(String[] args){
        Livros livro = new Livros("Tecnologia", "Java Avançado", "Editora ABC", 3, "123-A", "Rafael Durgante");
        Revista Revista = new Revista("ADS", "Tech", "Coleção TI", "Editora Valente");
        
        System.out.println("Intormações do Livro");
        livro.mostrarGeral();
        
        System.out.println("\n################################");
        System.out.println("Informações da Revista");
        Revista.mostrarGeral();
    }
    
}
