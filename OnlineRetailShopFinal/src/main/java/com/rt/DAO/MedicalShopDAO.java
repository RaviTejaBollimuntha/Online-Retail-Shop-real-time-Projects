package com.rt.DAO;

import java.util.List;

import com.rt.bo.CustomerBO;
import com.rt.bo.OrderBO;

public interface MedicalShopDAO {

	public CustomerBO loginUser(String name, String pass);

	public String MRegistor(String name, String mobile, String email, String pass, String city, String pincode,
			String state, String address);

	public int[] ordetDetails(List<OrderBO> listbo);
	

}
