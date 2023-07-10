package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {

		Department d = new Department(1,"Fish");
		
		Seller s = new Seller(1, "Rogerio", "rogerio@gmail.com", new Date(), 3000.00, d);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(d);
		System.out.println(s);
	}
	
}
