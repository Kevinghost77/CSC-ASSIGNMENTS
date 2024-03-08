import java.util.*;
import java.io.*; 
import java.text.*;

public class Person {

private String name;
private Date birth;
private Date died;


public static boolean consistent(Date BirthDate, Date DeathDate){

if(BirthDate == null)

return false;

else if(DeathDate == null)

return true;

else return(BirthDate.precedes(DeathDate) || BirthDate.equals(DeathDate));

}

public Person(String Name,Date BirthDate ,Date DeathDate){

if(consistent(Birthdate, DeathDate)){

this.name = Name;

this.birth = new Date(BirthDate);

if(DeathDate == null)

this.died = null;

else this.died =new Date(DeathDate);
}

else {

System.out.println("Inconsistent Date");
System.exit(0);
}
}

}