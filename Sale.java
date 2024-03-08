public class Sale{

private double price;
private String name;

public Sale(){

this.price = 0.0;
this.name = "no name";
}

public Sale(Sale othersale){
this.price = othersale.price;
this.name = othersale.name;
}

public Sale(String Name, double Price){

this.name = Name;
this.price = Price;
}

public double bill(){ return this.price;}

public void setName(String otherName){ this.name = otherName;}

public void setPrice(double otherPrice){ this.price = otherPrice;}

public String getName(){ return this.name;}

public double getPrice(){ return this.price;}

public boolean equals(Object othersale){

if(othersale == null)
return false;

else if(getClass() != othersale.getClass())
return false;

else{

Sale sale =  (Sale)othersale;

return(name.equals(sale.name) && price==sale.price);

}
}

public boolean lessThan(Sale othersale){

if(othersale == null)

return false;

else{ return bill() < othersale.bill();}

}

public Sale clone(){

return new Sale(this);

}

public static void announcement( ){

System.out.println( "This is the Sale class!!!");
}

public String toString( )
{
        return (name + " Price and total cost = $" + price);
}



} 
