import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;

public class FirstWindow extends JFrame
{
   public static final int WIDTH = 400;
   public static final int HEIGHT = 200;

   public FirstWindow()
   {
      super();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(WIDTH, HEIGHT);
      
      JButton button1 = new JButton("Click me!");
      button1.setBackground(Color.GREEN);
      
      button1.addActionListener(new EndingListener());
      add(button1);
   }
}
