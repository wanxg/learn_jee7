package learnjee7.constructorsetterinjection;

import javax.inject.Inject;
import javax.inject.Named;

public class CalculatorWithConstructorInjection {
	
	private MyBean bean;
	
	@Inject
	public CalculatorWithConstructorInjection(MyBean bean){
		this.bean = bean;
	}
	
	public int multiplier (int base){
		
		return base * bean.generateRandomNumber(10);
		
	}

}
