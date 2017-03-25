package learnjee7.instance;

import static org.junit.Assert.*;

import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import learnjee7.instance.ClearingFileProcessor;

public class ClearingFileProcessorTest {
	private EJBContainer container;
	
	@Inject
	ClearingFileProcessor processor;
	
    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }
    
    @After
	public void cleanUp() throws Exception {
		container.getContext().unbind("inject");
		container.getContext().close();
	}
    
    @Test
    public void testFileParser(){
    	
    	assertTrue(processor.parser());
    }
}
