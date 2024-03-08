public class English2Zulu extends Translator {
   
   public English2Zulu(String src, String tgt) {
      super(src, tgt);
   }
   
   public void translate(String input) {
      System.out.println(getSrc() + ": " + input);
      if (input.equals("Hello")) {
         System.out.println(getTgt() + ": " + "Sawubona");
      } else if (input.equals("How are you?")) {
         System.out.println(getTgt() + ": " + "Unjani?");
      } else {
         System.out.println("Cannot translate this input yet.");
      }      
   }  
   
}