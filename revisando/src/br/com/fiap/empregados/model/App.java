package br.com.fiap.empregados.model;

public class App {
    public static void main(String[] args) {
        Empregado e = new Empregado(10_000);

        Empregado g = new Gerente(10_000, 30);

        System.out.println(e);
        System.out.println(g);
    }
}
