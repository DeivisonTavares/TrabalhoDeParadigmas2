import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(" Produto adicionado com sucesso.");
    }

    public void removerProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println(" Produto removido.");
        } else {
            System.out.println(" Produto não encontrado.");
        }
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println(" Estoque vazio.");
        } else {
            System.out.println("\n Produtos no Estoque:");
            for (Produto produto : produtos) {
                produto.exibirInformacoes();
            }
        }
    }
}
