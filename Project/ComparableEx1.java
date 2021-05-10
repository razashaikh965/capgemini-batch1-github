package may07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparableEx1 {
public static void main(String[] args) {
	Product p1=new Product(101, "Boat earphones", 2000, 3.9f);
	Product p2=new  Product(102,"MIVI headphones",1000,4.2f);
	Product p3=new Product(103, "Redmi headphone", 1500, 4.4f);
	Product p4=new Product(104, "Alexa", 3000, 4.5f);
	Product p5=new Product(105, "Marshall headphone", 5000, 4.1f);
	Product p6=new Product(106, "Apple airpods", 18000, 4.4f);
	
	
	ArrayList<Product> prodList=new ArrayList<Product>();
	prodList.add(p1);
	prodList.add(p2);
	prodList.add(p3);
	prodList.add(p4);
	prodList.add(p5);
	prodList.add(p6);
	System.out.println("-----before sorting-----");
	System.out.println(prodList);
	Scanner scanner=new Scanner(System.in);
	System.out.println("1. Sort by price\n 2. Sort by Ratings\n 3. Sort by product name\n");
	System.out.println("Enter the choice");
	int choice=scanner.nextInt();
	switch(choice) {
	case 1:
		Collections.sort(prodList);
		break;
	case 2:
		Collections.sort(prodList, new CompareByRatings());
		break;
	case 3:
		Collections.sort(prodList, new CompareByProductName());
	}
	System.out.println(prodList);
}
}


class CompareByRatings implements Comparator<Product>{
	public int compare(Product p1, Product p2) {
		if(p1.getRatings()> p2.getRatings())
			return -1;
		else
			return 1;
	}
}

class CompareByProductName implements Comparator<Product>{
	public int compare(Product p1, Product p2) {
		int r=p1.getProductName().compareTo(p2.getProductName());
		return r;
	}
}