public class TestSale{

public static void main(String[] args)
{


Sale aSale = new Sale("Jacket", 100.00);

DiscSale aDisc = new DiscSale("Yeezy Boost 350", 100.0, 15.00);


if (aDisc.lessThan(aSale)){

System.out.println(aSale.bill() + " is more than " +aDisc.bill());

}



aSale.announcement( );
System.out.println(aSale);
System.out.println(aDisc);




}
}