package com.designPattern.factoryMethodPattern;

public class PlanFactory {

	public Plan getPlan(String planType) {

		if (planType == null)
			return null;
		if (planType.equalsIgnoreCase("DomesticPlan"))
			return new DomesticPlan();
		else if (planType.equalsIgnoreCase("CommercialPlan"))
			return new CommercialPlan();
		else if (planType.equalsIgnoreCase("InstitunalPlan"))
			return new InstitunalPlan();

		return null;
	}

}
