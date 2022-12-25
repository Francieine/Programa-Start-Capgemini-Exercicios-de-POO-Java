package Exercicio03POO;

/* 3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
Crie uma classe que contenha um método main para testar sua classe BombaCombustível */


public class BombaCombustivel {
    private String tipoDeCombustivel;
    private float valorPorLitro;
    private float quantidadeCombustivel;
    private float converterDinheiroEmLitros;

    public BombaCombustivel(String tipoDeCombustivel, float valorPorLitro, float quantidadeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        if(tipoDeCombustivel == "gasolina"){
            this.valorPorLitro = 5.00f;
        }else if(tipoDeCombustivel == "alcool"){
            this.valorPorLitro = 4.00f;
        }
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    //metodo

    public float abastecerPorValor(float valorEmDinheiro){
        this.converterDinheiroEmLitros = valorEmDinheiro / valorPorLitro;
        System.out.println("O valor em Litros é: ");
        return converterDinheiroEmLitros;
    }

    public float abastecerPorLitro(float valorEmDinheiro){
        this.converterDinheiroEmLitros = valorEmDinheiro * valorPorLitro;
        System.out.println("O valor a pagar por litros é: ");
        return converterDinheiroEmLitros;
    }

   public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
}
