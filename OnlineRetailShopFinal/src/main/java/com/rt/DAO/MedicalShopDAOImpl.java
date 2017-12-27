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
public class MedicalShopDAOImpl implements MedicalShopDAO {
    @Autowired
	private JdbcTemplate jt;
    private static final String USER_LOGIN="SELECT UNAME,MOBILE,EMAIL,PASSWORD,CITY,PINCODE,STATE,ADDRESS FROM MCUSTOMERS WHERE UNAME=? AND PASSWORD=?";
	private static final String USER_INSERT="INSERT INTO MCUSTOMERS(UNAME,MOBILE,EMAIL,PASSWORD,CITY,PINCODE,STATE,ADDRESS)VALUES(?,?,?,?,?,?,?,?)";
	private static final String USER_INSERT_ORDER="INSERT INTO MORDER(UNAME,PRODUCT,AMOUNT,NOI,EMAIL,MOBILE,ADDRESS,P_TYPE,B_TYPE,O_DATE)VALUES(?,?,?,?,?,?,?,?,?,?)";
    @Override
	public CustomerBO loginUser(String name, String pass) {
		CustomerBO bo=null;
		bo=jt.queryForObject(USER_LOGIN, new RowMapper<CustomerBO>() {

			@Override
			public CustomerBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				CustomerBO b=null;
				b=new CustomerBO();
				b.setUname(rs.getString(1));
				b.setMoblie(rs.getLong(2));
				b.setEmail(rs.getString(3));
				b.setPassword(rs.getString(4));
				b.setCity(rs.getString(5));
				b.setPincode(rs.getLong(6));
				b.setState(rs.getString(7));
				b.setAddress(rs.getString(8));
				return b;
			}
		}, new Object[]{name,pass});
		return bo;
	}
	@Override
	public String MRegistor(String name, String mobile, String email, String pass, String city, String pincode,
			String state, String address) {
		int count=0;
		count=jt.update(USER_INSERT, name,mobile,email,pass,city,pincode,state,address);
		if(count!=0)
			return "success";
			else
			return null;
	}
	@Override
	public int[] ordetDetails(List<OrderBO> listbo) {
			
		int result[]=jt.batchUpdate(USER_INSERT_ORDER, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1,listbo.get(i).getUname());
				ps.setString(2,listbo.get(i).getProduct());
				ps.setString(3,listbo.get(i).getAmount());
				ps.setString(4,listbo.get(i).getNoi());
				ps.setString(5,listbo.get(i).getEmail());
				ps.setString(6,listbo.get(i).getMob());
				ps.setString(7,listbo.get(i).getAdd());
				ps.setString(8,listbo.get(i).getP_type());
				ps.setString(9,listbo.get(i).getB_type());
				ps.setDate(10,listbo.get(i).getD());
				
			}
			
			@Override
			public int getBatchSize() {
				
				return listbo.size();
			}
		});
		
			return result;
	}

}
