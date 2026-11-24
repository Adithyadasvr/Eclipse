package JUNIT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junitpgm {
	@Before
	public void setup()
	{
		System.out.println("browser open");
	}

	@Test
	
		public void test()
		{
			System.out.println("during testing");
		}
		
		@After
		public void browserclose()
		{
			System.out.println("browser closed");
		}
	}

