package com.ttaibu.intro;

import java.math.BigDecimal;

public interface StockOptionEligible {
	
	void processStockOptions(int numberOfOptions, BigDecimal price);

}
