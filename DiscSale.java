import java.lang.Math;


public class DiscSale extends Sale{

private double discount;

public DiscSale(){

super();

this.discount = 0.0;
}

public DiscSale (DiscSale otherDisc){

super(otherDisc);
this.discount = otherDisc.discount;
}

public DiscSale(String NaMe, double priCe, double Discount){
super(NaMe, priCe);
this.discount = Discount;
}

public double getDiscount(){ return this.discount;}
public void setDiscount(double DisCount){ this.discount = DisCount;}

public double bill(){ return getPrice() * (1-(discount/100));}

public boolean equals(Object otherDisc){

if(otherDisc == null)
return false;

else if(getClass() != otherDisc.getClass())
return false;

else{

DiscSale discSale =  (DiscSale)otherDisc;

return (super.equals(discSale) && this.discount == discSale.discount);

}

}

public static void announcement( )
{
        System.out.println("This is the DiscountSale class.");

} 

public String toString( )
    {
        return (getName( ) + " Price = $" + getPrice( )
                + " Discount = " + discount + "%\n"
                + "   Total cost = $" + bill( ));
    }


public DiscSale clone(){

return new DiscSale(this);
}

}