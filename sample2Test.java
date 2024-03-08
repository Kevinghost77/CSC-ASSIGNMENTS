import java.util.Scanner;

public class sample2Test{

public static void main(String[] args){

sample2<String, Integer> s = new sample2<String, Integer>("The Originals", 7);

sample2<String, Integer> r = new sample2<String, Integer>("The Vampire Diaries", 8);
Scanner keyin = new Scanner(System.in);

System.out.println("The current rating of " + s.getData1() + " is: " + s.getData2());

System.out.println("Try and give the show a new rating");

int  rating = keyin.nextInt();
s.SetData2(rating);

System.out.println("The new rating of " +s.getData1() + " is: " + s.getData2());

sample2.combine(s,r);

}
} 