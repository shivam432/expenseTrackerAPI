package com.shivam.expense.service;

import java.util.List;

import com.shivam.expense.entity.Transaction;
import com.shivam.expense.exception.EtBadRequestException;
import com.shivam.expense.exception.EtResourceNotFoundException;

public interface TransactionService {
	
	public List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);
	
	public Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

	public Transaction saveTransaction(Transaction transaction) throws EtBadRequestException;
	
	public void removeTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}
