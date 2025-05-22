import java.util.Scanner;
public class ControleEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Adicionar Estoque");
            System.out.println("4 - Remover Estoque");
            System.out.println("5 - Listar Produtos");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();

            if (opcao == 1) {
                System.out.print("ID do Produto: ");
                int id = input.nextInt();
                input.nextLine(); // limpar buffer

                System.out.print("Nome do Produto: ");
                String nome = input.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = input.nextInt();

                System.out.print("Preço: ");
                double preco = input.nextDouble();

                Produto p = new Produto(id, nome, quantidade, preco);
                estoque.adicionarProduto(p);

            } else if (opcao == 2) {
                System.out.print("ID do Produto a remover: ");
                int id = input.nextInt();
                estoque.removerProduto(id);

            } else if (opcao == 3) {
                System.out.print("ID do Produto: ");
                int id = input.nextInt();
                Produto p = estoque.buscarProdutoPorId(id);
                if (p != null) {
                    System.out.print("Quantidade para adicionar: ");
                    int qtd = input.nextInt();
                    p.adicionarEstoque(qtd);
                    System.out.println("Estoque atualizado.");
                } else {
                    System.out.println("Produto não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.print("ID do Produto: ");
                int id = input.nextInt();
                Produto p = estoque.buscarProdutoPorId(id);
                if (p != null) {
                    System.out.print("Quantidade para remover: ");
                    int qtd = input.nextInt();
                    p.removerEstoque(qtd);
                    System.out.println("Estoque atualizado.");
                } else {
                    System.out.println("Produto não encontrado.");
                }

            } else if (opcao == 5) {
                estoque.listarProdutos();

            } else if (opcao == 6) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }

        input.close();
    }
}