package br.com.fiap.empregados.model;

public class Empregado {

    private double salario;

    public double getProventos(){
        return salario;
    }

    public Empregado(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "salario=" + salario +
                '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
