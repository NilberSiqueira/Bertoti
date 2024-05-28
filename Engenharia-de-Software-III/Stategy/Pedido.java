public class Pedido {
    private DescontoStrategy descontoStrategy;
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularValorComDesconto() {
        if (descontoStrategy != null) {
            return descontoStrategy.aplicarDesconto(valor);
        }
        return valor;
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido(100.0); // Valor inicial do pedido

        // Aplicando Desconto de Natal
        pedido.setDescontoStrategy(new DescontoNatal());
        System.out.println("Valor com Desconto de Natal: " + pedido.calcularValorComDesconto());

        // Aplicando Desconto de Ano Novo
        pedido.setDescontoStrategy(new DescontoAnoNovo());
        System.out.println("Valor com Desconto de Ano Novo: " + pedido.calcularValorComDesconto());
    }
}
