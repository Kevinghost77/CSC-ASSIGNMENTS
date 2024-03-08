public class LinkedList2{

private Node1 head;

public LinkedList2()
{
  head = null;
  
}

public void addToStart(String NewCar, String NewModel,int newPrice){

head = new Node1(NewCar,NewModel,newPrice,head);

}

public void OutPutList(){

Node1 position = head;

while( position != null ){

System.out.println(position);

position = position.getLINK();

}
}
public boolean RemoveFromStart()
{

if(head != null)
{ 
  head = head.getLINK();
return true;
}

return false;

}


private Node1 Find( String NewCar, String NewModel, int newPrice )

{
  Node1 position = head;
  
  while( position != null)
{

   if(position.getCar().equals(NewCar) && position.getModel().equals(NewModel) && position.getPrice()==newPrice)
   return position;
   
   position = position.getLINK();
   
}

return null;

}


public boolean Contains( String NewCar, String NewModel,int NewPrice ){

return (Find(NewCar, NewModel, NewPrice) != null);

}


}


