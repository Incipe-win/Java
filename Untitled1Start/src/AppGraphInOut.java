/**
 * Created by incipe on 2020/2/9.
 * Email:chao7461@gmail.com
 * The story has just begun !
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author incipe
 */
public class AppGraphInOut {
  public static void main(String args[]) {
    new AppFrame();
  }
}

class AppFrame extends JFrame {
  JTextField in = new JTextField(10);
  JButton btn = new JButton("求平方");
  JLabel out = new JLabel("用于显示结果的标签");

  public AppFrame() {
    setLayout(new FlowLayout());
    getContentPane().add(in);
    getContentPane().add(btn);
    getContentPane().add(out);
    btn.addActionListener(new BtnActionAdapter());
    setSize(400, 100);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
  }

  class BtnActionAdapter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      String s = in.getText();
      double d = Double.parseDouble(s);
      double sq = d * d;
      out.setText(d + "的平方是：" + sq);
    }
  }
}

/**
 * btn.addactionlistener(e->{
 * string s = in.gettext();
 * double d = double.parsedouble(s);
 * double sq = math.sqrt(d);
 * out.settext(d + "的平方是：" + sq);
 * });
 */
