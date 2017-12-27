package com.rt.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.bo.CustomerBO;
import com.rt.bo.OrderBO;
@Repository("MDao")
public class RStoreDAOImpl implements RStoreDAO {
    @Autowired
	private JdbcTemplate jt;
    private static final String USER_LOGIN="SELECT FNAME,LNAME,EMAIL,PASSWORD,MOBILE,CITY,PINCODE,COUNTRY,ADDRESS FROM RCUSTOMER WHERE EMAIL=? AND PASSWORD=?";
	private static final String USER_INSERT="INSERT INTO RCUSTOMER(FNAME,LNAME,EMAIL,PASSWORD,MOBILE,CITY,PINCODE,COUNTRY,ADDRESS)VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String USER_INSERT_ORDER="INSERT INTO RORDER(FNAME,LNAME,EMAIL,MOBILE,CITY,PINCODE,COUNTRY,ADDRESS,PRODUCT,AMOUNT,NOI,ODATE)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String COUPAN_CHECK="SELECT COUNT(*) FROM RCOUPANS WHERE COUPANCODE=?";
	private static final String WITHDRAW_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
    private static final String DEPOSITE_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE+? WHERE ACNO=?";
    @Override
	public CustomerBO loginUser(String name, String pass) {
		CustomerBO bo=null;
		bo=jt.queryForObject(USER_LOGIN, new RowMapper<CustomerBO>() {

			@Override
			public CustomerBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				CustomerBO b=null;
				b=new CustomerBO();
				b.setFname(rs.getString(1));
				b.setLname(rs.getString(2));				
				b.setEmail(rs.getString(3));
				b.setPassword(rs.getString(4));
				b.setMoblie(rs.getLong(5));
				b.setCity(rs.getString(6));
				b.setPincode(rs.getLong(7));
				b.setCountry(rs.getString(8));
				b.setAddress(rs.getString(9));
				return b;
			}
		}, new Object[]{name,pass});
		return bo;
	}
	@Override
	public String RRegistor(String fname, String lname, String email, String pass, String mobile, String city,
			String pincode, String country, String address) {
		int count=0;
		count=jt.update(USER_INSERT, fname,lname,email,pass,mobile,city,pincode,country,address);
		if(count!=0)
			return "success";
			else
			return null;
	}
	@Override
	public int withdraw(int accNo, float amount) {
	  int count=0;
	  count=jt.update(WITHDRAW_QUERY,amount,accNo);
    return count;
	}//method

	@Override
	public int deposite(int accNo, float amount) {
		int count=0;
		count=jt.update(DEPOSITE_QUERY,amount,accNo);
		return count;
	}//deposite(-)
	@Override
	public int[] ordetDetails(List<OrderBO> listbo) {
			
		int result[]=jt.batchUpdate(USER_INSERT_ORDER, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1,listbo.get(i).getFname());
				ps.setString(2,listbo.get(i).getLname());
				ps.setString(3,listbo.get(i).getEmail());
				ps.setString(4,listbo.get(i).getMoblie());
				ps.setString(5,listbo.get(i).getCity());
				ps.setString(6,listbo.get(i).getPincode());
				ps.setString(7,listbo.get(i).getCountry());
				ps.setString(8,listbo.get(i).getAddress());
				ps.setString(9,listbo.get(i).getProduct());
				ps.setString(10,listbo.get(i).getAmount());				
				ps.setString(11,listbo.get(i).getNoi());				
				ps.setDate(12,listbo.get(i).getD());
				
			}
			
			@Override
			public int getBatchSize() {
				
				return listbo.size();
			}
		});
		
			return result;
	}
   @Override
public boolean cCheck(String ccode) {
	int cc=jt.queryForObject(COUPAN_CHECK, Integer.class,ccode);
	
	if(cc!=0)
	return true;
	else
		return false;
}
}
