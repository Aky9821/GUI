package src;


import java.util.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aky_9821
 */
import java.util.*;

public class Ques1 extends javax.swing.JFrame {

    /**
     * Creates new form Ques2
     */
    public Ques1(int m1, int a1, int u1) {
        super("SJC Talent Search Examinations!!!");

        m = m1;
        a = a1;
        u = u1;
        jrb5 = new javax.swing.JRadioButton();

        initComponents();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ob = new Timer();

        ob.schedule(new Task(), 0, 1000);
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        bg.add(jrb4);
        bg.add(jrb5);
        setVisible(true);
        /*if(!(jrb1.isSelected()||jrb2.isSelected()||jrb3.isSelected()||jrb4.isSelected()))
            jButton2.setEnabled(false);
        else
            jButton2.setEnabled(true);*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jrb1 = new javax.swing.JRadioButton();
        jrb2 = new javax.swing.JRadioButton();
        jrb3 = new javax.swing.JRadioButton();
        jrb4 = new javax.swing.JRadioButton();
        jb1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setLocation(new java.awt.Point(200, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("  Ques  1 :-");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 204), 1, true));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" \n What is the range of short data type in java?");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jrb1.setText("-214045 to 214044");

        jrb2.setText("-32768 to 32767");

        jrb3.setText("-128 to 127");

        jrb4.setText("None Of Above");

        jb1.setBackground(new java.awt.Color(255, 255, 255));
        jb1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb1.setText("Skip Ques!!");
        jb1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Submit To Next Ques->");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb1)
                    .addComponent(jrb3)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb2)
                            .addComponent(jrb4))
                        .addGap(106, 106, 106))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb3)
                    .addComponent(jrb2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb1)
                    .addComponent(jrb4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16));
        jTextField1.setText(" Atempted Questions = "+a);
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setEnabled(false);

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16));
        jTextField2.setText(" Skipped Questions   = "+u);
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setEnabled(false);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setValue(0);

        jTextField3.setFont(new java.awt.Font("Arial", 0, 16));
        jTextField3.setText(" Questions Remaining = "+(10-(u+a)));
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField3.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 3, true));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField4.setText(" Time Remaing  ;-");
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 255, 0));
        jTextField5.setText(" "+t+" Seconds Left .");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:Q
        // setVisible(false);
        u++;
        jLabel1.setText("  Ques " + (u + a + 1) + " :-");
        jProgressBar1.setValue((u + a + 1) * 10);
        jTextField2.setText(" Skipped Questions   = " + u);
        jTextField3.setText(" Questions Remaining = " + (10 - (u + a)));
        jrb5.setSelected(true);

        if (u + a == 1) {
            ob.cancel();
            ob = new Timer();

            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText(" An expression involving byte, int, and literal  numbers \n is promoted  to which of these?");
            jrb1.setText(" float");
            jrb2.setText(" long");
            jrb3.setText(" byte");
            jrb4.setText(" int");
        } else if (u + a == 2) {
            ob.cancel();

            ob = new Timer();

            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText("Which of the following is/are true about packages in Java? \n"
                    + "1) Every class is part of some package. \n"
                    + "2) All classes in a file are part of the same package. \n"
                    + "3) If no package is specified, the classes in the file \n"
                    + "   go into a special unnamed package ");
            jrb1.setText("All are correct");
            jrb2.setText("Only 1,2");
            jrb3.setText("Only 2,3");
            jrb4.setText("Only 1,3");
        } else if (u + a == 3) {
            ob.cancel();

            ob = new Timer();

            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText("Predict the output of following Java program? \n"
                    + "class Test {\n"
                    + "  int i;\n"
                    + "} \n"
                    + "class Main {\n"
                    + "   public static void main(String args[]) { \n"
                    + "     Test t; \n"
                    + "     System.out.println(t.i); \n"
                    + "}  ");
            jrb1.setText("0");
            jrb2.setText("Compiler Error");
            jrb3.setText("Garbage Value");
            jrb4.setText("Runtime Error");
        } else if (u + a == 4) {
            ob.cancel();

            ob = new Timer();

            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText("class Test {\n"
                    + "  int i;\n"
                    + "} \n"
                    + "class Main {\n"
                    + "  public static void main(String args[]) { \n"
                    + "      Test t = new Test(); \n"
                    + "      System.out.println(t.i);\n"
                    + "   } \n"
                    + "}");
            jrb1.setText("Garbage Value");
            jrb2.setText("0");
            jrb3.setText("Compiler  Error");
            jrb4.setText("Runtime Error ");
        } else if (u + a == 5) {
            ob.cancel();

            ob = new Timer();

            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText(
                    "Which of the following is FALSE about arrays on Java\n"
                    + "1 - Java array is always an object\n"
                    + "2 - Length of array can be changed after creation of array\n"
                    + "3 - Arrays in Java are always allocated on heap\n4 - None of Above ");

            jrb1.setText("4");
            jrb2.setText("3");
            jrb3.setText("2");
            jrb4.setText("1");
        } else if (u + a == 6) {
            ob.cancel();

            ob = new Timer();

            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText("Predict the output of following Java program?\nclass Test {\n"
                    + "   public static void main(String args[]) {\n"
                    + "     int arr[2];  \n"
                    + "     System.out.println(arr[0]);\n"
                    + "     System.out.println(arr[1]);\n"
                    + "   }\n"
                    + "}");
            jrb1.setText("Compiler Error");
            jrb2.setText("0\n0");
            jrb3.setText("garbage Value");
            jrb4.setText("Exception");
        } else if (u + a
                == 7) {
            ob.cancel();

            ob = new Timer();
            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText("Output of following Java program? \n"
                    + "class Main {"
                    + "    public static void main(String args[]) {   \n"
                    + "             System.out.println(fun());\n"
                    + "    } \n"
                    + "  \n"
                    + "    int fun()\n"
                    + "    {\n"
                    + "      return 20;\n"
                    + "    }\n"
                    + "}");
            jrb1.setText("20");
            jrb2.setText("0");
            jrb3.setText("Compiler Error");
            jrb4.setText("Garbage Value");
        } else if (u + a
                == 8) {
            ob.cancel();

            ob = new Timer();
            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText("What is the use of final keyword in Java?\n"
                    + "1 - "
                    + "When a class is made final, a sublcass of it can not \nbe created.\n"
                    + "2 - "
                    + "When a method is final, it can not be overridden.\n"
                    + "3 - "
                    + "When a variable is final, it can be assigned value \nonly once.\n"
                    + "4 - "
                    + "All of the above");
            jrb1.setText("1");
            jrb2.setText("2");
            jrb3.setText("3");
            jrb4.setText("4");
        } else if (u + a
                == 9) {
            ob.cancel();

            ob = new Timer();
            ob.schedule(new Task(), 0, 1000);

            jTextArea1.setText("class Test\n"
                    + "{\n"
                    + "    public static void main(String args[])\n"
                    + "    {\n"
                    + "        String s1 = \"geeksquiz\";\n"
                    + "        String s2 = \"geeksquiz\";\n"
                    + "        System.out.println(\"s1 == s2 is:\" + s1 == s2);\n"
                    + "    }\n"
                    + "}");
            jrb1.setText("Compiler Error");
            jrb2.setText("true");
            jrb3.setText("false");
            jrb4.setText("Throws an Exception");
            jButton2.setText("Submit");
        } else {
            ob.cancel();
            ResultLoading ob = new ResultLoading(m, a, u);
            dispose();
        }


    }//GEN-LAST:event_jb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jrb1.isSelected() || jrb2.isSelected() || jrb3.isSelected() || jrb4.isSelected()) {
            if (u + a == 0 || u + a == 3 || u + a == 4) {
                if (jrb2.isSelected()) {
                    m += 4;
                    a += 1;

                } else if (jrb1.isSelected() || jrb3.isSelected() || jrb4.isSelected()) {
                    m -= 1;
                    a += 1;
                } else {
                    u++;
                }
            } else if (u + a == 7 || u + a == 9 || u + a == 5) {
                if (jrb3.isSelected()) {
                    m += 4;
                    a += 1;

                } else if (jrb1.isSelected() || jrb2.isSelected() || jrb4.isSelected()) {
                    m -= 1;
                    a += 1;
                } else {
                    u++;
                }
            } else if (u + a == 1 || u + a == 8) {
                if (jrb4.isSelected()) {
                    m += 4;
                    a += 1;

                } else if (jrb1.isSelected() || jrb3.isSelected() || jrb2.isSelected()) {
                    m -= 1;
                    a += 1;
                } else {
                    u++;
                }
            } else if (u + a == 6 || u + a == 2) {
                if (jrb1.isSelected()) {
                    m += 4;
                    a += 1;

                } else if (jrb2.isSelected() || jrb3.isSelected() || jrb4.isSelected()) {
                    m -= 1;
                    a += 1;
                } else {
                    u++;
                }
            }

            jLabel1.setText("  Ques " + (u + a + 1) + " :-");
            jProgressBar1.setValue((u + a + 1) * 10);
            jTextField1.setText(" Attempted Questions   = " + a);

            jTextField2.setText(" Skipped Questions   = " + u);
            jTextField3.setText(" Questions Remaining = " + (10 - (u + a)));
            jrb5.setSelected(true);

            if (u + a == 1) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText(" An expression involving byte, int, and literal \n numbers is promoted to which of these?");
                jrb1.setText(" float");
                jrb2.setText(" long");
                jrb3.setText(" byte");
                jrb4.setText(" int");
            } else if (u + a == 2) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText("Which of the following is/are true about packages in Java? \n"
                        + "1) Every class is part of some package. \n"
                        + "2) All classes in a file are part of the same package. \n"
                        + "3) If no package is specified, the classes in the file \n"
                        + "   go into a special unnamed package ");
                jrb1.setText("All are correct");
                jrb2.setText("Only 1,2");
                jrb3.setText("Only 2,3");
                jrb4.setText("Only 1,3");
            } else if (u + a == 3) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText("Predict the output of following Java program? \n"
                        + "class Test {\n"
                        + "  int i;\n"
                        + "} \n"
                        + "class Main {\n"
                        + "   public static void main(String args[]) { \n"
                        + "     Test t; \n"
                        + "     System.out.println(t.i); \n"
                        + "}  ");
                jrb1.setText("0");
                jrb2.setText("Compiler Error");
                jrb3.setText("Garbage Value");
                jrb4.setText("Runtime Error");
            } else if (u + a == 4) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText("class Test {\n"
                        + "  int i;\n"
                        + "} \n"
                        + "class Main {\n"
                        + "  public static void main(String args[]) { \n"
                        + "      Test t = new Test(); \n"
                        + "      System.out.println(t.i);\n"
                        + "   } \n"
                        + "}");
                jrb1.setText("Garbage Value");
                jrb2.setText("0");
                jrb3.setText("Compiler  Error");
                jrb4.setText("Runtime Error ");
            } else if (u + a == 5) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText(
                        "Which of the following is FALSE about arrays on Java\n"
                        + "1 - Java array is always an object\n"
                        + "2 - Length of array can be changed after creation of array\n"
                        + "3 - Arrays in Java are always allocated on heap\n4 - None of Above ");

                jrb1.setText("4");
                jrb2.setText("3");
                jrb3.setText("2");
                jrb4.setText("1");
            } else if (u + a == 6) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText("Predict the output of following Java program?  \nclass Test {\n"
                        + "   public static void main(String args[]) {\n"
                        + "     int arr[2];  \n"
                        + "     System.out.println(arr[0]);\n"
                        + "     System.out.println(arr[1]);\n"
                        + "   }\n"
                        + "}");
                jrb1.setText("Compiler Error");
                jrb2.setText("0\n0");
                jrb3.setText("garbage Value");
                jrb4.setText("Exception");
            } else if (u + a == 7) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText("Output of following Java program? \n"
                        + "class Main {"
                        + "    public static void main(String args[]) {   \n"
                        + "             System.out.println(fun());\n"
                        + "    } \n"
                        + "  \n"
                        + "    int fun()\n"
                        + "    {\n"
                        + "      return 20;\n"
                        + "    }\n"
                        + "}");
                jrb1.setText("20");
                jrb2.setText("0");
                jrb3.setText("Compiler Error");
                jrb4.setText("Garbage Value");
            } else if (u + a == 8) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText("What is the use of final keyword in Java?\n"
                        + "1 - "
                        + "When a class is made final, a sublcass of it can not \nbe created.\n"
                        + "2 - "
                        + "When a method is final, it can not be overridden.\n"
                        + "3 - "
                        + "When a variable is final, it can be assigned value \nonly once.\n"
                        + "4 - "
                        + "All of the above");
                jrb1.setText("1");
                jrb2.setText("2");
                jrb3.setText("3");
                jrb4.setText("4");
            } else if (u + a == 9) {
                ob.cancel();

                ob = new Timer();

                ob.schedule(new Task(), 0, 1000);

                jTextArea1.setText("class Test\n"
                        + "{\n"
                        + "    public static void main(String args[])\n"
                        + "    {\n"
                        + "        String s1 = \"geeksquiz\";\n"
                        + "        String s2 = \"geeksquiz\";\n"
                        + "        System.out.println(\"s1 == s2 is:\" + s1 == s2);\n"
                        + "    }\n"
                        + "}");
                jrb1.setText("Compiler Error");
                jrb2.setText("true");
                jrb3.setText("false");
                jrb4.setText("Throws an Exception");
                jButton2.setText("Submit");

            } else {
                ob.cancel();
                ResultLoading ob = new ResultLoading(m, a, u);
                dispose();
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ques1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ques1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ques1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ques1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Ques1().setVisible(true);
            }
        });

    }
    static int u, a, m, t;

    static class Task extends TimerTask {

        int t = 25;

        public void run() {
            // System.out.println("\f Time Left " + a + "seconds");
            jTextField5.setText("   " + t + "  Seconds .");
            t--;
            if (t > 10) {
                jTextField5.setForeground(new java.awt.Color(51, 255, 0));
            }

            if (t < 10) {
                jTextField5.setForeground(new java.awt.Color(255, 0, 0));
            }
            if (t < 0) {
                jTextField5.setForeground(new java.awt.Color(51, 255, 0));

                t = 25;
                ob.cancel();
                if ((u + a) != 9) {
                    jb1.doClick();
                }

            }
        }
    }

    private javax.swing.JRadioButton jrb5;
    static Timer ob;
    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField5;
    private static javax.swing.JButton jb1;
    private javax.swing.JRadioButton jrb1;
    private javax.swing.JRadioButton jrb2;
    private javax.swing.JRadioButton jrb3;
    private javax.swing.JRadioButton jrb4;

}
