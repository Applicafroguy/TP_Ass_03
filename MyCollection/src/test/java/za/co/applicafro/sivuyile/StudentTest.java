package za.co.applicafro.sivuyile;

import org.junit.Assert;
import org.junit.Test;
import za.co.applicafro.sivuyile.test.Student;

import java.util.*;

/**
 * Created by sivuyile on 4/13/16.
 */
public class StudentTest {




    @Test
    public void listTest(){
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            Student student = new Student("name"+(i+1),"lname"+(i+1));
            studentList.add(student);
        }

        Assert.assertNotNull(studentList);
    }

    @Test
    public void testSet(){
        Set<Student> studentSet = new LinkedHashSet<Student>();
        for (int i = 0; i <3; i++){
            Student student = new Student("name"+(i+1),"lname"+(i+1));
            studentSet.add(student);
        }

        Assert.assertNotNull(studentSet);
    }

    @Test
    public void testMap(){
        Map map = new HashMap();
        for (int i = 0; i <3; i++){
            map.put("key"+i,"Value"+i);
        }

        Assert.assertNotNull(map);
    }
}
