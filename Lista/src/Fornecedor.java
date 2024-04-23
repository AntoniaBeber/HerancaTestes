//subclasse da classe Pessoa a classe Fornecedor.
// Considere que cada instância da classe Fornecedor tem,
// para além dos atributos que caracterizam a classe Pessoa, os
//atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor)
// e valorDivida (montante da dívida para com o fornecedor).
// Implemente na classe Fornecedor, para além dos usuais métodos
//seletores e modificadores, um método obterSaldo() que devolve a diferença
// entre os valores dos
//atributos valorCredito e
//valorDivida. Depois de implementada a classe Fornecedor,
// crie um programa de teste adequado
//que lhe permita verificar o funcionamento dos métodos implementados na classe
// Fornecedor e os
//herdados da classe Pessoa.

public class Fornecedor extends Pessoa{


    public Fornecedor(String nome, String endereco, String telefone) {
        super();
    }
    private int valorCredito;
    private int valorDivida;

    public Fornecedor() {
    this.valorDivida = 40;
    this.valorCredito = 66;
    }



    public int obterSaldo(){
        return valorCredito - valorDivida;
    }
}
