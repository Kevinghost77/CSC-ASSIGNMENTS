import java.util.Scanner;
import java.io.*;






public class methodz {


String[] sts = new String[100000];




public String[] load(String File)  throws IOException{

Scanner read = new Scanner(System.in);

String Name = read.nextLine();

File file = new File(Name);

Scanner sc = new Scanner(file).useDelimiter("\t");

int i = 0;
               while (sc.hasNextLine()){
               
               sts[i] = sc.nextLine();
               i++; }

System.out.println("knowledge base loaded successsfully.\n") ;             
return sts;

}



public String search(String target) {

for(int i = 0; i < sts.length; i++){

      if(sts[i].contains(target))
      return sts[i];
      
}
return null;
}

public String searcher(String Target, String sentence){


for(int i = 0; i < sts.length; i++){
      if(sts[i].contains(Target) && sts[i].contains(sentence)){
      
      String[] CS = sts[i].split("\t");
      
      for(int j =0; j < CS.length; j++){
      
            if (CS[j] == CS[CS.length -1])
            
                   return CS[j]; 
                   
      
     
}
 
}
}
  return "The statement is not in the knowledge base";
}

public String update(){
String str = "";

Scanner key = new Scanner(System.in);
System.out.println("Enter the term: ");

String tgt = key.nextLine();

System.out.println("Enter the sentence: ");

String sent = key.nextLine();

System.out.println("Enter the confidence score: ");

double new_score = key.nextDouble();

Double current_score = Double.parseDouble(searcher(tgt,search(tgt)));

if(new_score > current_score) { 

for(int i = 0; i < sts.length; i++){

if(sts[i].contains(tgt))
str = tgt + "\t"+ sent + "\t" + String.valueOf(new_score);

sts[i] = tgt + "\t"+ sent + "\t" + String.valueOf(new_score);

return  "Statement for term " + tgt + " has been updated\n" ; 

}

 
}
return "Can't update score...confidence score is lower than current statement\n";
}








    
 
   
 
     
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

