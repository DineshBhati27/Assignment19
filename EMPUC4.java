import java.util.Random;
class EMPUC4{
    
    public static void main(String args[]){
    
    final int isFullTime=1;
    final int isPartTime=0;
    int empHrs;
    int salary;
        
    int empWagePerHrs=20;
        
    Random ran=new Random();
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
     System.out.println("Wages:"+salary);
    }
}