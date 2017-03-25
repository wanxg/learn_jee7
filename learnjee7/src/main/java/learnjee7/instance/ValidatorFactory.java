package learnjee7.instance;

import javax.enterprise.inject.Produces;

public class ValidatorFactory {
	
	private CardSchemeType type;
	
	@Produces
	public Validator retrieveValidator(){
		
		switch(type) {
		
		case MasterCard:
		
			return new MasterCardValidator();
			
		case VISA:
		
			return new VisaValidator();
			
		default:
			
			return null;
			
		}
		
	}

}
