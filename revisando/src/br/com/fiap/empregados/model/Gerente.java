package br.com.fiap.empregados.model;

public class Gerente extends Empregado {

    private double bonus;

    public Gerente(double salario, double bonus) {
        super(salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gerente{");
        sb.append("bonus=").append(bonus);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
