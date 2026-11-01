package com.ttaibu.intro;

import java.math.BigDecimal;

public interface BonusEligible {
	
	BigDecimal getSalary();
	
	default BigDecimal calculateBonus() {
		// Default: bonus is 10% of Salary
		return getSalary().multiply(BigDecimal.valueOf(0.1));
	}

}
