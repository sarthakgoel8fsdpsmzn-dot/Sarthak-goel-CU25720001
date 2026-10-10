
class ElectricBill {
    int units;
    static double fixedCharge = 100;

    ElectricBill(int units) {
        this.units = units;
    }

    void calculateBill() {
        double ratePerUnit = 5;
        double energyCharge = units * ratePerUnit;
        double totalBill = energyCharge + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Energy Charge: Rs. " + energyCharge);
        System.out.println("Fixed Charge: Rs. " + fixedCharge);
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}

public class question18 {
    public static void main(String[] args) {
        int consumedUnits = 150;

        ElectricBill bill = new ElectricBill(consumedUnits);
        bill.calculateBill();
    }
}
