package trybe.java.elective;

/**
 * CLASSE para esplicação do método while.
 */
public class ExplicacaoWhile {

  /**
   * MÉTODO utilizado para rodar a aplicação.
   */
  public static void main(String[] args) {
    String[] inscritos = {"Bruno", "Samira", "Chloe", "John", "Sidnei", "Susana", "Santana", "Vera",
        "Guiomar", "Verediano"};

    final int numeroDeVagas = 10;

    int vagaAtual = 0;

    preencherVagas(vagaAtual, numeroDeVagas, inscritos);
  }

  /**
   * MÉTODO - usado para preencher as vagas.
   *
   * @param vagaAtual     informa a posição da última vaga preenchida, int.
   * @param numeroDeVagas informa o numero total de vagas, é um int final.
   * @param inscritos     informa pessoas que querem se inscrever, Array de String. Por fim imprime
   *                      no cosole uma mensagem informando quem foi inscrito e em que vaga.
   */
  public static void preencherVagas(int vagaAtual, int numeroDeVagas, String[] inscritos) {
    String[] vagas = new String[numeroDeVagas];
    String inscrito = "Indefinido";
    String log;

    while (vagaAtual < numeroDeVagas) {
      inscrito = inscritos[vagaAtual];
      log = "Adicionando a inscrição: " + inscrito + " na vaga: " + (vagaAtual + 1) + "\n";
      vagas[vagaAtual] = inscrito;
      vagaAtual += 1;
      System.out.println(log);
    }
  }
}
