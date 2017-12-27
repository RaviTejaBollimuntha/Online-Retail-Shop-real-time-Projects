package com.rt.util;

import java.util.HashMap;
import java.util.Map;

public class cart {
	 private static HashMap<String,Map<String,Map<String,String>>> cartItems;
	 private static Map<String,Map<String,String>> pro ;
	 private static Map<String,String> val ;
	public cart(){
	cartItems = new HashMap<>();
	
	}
	public static HashMap getCartItems(){
	return cartItems;
	}
	public void addToCart(String url,String prd, String amt,String noi){
		val= new HashMap<>();
		pro= new HashMap<>();
		val.put(amt,noi);
		pro.put(prd, val);
	cartItems.put(url, pro);
	}
	public void deleteFromCart(String itemId){
		cartItems.remove(itemId);

		}
}
