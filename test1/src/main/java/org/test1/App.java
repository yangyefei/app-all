package org.test1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.web.utils.RetryListener;
import com.web.utils.TestLinster;

/**
 * Hello world!
 *
 */
@Listeners({TestLinster.class,RetryListener.class})
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
