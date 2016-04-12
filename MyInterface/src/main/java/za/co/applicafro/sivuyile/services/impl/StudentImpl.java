package za.co.applicafro.sivuyile.services.impl;

import za.co.applicafro.sivuyile.services.StudentInterface;

/**
 * Created by sivuyile on 4/12/16.
 */
public class StudentImpl implements StudentInterface {

    private String fname;
    private String lname;

    public void addStudent(String fname,String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public void printStudent() {
        System.out.println("Student\nName: "+fname +"\nLast Name:"+lname);
    }
}
