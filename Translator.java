public abstract class Translator {

   private String src;
   private String tgt;
   
   public Translator(String src, String tgt) {
      this.src = src;
      this.tgt = tgt;
   }
   
   public String getSrc() {
      return src;
   }
   
   public String getTgt() {
      return tgt;
   }
   
   public void printDetails() {
      System.out.println("This model translates from " + src + " to " + tgt);
   }
   
   public abstract void translate(String input);
   
}