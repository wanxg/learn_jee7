package learnjee7.instance;

import static org.junit.Assert.*;

import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;

import learnjee7.instance.ClearingFileProcessor2;

public class ClearingFileProcessorTest2 {
	private EJBContainer container;
	
	@Inject
	ClearingFileProcessor2 processor;
	
    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }
    @Test
    public void testFileParser(){
    	
    	assertTrue(processor.parser());
    }
}
