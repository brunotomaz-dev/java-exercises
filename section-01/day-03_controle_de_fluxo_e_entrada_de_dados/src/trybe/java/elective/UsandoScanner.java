package trybe.java.elective;

import java.util.Scanner;

/**
 * CLASSE de estudo da classe Scanner.
 */
public class UsandoScanner {

  /**
   * MÉTODO principal para exemplificar uso do scanner. Ele lê o seu nome no console e devolve uma
   * mensagem.
   */
  public static void main(String[] args) {

    questionNameInConsole(); // para não quebrar a próxima execução comente essa linha.
    lidandoComNum();
    lidandoComNum2();
  }

  /**
   * MÉTODO que lê o nome do usuário no console e devolve uma mensagem de boas vindas.
   */
  public static void questionNameInConsole() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual é o seu nome: ");
    String nome = scanner.next();
    System.out.println("Boas Vindas, " + nome + "!");
    scanner.close(); // nunca esquecer do close para evitar memory leak.
  }

  /**
   * MÉTODO que lê dois números inteiros no console e devolve a soma deles.
   */
  public static void lidandoComNum() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entre com o primeiro número: ");
    String input1 = scanner.next(); // se o usuário digitar uma string aqui, o programa quebra.
    System.out.print("Entre com o segundo número: ");
    String input2 = scanner.next(); // precisa fazer o parse, pois o método retorna uma string.

    int n1 = Integer.parseInt(input1); // faz o parse para int, se não for possível, quebra.
    int n2 = Integer.parseInt(input2);

    int resultado = n1 + n2;
    System.out.println("O resultado da soma é: " + resultado);
  }
  
  /**
   * MÉTODO que lê dois números inteiros no console e devolve a soma deles.
   */
  public static void lidandoComNum2() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entre com o primeiro número: ");
    int n1 = scanner.nextInt(); // se o usuário digitar uma string aqui, o programa quebra.
    System.out.print("Entre com o segundo número: ");
    int n2 = scanner.nextInt(); // não precisa fazer o parse, pois o método já retorna um int.

    int resultado = n1 + n2;
    System.out.println("O resultado da soma é: " + resultado);
  }
}
