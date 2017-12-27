package com.rt.Service;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.sql.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rt.DAO.RStoreDAO;
import com.rt.bo.CustomerBO;
import com.rt.bo.OrderBO;
import com.rt.dto.CustomerDTO;


@Service("MService")
public class RServiceImpl implements RService {
	@Autowired
	private RStoreDAO dao;

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
	public String userRegister(String fname, String lname, String email, String pass, String mobile, String city,
			String pincode, String country, String address) {
		String res=dao.RRegistor(fname,lname,email,pass,mobile,city,pincode,country,address);
		return res;
	}
	@Transactional(propagation=Propagation.REQUIRED,
		      readOnly=false,
		      transactionManager="dsTxMgmr",timeout=30)
	@Override
	public String userOrder(String fname, String lname, String email, String mobile, String city, String pincode,
			String country, String address, Map<String,Map<String,Map<String,String>>> hp, String famt, String srcaccno) {
		System.out.println(hp);
		List<OrderBO> listbo=new ArrayList();
		 Map<String, Map<String, String>> item=null;
		 Map<String, String> val=null;
		 String a=null,n=null;
		 OrderBO bo=null;
		java.util.Date date=new java.util.Date();
		for(String key: hp.keySet()){
			item=hp.get(key);
			for(String k1: item.keySet()){
				val=item.get(k1);
			for(String k: val.keySet()){	
				bo=new OrderBO(fname,lname,email,mobile,city,pincode,country,address,k1,k,val.get(k),new Date(date.getTime()));
		}
			}
			listbo.add(bo);
		}
		int result1=0,result2=0;
      //use DAO
		int srcacc;
		float amt;
		srcacc=Integer.parseInt(srcaccno);
		amt=Float.parseFloat(famt);
		result1=dao.withdraw(srcacc,amt);
		result2=dao.deposite(32387,amt);
		if(result1==0 || result2==0){
			
			throw new IllegalArgumentException();
		}
		
	  int result[]=dao.ordetDetails(listbo);
	  if(result!=null)
		return "sucsess";
	  else
		 return null;
	  }
	@Override
	public float coupanCheck(String ccode) {
		boolean val=dao.cCheck(ccode);
		
	    if(val==true)
	    {
	    	int cc=Integer.parseInt(ccode.substring(2,4));
	    	System.out.println(cc);
             return cc/100.0f;
	    	
	    }
		return 0.0f;
	}
	}



