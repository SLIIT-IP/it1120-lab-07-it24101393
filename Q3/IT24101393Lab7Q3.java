import java.util.Scanner;

public class IT24101393Lab7Q3 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int amount;
double discount;
double total;
int count = 1;

  while (count <= 5) {
  System.out.println("Customer " + count);
  System.out.print("Enter total bill amount: ");
  amount = input.nextInt();

  System.out.print("Enter mode of payment (c for cash, o for other): ");
  char payment = input.next().charAt(0);

    if (payment == 'c' || payment == 'C') {
    discount = amount * 5.0 / 100;
    total = amount - discount;
    System.out.println("Discount is: " + discount);}
    else if (payment == 'o' || payment == 'O') {
    discount = 0;
    total = amount;
    System.out.println("No discount applicable.");}
    else {
    discount = 0;
    total = amount;
    System.out.println("Payment mode is not valid.");}
            

   System.out.println("Amount to be paid: " + total);
   System.out.println();
   count = count + 1;}

input.close();
    }
}
