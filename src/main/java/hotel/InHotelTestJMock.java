package hotel;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class InHotelTestJMock {
      private Mockery context = new Mockery();
      private IData iData = null;
      
      @Test
      public void TestInSuccess() {
    	  iData = context.mock(IData.class);
    	  
    	  InHotel inHotel = new InHotel(iData);
    	  context.checking(new Expectations(){
    		  {
    			  oneOf(iData).in_out_Room(101,"zeng");
    			  will(returnValue("zeng成功入住101房间"));
    		  }
    	  });
    	  String result = inHotel.in(101, "zeng");
          assertEquals("zeng成功入住101房间",result);
      }

      @Test
      public void TestInFailure() {
    	  iData = context.mock(IData.class);
    	 
    	  InHotel inHotel = new InHotel(iData);
    	  context.checking(new Expectations(){
    		  {  oneOf(iData).in_out_Room(101,"zeng");
			  will(returnValue("该房间已经有客人入住！"));
    		  }
    	  });
      }

}
