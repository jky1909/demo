package test.com.jky.design.patterns.observer; 

import com.jky.design.patterns.observer.MySubject;
import com.jky.design.patterns.observer.Observer1;
import com.jky.design.patterns.observer.Observer2;
import com.jky.design.patterns.observer.Subject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
* MySubject Tester. 
* 
* @author <jky>
* @since <pre></pre>
* @version 1.0 
*/ 
public class MySubjectTest { 

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: operation()
    *
    */
    @Test
    public void testOperation() throws Exception {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }


} 
