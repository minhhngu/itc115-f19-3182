
public class genericProduct {

	public static void main(String[] args) {
		// *********************************************************
		// Assignment 9
		//
		// Design and code a class for a generic product.
		// By: Minh Ngu
		// 11/25/2019
		// *********************************************************

		ProductData p1 = new ProductData();
		p1.setCode("AB-01");
		p1.setDescription("prototype mind-control device.");
		p1.setPriceFormatted(1500000000);
		p1.setStock(1);

		ProductData p2 = new ProductData();
		p2.setCode("XY-09");
		p2.setDescription("finished atmospheric manipulator,\n" + "capable of generating rain.");
		p2.setPriceFormatted(75000000);
		p2.setStock(8);

		ProductData p3 = new ProductData();
		p3.setCode("PY-32");
		p3.setDescription("32nd iteration of a hair growth serum.\n"
				+ "Previous iterations have either caused hair loss,\n" + "or wildly uncontrollable hair growth.");
		p3.setPriceFormatted(15);
		p3.setStock(32000);

		System.out.println(p1.toString());
		System.out.println();
		System.out.println(p2.toString());
		System.out.println();
		System.out.println(p3.toString());
	}

}