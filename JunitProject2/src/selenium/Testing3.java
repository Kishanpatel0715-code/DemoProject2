package selenium;



import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Testing3 {
	
	@Rule
	public ErrorCollector err = new ErrorCollector();

	@Test
	public void test6() {
		String expected ="abc";
		String actual = "abc";
		/*
		 * if(expected.equals(actual)) { System.out.println("passed"); }else {
		 * System.out.println("failed"); }
		 */
		
		System.out.println("Before first Assert");
		Assert.assertEquals(expected,actual);
		System.out.println("After first Assert");
		Assert.assertTrue(2>3);
		System.out.println("after 2nd assert");
		
	}
	
	@Test
	public void test7() {
		String expected ="abc";
		String actual = "abc1";
		
		System.out.println("Before first Assert");
		try {
			Assert.assertEquals(expected,actual);
		}catch(Throwable t) {
			System.out.println("catch 1");
			err.addError(t);
		}
		
		System.out.println("After first Assert");
		try {
			Assert.assertTrue(2>3);

		}catch(Throwable t) {
			System.out.println("catch 2");
			err.addError(t);
		}
		System.out.println("after 2nd assert");
		
	}

}
