public class sample2<T1,T2>{

private T1 data1;

private T2 data2;


public sample2( T1 Data1, T2 Data2){

this.data1 = Data1;
this.data2 = Data2;

}


public void SetData1(T1 Data1){

this.data1 = Data1;
}

public void SetData2(T2 Data2){

this.data2 = Data2;

}

public T1 getData1(){ return this.data1;}


public T2 getData2(){ return this.data2;}


public boolean equals(Object otherobject){

if(otherobject == null)
return false;

else if( getClass() != otherobject.getClass())

return false;

else{

sample2<T1,T2> Sample2 = (sample2<T1,T2>)otherobject;

return( this.data1.equals(Sample2.data1) && this.data2.equals(Sample2.data2));

}
}

public static <T1,T2> void combine(sample2<T1,T2> one,sample2<T1,T2> two ){

System.out.println(one.data1 + " and  "+ two.data1 +" " + one.data2 + two.data2);


}

}

