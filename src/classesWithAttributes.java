
public class classesWithAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(1,"Laptop","Asus Laptop",2,3);
		
//		Product product = new Product();
//		product.setName ("Laptop");
//		product.setId(1);
//		product.setPrice(5000);
//		product.setStockAmount(3);
//		product.setDescription ("Asus Laptop");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1, "", "", 2, 200); //yanlış kullanım
		
		System.out.print(product.getKod());
	}

}

//SOLID prensibleri
//bir class sadece bir iş yapar. Single responsibility