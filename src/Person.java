
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S500900
 */
public class Person{

    public String first_name;
    public String last_name;
    public String ID;
    public int parking_space_number;

    public Person() {
        this(null, null);
    }

    public Person(String name, String ID) {
        setName(name);
        setID(ID);
    }

    private void setName(String name) {
        String f;
        String l;
        f = name.split(", ")[1];
        l = name.split(", ")[0];

        this.first_name = f;
        this.last_name = l;
    }

    private void setID(String num) {
        this.ID = num;
    }


    public void setParkingSpaceNumber(int num) {
        this.parking_space_number = num;
    }

    public String getLastName()
    {
        return this.last_name;
    }

    public String getFirstName()
    {
        return this.first_name;
    }

    public String getID()
    {
        return this.ID;
    }


    public int getParkingSpace()
    {
        return this.parking_space_number;
    }


    public String toString() {
        return this.ID + " - " + this.parking_space_number;
    }
}
