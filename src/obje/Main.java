package obje;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product();
		product.setName("Monster NoteBook");
		product.setPrice(15000);
		product.setDiscoundRate(18);
		System.out.println(product.getName());
		System.out.println("Fiyat:" + product.getPrice());
		System.out.println("Ýndirimli fiyatý:"+product.getLastPrice());
		
	}

}