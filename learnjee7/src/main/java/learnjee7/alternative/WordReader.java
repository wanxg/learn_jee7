package learnjee7.alternative;

import javax.inject.Inject;

public class WordReader {
	
	@Inject
	private Source source;
	
	public String read(){
		
		return source.read();
		
	}
}
