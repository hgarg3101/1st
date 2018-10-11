package com.capgemini.bank.service;
import static org.junit.Assert.*;

import java.sql.SQLException;

import  org.junit.Test;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.dao.DemandDraftDAO;

public class MyJunitTest {

	@Test
	public void testAddDemandDraftDetails() throws SQLException{
		DemandDraft demandDraft = new DemandDraft();
		demandDraft.setCname("Test");
		demandDraft.setPnum("9876543210");
		demandDraft.setIfo("ABC comp");
		demandDraft.setDdamt(50000.0);  //double
		demandDraft.setDd_desc("Good job");
		demandDraft.setDdcomm(300.0);    //double
		DemandDraftDAO test = new DemandDraftDAO();
		assertEquals(1, test.addDemandDraftDetails(demandDraft));   //if succesful will return 1
	}
}
