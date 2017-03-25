package learnjee7.alternative;

import javax.enterprise.inject.Default;

@Default
public class IPMSource implements Source{

	public String read() {
		System.out.println("reading from ipm file......");
		return "IPM";
	}

}
