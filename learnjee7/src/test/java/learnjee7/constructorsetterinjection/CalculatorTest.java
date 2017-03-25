package learnjee7.constructorsetterinjection;

import static org.junit.Assert.assertTrue;

import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import learnjee7.constructorsetterinjection.CalculatorWithFieldInjection;

public class CalculatorTest {
	
	private EJBContainer container;
	
	private @Inject CalculatorWithFieldInjection cf;
	
	private @Inject CalculatorWithFieldInjection cc;
	
    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }
    
    @Test
    public void testMultplierWithFieldInjection(){
    	
    	int base = 10;
    	//Calculator c = new Calculator();
    	
    	int multi = cf.multiplier(base);
    	
    	assertTrue("Wrong: 50 <= " + multi,  50>multi);
    }
    
    @Test
    public void testMultplierWithConstructorInjection(){
    	
    	int base = 10;
    	
    	int multi = cc.multiplier(base);
    	
    	assertTrue("Wrong: 50 <= " + multi,  50>multi);
    }

}
