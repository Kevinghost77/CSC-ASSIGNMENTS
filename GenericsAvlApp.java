import java.util.Scanner;
import java.io.*;

public class GenericsAvlApp {






public static void main(String[] args) throws IOException{


AVLTree<String> avl = new AVLTree<String>();

Scanner input = new Scanner(System.in);

String Name = "GenericsKB.txt";

File file = new File(Name);

Scanner sc = new Scanner(file).useDelimiter("\t");
String[] words;
int i = 0;
               while (sc.hasNextLine()){
               
               words = sc.nextLine().split("\t");
               
               avl.insert(words[0],words[1],words[2]);
               System.out.println("The number of insertion operations for: " + words[0]+": " + avl.getInsertCount());
               avl.clearInsertCount();
             
               i++;
               }
sc.close(); 
             
String query = " ";


             
String Names = "testQueries.txt";

File newFile = new File(Names);

Scanner scs = new Scanner(newFile);

String queryWord;

int k = 0;

              while (scs.hasNextLine()){
              
               queryWord = scs.nextLine().stripTrailing();
           
              if(avl.find(queryWord) != null){
              
               System.out.println("Item Found - "+ avl.find(queryWord).data + ": " + avl.find(queryWord).statement + " " + avl.find(queryWord).score + "\n");
               System.out.println("The number of search operations: " + avl.getSearchCount());
               
               
               }
        
               if ((avl.find(queryWord) == null )){
                   System.out.println("Item associated with the query " + queryWord +" not found.\n");
                   System.out.println("The number of search operations: " + avl.getSearchCount());
           
                   
                   
              }
              
              
              
               k++;
               }
               
           
               scs.close();
               System.out.println("------------------------------");
               
               
               
               
               
               
               }
            
              
               
               

}


