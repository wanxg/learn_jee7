package learnjee7.alternative;

import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Before;
import org.junit.Test;

import learnjee7.alternative.WordReader;

import static org.junit.Assert.*;
public class WordReaderTest {
	
	private EJBContainer container;
	
	@Inject
	WordReader reader;
	
    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }
    @Test
    public void testFileReader(){
    	
    	assertEquals("File", reader.read());
    }
    
    @Test
    public void testUrlReader(){
    	
    	assertEquals("Http", reader.read());
    }

}
