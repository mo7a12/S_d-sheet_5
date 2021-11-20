package lab_5;

/**
 *
 * @author Sameeh_Boshra
 */
public class TeachingAssistant implements Staff {

  int for_hour = 35;
  int year =2021;
 
    @Override
    public void GetSalary(  int hour_work ) {
        System.out.println(  "the salary for Teaching_ASSistant is  :  "+ hour_work *for_hour);
    }

   
    @Override
    public void getYearsOfWork() {
    }
}
