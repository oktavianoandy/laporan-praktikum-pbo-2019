package percobaan1;

public class Tester3_1841720002Andy {

    public static void main(String[] args) {
        PermanentEmployee1841720002Andy pEmp = new PermanentEmployee1841720002Andy("Dedik", 500);
        InternshipEmployee1841720002Andy iEmp = new InternshipEmployee1841720002Andy("Sunarto", 5);
        ElectricityBill1841720002 eBill = new ElectricityBill1841720002(5, "R-1");
        Employee184172002Andy e[] = {pEmp, iEmp};
        IPayable1841720002Andy p[] = {pEmp, eBill};
        //Employee184172002Andy e2[] = {pEmp, iEmp , eBill};
    }

}
