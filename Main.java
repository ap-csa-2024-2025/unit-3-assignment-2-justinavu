import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    checkSkib();
    
    }
  public static void checkSkib() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a double:");
    double skib = sc.nextDouble();
    if (skib == 12.345) {
      System.out.println("YES");
  }
  }
}
