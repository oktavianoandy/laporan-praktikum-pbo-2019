package percobaan1;

public class Tester4_1841720002Andy {

    public static void main(String[] args) {
        Owner1841720002Andy ow = new Owner1841720002Andy();
        ElectricityBill1841720002 eBill = new ElectricityBill1841720002(5, "R-1");
        ow.payAndy(eBill);//pay for electricity bill
        System.out.println("--------------------------------------------------");
        
        PermanentEmployee1841720002Andy pEmp = new PermanentEmployee1841720002Andy("Dedik", 500);
        ow.payAndy(pEmp);//pay for permanent employee
        System.out.println("--------------------------------------------------");
        
        InternshipEmployee1841720002Andy iEmp = new InternshipEmployee1841720002Andy("Sunarto", 5);
        ow.showMyEmployeeAndy(pEmp); //show permanent employee info
        System.out.println("--------------------------------------------------");
        ow.showMyEmployeeAndy(iEmp); // show internship employee info
        
        //ow.payAndy(iEmp);
    }
}
