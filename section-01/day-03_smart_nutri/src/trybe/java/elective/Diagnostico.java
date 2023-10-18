package trybe.java.elective;

import java.util.Scanner;

/**
 * CLASSE - Diagnóstico.
 * <p>
 *   Esta classe é responsável por calcular o IMC de uma pessoa.
 *   <br>
 *   <br>
 *   <b>Exemplo:</b>
 *   <br>
 *   <br>
 *   <code>
 *     Diagnostico diagnostico = new Diagnostico();
 *     <br>
 *     diagnostico.calcularImc(70.5, 1.75);
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
public class Diagnostico {

  /**
   * MÉTODO - Calcula o IMC de uma pessoa.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o seu peso: ");
    double peso = scanner.nextDouble();
    System.out.print("Digite a sua altura: ");
    double altura = scanner.nextDouble();

    Avaliacao avaliacao = new Avaliacao();
    avaliacao.calcularImc(peso, altura);

    scanner.close();

  }

}
