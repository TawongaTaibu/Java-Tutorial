package com.ttaibu.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Manager extends Employee implements StockOptionEligible, BonusEligible {
	
	private static final Logger log = Logger.getLogger(Manager.class.getName());
	
	public Manager() {
		super();
	}
	
	
	public Manager(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender,
			String taxpayerIdNumber, String employeeNumber, BigDecimal salary) {
		super(firstName, lastName, age, height, weight, eyeColor, gender, taxpayerIdNumber, employeeNumber, salary);
	}



	public Manager(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
		super(firstName, lastName, age, height, weight, eyeColor, gender);
	}



	@Override
	public void processStockOptions(int numberOfOptions, BigDecimal price) {
		log.info("Wow, I can't believe I got " + numberOfOptions + " options at $" + price.toPlainString() + "each!");
	}

}