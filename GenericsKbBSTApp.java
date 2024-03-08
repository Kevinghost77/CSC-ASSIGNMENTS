import java.util.Scanner;
import java.io.*;

public class GenericsKbBSTApp {





public static void main(String[] args) throws IOException {

methodsForBST s = new methodsForBST();



Scanner input = new Scanner(System.in);


int choice = 0;

while(choice != 5)
{
System.out.println("Choose an action from the menu:\n"
+ "1. Load a knowledge base from a file\n"
+"2. Add a new statement to the knowledge base\n"
+"3. Search for an item in the knowledge base by term\n"
+"4. Search for a item in the knowledge base by term and sentence\n"
+"5. Quit\n"
+ "Enter your choice: "); 

choice = input.nextInt();

if ( choice == 1 ){ 
 
System.out.println("enter file name: ");

s.Load(input.nextLine());


}

else if(choice == 2){ 
String junk = input.nextLine();

System.out.println("Enter the term: ");

String Target = input.nextLine();

System.out.println("Enter the statement: ");

String STS = input.nextLine();

System.out.println("Enter the Confidence score: ");

double conf = input.nextDouble();
String Current_score = s.bts.find(Target).score;

double current_score = Double.parseDouble(Current_score);

         if(conf >= current_score){
            String new_score = String.valueOf(conf);
            s.bts.insert(Target,STS,new_score);
            System.out.println("Statement for term " + Target +" has been updated.\n");
            }         
            else
            System.out.println("The Confidence Score is lower than the current statement, unable to update.\n");
}





else if(choice == 3){ 
String junk = input.nextLine();

System.out.println("Enter the term to search: ");

String Target = input.nextLine();
      if(s.bts.find(Target) != null)
      System.out.println("Statement found: " + s.bts.find(Target).statement +" ("+ "Confidence score: " + s.bts.find(Target).score + ")");

      else
      System.out.println("Cannot find statement associated with the term.\n");
      
}
else if(choice == 4){
String junk = input.nextLine();

System.out.println("Enter the term: ");

String target = input.nextLine();

System.out.println("Enter Statement to search for: ");

String STS = input.nextLine();
         if(s.bts.find(target) != null)
         System.out.println("Statement was found and has a confidence score of " + s.bts.find(target).score +"."+"\n");
         else
         System.out.println("Cannot find statement associated with the term.\n");
}


}  
 
 

}

}













