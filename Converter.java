import java.util.Scanner;


public class Converter{

public static void main(String[] args){

String [] hours = {"one","two","three","four"};

String [] minutes = {"o'clock", "five","ten"};

Scanner key = new Scanner(System.in);

System.out.println("Enter a time or 'quit': " );
String time = key.nextLine();


while(time != "quit") {


String str1 = time.substring(0,2);
String str2 = time.substring(3,5);

System.out.println(str1);
System.out.println(str2);

int hrs = Integer.parseInt(str1);
int mins = Integer.parseInt(str2);

System.out.println(hrs);
System.out.println(mins);


if ( mins < 30 ){

String past = "past";

switch(mins) {

case 5:

String Cur = minutes[1];

System.out.print(Cur + " " + past);

break; }

}

else {

String to = "to";

switch(mins) {

case 5:

String Cur = minutes[1];

System.out.print(Cur + " " + to);

break; }
}

switch(hrs) {

case 13: 

String tur = hours[0];

System.out.print(" " + tur);

break;

}



break;









}






}
}