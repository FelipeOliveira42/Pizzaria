import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SistemaPedidoPizza {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Sistema de Pedido de Pizza!");
        // Criando instâncias das pizzas
        Pizza pizzaMussarela = new PizzaMussarela();
        Pizza pizzaCalabresa = new PizzaCalabresa();
        Pizza pizzaVegetariana = new PizzaVegetariana();
        // Criando instâncias dos adaptadores de pagamento
        FormaDePagamento cartaoCredito = new PagamentoCartaoDeCredito();
        FormaDePagamento dinheiro = new PagamentoDinheiro();
        FormaDePagamento pix = new PagamentoPix();

        // Solicitando ao usuário que escolha o tipo de pizza
        System.out.println("Escolha o tipo de pizza (1 - Mussarela, 2 - Calabresa, 3 - Vegetariana): ");
        // Configurando a leitura de entrada do usuário
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReaderDecorator decorator = new BufferedReaderDecorator(br);
        // Lendo a escolha do usuário
        String escolhaPizza = decorator.lerLinha();
        if (escolhaPizza != null) {
            Pizza pizzaEscolhida = null;
            // Determinando a pizza escolhida com base na entrada do usuário
            switch (escolhaPizza) {
                case "1":
                    pizzaEscolhida = pizzaMussarela;
                    break;
                case "2":
                    pizzaEscolhida = pizzaCalabresa;
                    break;
                case "3":
                    pizzaEscolhida = pizzaVegetariana;
                    break;
                default:
                    System.out.println("Opção de pizza inválida.");
                    return;
            }
            // Adicionar ingredientes à pizza
            System.out.println("Adicione ingredientes à pizza (digite 'sair' para finalizar): ");
            pizzaEscolhida.listarIngredientesDisponiveis();

            // Loop para adicionar ingredientes até que o usuário digite "sair"
            while (true) {
                String ingrediente = decorator.lerLinha();
                if (ingrediente.equalsIgnoreCase("sair")) {
                    break;
                }
                pizzaEscolhida.adicionarIngrediente(ingrediente);
            }
            double valorTotal = pizzaEscolhida.getValorTotal();
            System.out.println("Valor da Pizza: R$" + valorTotal);
            // Solicitando ao usuário que escolha a forma de pagamento
            System.out.println("Escolha a forma de pagamento (1 - Cartão de Crédito, 2 - Dinheiro, 3 - Pix): ");
            String escolhaPagamento = decorator.lerLinha();
            if (escolhaPagamento != null) {
                // Realizando o pagamento com base na escolha do usuário
                switch (escolhaPagamento) {
                    case "1":
                        cartaoCredito.realizarPagamento(valorTotal);
                        break;
                    case "2":
                        dinheiro.realizarPagamento(valorTotal);
                        break;
                    case "3":
                        pix.realizarPagamento(valorTotal);
                        break;
                    default:
                        System.out.println("Forma de pagamento inválida.");
                        break;
                }
            } else {
                System.out.println("Erro ao ler a entrada.");
            }
            // Mostrar a pizza completa após o pagamento
            System.out.println("\nPizza Completa: " + pizzaEscolhida.getDescricaoPizza());
        } else {
            System.out.println("Erro ao ler a entrada.");
        }
    }
} //FIM!