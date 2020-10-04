import java.util.Random;
class EMPUC3{
    
    public static void main(String args[]){
    
    int is_Full_Time=1;
    int empHrs;
    int salary;    
    int empWagePerHrs=20;
        
    Random ran=new Random();
    int empCheck=ran.nextInt(2);
    
       if(is_Full_Time == empCheck)
       {
             empHrs=8;      
        }
       else
        {
              empHrs=4;
        }
          
          salary=empHrs*empWagePerHrs;
          System.out.println("Daily Wages:"+salary); 

    }
}