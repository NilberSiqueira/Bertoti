// Classe Singleton
public class Singleton {
    // Instância única da classe
    private static Singleton instanciaUnica;

    // Construtor privado para evitar instanciação
    private Singleton() {
        // Inicialização
    }

    // Método público para obter a instância única
    public static Singleton getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Método exemplo
    public void mostrarMensagem() {
        System.out.println("Olá do Singleton!");
    }
}
