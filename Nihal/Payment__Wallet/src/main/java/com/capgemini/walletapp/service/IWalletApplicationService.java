package com.capgemini.walletapp.service;

import java.util.List;
import java.util.Map;

import com.capgemini.walletapp.bean.WalletApplication;

public interface IWalletApplicationService {
	
	public int createAccount(WalletApplication details);
	public boolean login(String username,String password);
	public double showBalance();
	public int deposit(double amount);
	public int withdraw(double amount);
	public int fundTransfer(long accNo,double amount);
	public List<String> printTrans();

}
