package trybe.java.eletive;

public class Arrays {

  public static void main(String[] args) {
    String[] arrayDeStringTest = {"não é chaves ", "é colchetes ", "no java"};
    int[] arrayDeInteiros = new int[9];
    arrayDeInteiros[0] = 40;
    arrayDeInteiros[1] = 55;
    arrayDeInteiros[2] = 63;
    arrayDeInteiros[3] = 17;
    arrayDeInteiros[4] = 22;
    arrayDeInteiros[5] = 68;
    arrayDeInteiros[6] = 89;
    arrayDeInteiros[7] = 97;
    arrayDeInteiros[8] = 89;

    System.out.println(arrayDeInteiros[8]);
    System.out.println(arrayDeInteiros[2]);
    System.out.println(arrayDeStringTest[0] + arrayDeStringTest[1] + arrayDeStringTest[2]);

    int[][] matriz = new int[2][10]; // like columns and lines
    String[] arrayDeString = new String[10];

    matriz[0][0] = 10;
    matriz[1][0] = 20;

    arrayDeString[0] = "Na Trybe";
    arrayDeString[1] = " eu aprendo Java";

    System.out.println(arrayDeInteiros[3]);
    System.out.println(matriz[0][0]);
    System.out.println(matriz[1][5]);
    System.out.println(arrayDeString[0] + arrayDeString[1]);
    System.out.println(arrayDeString.length);

    StringBuilder stringBuilder = new StringBuilder();
    String estou = "estou";
    String aprendendo = " aprendendo";
    String java = " java";
    String metodo = " e o método";
    String juncao = " de junção do StringBuilder";

    String frase = stringBuilder
        .append(estou)
        .append(aprendendo)
        .append(java)
        .append(metodo)
        .append(juncao)
        .toString();

    System.out.println(frase);

    StringBuilder novaFrase = stringBuilder.replace(17, 21, "Tipos primitivos");
    System.out.println(novaFrase);
  }

}
