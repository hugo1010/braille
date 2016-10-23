package braille;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class miBraille extends javax.swing.JFrame {

    ArrayList<String> Textos = new ArrayList<>();

    int contador = 0;

    public miBraille() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Toque aqui para Escribri");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel10.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel11.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel14.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel15.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel16.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel17.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel18.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel19.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel20.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel21.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel22.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel23.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel24.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel25.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel26.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel27.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel28.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel29.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel31.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel32.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel33.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (jTextField1.getText().isEmpty()) {
            borrar();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                if (contador == 1) {
                    jLabel2.setIcon(null);
                }
                if (contador == 2) {
                    jLabel3.setIcon(null);
                }
                if (contador == 3) {
                    jLabel4.setIcon(null);
                }
                if (contador == 4) {
                    jLabel5.setIcon(null);
                }
                if (contador == 5) {
                    jLabel6.setIcon(null);
                }
                if (contador == 6) {
                    jLabel7.setIcon(null);
                }
                if (contador == 7) {
                    jLabel8.setIcon(null);
                }
                if (contador == 8) {
                    jLabel9.setIcon(null);
                }
                if (contador == 9) {
                    jLabel10.setIcon(null);
                }
                if (contador == 10) {
                    jLabel11.setIcon(null);
                }
                if (contador == 11) {
                    jLabel2.setIcon(null);
                }
                if (contador == 12) {
                    jLabel3.setIcon(null);
                }
                if (contador == 13) {
                    jLabel4.setIcon(null);
                }
                if (contador == 14) {
                    jLabel5.setIcon(null);
                }
                if (contador == 15) {
                    jLabel6.setIcon(null);
                }
                if (contador == 16) {
                    jLabel7.setIcon(null);
                }
                if (contador == 17) {
                    jLabel8.setIcon(null);
                }
                if (contador == 18) {
                    jLabel9.setIcon(null);
                }
                if (contador == 19) {
                    jLabel10.setIcon(null);
                }
                if (contador == 20) {
                    jLabel11.setIcon(null);
                }
                if (contador == 21) {
                    jLabel2.setIcon(null);
                }
                if (contador == 22) {
                    jLabel3.setIcon(null);
                }
                if (contador == 23) {
                    jLabel4.setIcon(null);
                }
                if (contador == 24) {
                    jLabel5.setIcon(null);
                }
                if (contador == 25) {
                    jLabel6.setIcon(null);
                }
                if (contador == 26) {
                    jLabel7.setIcon(null);
                }
                if (contador == 27) {
                    jLabel8.setIcon(null);
                }
                if (contador == 28) {
                    jLabel9.setIcon(null);
                }
                if (contador == 29) {
                    jLabel10.setIcon(null);
                }
                if (contador == 30) {
                    jLabel11.setIcon(null);
                }
                if (contador == 31) {
                    jLabel11.setIcon(null);
                }
                if (contador == 32) {
                    jLabel11.setIcon(null);
                }
                if (contador == 33) {
                    jLabel11.setIcon(null);
                }
                Textos.remove(Textos.size() -1);
                contador--;
            } else {
                if (jTextField1.getText().endsWith(" ")) {
                    contador++;
                    Textos.add(" ");
                } else {
                    try {
                        if (contador >= 33) {
                            borrar();
                        }

                        contador++;
                        String letra = jTextField1.getText().substring(jTextField1.getText().length() - 1);
                        Textos.add(letra);
                        imagen(letra, contador);
                    } catch (Exception e) {
                        System.out.println("Error " + e);
                    }
                }
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased


    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               File arreglo;
                String cad = "";
                arreglo = new File(System.getProperty("user.dir")+"/BrailleTraducido.html");
                //Escritura
                try {

                    FileWriter w = new FileWriter(arreglo);
                    try (BufferedWriter bw = new BufferedWriter(w); PrintWriter wr = new PrintWriter(bw)) {
                        wr.append("<HTML>"
                                + "	<HEAD>"
                                + "           <TITLE>Traductor de Braille</TITLE>"
                                + "	</HEAD>"
                                +"<body>"
                                + "       <h1 align=\"center\">Traductor de Braille</h1>"
                                + "</body>"
                                + "<body style=background-color:#FF0000>"
                                + "</body>"
                                + "	<BODY>"
                                + "           <H2>");

                        for (String lee : Textos) {
                            Braille Traductor = new Traductor(lee);
                            Traductor.imprimir();

                                   if (lee.equals(" ")) {
                                wr.append("&ensp;");
                            }
                            if (lee.equals(" ")) {
                                wr.append("&ensp;");
                            }
                            if (lee.equals("a")) {                                
                                wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("b")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("c")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("d")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("e")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("f")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("g")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("h")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("i")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("j")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("k")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("l")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("m")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("n")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("o")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("p")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("q")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("r")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("s")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("t")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("u")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("v")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("w")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("x")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("y")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                            if (lee.equals("z")) {
                                 wr.append("<img src=\"src\\braille\\Imgbraille\\"+lee+".jpg\" width=50 height=70>");
                            }
                        }
                        wr.append("</H2> <H3>" + cad + "</H3> "
                                + "     </BODY>"
                                + "</HTML>");
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            
            int respuesta = JOptionPane.showConfirmDialog(null, "Traducido  \n¡ABRIR!", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (respuesta == YES_NO_OPTION) {
                try {
                    File path = new File(System.getProperty("user.dir")+"/BrailleTraducido.html");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }    
    }//GEN-LAST:event_jButton1ActionPerformed

    public void imagen(String letra, int posicion) {
        ImageIcon Ibraille = new ImageIcon("src\\braille\\Imgbraille\\" + letra + ".jpg");
        System.out.println(letra + " " + posicion);
        if (posicion == 1) {
            jLabel1.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 2) {
            jLabel2.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 3) {
            jLabel3.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 4) {
            jLabel4.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 5) {
            jLabel5.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 6) {
            jLabel6.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 7) {
            jLabel7.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 8) {
            jLabel8.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 9) {
            jLabel9.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 10) {
            jLabel10.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 11) {
            jLabel11.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 12) {
            jLabel12.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 13) {
            jLabel13.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 14) {
            jLabel14.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 15) {
            jLabel15.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 16) {
            jLabel16.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 17) {
            jLabel17.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 18) {
            jLabel18.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 19) {
            jLabel19.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 20) {
            jLabel20.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 21) {
            jLabel21.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 22) {
            jLabel22.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 23) {
            jLabel23.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 24) {
            jLabel24.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 25) {
            jLabel25.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel25.getWidth(), jLabel25.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 26) {
            jLabel26.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 27) {
            jLabel27.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel27.getWidth(), jLabel27.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 28) {
            jLabel28.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 29) {
            jLabel29.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 30) {
            jLabel30.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 31) {
            jLabel31.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 32) {
            jLabel32.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_REPLICATE)));
        }
        if (posicion == 33) {
            jLabel33.setIcon(new ImageIcon(Ibraille.getImage().getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_REPLICATE)));
        }

    }
    public void borrar() {
        jLabel1.setIcon(null);
        jLabel2.setIcon(null);
        jLabel3.setIcon(null);
        jLabel4.setIcon(null);
        jLabel5.setIcon(null);
        jLabel6.setIcon(null);
        jLabel7.setIcon(null);
        jLabel8.setIcon(null);
        jLabel9.setIcon(null);
        jLabel10.setIcon(null);
        jLabel11.setIcon(null);
        jLabel12.setIcon(null);
        jLabel13.setIcon(null);
        jLabel14.setIcon(null);
        jLabel15.setIcon(null);
        jLabel16.setIcon(null);
        jLabel17.setIcon(null);
        jLabel18.setIcon(null);
        jLabel19.setIcon(null);
        jLabel20.setIcon(null);
        jLabel21.setIcon(null);
        jLabel22.setIcon(null);
        jLabel23.setIcon(null);
        jLabel24.setIcon(null);
        jLabel25.setIcon(null);
        jLabel26.setIcon(null);
        jLabel27.setIcon(null);
        jLabel28.setIcon(null);
        jLabel29.setIcon(null);
        jLabel30.setIcon(null);
        jLabel31.setIcon(null);
        jLabel32.setIcon(null);
        jLabel33.setIcon(null);      
        contador = 0;
    }
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
            java.util.logging.Logger.getLogger(miBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(miBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(miBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(miBraille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new miBraille().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
