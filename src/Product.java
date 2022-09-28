
public class Product {
	
	//constructor
	public Product(int id, String name, String description, int stockAmount, double price) {
		System.out.println("Yapıcı Blok Çalıştı");
		this.id=id;
		this.renk=renk;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	//overloading = aynı isimle farklı parametrelerle kullanmak
	public Product() {
		
	}
	
	//attribute || field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	
	private String kod;   //kodu kullanıcı düzenleyemez sadece okuyabilir.
	//private yazılmadıysa nesne public demektir. Özellikle public yazmaya gerek yoktur.
	// örneğin sistemde bir ürüne kod atandı.
	
	
	// getter - setter blokları
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		//this.id = id;  // bu classtaki id demek
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	private double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	private int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	private String getRenk() {
		return renk;
	}

	private void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name = name.substring(0,1)+ id;
	}

	private void setKod(String kod) {
		this.kod = kod;
	}
	
	
}
