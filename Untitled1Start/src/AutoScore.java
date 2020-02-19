/**
 * Created by incipe on 2020/2/9.
 * Email:chao7461@gmail.com
 * The story has just begun !
 */

import javax.swing.*;
import java.awt.*;

/**
 * @author incipe
 */
public class AutoScore extends JFrame {
  public AutoScore() {
    init();
    setSize(400, 350);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void init() {
    setLayout(null);
    setSize(400, 350);
    btnNew.setLabel("Set a question");
    getContentPane().add(btnNew);
    btnNew.setBackground(java.awt.Color.lightGray);
    btnNew.setBounds(36, 96, 98, 26);
    btnJudge.setLabel("Judge");
    getContentPane().add(btnJudge);
    btnJudge.setBackground(java.awt.Color.lightGray);
    btnJudge.setBounds(216, 96, 94, 25);
    lblA.setText("*");
    getContentPane().add(lblA);
    lblA.setFont(new Font("Dialog", Font.PLAIN, 24));
    lblA.setBounds(36, 24, 36, 36);
    lblOp.setText("*");
    getContentPane().add(lblOp);
    lblOp.setFont(new Font("Dialog", Font.PLAIN, 24));
    lblOp.setBounds(72, 24, 36, 36);
    lblB.setText("*");
    getContentPane().add(lblB);
    lblB.setFont(new Font("Dialog", Font.PLAIN, 24));
    lblB.setBounds(108, 24, 33, 36);
    label5.setText("=");
    getContentPane().add(label5);
    label5.setFont(new Font("Dialog", Font.PLAIN, 24));
    label5.setBounds(168, 24, 33, 36);
    getContentPane().add(txtAnswer);
    txtAnswer.setFont(new Font("Dialog", Font.PLAIN, 24));
    txtAnswer.setBounds(216, 24, 85, 42);
    listDisp.setFont(new Font("Dialog", Font.PLAIN, 16));
    getContentPane().add(listDisp);
    listDisp.setBounds(36, 144, 272, 106);

    SymAction lSymAction = new SymAction();
    btnNew.addActionListener(lSymAction);
    btnJudge.addActionListener(lSymAction);
  }

  java.awt.Button btnNew = new java.awt.Button();
  java.awt.Button btnJudge = new java.awt.Button();
  java.awt.Label lblA = new java.awt.Label();
  java.awt.Label lblOp = new java.awt.Label();
  java.awt.Label lblB = new java.awt.Label();
  java.awt.Label label5 = new java.awt.Label();
  java.awt.TextField txtAnswer = new java.awt.TextField();
  java.awt.List listDisp = new java.awt.List(0);

  class SymAction implements java.awt.event.ActionListener {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent event) {
      Object object = event.getSource();
      if (object == btnNew) {
        btnNewActionPerformed(event);
      } else if (object == btnJudge) {
        btnJudgeActionPerformed(event);
      }
    }
  }

  void btnNewActionPerformed(java.awt.event.ActionEvent event) {
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
        result = a / b;
        break;
      default:
        break;
    }
    lblA.setText("" + a);
    lblB.setText("" + b);
    lblOp.setText("" + op);
    txtAnswer.setText("");
  }

  int a = 0, b = 0;
  String op = "";
  double result = 0;

  void btnJudgeActionPerformed(java.awt.event.ActionEvent event) {
    String str = txtAnswer.getText();
    double d = Double.valueOf(str).doubleValue();
    String disp = "" + a + op + b + "=" + str + " ";
    if (d == result) {
      disp += "True";
    } else {
      disp += " False";
    }

    listDisp.add(disp);
  }

  public static void main(String[] args) {
    AutoScore score = new AutoScore();
  }
}
