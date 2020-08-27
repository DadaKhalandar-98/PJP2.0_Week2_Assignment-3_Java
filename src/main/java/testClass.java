import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testClass {
	
	@Test
    public void test1() {
		
		SettingData ob=new SettingData();
		
		ob.setamountInDollars("66");
        ob.setcurrency("INR");
        
        assertEquals("1.0", ob.cal_avg());
    }
	
	@Test
    public void test2() {
		
		SettingData ob1=new SettingData();
		
		ob1.setamountInDollars("100");
        ob1.setcurrency("INR");
        
        assertEquals("1.5", ob1.cal_avg());
    }

}