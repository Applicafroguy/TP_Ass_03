package za.co.applicafro.sivuyile.test;

import za.co.applicafro.sivuyile.services.impl.StudentImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentImpl student = new StudentImpl();
        student.addStudent("lihe","Khowa");
        student.printStudent();
    }
}
