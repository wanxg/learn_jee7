package learnjee7.instance;

@CardScheme(type=CardSchemeType.MasterCard)
@MasterCard
public class MasterCardValidator implements Validator {

	public boolean valiate(String field) {
		if("File".equals(field))
			return true;
		else 
			return false;
	}

}
