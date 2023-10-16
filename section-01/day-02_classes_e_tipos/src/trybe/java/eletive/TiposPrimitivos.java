package trybe.java.eletive;

public class TiposPrimitivos {

  public static void main(String[] args) {
    byte b = 9;
    short num = 300;
    short formatadoComUnderscore = 20_000;
    int numeroInteiro = 10;
    int intA = 10, intB = 20, soma; // initialization with inline
    soma = intA + intB;
    long numA = 102040;
    long numB = 102030405060L; // l indicate long number - is necessary
    float numC = -101.23f;
    float numD = 2.356f;
    double dobA = 2.356;
    double dobB = 1.409F; // can receive float
    double dobC = 12930L; // can receive long
    boolean isBoolean = true;
    boolean isNumber = false;
    char letraA = 'a'; // single quote for char and double quote for string
    char letraAMaiuscula = 'A';

    System.out.println("byte " + b);
    System.out.println("short " + num);
    System.out.println("short com underscore " + formatadoComUnderscore);
    System.out.println("Número inteiro " + numeroInteiro);
    System.out.println("soma de números " + soma);
    System.out.println("long " + numA);
    System.out.println("long com l " + numB);
    System.out.println("float " + numC + numD);
    System.out.println("double with float" + dobB);
    System.out.println("double " + dobA);
    System.out.println("double with long " + dobC);
    System.out.println("boolean " + isBoolean + " " + isNumber);
    System.out.println("char " + letraA + " " + letraAMaiuscula);
  }
}
