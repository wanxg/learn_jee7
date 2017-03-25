package learnjee7.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class FileSource implements Source{

	public String read() {
		System.out.println("reading from file......");
		return "File";
	}

}
