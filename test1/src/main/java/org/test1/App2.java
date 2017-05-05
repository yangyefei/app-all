package org.test1;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App2 
{
	
	
	@Test
    public void test2()
    {
		String currentPath = System.getProperty("user.dir");
        System.out.println( "Hello World! test2" );
        System.out.println(currentPath);
    }
}
