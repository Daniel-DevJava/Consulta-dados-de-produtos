package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberProduct = sc.nextInt();
		for (int i = 1; i <= numberProduct; i++) {
			System.out.print("Product #" + i + "data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		sc.close();

	}

}
