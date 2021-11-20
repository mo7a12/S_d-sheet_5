package lab_5;
import java.util.Scanner;
/**
 *
 * @author Sameeh_Boshra
 */
public class Lab_5 {

   
    public static void main(String[] args) {
 
        Scanner input =new Scanner (System.in);
        
        MemberFactory getMember=new MemberFactory();
        System.out.println("Enter your member factory please  : ");
        String member=input.next();
        System.out.println("Enter hour_work please  : ");
        int hour_work =input.nextInt();
          
        Staff s =getMember.getMemberFactory(member);
        s.GetSalary(   hour_work );
  
    
    }
    
}
