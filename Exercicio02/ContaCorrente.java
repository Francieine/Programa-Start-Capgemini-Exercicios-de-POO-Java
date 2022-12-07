/* Exercicio 02 - Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.*/

package Exercicio2;

public class ContaCorrente {

    private int numeroDaConta;
    private String nomeCorrentista;

    private String alterarNome;
    private int saldo;


    public ContaCorrente(int numeroDaConta, String nomeCorrentista, int saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 100;

    }
    public String getAlterarNome(){
        return alterarNome;
    }

    public int getSaldo(){
        return saldo;
    }

       public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
