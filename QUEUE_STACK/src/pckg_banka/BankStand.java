package pckg_banka;

public class BankStand {

    private int id;
    private static int cntID = 1;
    private float processingTime;


    public BankStand(float processingTime) {
        this.id = cntID++;
        this.processingTime = processingTime*id;
    }
}
