package learnjee7.instance;

import javax.inject.Inject;
import learnjee7.alternative.Source;

public class ClearingFileProcessor2 {

	private static final String CARDSCEHEME = "MCI";
	
	@Inject 
	//@CardScheme(type=CardSchemeType.VISA) 
	Validator validator;
	
	@Inject Source source;
	
	public boolean parser(){
		
		if(CARDSCEHEME.equals("MCI")){
			
			if(validator.valiate(source.read())) 
				return true;
			else
				return false;
		}
		
		else if(CARDSCEHEME.equals("VIS")){
			
			if(validator.valiate(source.read())) 
				return true;
			else
				return false;
		}
		
		else
			
			return false;
		

	}
}
