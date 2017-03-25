package learnjee7.constructorsetterinjection;

import javax.inject.Inject;
import javax.inject.Named;

public class CalculatorWithFieldInjection {
	
	@Inject
	private MyBean bean;
	
	public int multiplier (int base){
		
		return base * bean.generateRandomNumber(10);
		
	}

}
