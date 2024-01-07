import javax.swing.*;

import java.awt.Color;
import java.awt.event.*; 

public class Frame extends JFrame implements ActionListener{
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bclose, bAcak;
    private JPanel jPanel1, jPanel2, panel1;
    private JLabel title;
    private JOptionPane pane1 = new JOptionPane();

    public Frame() {
        setFrame();

        bclose.addActionListener(this);
        bAcak.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }

    public void setFrame() {
        panel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bclose = new javax.swing.JButton();
        bAcak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 0, 136));
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 500));

        panel1.setBackground(new java.awt.Color(0, 5, 89));
        panel1.setForeground(new java.awt.Color(7, 112, 118));

        title.setFont(new java.awt.Font("Work Sans Black", 0, 30)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("PUZZLE A6");

        b1.setBackground(new java.awt.Color(136, 128, 255));
        b1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("8");
        b1.setAlignmentX(0.5F);
        b1.setBorder(null);

        b2.setBackground(new java.awt.Color(136, 128, 255));
        b2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("3");
        b2.setAlignmentX(0.5F);
        b2.setBorder(null);

        b3.setBackground(new java.awt.Color(136, 128, 255));
        b3.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("5");
        b3.setAlignmentX(0.5F);
        b3.setBorder(null);

        b6.setBackground(new java.awt.Color(136, 128, 255));
        b6.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("2");
        b6.setAlignmentX(0.5F);
        b6.setBorder(null);

        b5.setBackground(new java.awt.Color(136, 128, 255));
        b5.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("7");
        b5.setAlignmentX(0.5F);
        b5.setBorder(null);

        b4.setBackground(new java.awt.Color(136, 128, 255));
        b4.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.setAlignmentX(0.5F);
        b4.setBorder(null);

        b7.setBackground(new java.awt.Color(136, 128, 255));
        b7.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("1");
        b7.setAlignmentX(0.5F);
        b7.setBorder(null);

        b8.setBackground(new java.awt.Color(136, 128, 255));
        b8.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("6");
        b8.setAlignmentX(0.5F);
        b8.setBorder(null);

        b9.setBackground(new java.awt.Color(180, 175, 255));
        b9.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText(" ");
        b9.setAlignmentX(0.5F);
        b9.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        bclose.setBackground(new java.awt.Color(255, 0, 51));
        bclose.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        bclose.setForeground(new java.awt.Color(255, 255, 255));
        bclose.setText("X");
        bclose.setAlignmentX(0.5F);
        bclose.setBorder(null);

        bAcak.setBackground(new java.awt.Color(220, 64, 255));
        bAcak.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        bAcak.setForeground(new java.awt.Color(255, 255, 255));
        bAcak.setText("R");
        bAcak.setAlignmentX(0.5F);
        bAcak.setBorder(null);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAcak, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bclose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAcak, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(bclose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(479, 339));
        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bclose) {
            System.out.println("Anda Keluar Dari Game");
            System.exit(0);
        }
        if(e.getSource()==bAcak){  
            String s=b4.getLabel();  
            b4.setLabel(b9.getLabel());  
            b9.setLabel(s);
            
            Color c = b4.getBackground();
            b4.setBackground(b9.getBackground());
            b9.setBackground(c);  

            s = b1.getLabel();  
            b1.setLabel(b5.getLabel()); 
            b5.setLabel(s);

            c = b1.getBackground();
            b1.setBackground(b5.getBackground());
            b5.setBackground(c); 

            s = b2.getLabel();  
            b2.setLabel(b7.getLabel());  
            b7.setLabel(s);

            c = b2.getBackground();
            b2.setBackground(b7.getBackground());
            b7.setBackground(c); 
            
            s = b8.getLabel();
            b8.setLabel(b3.getLabel());
            b3.setLabel(s);

            c = b8.getBackground();
            b8.setBackground(b3.getBackground());
            b3.setBackground(c); 

        }

        if(e.getSource() == b1){  
            //System.out.println("B1 Di Pencet");
            String s = b1.getLabel(); 
            Color c = b1.getBackground();

            if(b4.getLabel().equals(" ")){ 
                b4.setLabel(s); 
                b1.setBackground(b4.getBackground());
                b1.setLabel(" ");
                b4.setBackground(c); 
            } else if (b2.getLabel().equals(" ")){ 
                b2.setLabel(s);
                b1.setBackground(b2.getBackground());
                b1.setLabel(" ");
                b2.setBackground(c); 
            }  
        }

        if(e.getSource() == b2){  
            //System.out.println("b2 Di Pencet");
            String s = b2.getLabel(); 
            Color c = b2.getBackground();

            if(b1.getLabel().equals(" ")){ 
                b1.setLabel(s); 
                b2.setBackground(b1.getBackground());
                b2.setLabel(" ");
                b1.setBackground(c); 
            } else if (b3.getLabel().equals(" ")){ 
                b3.setLabel(s);
                b2.setBackground(b3.getBackground());
                b2.setLabel(" ");
                b3.setBackground(c); 
            } else if (b5.getLabel().equals(" ")){ 
                b5.setLabel(s);
                b2.setBackground(b5.getBackground());
                b2.setLabel(" ");
                b5.setBackground(c); 
            }  
        }

        if(e.getSource() == b3){  
            //System.out.println("b3 Di Pencet");
            String s = b3.getLabel(); 
            Color c = b3.getBackground();

            if(b2.getLabel().equals(" ")){ 
                b2.setLabel(s); 
                b3.setBackground(b2.getBackground());
                b3.setLabel(" ");
                b2.setBackground(c); 
            } else if (b6.getLabel().equals(" ")){ 
                b6.setLabel(s);
                b3.setBackground(b6.getBackground());
                b3.setLabel(" ");
                b6.setBackground(c); 
            } 
        }

        if(e.getSource() == b4){  
            //System.out.println("b4 Di Pencet");
            String s = b4.getLabel(); 
            Color c = b4.getBackground();

            if(b1.getLabel().equals(" ")){ 
                b1.setLabel(s); 
                b4.setBackground(b1.getBackground());
                b4.setLabel(" ");
                b1.setBackground(c); 
            } else if (b5.getLabel().equals(" ")){ 
                b5.setLabel(s);
                b4.setBackground(b5.getBackground());
                b4.setLabel(" ");
                b5.setBackground(c); 
            } else if (b7.getLabel().equals(" ")){ 
                b7.setLabel(s);
                b4.setBackground(b7.getBackground());
                b4.setLabel(" ");
                b7.setBackground(c); 
            } 
        }
        
        if(e.getSource() == b5){  
            //System.out.println("b5 Di Pencet");
            String s = b5.getLabel(); 
            Color c = b5.getBackground();

            if(b2.getLabel().equals(" ")){ 
                b2.setLabel(s); 
                b5.setBackground(b2.getBackground());
                b5.setLabel(" ");
                b2.setBackground(c); 
            } else if (b4.getLabel().equals(" ")){ 
                b4.setLabel(s);
                b5.setBackground(b4.getBackground());
                b5.setLabel(" ");
                b4.setBackground(c); 
            } else if (b6.getLabel().equals(" ")){ 
                b6.setLabel(s);
                b5.setBackground(b6.getBackground());
                b5.setLabel(" ");
                b6.setBackground(c); 
            } else if (b8.getLabel().equals(" ")){ 
                b8.setLabel(s);
                b5.setBackground(b8.getBackground());
                b5.setLabel(" ");
                b8.setBackground(c); 
            } 
        }

        if(e.getSource() == b6){  
            //System.out.println("b6 Di Pencet");
            String s = b6.getLabel(); 
            Color c = b6.getBackground();

            if(b3.getLabel().equals(" ")){ 
                b3.setLabel(s); 
                b6.setBackground(b3.getBackground());
                b6.setLabel(" ");
                b3.setBackground(c); 
            } else if (b5.getLabel().equals(" ")){ 
                b5.setLabel(s);
                b6.setBackground(b5.getBackground());
                b6.setLabel(" ");
                b5.setBackground(c); 
            } else if (b9.getLabel().equals(" ")){ 
                b9.setLabel(s);
                b6.setBackground(b9.getBackground());
                b6.setLabel(" ");
                b9.setBackground(c); 
            } 
        }

        if(e.getSource() == b7){  
            //System.out.println("b7 Di Pencet");
            String s = b7.getLabel(); 
            Color c = b7.getBackground();

            if(b4.getLabel().equals(" ")){ 
                b4.setLabel(s); 
                b7.setBackground(b4.getBackground());
                b7.setLabel(" ");
                b4.setBackground(c); 
            } else if (b8.getLabel().equals(" ")){ 
                b8.setLabel(s);
                b7.setBackground(b8.getBackground());
                b7.setLabel(" ");
                b8.setBackground(c); 
            }
        }

        if(e.getSource() == b8){  
            //System.out.println("b8 Di Pencet");
            String s = b8.getLabel(); 
            Color c = b8.getBackground();

            if(b5.getLabel().equals(" ")){ 
                b5.setLabel(s); 
                b8.setBackground(b5.getBackground());
                b8.setLabel(" ");
                b5.setBackground(c); 
            } else if (b7.getLabel().equals(" ")){ 
                b7.setLabel(s);
                b8.setBackground(b7.getBackground());
                b8.setLabel(" ");
                b7.setBackground(c); 
            } else if (b9.getLabel().equals(" ")){ 
                b9.setLabel(s);
                b8.setBackground(b9.getBackground());
                b8.setLabel(" ");
                b9.setBackground(c); 
            }
        }

        if(e.getSource() == b9){  
            //System.out.println("b9 Di Pencet");
            String s = b9.getLabel(); 
            Color c = b9.getBackground();

            if(b6.getLabel().equals(" ")){ 
                b6.setLabel(s); 
                b9.setBackground(b6.getBackground());
                b9.setLabel(" ");
                b6.setBackground(c); 
            } else if (b8.getLabel().equals(" ")){ 
                b8.setLabel(s);
                b9.setBackground(b8.getBackground());
                b9.setLabel(" ");
                b8.setBackground(c); 
            }
        }

        if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals(" ")){ 
            pane1.showMessageDialog(Frame.this,"Selamat!! Kamu Berhasil 😁😊"); 
            pane1.setBackground(new java.awt.Color(161, 0, 224));
            pane1.setForeground(new java.awt.Color(255, 255, 255));
        }  
    }
}
