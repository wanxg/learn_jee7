package learnjee7.constructorsetterinjection;

import java.util.Random;

public class MyBean{
	
	public int generateRandomNumber(int i){
		
		Random randomInt = new Random();
		
		return randomInt.nextInt(i);
		
	}

}
