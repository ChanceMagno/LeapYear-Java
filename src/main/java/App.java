import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a year, I will tell you if it is a Leap Year!");
    String stringYear = myConsole.readLine();
    int intYear = Integer.parseInt(stringYear);
    LeapYear leapYear = new LeapYear();
    boolean leapYearResult = leapYear.isLeapYear(intYear);
    System.out.println("Is this year a leap year? Answer: " + leapYearResult);
  }
}
