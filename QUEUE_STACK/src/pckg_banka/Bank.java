package pckg_banka;

import pckg_adt_queue.QUEUEARR;

import java.util.Set;
import java.util.TreeSet;

public class Bank {

    private String bankName;
    private int id;
    private static int cntID = 100;
    private Set<BankStand> stands;
    private QUEUEARR<Customer> queue;
    private static final int BANK_CAPACITY = 30;


    public Bank(String bankName) {
        this.bankName = bankName;
        this.id = cntID++;
        this.stands = new TreeSet<>();
        this.queue = new QUEUEARR<>(BANK_CAPACITY);
    }


    public void addStand(BankStand stand) {
        this.stands.add(stand);
    }


    public void addCustomerToQueue(Customer customer) {
        queue.enqueue(customer);
    }

    public void startTransactionsOnBankStands() {

    }



}
