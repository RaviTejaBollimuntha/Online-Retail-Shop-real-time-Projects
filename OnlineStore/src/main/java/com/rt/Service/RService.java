package com.rt.Service;

import java.util.HashMap;
import java.util.Map;

import com.rt.dto.CustomerDTO;

public interface RService {

	public CustomerDTO userAuthendication(String name, String pass);

	public String userRegister(String fname, String lname, String email, String pass, String mobile, String city,
			String pincode, String country, String address);

	public float coupanCheck(String ccode);

	public String userOrder(String fname, String lname, String email, String mobile, String city, String pincode,
			String country, String address, Map<String,Map<String,Map<String,String>>> hp, String famt, String srcaccno);

	

}
