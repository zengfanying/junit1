package hotel;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

public class OutHotelTestJMock {

    private Mockery context = new Mockery();
    private IData iData = null;
    private OutHotel oh = null;
    
    @Before
    public void setUp() throws Exception
    {
    	iData = context.mock(IData.class);
    	oh = new OutHotel(iData);
    	 context.checking(new Expectations(){
   		  {
   			  oneOf(iData).in_out_Room(701,"EMPTY");
   			  will(returnValue("701退房成功"));
   		  }
   	  });
    }
    @Test
    public void TestOut() {
    	assertEquals("701退房成功",oh.out(701));
    }
}
