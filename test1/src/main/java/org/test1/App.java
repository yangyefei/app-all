package org.test1;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	@Test
    public void test1()
    {
		String currentPath = System.getProperty("user.dir");
        System.out.println( "Hello World! test1" );
        System.out.println(currentPath);
    }
}
