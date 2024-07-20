package com.livrojava.materiais;

public class Biblioteca {

  protected String assunto;
  protected String titulo;
  
  public Biblioteca (String assunto, String titulo){
      this.assunto = assunto;
      this.titulo = titulo;
  }
  
  public void mostrarGeral(){
      System.out.println("Assunto: "+ assunto);
      System.out.println("Titulo: " + titulo);
  }
}
