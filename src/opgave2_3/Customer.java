package opgave2_3;


public class Customer implements Comparable<Customer> {
    private String name;
    private String efternavn;
    private int alder;

    public Customer(String aName, String aLastName, int anAge) {
        setName(aName);
        setEfternavn(aLastName);
        setAlder(anAge);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEfternavn() {
        return efternavn;
    }
    
    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }
    
    public int getAlder() {
        return alder;
    }
    
    public void setAlder(int alder) {
        this.alder = alder;
    }
    
    @Override
    public int compareTo(Customer o) {
        int compareStatus = this.efternavn.compareToIgnoreCase(o.getEfternavn());

        if (compareStatus == 0) {
            compareStatus = this.name.compareToIgnoreCase(o.getName());

            if (compareStatus == 0) {
                compareStatus = this.alder - o.getAlder();
            }
        }

        return compareStatus;
    }

    @Override
    public String toString() {
        String toString = "Name is " + name + "\n";
        toString += "Last name is " + this.efternavn + "\n";
        toString += "Age is " + this.alder + "\n";
        return toString;
    }
}