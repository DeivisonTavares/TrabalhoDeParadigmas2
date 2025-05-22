public class Produto extends Item {
    private double preco;

    public Produto(int id, String nome, int quantidade, double preco) {
        super(id, nome, quantidade);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("ID: %d | Nome: %s | Quantidade: %d | Preço: R$ %.2f%n", 
                          id, nome, quantidade, preco);
    }
}

