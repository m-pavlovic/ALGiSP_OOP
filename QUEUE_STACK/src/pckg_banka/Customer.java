package pckg_banka;

public class Customer {

    private String name;
    private int id;
    private static int cntID = 40;


    public Customer(String name) {
        this.name = name;
        this.id = cntID++;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
