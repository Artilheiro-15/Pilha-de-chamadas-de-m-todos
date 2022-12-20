import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    method1();

    System.out.println("==================================");
    System.out.println("end of program");
  }

  public static void method1() {
    System.out.println("==================================");
    System.out.println("********METHOD1 START***********");
    method2();
    System.out.println("********METHOD1 END***********");
    System.out.println("==================================");
  }

  public static void method2() {
    Scanner sc = new Scanner(System.in);

    System.out.println("********METHOD2 START***********");
    System.out.println("==================================");
    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("invalid position!");
      e.printStackTrace();
      sc.next();
    } catch (InputMismatchException e) {
      System.out.println("==================================");
      System.out.println("Input error");
      System.out.println("==================================");
    }
    sc.close();
    System.out.println("********METHOD2 END***********");
  }
}
