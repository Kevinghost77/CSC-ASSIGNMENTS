import java.util.Scanner;
import java.io.*;

public class methodsForBST {

BinarySearchTree<String> bts = new BinarySearchTree<String>();

public BinarySearchTree<String> Load(String File)  throws IOException{

Scanner read = new Scanner(System.in);

String Name = read.nextLine();

File file = new File(Name);

Scanner sc = new Scanner(file).useDelimiter("\t");
String[] words;
int i = 0;
               while (sc.hasNextLine()){
               
               words = sc.nextLine().split("\t");
               
               bts.insert(words[0],words[1],words[2]);
               i++;
               }
               
System.out.println("knowledge base loaded successsfully.\n") ;             
return bts ;

}





}













