package com.capgemini.bank.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.service.DemandDraftService;

//Hey person this application is for xyz bank that is not even present in real life. It is an illusion. Everything is an illusion.

public class Client {
	
	static Logger Log=Logger.getLogger(Client.class.getName());
	
	public static void main(String...a) throws NumberFormatException, IOException{
		Integer choice;
		//Scanner sc= new Scanner(System.in);
		
		//using buffer reader to allow space strings
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//		Log.info("log test");
		
		System.out.println("Enter your Choice:\n1)Enter Demand Draft Details\n2)Exit");
		choice= Integer.parseInt(br.readLine());
		switch(choice){
		case 1:
		{
			DemandDraft dd1= new DemandDraft();
			System.out.println("Enter the name of the customer:");
			dd1.setCname(br.readLine());
			System.out.println("Enter customer phone number:(only 10 digits of numeric)");
			dd1.setPnum(br.readLine());
			System.out.println("In Favour of:");
			dd1.setIfo(br.readLine());
			System.out.println("Enter Demand Draft amount (in Rs.):");
			dd1.setDdamt(Double.parseDouble(br.readLine()));
			System.out.println("Enter Remarks:");
			dd1.setDd_desc(br.readLine());
			DemandDraftService ds=new DemandDraftService();
			try {
				if(ds.addDemandDraftDetails(dd1)==0){
					System.out.println("Exceptions errors");
					System.out.println("Demand Draft Application closing***\n closed**");
					System.exit(0);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Your Demand Draft request has been successfully registered along with the "+dd1.getTid());
			break;
	
		}
		case 2:{
			br.close();
			System.out.println("Demand Draft Application closing***\n*\n*\nclosed**");
			System.exit(0);
		}
		br.close();
		System.out.println("Demand Draft Application closing***\n*\n*\nclosed**");
		}
	}
}
