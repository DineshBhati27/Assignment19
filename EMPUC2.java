import java.util.Random;
class EMPUC2{
    
    public static void main(String args[]){
    
    int empHrs=8;
    int empWagePerHrs=20;
    int is_Present=1;
    Random ran=new Random();
    int empCheck=ran.nextInt(2);
    
       if(is_Present == empCheck){
             System.out.println("Employee is Present");
             int salary;
             salary=empHrs*empWagePerHrs;
             System.out.println("Daily Wage:"+salary);
          }
       else
          {
              System.out.println("Employee is Absent");
          }

    }
}
