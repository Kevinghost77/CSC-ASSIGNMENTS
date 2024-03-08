public abstract class Translation {

private String Source;
private String Target;

public Translation(String source, String target){

this.Source = source;
this.Target = target;

}


public void setSource( String Sourcer){

this.Source = Sourcer;

}

public void setTarget( String targeter){

this.Target = targeter;

}

public String getSource(){

 return this.Source;

}


public String getTarget(){

 return this.Target;

}


public void LanguagetoLanguage(){

System.out.println("The Translator Translates From " + getSource() + " To " + getTarget());

}

public abstract void wordtranslation( String input);

}