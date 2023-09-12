import java.util.HashMap;
import java.util.Map;
// Interface para representar uma pizza
interface Pizza {
    void montarPizza(); // Monta a pizza
    String getDescricaoPizza(); // Retorna uma descrição da pizza
    double getValorTotal(); // Retorna o valor total da pizza (incluindo ingredientes)
    void adicionarIngrediente(String ingrediente);
    void listarIngredientesDisponiveis(); // Lista os ingredientes disponíveis
}
// Implementação da pizza de mussarela
class PizzaMussarela implements Pizza {
    private Map<String, Double> ingredientes = new HashMap<>();
    private double valorBase = 20.0; // Valor base da pizza de mussarela
    public PizzaMussarela() {
        // Inicializa a pizza de mussarela com ingredientes pré-definidos
        ingredientes.put("Mussarela", 5.0);
        ingredientes.put("Tomate", 2.0);
        ingredientes.put("Orégano", 1.0);
        ingredientes.put("Bacon", 4.0);
    }
    @Override
    public void montarPizza() {
        System.out.println("Montando pizza de mussarela com os seguintes ingredientes:");
        for (Map.Entry<String, Double> entry : ingredientes.entrySet()) {
            System.out.println("- " + entry.getKey() + ": R$" + entry.getValue());
        }
        System.out.println("Valor Base da Pizza: R$" + valorBase);
    }

    @Override
    public void adicionarIngrediente(String ingrediente) {
        // Verifica se o ingrediente está na lista de ingredientes e adicione ao valor total
        if (ingredientes.containsKey(ingrediente)) {
            double valorIngrediente = ingredientes.get(ingrediente);
            valorBase += valorIngrediente;
            ingredientes.remove(ingrediente);
        } else {
            System.out.println("Ingrediente não encontrado na lista.");
        }
    }
    @Override
    public String getDescricaoPizza() {
        return "Pizza de Mussarela";
    }
    @Override
    public double getValorTotal() {
        return valorBase;
    }
    public void listarIngredientesDisponiveis() {
        System.out.println("Ingredientes disponíveis para adicionar à pizza de Mussarela:");
        for (String ingrediente : ingredientes.keySet()) {
            System.out.println("- " + ingrediente);
        }
    }
}
// Implementação da pizza de calabresa
class PizzaCalabresa implements Pizza {
    private Map<String, Double> ingredientes = new HashMap<>();
    private double valorBase = 25.0; // Valor base da pizza de calabresa
    private double valorTotal = valorBase; // Inicializa o valor total com o valor base
    public PizzaCalabresa() {
        // Ingredientes pré-definidos com valores
        ingredientes.put("Calabresa", 6.0);
        ingredientes.put("Cebola", 2.0);
        ingredientes.put("Orégano", 1.0);
    }
    @Override
    public void montarPizza() {
        System.out.println("Montando pizza de calabresa com os seguintes ingredientes:");
        for (Map.Entry<String, Double> entry : ingredientes.entrySet()) {
            System.out.println("- " + entry.getKey() + ": R$" + entry.getValue());
        }
    }
    @Override
    public void adicionarIngrediente(String ingrediente) {
        // Verifica se o ingrediente está na lista de ingredientes e adicione ao custo total
        if (ingredientes.containsKey(ingrediente)) {
            double valorIngrediente = ingredientes.get(ingrediente);
            valorTotal += valorIngrediente;
            ingredientes.remove(ingrediente);
        } else {
            System.out.println("Ingrediente não encontrado na lista.");
        }
    }
    @Override
    public String getDescricaoPizza() {
        return "Pizza de Calabresa";
    }
    @Override
    public double getValorTotal() {
        return valorTotal;
    }
    public void listarIngredientesDisponiveis() {
        System.out.println("Ingredientes disponíveis para adicionar à pizza de Mussarela:");
        for (String ingrediente : ingredientes.keySet()) {
            System.out.println("- " + ingrediente);
        }
    }
}
// Implementação da pizza vegetariana
class PizzaVegetariana implements Pizza {
    private Map<String, Double> ingredientes = new HashMap<>();
    private double valorBase = 29.0; // Valor base da pizza de calabresa
    private double valorTotal = valorBase; // Inicializa o valor total com o valor base

    public PizzaVegetariana() {
        // Ingredientes pré-definidos com valores
        ingredientes.put("Alface", 6.0);
        ingredientes.put("Brócolis", 2.0);
        ingredientes.put("Orégano", 3.0);
        ingredientes.put("Rúcula", 5.0);
        ingredientes.put("Gergelim", 0.5);
    }

    @Override
    public void montarPizza() {
        System.out.println("Montando pizza de calabresa com os seguintes ingredientes:");
        for (Map.Entry<String, Double> entry : ingredientes.entrySet()) {
            System.out.println("- " + entry.getKey() + ": R$" + entry.getValue());
        }
    }

    @Override
    public void adicionarIngrediente(String ingrediente) {
        // Verifica se o ingrediente está na lista de ingredientes e adicione ao custo total
        if (ingredientes.containsKey(ingrediente)) {
            double valorIngrediente = ingredientes.get(ingrediente);
            valorTotal += valorIngrediente;
            ingredientes.remove(ingrediente);
        } else {
            System.out.println("Ingrediente não encontrado na lista.");
        }
    }

    @Override
    public String getDescricaoPizza() {
        return "Pizza Vegetariana";
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    public void listarIngredientesDisponiveis() {
        System.out.println("Ingredientes disponíveis para adicionar à pizza Vegetariana:");
        for (String ingrediente : ingredientes.keySet()) {
            System.out.println("- " + ingrediente);
        }
    }

}