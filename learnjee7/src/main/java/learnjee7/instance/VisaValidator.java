package learnjee7.instance;

@CardScheme(type=CardSchemeType.VISA)
@VISA
public class VisaValidator implements Validator {

	public boolean valiate(String field) {
		if("Http".equals(field))
			return true;
		else 
			return false;
	}

}
