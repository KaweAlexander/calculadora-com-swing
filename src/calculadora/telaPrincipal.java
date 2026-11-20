/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author kaw3s
 */
public class telaPrincipal extends javax.swing.JFrame {

    Calculos calcular = new Calculos();
    
    String valorDigitado = "";
    String valorDigitado2 = "";
    String operador = " ";

    
    // salva o operado, faz a verificação em cadão botão de numero, se o operador tiver sido clicado, inicie a nova variavel
    public telaPrincipal() {
        initComponents();
    }
    
private void digitar(String numero){
       
        if(operador.equals(" ")){
            valorDigitado += numero;
            jTextField1.setText(valorDigitado);  
 
        }else if(operador.equals("+") || operador.equals("-") || operador.equals("x")|| operador.equals("÷")){
            valorDigitado2 += numero;
    
            jTextField1.setText(valorDigitado + " "+ operador + " " + valorDigitado2); 
        } 
    }  

private void limitarOperador(String sinal){
    
        if(valorDigitado.equals("")){
            JOptionPane.showMessageDialog(this, "Formato usado inválido");
            return;
        }
        if (!operador.equals(" ")) {
            JOptionPane.showMessageDialog(this, "Calma pae, o dev ficou com preguiça de trabalhar expressões");
        return;
        }
    
        String texto = jTextField1.getText();

        if (!texto.endsWith(sinal)) {
            jTextField1.setText(texto +" "+sinal);
}
        operador = sinal;
          
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        divisaoButton = new javax.swing.JButton();
        multiButton = new javax.swing.JButton();
        menosButton = new javax.swing.JButton();
        maisButton = new javax.swing.JButton();
        resultadoButton = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        Sinais = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        porcento = new javax.swing.JButton();
        colchete = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        deleteNumero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 27)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setFocusable(false);

