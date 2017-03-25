package learnjee7.instance;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

import learnjee7.alternative.Source;

public class ClearingFileProcessor {

	private static final String CARDSCEHEME = "MCI";
	
	@Inject @Any Instance<Validator> validatorSource;
	
	@Inject Source source;
	
	public boolean parser(){
		
		if(CARDSCEHEME.equals("MCI")){
			
			Validator validator  = validatorSource.select(new AnnotationLiteral<MasterCard>() {}).get();
			if(validator.valiate(source.read())) 
				return true;
			else
				return false;
		}
		
		else if(CARDSCEHEME.equals("VIS")){
			
			Validator validator  = validatorSource.select(new AnnotationLiteral<VISA>() {}).get();
			if(validator.valiate(source.read())) 
				return true;
			else
				return false;
		}
		
		else
			
			return false;
		

	}
}
