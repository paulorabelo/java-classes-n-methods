package br.com.mrgsoft.classesandmethods;

public class Pessoa {

    private String nome;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("Exibir apenas nome: " + nome);
    }
    //Sobrecarga a diferença está nos parametros
    public void exibirDados(String nome, int idade){
        System.out.println("Nome: " + nome + " idade: " + idade);
    }
}
