package hotel;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ListHomeTesteasyMock {
	private ListHome lh= new ListHome();
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog(); 
	private IData iData = null;
	
	@Test
    public void TestListJMock() {
	  iData = createMock("iData",IData.class);
		for(int i = 0; i < HotelConstant.HOTEL_TOTAL_FLOOR; i++)
		{
			for (int j = 0; j < HotelConstant.HOTEL_ROOMS_EVERYFLOOR; j++)
			{
				expect(iData.getStation((i + 1) * 100 + j + 1) + "\t").andReturn(HotelConstant.EMPTY);;
			}}
		replay(iData);
		
		lh.search();
		
		String lineSeperator = System.getProperty("line.separater");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < HotelConstant.HOTEL_TOTAL_FLOOR; i++)
		{
			for (int j = 0; j < HotelConstant.HOTEL_ROOMS_EVERYFLOOR; j++)
			{
				if(j + 1 < 10)
				{
					sb.append(i + 1 + "0" + (j + 1)+ "\t");
				}
				else {
					sb.append(i + 1 + "" + (j + 1)+ "\t");
				}
			}
			
			//打印房间状态
			sb.append(lineSeperator);
			for (int j = 0; j < HotelConstant.HOTEL_ROOMS_EVERYFLOOR; j++)
			{
				sb.append(HotelConstant.EMPTY + "\t");
			}
			sb.append(lineSeperator);
			}
		assertEquals(sb.toString(),systemOutRule.getLog());
        verify(iData);
	}
}
