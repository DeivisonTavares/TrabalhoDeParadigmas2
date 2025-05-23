import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== SISTEMA DE CONTROLE DE ESTOQUE =====");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Adicionar Estoque (Entrada)");
            System.out.println("4 - Remover Estoque (Saída)");
            System.out.println("5 - Listar Produtos");
            System.out.println("6 - Sair");
            System.out.print(" Escolha uma opção: ");
            
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print(" ID do Produto: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print(" Nome do Produto: ");
                    String nome = input.nextLine();

                    System.out.print(" Quantidade Inicial: ");
                    int quantidade = input.nextInt();

                    System.out.print(" Preço: ");
                    double preco = input.nextDouble();

                    Produto novoProduto = new Produto(id, nome, quantidade, preco);
                    estoque.adicionarProduto(novoProduto);
                    break;
                }
                case 2: {
                    System.out.print(" ID do Produto para remover: ");
                    int id = input.nextInt();
                    estoque.removerProduto(id);
                    break;
                }
                case 3: {
                    System.out.print(" ID do Produto: ");
                    int id = input.nextInt();
                    Produto produto = estoque.buscarProdutoPorId(id);
                    if (produto != null) {
                        System.out.print(" Quantidade a adicionar: ");
                        int qtd = input.nextInt();
                        produto.adicionarEstoque(qtd);
                        System.out.println(" Estoque atualizado.");
                    } else {
                        System.out.println(" Produto não encontrado.");
                    }
                    break;
                }
                case 4: {
                    System.out.print(" ID do Produto: ");
                    int id = input.nextInt();
                    Produto produto = estoque.buscarProdutoPorId(id);
                    if (produto != null) {
                        System.out.print(" Quantidade a remover: ");
                        int qtd = input.nextInt();
                        produto.removerEstoque(qtd);
                        System.out.println(" Estoque atualizado.");
                    } else {
                        System.out.println(" Produto não encontrado.");
                    }
                    break;
                }
                case 5: {
                    estoque.listarProdutos();
                    break;
                }
                case 6: {
                    continuar = false;
                    System.out.println(" Encerrando o sistema... Até mais!");
                    break;
                }
                default: {
                    System.out.println(" Opção inválida. Tente novamente.");
                }
            }
        }

        input.close();
    }
}
