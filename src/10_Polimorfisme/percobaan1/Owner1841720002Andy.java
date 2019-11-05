package percobaan1;

public class Owner1841720002Andy {

    public void payAndy(IPayable1841720002Andy p) {
        System.out.println("Total payment = " + p.getPaymentAmountAndy());
        if (p instanceof ElectricityBill1841720002) {
            ElectricityBill1841720002 eb = (ElectricityBill1841720002) p;
            System.out.println("" + eb.getBillInfoAndy());
        } else if (p instanceof PermanentEmployee1841720002Andy) {
            PermanentEmployee1841720002Andy pe = (PermanentEmployee1841720002Andy) p;
            pe.getEmployeeInfoAndy();
            System.out.println("" + pe.getEmployeeInfoAndy());
        }
    }
    
    public void showMyEmployeeAndy(Employee184172002Andy e){
        System.out.println(""+e.getEmployeeInfoAndy());
        if (e instanceof PermanentEmployee1841720002Andy) {
            System.out.println("You have to pay him/her mothly!!!");
        } else {
            System.out.println("No need to him/her");
        }
    }
}
