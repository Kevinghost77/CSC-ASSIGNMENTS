import java.util.Scanner;
import java.io.*;






public class GenericsKbArrayApp {




    
 
   
 
     
public static void main(String[] args) throws IOException {
Scanner input = new Scanner(System.in);
methodz t1 = new methodz();


   
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

if ( choice == 1){ 

System.out.println("enter file name: ");

t1.load(input.nextLine());
}

else if(choice == 2){
System.out.println(t1.update());
}





else if(choice == 3){ 
String junk = input.nextLine();

System.out.println("Enter the term to search: ");

String Target = input.nextLine();

String[] Str = (t1.search(Target)).split("\t");

System.out.println("Statement found: " + Str[1] + " (" + "Confidence score: " + Str[2] +")" +"\n");

}

else if(choice == 4){ 
String junk = input.nextLine();

System.out.println("Enter the term: ");

String Target = input.nextLine();


System.out.println("Enter the statement to search for: ");

String sentence = input.nextLine();

System.out.println("The Statement was found and has confidence score of " +t1.searcher(Target,sentence) +"\n");
}
 


}


}

}

