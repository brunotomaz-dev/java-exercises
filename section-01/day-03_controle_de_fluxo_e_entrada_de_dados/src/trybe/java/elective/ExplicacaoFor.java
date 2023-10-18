package trybe.java.elective;

/**
 * Explicação básica do for, detalhe para a segunda maneira que pode ser usado o for em alguns
 * casos.
 */
public class ExplicacaoFor {

  /**
   * Método Principal.
   */
  public static void main(String[] args) {
    String[] nomes = {"Bruno", "Samira", "Chloe", "John"};

    for (int i = 0; i < nomes.length; i++) { // for tradicional
      imprimeMensagem(nomes[i]);
    }

    for (String nome : nomes) { // enhanced for
      imprimeMensagem(nome);
    }
  }

  static void imprimeMensagem(String mensagem) {
    System.out.println(mensagem);
  }
}
