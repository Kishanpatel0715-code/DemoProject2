package selenium;



import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Testing4 {

	String username;
	String password;
	String browser;
	
	public Testing4(String username,String password,String browser) {
		this.username = username;
		this.password = password;
		this.browser = browser;
		
	}
	@Test
	public void test() {
		System.out.println(username+"----"+password+"-----"+browser);
		
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data = new Object[4][3];
		
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "Mozilla";
		
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "Chrome";
		
		data[2][0] = "U3";
		data[2][1] = "P3";
		data[2][2] = "IE";
		
		data[3][0] = "U4";
		data[3][1] = "P4";
		data[3][2] = "Safari";
		
		return Arrays.asList(data);
	}

}