        divisaoButton.setBackground(new java.awt.Color(102, 102, 102));
        divisaoButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        divisaoButton.setForeground(new java.awt.Color(255, 255, 255));
        divisaoButton.setText("÷");
        divisaoButton.setFocusPainted(false);
        divisaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoButtonActionPerformed(evt);
            }
        });

        multiButton.setBackground(new java.awt.Color(102, 102, 102));
        multiButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        multiButton.setForeground(new java.awt.Color(255, 255, 255));
        multiButton.setText("x");
        multiButton.setFocusPainted(false);
        multiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiButtonActionPerformed(evt);
            }
        });

        menosButton.setBackground(new java.awt.Color(102, 102, 102));
        menosButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        menosButton.setForeground(new java.awt.Color(255, 255, 255));
        menosButton.setText("-");
        menosButton.setFocusPainted(false);
        menosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosButtonActionPerformed(evt);
            }
        });

        maisButton.setBackground(new java.awt.Color(102, 102, 102));
        maisButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        maisButton.setForeground(new java.awt.Color(255, 255, 255));
        maisButton.setText("+");
        maisButton.setFocusPainted(false);
        maisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisButtonActionPerformed(evt);
            }
        });

        resultadoButton.setBackground(new java.awt.Color(102, 102, 102));
        resultadoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        resultadoButton.setForeground(new java.awt.Color(255, 255, 255));
        resultadoButton.setText("=");
        resultadoButton.setFocusPainted(false);
        resultadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoButtonActionPerformed(evt);
            }
        });

        virgula.setBackground(new java.awt.Color(102, 102, 102));
        virgula.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        virgula.setForeground(new java.awt.Color(255, 255, 255));
        virgula.setText(",");
        virgula.setFocusPainted(false);
        virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgulaActionPerformed(evt);
            }
        });

        button0.setBackground(new java.awt.Color(102, 102, 102));
        button0.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button0.setForeground(new java.awt.Color(255, 255, 255));
        button0.setText("0");
        button0.setFocusPainted(false);
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        Sinais.setBackground(new java.awt.Color(102, 102, 102));
        Sinais.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Sinais.setForeground(new java.awt.Color(255, 255, 255));
        Sinais.setText("+/-");
        Sinais.setFocusPainted(false);
        Sinais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinaisActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(102, 102, 102));
        button3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("3");
        button3.setFocusPainted(false);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(102, 102, 102));
        button2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("2");
        button2.setFocusPainted(false);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(102, 102, 102));
        button1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("1");
        button1.setFocusPainted(false);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(102, 102, 102));
        button6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("6");
        button6.setFocusPainted(false);
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(102, 102, 102));
        button5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("5");
        button5.setFocusPainted(false);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(102, 102, 102));
        button4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("4");
        button4.setFocusPainted(false);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(102, 102, 102));
        button9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("9");
        button9.setFocusPainted(false);
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(102, 102, 102));
        button8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("8");
        button8.setFocusPainted(false);
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(102, 102, 102));
        button7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("7");
        button7.setFocusPainted(false);
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        porcento.setBackground(new java.awt.Color(102, 102, 102));
        porcento.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        porcento.setForeground(new java.awt.Color(255, 255, 255));
        porcento.setText("%");
        porcento.setFocusPainted(false);
        porcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentoActionPerformed(evt);
            }
        });

        colchete.setBackground(new java.awt.Color(102, 102, 102));
        colchete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        colchete.setForeground(new java.awt.Color(255, 255, 255));
        colchete.setText("( )");
        colchete.setFocusPainted(false);

        apagar.setBackground(new java.awt.Color(102, 102, 102));
        apagar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        apagar.setForeground(new java.awt.Color(204, 0, 51));
        apagar.setText("c");
        apagar.setFocusPainted(false);
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        deleteNumero.setBackground(new java.awt.Color(102, 102, 102));
        deleteNumero.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        deleteNumero.setForeground(new java.awt.Color(153, 0, 0));
        deleteNumero.setText("⌫");
        deleteNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteNumero.setFocusPainted(false);
        deleteNumero.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Sinais, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultadoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(divisaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(colchete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(porcento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colchete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sinais, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
                   
        digitar("1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
       
        digitar("0");
    }//GEN-LAST:event_button0ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
        digitar("2");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
       
       digitar("3"); 
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        
       digitar("4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
       
       digitar("5"); 
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
       
       digitar("6"); 
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
       
       digitar("7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        
       digitar("8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
       
       digitar("9");
    }//GEN-LAST:event_button9ActionPerformed

    private void resultadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoButtonActionPerformed
       
       if(valorDigitado.equals("")){
           return;
       }
       double numero1 = Double.parseDouble(valorDigitado);
       double numero2 = 0;
       
       if(!valorDigitado2.equals("")){
           numero2 = Double.parseDouble(valorDigitado2);
       }
       String resultado = "";
       switch (operador) {
            case "+":
                resultado = String.valueOf(calcular.soma(numero1, numero2));
                break;

            case "-":
                resultado = String.valueOf(calcular.menos(numero1, numero2));
                break;

            case "x":
                resultado = String.valueOf(calcular.multiplica(numero1, numero2));
                break;

            case "÷":
                if(calcular.dividir(numero1, numero2) == null){
                    
                    javax.swing.JOptionPane.showMessageDialog(this,"Não há divisões por zero seu burro do krl!","Aviso",javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }else{
                    resultado = String.valueOf(calcular.dividir(numero1, numero2));
                }
                break;
                
            case "%":
                   resultado = String.valueOf(calcular.porcentagem(numero1));
                   break;
            default:
                System.out.println("ERRO NO OPERADOR");
                break;
                
        }

       double resultad = Double.parseDouble(resultado);
       String valorFinal;
       if(resultad == (int) resultad){
           jTextField1.setText(String.valueOf((int)resultad));
       }else{
           jTextField1.setText(resultado);
       }
   
       valorDigitado = resultado;
       valorDigitado2 = "";
       operador = " ";

    }//GEN-LAST:event_resultadoButtonActionPerformed

    private void maisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisButtonActionPerformed
       
        limitarOperador("+");
    }//GEN-LAST:event_maisButtonActionPerformed

    private void menosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosButtonActionPerformed
       
        limitarOperador("-");
        
    }//GEN-LAST:event_menosButtonActionPerformed

    private void multiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiButtonActionPerformed
      
        limitarOperador("x");
        
    }//GEN-LAST:event_multiButtonActionPerformed

    private void divisaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoButtonActionPerformed
       
       limitarOperador("÷");
       
    }//GEN-LAST:event_divisaoButtonActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
       jTextField1.setText("");
       operador = " ";
       valorDigitado = "";
       valorDigitado2 = "";
    }//GEN-LAST:event_apagarActionPerformed

    private void porcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentoActionPerformed
        limitarOperador("%");
 
    }//GEN-LAST:event_porcentoActionPerformed

    private void SinaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinaisActionPerformed
         
        if(valorDigitado.equals("")){
           jTextField1.setText("-");
           valorDigitado = "-";
           return;
        }
        if (valorDigitado.equals("-")) {
            valorDigitado = "";
            jTextField1.setText("");
            return;
        }
        
        double numero = Double.parseDouble(valorDigitado);
            
            numero = - numero;
        
        if(numero == (int) numero){ 
            
            String conver = String.valueOf((int)numero);
            valorDigitado = conver;
            jTextField1.setText(valorDigitado);
            
        }else{
            
            String conver = String.valueOf(numero);
            valorDigitado = conver;
            jTextField1.setText(valorDigitado);
            
        }

    }//GEN-LAST:event_SinaisActionPerformed

    private void virgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgulaActionPerformed
        
        if (operador.equals(" ")) {
            if (!valorDigitado.equals("") && !valorDigitado.contains(".")) {
                valorDigitado += ".";
                jTextField1.setText(valorDigitado);

            }
        } else {
            if (!valorDigitado2.equals("") && !valorDigitado2.contains(".")) {
                valorDigitado2 += ".";
                jTextField1.setText(valorDigitado+" " + operador +" "+ valorDigitado2);
        }}
        
 
    }//GEN-LAST:event_virgulaActionPerformed

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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sinais;
    private javax.swing.JButton apagar;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton colchete;
    private javax.swing.JButton deleteNumero;
    private javax.swing.JButton divisaoButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton maisButton;
    private javax.swing.JButton menosButton;
    private javax.swing.JButton multiButton;
    private javax.swing.JButton porcento;
    private javax.swing.JButton resultadoButton;
    private javax.swing.JButton virgula;
    // End of variables declaration//GEN-END:variables
}
