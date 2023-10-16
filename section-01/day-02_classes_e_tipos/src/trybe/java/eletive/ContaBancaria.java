package trybe.java.eletive;

public class ContaBancaria {
  public void mostrarMensagem() {
    System.out.println("Conta acessada.");
  }

  public void depositar(double value) {
    System.out.println("Valor depositado: " + value);
  }

  public double converterMoeda(float total, float cambio) {
    return total * cambio;
  }
}
