public class DescontoAnoNovo implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.85; // 15% de desconto
    }
}
