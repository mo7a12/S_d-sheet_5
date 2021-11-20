package lab_5;

/**
 *
 * @author Sameeh_Boshra
 */
public class Doctor implements Staff {
  int for_hour=50;
  
  
    @Override
    public void GetSalary(  int hour_work ) {
   
        System.out.println("the salary for doctor is  :  "+hour_work*for_hour);
        
    }


    @Override
    public void getYearsOfWork() {
    }
   
}
