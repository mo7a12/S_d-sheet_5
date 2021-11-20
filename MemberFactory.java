package lab_5;

/**
 *
 * @author Sameeh_Boshra
 */
public class MemberFactory {
    public Staff getMemberFactory (String member)
    {
        
       if(member==null)
          {
              return null ;
          }
       if(member.equalsIgnoreCase("Doctor"))
          {
             return new Doctor();
           
          }
       else if(member.equalsIgnoreCase("TeacchingAssistant"))        
           {
               return new TeachingAssistant();
           }
     else
           return null;
       
       
       
    }
}
