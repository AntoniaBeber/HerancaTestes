// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Fornecedor fornecedor = new Fornecedor();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereco: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereco: " + fornecedor.getEndereco());
        System.out.println("Saldo: " + fornecedor.obterSaldo());

    }
}
