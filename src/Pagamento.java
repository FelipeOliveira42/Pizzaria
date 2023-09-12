// Interface para representar uma forma de pagamento
interface FormaDePagamento {
    void realizarPagamento(double valor); // Realiza o pagamento com o valor especificado
}
// Implementação da forma de pagamento com cartão de crédito
class PagamentoCartaoDeCredito implements FormaDePagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito: R$" + valor);
    }
}
// Implementação da forma de pagamento em dinheiro
class PagamentoDinheiro implements FormaDePagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em dinheiro: R$" + valor);
    }
}
// Implementação da forma de pagamento em dinheiro
class PagamentoPix implements FormaDePagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento no Pix: R$" + valor);
    }
}