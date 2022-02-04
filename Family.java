import java.util.ArrayList;
import java.util.List;

public class Family {
    private int numberOfPersonInFamily;
    private int apartmentNumber;
    private List<Person> persons;

    public Family() {
        persons = new ArrayList<Person>();
    }

    public Family(int numberOfPersonInFamily, int apartmentNumber, List<Person> persons) {
        this.numberOfPersonInFamily = numberOfPersonInFamily;
        this.apartmentNumber = apartmentNumber;
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }



    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }



    public int getNumberOfPersonInFamily() {
        return numberOfPersonInFamily;
    }

    public void setNumberOfPersonInFamily(int numberOfPersonInFamily) {
        this.numberOfPersonInFamily = numberOfPersonInFamily;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Apartment number: " + apartmentNumber + ", number of person in family: " + numberOfPersonInFamily + ", detail: "+ persons;
    }
    
}
