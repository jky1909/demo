package test.com.jky.design.patterns.decorator; 

import com.jky.design.patterns.decorator.Decorator;
import com.jky.design.patterns.decorator.Source;
import com.jky.design.patterns.decorator.Sourceable;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Test Tester. 
* 
* @author <jky>
* @since <pre>2018/01/19</pre>
* @version 1.0 
*/ 
public class TestTest { 

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: test()
    *
    */
    @Test
    public void testTest() throws Exception {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }


} 
