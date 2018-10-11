package com.capgemini.bank.dao;

import java.sql.DriverManager;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.apache.log4j.Logger;

import com.capgemini.bank.bean.DemandDraft;

public class DemandDraftDAO implements IDemandDraftDAO {
	static Logger Log=Logger.getLogger(DemandDraftDAO.class.getName());
	
	@Override
	public int addDemandDraftDetails(DemandDraft demandDraft){
		Date d = new Date();
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="hr";
		String pass="hr";
	
		Connection con=null;
		try {
			con = DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("Connection created and retrives into con object**");

		String sql="insert into demand_draft values(?,?,?,?,?,?,?,?)";
		
		/*(1)transaction_id NUMBER,(2)customer_name VARCHAR2(20),
		 * (3)in_favor_of  VARCHAR2(20), 
		(4)phone_number VARCHAR2(10),(5) date_of_transaction DATE,
		(6) dd_amount NUMBER, 
		(7)dd_commission NUMBER, 
		(8)dd_description VARCHAR2(50)*/
		
		
		
		Statement st=null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		} //import using java.sql not java.beans
		Log.info("create statement using con.create statement used to execute sequence query separately");
		ResultSet rs=null;
		try {
			rs = st.executeQuery("select Transaction_id_Seq.nextval from dual");
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("Executing sequence.nextval and storing it into a result set");
		try {
			while(rs.next()){
			demandDraft.setTid(Integer.valueOf(rs.getInt(1)));
			}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		PreparedStatement ps=null;
		try {
			ps = con.prepareStatement(sql);
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("Object of prepared statement by passing  sql string into prepare statement method present in con object. For inputing values into the table");
		try {
			ps.setInt(1,demandDraft.getTid());
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("value of Transaction id is set");
		try {
			ps.setString(2,demandDraft.getCname());
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("value of Customer_name is set");
		try {
			ps.setString(3, demandDraft.getIfo());
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("value of in_favour_of is set");
		try {
			ps.setString(4, demandDraft.getPnum());
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("value of phone_number is set");
		try {
			ps.setDate(5, new java.sql.Date(d.getTime()));
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("value of date_of_transaction is set");
		try {
			ps.setDouble(6, demandDraft.getDdamt());
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		Log.info("value of dd_amount is set");
		try {
			ps.setDouble(7,demandDraft.getDdcomm());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		Log.info("value of dd_commission is set");
		try {
			ps.setString(8, demandDraft.getDd_desc());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		Log.info("value of dd_description is set");
		try {
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		Log.info("Executing updation");
		Log.info("1 row inserted");
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		Log.info("Connection closed**");
		return 1;
	}

	@Override
	public DemandDraft getDemandDraftDetails(int transactionId) {
		
		return null;
	}
	

}
