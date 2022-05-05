package fit.basic;

public class Operators {
  public static void testOperators() {
    System.out.println("-------------Operators in JAVA---------");

    int result = 5 + 5;
    int resultTruncate = 6 + 2 - 3 * 5 % 6;
    boolean tAndT = true && true;  
    boolean tAndF = true && false;
    boolean less = 3 < 5;

    System.out.println(result);
    System.out.println(resultTruncate);
    System.out.println(less);
    System.out.println(tAndT);
    System.out.println(tAndF);
    System.out.println("\n----------------------------------------\n");
  }
}
