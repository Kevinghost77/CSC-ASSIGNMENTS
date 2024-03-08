public class Demo {

   public static void main(String args[]) {
      
      English2Zulu t = new English2Zulu("English", "isiZulu");
      t.printDetails();
      t.translate("How are you?");
      
      English2French t2 = new English2French("English", "French");
      t2.printDetails();
      t2.translate("Hello");
      
   }
}