package com.rt.Service;

import java.util.HashMap;
import java.util.Map;

import com.rt.dto.CustomerDTO;

public interface MService {

	public CustomerDTO userAuthendication(String name, String pass);

	public String userRegister(String name, String mobile, String email, String pass, String city, String pincode,
			String state, String address);

	public String userOrder(String name, HashMap<String, Map<String, String>> hp, String email, String mob, String addr,
			String rpay, String pay);

	

}
