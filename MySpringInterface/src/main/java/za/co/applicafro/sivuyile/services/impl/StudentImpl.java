package za.co.applicafro.sivuyile.services.impl;

import za.co.applicafro.sivuyile.services.StudentInterface;

/**
 * Created by sivuyile on 4/12/16.
 */
public class StudentImpl implements StudentInterface {

    private String lname,fname;

    public void addStudent(String fname, String lname) {
        this.lname = lname;
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void printStudent() {

    }
}
