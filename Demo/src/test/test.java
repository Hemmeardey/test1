package test;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int number0fBaskets, eggsPerBasket, totalEggs;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of eggs in each basket:");
    eggsPerBasket = keyboard.nextInt();
    System.out.println("Enter the number of basket:");
    number0fBaskets = keyboard.nextInt();
    totalEggs = number0fBaskets * eggsPerBasket;
    System.out.println("if you have");
    System.out.println("eggsPerBasket + eggs per basket and");
    System.out.println(number0fBaskets + "baskets,then");
    System.out.println("the total number of eggs is " + totalEggs);
    System.out.println("Now we take two eggs out of each basket.");
    eggsPerBasket = eggsPerBasket - 2;
    totalEggs =  number0fBaskets * eggsPerBasket;
    System.out.println("You Now have ");
    System.out.println("eggsPerBasket + eggs per basket and");
    System.out.println(number0fBaskets +" baskets.");
    System.out.println("The new total of eggs is " + totalEggs);
  }
}