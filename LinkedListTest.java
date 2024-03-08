public class LinkedListTest{

public static void main(String[] args){

LinkedList2 aList = new LinkedList2();

aList.addToStart("Mercedes Benz", "C200",200000);

aList.addToStart("Land Rover", "Sport", 1000000);

aList.addToStart("Porsche", "911 ST", 2400000);

aList.addToStart("Ferrari", "LaFerrari", 18000000);

aList.addToStart("Bugatti", "Chiron" , 48000000);

aList.OutPutList();

System.out.println(aList.Contains("Bugatti","Chiron",48000000));


aList.RemoveFromStart();
aList.RemoveFromStart();

aList.OutPutList();































}
}