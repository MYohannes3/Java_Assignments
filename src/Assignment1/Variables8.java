package Assignment1;

public class Variables8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coffee = 4;
		int tea = 3;
		int esspreso = 6;
		int product1 = tea + coffee + esspreso ;
		int product2 = product1 + esspreso;
		int product3 = coffee + esspreso;
		int subtotal = product1 + product2 + product3;
		double sales_tax = subtotal/10;
		double total_sale = subtotal + sales_tax;
		
		System.out.println("product 1: "+  product1);
		System.out.println("product 2: "+  product2);
		System.out.println("product 3: "+  product3);
		System.out.println("subtotal: "+  subtotal);
		System.out.println("sales tax: "+  sales_tax);
		System.out.println("total sale: "+  total_sale);
		
	}

}
