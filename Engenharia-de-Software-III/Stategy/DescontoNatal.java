public class DescontoNatal implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.90; // 10% de desconto
    }
}