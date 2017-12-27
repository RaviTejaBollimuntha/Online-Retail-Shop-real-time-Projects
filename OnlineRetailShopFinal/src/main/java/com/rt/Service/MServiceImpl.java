package com.rt.Service;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DAO.MedicalShopDAO;
import com.rt.bo.CustomerBO;
import com.rt.bo.OrderBO;
import com.rt.dto.CustomerDTO;


@Service("MService")
public class MServiceImpl implements MService {
	@Autowired
	private MedicalShopDAO dao;

	@Override
	public CustomerDTO userAuthendication(String name, String pass) {
		CustomerBO bo=null;
		CustomerDTO dto=null;
		bo=dao.loginUser(name,pass);
		dto=new CustomerDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public String userRegister(String name, String mobile, String email, String pass, String city, String pincode,
			String state, String address) {
		String res=dao.MRegistor(name,mobile,email,pass,city,pincode,state,address);
		return res;
	}

	@Override
	public String userOrder(String name, HashMap<String, Map<String, String>> hp, String email, String mob, String addr,
			String rpay, String pay) {
		System.out.println(hp);
		List<OrderBO> listbo=new ArrayList();
		 Map<String, String> item=null;
		 String a=null,n=null;
		 OrderBO bo=null;
		java.util.Date date=new java.util.Date();
		for(String key: hp.keySet()){
			item=hp.get(key);
			for(String k: item.keySet()){	
				bo=new OrderBO(name,key,k,item.get(k),email,mob,addr,rpay, pay, new Date(date.getTime()));
		}
			listbo.add(bo);
		}
	  int result[]=dao.ordetDetails(listbo);
	  if(result!=null)
		return "sucsess";
	  else
		 return null;
	  }
	}



