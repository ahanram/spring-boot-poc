package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MonthlyPayment {
@Autowired
	private Amount Amount;
	public void logicForPayment()
	{
		Amount.getAmountInfo();
	}
}
