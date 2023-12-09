package practiseJavaForQA;

public class Employees {

    int employeeID;
     String firstName = "Ola";




     int basic_salary = 2500;
     int overtimeRate = 20; //an example of a global variable


     public int requestOvertimePay(int overtimeHours)
     {
         return overtimeHours*overtimeRate;
     }



}
