package ch06_class.sec11_Ex;


public class ShopService {

	
	private static ShopService singleton= new ShopService();
	
	private ShopService() { }
	
	public static ShopService getInstance() { 
		return singleton;
	}
}