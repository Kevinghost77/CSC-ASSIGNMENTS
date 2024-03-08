public class ArrayTesting2{

public static void main(String[] args){


Double[] d = new Double[10];

for( int i = 0; i < d.length; i++) {

d[i] = new Double(d.length - i);

System.out.println(d[i]);

}




}
}