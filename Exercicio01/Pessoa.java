package Exercicio01;

/*Exercicio 01 - Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos dados de uma
 pessoa. Crie um método para calcular a idade da pessoa */

public class Pessoa {
        //1º - defina os atributos
        private String nome;
        private int dataNascimento;
        private int dataAtual;
        private float altura;

        // 2º - defina os metodos de acesso
    public Pessoa(String nome, int dataNascimento, int dataAtual, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataAtual = dataAtual;
        this.altura = altura;
    }
        // 3º - metodo de calculo da idade
        public int getCalculoIdade(){
        return (dataAtual - dataNascimento);
        }

        public String getImprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Data atual: " + dataAtual);
        System.out.println("Altura: " + altura);
            return null;
        }

        //4º - gere os getts e setts
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(int dataAtual) {
        this.dataAtual = dataAtual;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
