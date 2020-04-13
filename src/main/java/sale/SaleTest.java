package sale;

import org.junit.Test;

import sale.Sale;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SaleTest {
//		
//	    private int headphones;//耳机
//	    private int shells;//手机壳
//	    private int protectors;//贴膜
//	    private float expected;//期望值
//	    
//	    public SaleTest(int headphones, int shells, int protectors, float expected)
//	    {
//	    	this.headphones = headphones;
//	    	this.shells = shells;
//	    	this.protectors = protectors;
//	    	this.expected = expected;
//	    }
    @Test
	public void test() throws Exception {
    	
	Sale sale = new Sale();
	
	assertEquals((float)-1, sale.commission(-1, 0, 0), 0.01);
	assertEquals((float)-1, sale.commission(-1, -1, -1), 0.01);
	assertEquals((float)-1, sale.commission(1, -1, 0), 0.01);
	assertEquals((float)-1, sale.commission(-1,-1,1), 0.01);
	assertEquals((float)-1, sale.commission(1, -1, -1), 0.01);
	assertEquals((float)-1, sale.commission(-1, 1, -1), 0.01);
	assertEquals((float)-1, sale.commission(1, 1, -1), 0.01);
	assertEquals((float)9.8, sale.commission(1, 1, 1), 0.01);
	assertEquals((float)100, sale.commission(12, 4, 0), 0.01);
	assertEquals((float)236, sale.commission(20, 20, 10), 0.01);

//	System.out.println("(-1, -1, -1)结果为："+sale.commission(-1, -1, -1));
//	System.out.println("(1, -1, 0)结果为："+sale.commission(1, -1, 0));
//	System.out.println("(-1, -1, 1)结果为："+sale.commission(-1, -1, 1));
//	System.out.println("(1, -1, -1)结果为："+sale.commission(1, -1, -1));
//	System.out.println("(-1, 1, -1)结果为："+sale.commission(-1, 1, -1));
//	System.out.println("(1, 1, -1)结果为："+sale.commission(1, 1, -1));
//	System.out.println("(1, 1, 1)结果为："+sale.commission(1, 1, 1));
//	System.out.println("(12, 4, 0)结果为："+sale.commission(12, 4, 0));
//	System.out.println("(20, 20, 10)结果为："+sale.commission(20, 20, 10));
	
	//测试
	System.out.println("(0, 0, 0)结果为："+sale.commission(0, 0, 0));
	}
	}

