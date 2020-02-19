/**
 * Created by incipe on 2020/2/11.
 * Email:chao7461@gmail.com
 * The story has just begun !
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

/**
 * @author incipe
 */
public class AutoScoreCopy extends JFrame {
  /**
   * 规则描述标签
   */
  Label labRule = new Label();
  /**
   * 第一个数字标签
   */
  Label labA = new Label();
  /**
   * 加减乘除标签
   */
  Label labOp = new Label();
  /**
   * 第二个数字标签
   */
  Label labB = new Label();
  /**
   * 等于号“＝”标签
   */
  Label label5 = new Label();
  /**
   * 输入合法性校验提示标签
   */
  Label labWarn = new Label();
  /**
   * 答题列表标签
   */
  Label labQues = new Label();
  /**
   * 判分标签
   */
  Label labResult = new Label();
  /**
   * 输入答案输入框
   */
  TextField txtAnswer = new TextField();

  /**
   * 记录答题总数
   */
  int total = 0;
  /**
   * 记录答题正确数量
   */
  int right = 0;
  /**
   * 记录答题错误数量
   */
  int error = 0;
  /**
   * 记录答题总分
   */
  int score = 0;
  /**
   * 一轮结束后标识
   */
  boolean isOver = false;
  /**
   * 程序第一次运行标识
   */
  boolean isFirst = true;

  /**
   * 每一轮运行开始时间
   */
  long startTime;

  /**
   * 答题列表展示框
   */
  List listDisp = new List();
  /**
   * 分数展示框
   */
  List listScore = new List();

  public static void main(String[] args) {
    AutoScoreCopy score = new AutoScoreCopy();
  }

  public AutoScoreCopy() {
    init();
    setSize(450, 630);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void init() {
    setLayout(null);
    setSize(450, 630);

    labRule.setText("Please press \"Enter\" to start ");
    labRule.setBounds(36, 10, 390, 72);
    labRule.setFont(new Font("Dialog", Font.PLAIN, 12));
    getContentPane().add(labRule);

    labA.setText("x");
    labA.setBounds(36, 82, 36, 36);
    labA.setFont(new Font("Dialog", Font.PLAIN, 24));
    getContentPane().add(labA);

    labOp.setText("+");
    labOp.setFont(new Font("Dialog", Font.PLAIN, 24));
    labOp.setBounds(72, 82, 45, 36);
    getContentPane().add(labOp);

    labB.setText("y");
    labB.setFont(new Font("Dialog", Font.PLAIN, 24));
    labB.setBounds(118, 82, 33, 36);
    getContentPane().add(labB);

    label5.setText("=");
    label5.setFont(new Font("Dialog", Font.PLAIN, 24));
    label5.setBounds(168, 82, 24, 36);
    getContentPane().add(label5);


    labWarn.setFont(new Font("Dialog", Font.PLAIN, 12));
    labWarn.setBackground(Color.RED);
    labWarn.setBounds(320, 82, 80, 36);
    labWarn.setVisible(false);
    getContentPane().add(labWarn);

    labQues.setText("Question List:");
    labQues.setFont(new Font("Dialog", Font.PLAIN, 12));
    labQues.setBounds(36, 148, 100, 20);
    getContentPane().add(labQues);

    labResult.setText("Total Score:");
    labResult.setFont(new Font("Dialog", Font.PLAIN, 12));
    labResult.setBounds(36, 420, 100, 20);
    labResult.setVisible(false);
    getContentPane().add(labResult);

    txtAnswer.setFont(new Font("Dialog", Font.PLAIN, 24));
    txtAnswer.setBounds(216, 82, 100, 36);
    getContentPane().add(txtAnswer);


    listDisp.setFont(new Font("Dialog", Font.PLAIN, 16));
    listDisp.setBounds(36, 174, 282, 230);
    getContentPane().add(listDisp);

    listScore.setFont(new Font("Dialog", Font.PLAIN, 16));
    listScore.setBounds(36, 450, 282, 135);

    /**  答案输入框，键盘按键监听类*/
    MyKey myKey = new MyKey();
    txtAnswer.addKeyListener(myKey);

  }

  class MyKey implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
      if (e.getSource() == txtAnswer) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
          if (isOver || isFirst) {
            updateQuestion(null);
          } else if ("".equals(txtAnswer.getText())) {
            labWarn.setText("Please input answer!");
            labWarn.setVisible(true);
          } else {
            labWarn.setVisible(false);
            if (!isNumber(txtAnswer.getText())) {
              labWarn.setText("Please input number!");
              labWarn.setVisible(true);
            } else if (total < 9) {
              judge(null);
              updateQuestion(null);
            } else {
              judge(null);
              labResult.setVisible(true);
              scorePerformed(null);
            }
          }
        }
      }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

  }


  int a = 0, b = 0;
  String op = "";
  double result = 0;
  DecimalFormat df = new DecimalFormat("#.00");

  /**
   * 出题方法
   *
   * @param e
   */
  public void updateQuestion(ActionEvent e) {
    if (isFirst) {
      startTime = System.currentTimeMillis();
    }
    if (isOver == true) {
      listDisp.clear();
      listScore.clear();
      labResult.setVisible(false);
      listScore.setVisible(false);
    }
    isOver = false;
    a = (int) (Math.random() * 9 + 1);
    b = (int) (Math.random() * 9 + 1);
    int c = (int) (Math.random() * 4);
    switch (c) {
      case 0:
        op = "+";
        result = a + b;
        break;
      case 1:
        op = "-";
        result = a - b;
        break;
      case 2:
        op = "*";
        result = a * b;
        break;
      case 3:
        op = "/";
        result = (a * 1.0) / b;
        //若两个数除不尽，则按四舍五入保留2位小数
        if (String.valueOf(result).length() > 10) {
          result = Double.parseDouble(df.format((a * 1.0) / b));
        }
        break;
      default:
        break;
    }
    labA.setText(String.valueOf(a));
    labB.setText(String.valueOf(b));
    labOp.setText(op);
    label5.setText("=");
    txtAnswer.setText("");
    isFirst = false;

  }

  /**
   * 判断结果
   *
   * @param e
   */
  public void judge(ActionEvent e) {
    try {
      double value = Double.parseDouble(txtAnswer.getText());
      String resultStr = (total + 1) + ") " + a + op + b + "=" + value;
      if (value == result) {
        resultStr += " \tTrue";
        right++;
        score += 10;
      } else {
        resultStr += " \tFalse,the correct is:" + result;
        error++;
      }
      listDisp.add(resultStr);
      total++;
    } catch (NumberFormatException ignored) {
    }
  }

  /**
   * 统计分数
   *
   * @param e
   */
  public void scorePerformed(ActionEvent e) {
    isOver = true;
    listScore.clear();
    listScore.setVisible(true);
    String exitStr = "Total questions:" + total;
    listScore.add(exitStr);
    listScore.add("Total time:" + (System.currentTimeMillis() - startTime) / 1000 + "s");
    listScore.add("True:" + right);
    listScore.add("False:" + error);
    listScore.add("Score:" + score);
    getContentPane().add(listScore);
    score = 0;
    right = 0;
    error = 0;
    total = 0;

  }

  /**
   * 校验输入是否位数字
   *
   * @param numberStr
   * @return
   */
  public boolean isNumber(String numberStr) {
    boolean isNumber = true;
    try {
      Double.parseDouble(numberStr);
    } catch (NumberFormatException e) {
      isNumber = false;
    }
    return isNumber;
  }
}
