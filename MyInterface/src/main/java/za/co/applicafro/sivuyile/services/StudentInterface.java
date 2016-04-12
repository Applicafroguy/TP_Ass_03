package za.co.applicafro.sivuyile.services;

/**
 * Created by sivuyile on 4/12/16.
 */
public interface StudentInterface {

    // variables
    String fname = null;
    String lname = null;

    // methods
    void addStudent(String fname, String lname);
    void printStudent();

}
