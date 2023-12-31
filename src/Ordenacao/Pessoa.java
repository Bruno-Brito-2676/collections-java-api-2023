package Ordenacao;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.getIdade());
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public String toString() {
        return "Pessoa{nome='" + this.nome + "', idade=" + this.idade + ", altura=" + this.altura + "}";
    }
}
