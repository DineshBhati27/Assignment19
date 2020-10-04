import java.util.Random;
class EMPUC5{
    
    public static void main(String args[]){
    
    final int isFullTime=1;
    final int isPartTime=0;
    int empHrs;
    int salary=0;
    int TotalSalary=0;
    int i;    
    int empWagePerHrs=20;
        
    Random ran=new Random();
        
    for(i=1;i<=20;i++)
    {
       int empCheck=ran.nextInt(2);
       
        
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
     salary=empHrs*empWagePerHrs;
     TotalSalary+=salary;
     }
        
     System.out.println("Wages for 20_Days:"+TotalSalary);        
  }
}