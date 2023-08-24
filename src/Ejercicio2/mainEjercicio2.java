package Ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		productoCongelado prodCong = new productoCongelado("10/09/2023", 35678, -5);
		ProductoFresco prodFres = new ProductoFresco("15/09/2023", 55699, "05/07/2023", "Argentina");
		productoRefrigerado prodRef = new productoRefrigerado("10/10/2023", 78923, 2526); 
		
		System.out.println(prodCong.toString());
		System.out.println(prodFres.toString());
		System.out.println(prodRef.toString());
	}

}
