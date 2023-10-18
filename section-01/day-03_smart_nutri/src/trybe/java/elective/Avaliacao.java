package trybe.java.elective;

/**
 * CLASSE - Avaliação.
 * <p>
 *   Esta classe é responsável por calcular o IMC de uma pessoa.
 *   <br>
 *   <br>
 *   <b>Exemplo:</b>
 *   <br>
 *   <br>
 *   <code>
 *     Avaliacao avaliacao = new Avaliacao();
 *     <br>
 *     avaliacao.calcularImc(70.5, 1.75);
 *     <br>
 *     <br>
 *     // O seu IMC é: 23.0
 *     <br>
 *     <br>
 *   </code>
 *   <br>
 *   <br>
 * </p>
 *
 */
public class Avaliacao {

  /**
   * MÉTODO - Calcula o IMC de uma pessoa.
   * <p>
   *   IMC = Peso / Altura²
   *   <br>
   *   Exemplo: 70.5 / (1.75 * 1.75) = 23.0
   *   <br>
   *   IMC = 23.0
   *   <br>
   *   <br>
   * </p>
   *
   * @param peso   Peso da pessoa.
   *               Exemplo: 70.5
   *               tipo: double
   * @param altura Altura da pessoa.
   *               Exemplo: 1.75
   *               tipo: double
   */
  public void calcularImc(double peso, double altura) {
    // double imc = peso / (altura * altura);
    // double imc = peso / altura²;
    double imc = peso / Math.pow(altura, 2);
    System.out.println("O seu IMC é: " + imc);
  }
}
