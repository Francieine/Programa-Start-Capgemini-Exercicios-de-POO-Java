package Exercicio01;

public class Main {
    public static void main(String[] args) {

        Pessoa fulano = new Pessoa("Fran", 1991,2022, 1.70f);
        System.out.println("Calculo idade é: " + fulano.getCalculoIdade());
        System.out.println("Os dados pessoais são: " + fulano.getImprimirDados());
    }
}
