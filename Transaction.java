// Spencer Goldwin

import java.util.Scanner;
public class Transaction {

public static void main(String[] args)
{

	int numberOfShare;
	double pricePerShare,purchaseCommission,saleCommission,salePrice;
	String name;
		System.out.print("Enter Your name: ");
		name=input.nextLine();
		get number of shares from user
		System.out.print("Enter the number of shares bought/sold: ");
		numberOfShare=input.nextInt();
		//get the purchase price of the one share
		System.out.print("Enter the purchase price per share:$");
		pricePerShare=input.nextDouble();
		//get the purchase commission
		System.out.print("what is the Purchase commission :");
		purchaseCommission=input.nextDouble();
		//get the selling price of the one share
		System.out.print("Enter the sale price per share :$");
		salePrice=input.nextDouble();
		//get the sale commission
		System.out.print("what is the Sale commission:");
		saleCommission=input.nextDouble();
			//calculate the total purchase price
			double totalPuchacePrice=numberOfShare*pricePerShare;
			//calculate the total purchase commission
			double totalPuchaceCommission=(purchaseCommission)*totalPuchacePrice;
			//calculate the total selling price
			double totalSalePrice=numberOfShare*salePrice;
			//calculate the total selling commission
			double totalSaleCommisson=totalSalePrice*(saleCommission);
		System.out.println( "Your Net gain is :$" +(totalSalePrice-totalPuchacePrice-totalPuchaceCommission-totalSaleCommisson));
}
}