import java.util.Random;
class EMPUC1{
    
    public static void main(String args[]){
    
    int is_FULL_Time=1;
    Random ran=new Random();
    int empCheck=ran.nextInt(2);
    
       if(is_FULL_Time == empCheck){
             System.out.println("Employee is Present");
          }
       else
          {
        System.out.println("Employee is Absent");
          }

    }
}