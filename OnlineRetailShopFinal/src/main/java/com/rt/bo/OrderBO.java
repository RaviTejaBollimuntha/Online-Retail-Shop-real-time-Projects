package com.rt.bo;

import java.sql.Date;

public class OrderBO {
private String uname, product,amount,noi,email,mob,add,p_type,b_type;
private Date d;


public OrderBO(String uname, String product, String amount, String noi, String email, String mob, String add,
		String p_type, String b_type, Date d) {
	this.uname = uname;
	this.product = product;
	this.amount = amount;
	this.noi = noi;
	this.email = email;
	this.mob = mob;
	this.add = add;
	this.p_type = p_type;
	this.b_type = b_type;
	this.d = d;
}


public String getUname() {
	return uname;
}


public void setUname(String uname) {
	this.uname = uname;
}


public String getProduct() {
	return product;
}


public void setProduct(String product) {
	this.product = product;
}


public String getAmount() {
	return amount;
}


public void setAmount(String amount) {
	this.amount = amount;
}


public String getNoi() {
	return noi;
}


public void setNoi(String noi) {
	this.noi = noi;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getMob() {
	return mob;
}


public void setMob(String mob) {
	this.mob = mob;
}


public String getAdd() {
	return add;
}


public void setAdd(String add) {
	this.add = add;
}


public String getP_type() {
	return p_type;
}


public void setP_type(String p_type) {
	this.p_type = p_type;
}


public String getB_type() {
	return b_type;
}


public void setB_type(String b_type) {
	this.b_type = b_type;
}


public Date getD() {
	return d;
}


public void setD(Date d) {
	this.d = d;
}


}
