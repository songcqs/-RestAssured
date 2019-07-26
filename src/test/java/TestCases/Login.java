package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jmoney.luckeylink.handler.Login_Handler;

public class Login {
     
    @BeforeTest
	private void Stup() throws Exception{
    	Login_Handler.InitializeExcelData();
    }
    
    @Test
	public void case1() throws Exception{
    	Login_Handler.Login(1);	
	}
	
    @Test
	public void case2() throws Exception{
    	Login_Handler.Login(2);	
	}
    
    @Test
	public void case3() throws Exception{
    	Login_Handler.Login(3);	
	}
    
    @Test
	public void case4() throws Exception{
    	Login_Handler.Login(4);	
	}
    
    @Test
	public void case5() throws Exception{
    	Login_Handler.Login(5);	
	}
    
    @Test
	public void case6() throws Exception{
    	Login_Handler.Login(6);	
	}
    
    @Test
	public void case7() throws Exception{
    	Login_Handler.Login(7);	
	}
    
	@AfterTest
	public void TearDown() throws Exception{
		Login_Handler.GetCaseInfo(1);
		Login_Handler.GetCaseInfo(2);
		Login_Handler.GetCaseInfo(3);
		Login_Handler.GetCaseInfo(4);
		Login_Handler.GetCaseInfo(5);
		Login_Handler.GetCaseInfo(6);
		Login_Handler.GetCaseInfo(7);
	}
}