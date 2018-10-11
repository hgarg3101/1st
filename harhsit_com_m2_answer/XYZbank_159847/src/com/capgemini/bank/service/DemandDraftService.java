package com.capgemini.bank.service;

import java.sql.SQLException;
import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.dao.DemandDraftDAO;

class NameValidException extends Exception
{
	String s;
	NameValidException(String s){
		this.s=s;
	}
	public String toString(){
		return s+" is not a valid name. Only Alphabets are allowed((Ex: Harshit867 is not allowed))";
	}
	
}

class CapgePhoneException extends Exception{    //custom defined exception to handle phone numbers
	String s;
	CapgePhoneException(String s){
		this.s=s;
	}
	public String toString(){
		return s+" is not a phone number. Only 10 numeric digits are allowed((Ex: 9995676123))";
	}
}
class CapgeDamtException extends Exception{    //custom defined exception to handle Demand draft amount
	double d;
	CapgeDamtException(double d){
		this.d=d;
	}
	public String toString(){
		return d+" amount is not in proper format. Till 5 lakhs allowed. Please use only numeric values(Ex: 3500)";
	}
}

public class DemandDraftService implements IDemandDraftService {

	@Override
	public int addDemandDraftDetails(DemandDraft demandDraft) throws SQLException {
		int flag=1;  //to check for method is working
		Double ddcomm = 0.0;
		if(demandDraft.getDdamt()<=5000){
			ddcomm=10.0;
		}
		else if(demandDraft.getDdamt()>5000 && demandDraft.getDdamt()<=10000){
			ddcomm=41.0;
		}
		else if(demandDraft.getDdamt()>10000 && demandDraft.getDdamt()<=100000){
			ddcomm=51.0;
		}
		else if(demandDraft.getDdamt()>100000 && demandDraft.getDdamt()<=500000){
			ddcomm=306.0;
		}
		demandDraft.setDdcomm(ddcomm);
		
		//use of custom exception
		try{
		if(!demandDraft.getPnum().matches("[0-9]{10}")){
			throw new CapgePhoneException(demandDraft.getPnum());
		}
		}
		catch(CapgePhoneException e){
			flag=0;
			e.printStackTrace();
		}
		//
		//use of custom exception will check negatives and error inputs
		try{
			if(!demandDraft.getDdamt().toString().matches("[0-500000.]+")){
				throw new CapgeDamtException(demandDraft.getDdamt());
				}
			}
		catch(CapgeDamtException e){
			flag=0;
			e.printStackTrace();
			}
	    //
		//use of custom exception will check valid name inputs
		try{
			if(!demandDraft.getCname().matches("[a-z A-Z]+")){
				throw new NameValidException(demandDraft.getCname());
				}
			}
		catch(NameValidException e){
			flag=0;
			e.printStackTrace();
			}
	    //
		
		//
		if(flag==1){
			DemandDraftDAO ddd= new DemandDraftDAO();
			ddd.addDemandDraftDetails(demandDraft); //Calling method from DataDemandDOA to add data to our table
		}
		return flag;
	}

	@Override
	public DemandDraft getDemandDraftDetails(int transactionId) {
		
		return null;
	}

}
