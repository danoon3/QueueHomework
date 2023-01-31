public class Person {
    protected String name;
    protected String surname;
    protected int numberOfTickets;

    public Person(String name, String surname, int numberOfTickets) {
        this.surname = surname;
        this.name = name;
        this.numberOfTickets = numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}
