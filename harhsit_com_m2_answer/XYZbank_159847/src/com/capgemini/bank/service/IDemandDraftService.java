package com.capgemini.bank.service;

import java.sql.SQLException;

import com.capgemini.bank.bean.DemandDraft;

public interface IDemandDraftService {
	int addDemandDraftDetails (DemandDraft demandDraft) throws SQLException;
	DemandDraft getDemandDraftDetails (int transactionId);
}
