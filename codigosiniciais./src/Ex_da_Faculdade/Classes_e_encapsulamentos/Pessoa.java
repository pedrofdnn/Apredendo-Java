package Ex_da_Faculdade.Classes_e_encapsulamentos;

import java.util.Random;

// classe
public class Pessoa {
    // atributos
    private String nome;
    private double codigo_identificador;
    private Random aleatorio;

    // métodos
    public Pessoa(String nome) {
        aleatorio = new Random();
        this.setNome(nome);
        this.codigo_identificador = aleatorio.nextDouble();
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCodigoIdentificador() {
        return this.codigo_identificador;
    }

    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Pedro Fernandes");
        System.out.println("Pessoa 1: " + p1.getNome() + " - Codigo Identificador: " + p1.getCodigoIdentificador());
        Pessoa p2 = new Pessoa("Maria Fernandes");
        System.out.println("Pessoa 2: " + p2.getNome() + " - Codigo Identificador: " + p2.getCodigoIdentificador());
    }
}
