// Importing scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // Declaring scanner and zip integer
    Scanner input = new Scanner(System.in);
    int zip = 0;
    // EXTRA: Loops through user input until proper zip code is put in
    while (String.valueOf(zip).length() != 5) {
      System.out.println("Enter a zipcode (5 digits!):");
      zip = input.nextInt();
    }
    // Changing int to string for loop
    String zipcode = String.valueOf(zip);

    // Going through each digit for bars
    for (int i = 0; i < zipcode.length(); i++) {
      printBarcode(zipcode.charAt(i));
    }

    // Finding sum of all digits
    int digit, sum = 0, count = 0;
    while(zip > 0) {    
      digit = zip % 10;  
      sum = sum + digit;  
      zip = zip / 10;
    }
    // Finds distance from the sum and the next highest multiple of 10
    while ((sum % 10) != 0) {
      count++;
      sum++;
    }
    // Changes result to string and prints final bars
    String cd = String.valueOf(count);
    printBarcode(cd.charAt(0));

  }

  // Prints out the bar code for a specific number
  public static void printBarcode(char n) {
    // Series of if statements for each digit
      if (n == '0') {
        System.out.print("||:::");
      }
      if (n == '1') {
        System.out.print(":::||");
      }
      if (n == '2') {
        System.out.print("::|:|");
      }
      if (n == '3') {
        System.out.print("::||:");
      }
      if (n == '4') {
        System.out.print(":|::|");
      }
      if (n == '5') {
        System.out.print(":|:|:");
      }
      if (n == '6') {
        System.out.print(":||::");
      }
      if (n == '7') {
        System.out.print("|:::|");
      }
      if (n == '8') {
        System.out.print("|:|::");
      }
      if (n == '9') {
        System.out.print("||:::");
      }
  }
}
