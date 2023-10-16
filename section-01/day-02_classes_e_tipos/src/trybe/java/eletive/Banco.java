package trybe.java.eletive;

public class Banco {

  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();

    conta.mostrarMensagem();
    conta.depositar(500);

    double valorConvertido = conta.converterMoeda(30, 5);
  }
}
