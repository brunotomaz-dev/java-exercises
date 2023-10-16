package trybe.java.eletive;

public class ClassesWrapper {

  public static void main(String[] args) {
    Integer valor = 7; // autoboxing
    int newValue = valor; //unboxing

    int value = 42;

    System.out.println(
        Integer.toBinaryString(value)
    );
  }
}
