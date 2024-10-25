import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // check12345();
    // check48();
    // checkDubFirst();
    // checkDivis();
    // isEven();
    grader();
  }
  public static void check12345() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a double:");
    double skib = sc.nextDouble();
    if (skib == 12.345) {
      System.out.println("YES");
  }
  }
  public static void check48() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter an int:");
    double skib = sc.nextInt();
    if (skib == 48) {
      System.out.println("YES");
  }
  }
  public static void checkDubFirst() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter an int:");
    int skib = sc.nextInt();
    System.out.println("Please enter another int");
    double idi = sc.nextDouble();
    if (skib*2 == idi) {
      System.out.println("YES");
  }
  }
  public static void checkDivis() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter an int:");
    int skib = sc.nextInt();
    if (skib % 2 == 0)
    {
      if (skib % 3 == 0)
      {
        System.out.println("Divisible by 2, 3");
      }
      else 
      {
        System.out.println("Divisible by 2");
      }
    }
  else 
  {
    if (skib % 3 == 0) 
    {
      System.out.println("Divisible by 3");
    }
  }
}
public static void isEven() {
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter an int:");
  int skib = sc.nextInt();
  if (skib % 2 == 0)
  {
    System.out.println("Even");
  }
  else 
  {
    System.out.println("Odd");
  }
}
public static void grader() {
  Scanner sc = new Scanner(System.in);
  String grades = "ABCDF";
  int lower = 90;
  int higher = 100;
  System.out.println("Please enter a letter grade:");
  String skib = sc.nextLine();
  if (grades.contains(skib)) 
  {
    int index = grades.indexOf(skib);
     if (index > 0)
    {
      int i = index*10;
      lower -= i;
      higher -= i;
      if (index == 4)
      {
        lower = 0;
      }
    }
    System.out.println(lower + "-" + higher);
  }
  else 
  {
    System.out.println("Invalid letter grade");
  }
}
}
