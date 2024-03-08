public class English2French extends Translator {
   
   public English2French(String src, String tgt) {
      super(src, tgt);
   }
   
   public void translate(String input) {
      if (input.equals("Hello")) {
         System.out.println(getTgt() + ": " + "Bonjour");
      } else {
         System.out.println("Cannot translate this input yet.");
      }      
   }  
   
}