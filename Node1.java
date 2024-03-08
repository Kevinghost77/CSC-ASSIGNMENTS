public class Node1{

private String Car;
private String Model;
private int Price;
private Node1 link;

public Node1(){

 Car = null;
 Model = null;
 Price = 0;
 link = null;

}

public Node1(String car, String model , int price , Node1 newLink){

this.Car = car;
this. Model = model;
this.Price = price;
link = newLink;

}

public String getCar(){ return this.Car; }
 
public String getModel(){ return this.Model; }

public int getPrice(){ return this.Price; }


public Node1 getLINK(){ return this.link; }

public String toString(){ return "Node1: " +  this.Car +" " + this.Model + " "+ this.Price;

}

}
 
 