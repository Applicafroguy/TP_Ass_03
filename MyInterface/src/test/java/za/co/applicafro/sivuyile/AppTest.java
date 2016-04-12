package za.co.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;
import za.co.applicafro.sivuyile.services.impl.StudentImpl;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void add(){
        StudentImpl student = new StudentImpl();
        student.addStudent("sid","luko");
        Assert.assertSame("sid",student.getFname());
    }

}
