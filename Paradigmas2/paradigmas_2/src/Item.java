public abstract class Item {
    protected int id;
    protected String nome;
    protected int quantidade;

    public Item(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println(" Quantidade insuficiente em estoque.");
        }
    }

    public abstract void exibirInformacoes();
}

