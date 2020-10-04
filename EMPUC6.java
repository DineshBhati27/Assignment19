import java.util.Random;
class EMPUC6{
    
    public static void main(String args[]){
    
    final int isFullTime=1;
    final int isPartTime=0;
    int empHrs;
    int salary=0;
    int TotalSalary=0;
    int empWagePerHrs=20;
    int totalHrs=0;
    int totalworkingdays=0;
        
    Random ran=new Random();
        
    while (totalHrs<=100 && totalworkingdays<=20 )
    {
       int empCheck=ran.nextInt(2);
       totalworkingdays++;
       switch(empCheck){
                   case isFullTime :
                                   empHrs=8;
                                   break;
                   case isPartTime :
                                   empHrs=4;
                                   break;
                   default :
                           empHrs=0;
                           break;
           }
     totalHrs+=empHrs;
     salary=empHrs*empWagePerHrs;
     TotalSalary+=salary;
     }
    System.out.println("Wages for 20_Days:"+TotalSalary);        
  }
}     
        