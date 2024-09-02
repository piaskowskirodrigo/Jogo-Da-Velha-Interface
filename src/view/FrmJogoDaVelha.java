/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class FrmJogoDaVelha extends javax.swing.JFrame {

    private String iniciaJogo = "X";
    private int xContador = 0;
    private int oContador = 0;
    public FrmJogoDaVelha() {
        initComponents();
    }

    private void placarJogo(){
        jogadorxx.setText(String.valueOf(xContador));
        jogadoroo.setText(String.valueOf(oContador));
    }
    
    //Vez do jogador
    private void escolheJogador(){
    if(iniciaJogo.equalsIgnoreCase("X")){
            iniciaJogo = "O";
    }else{
            iniciaJogo = "X";
    }
    }  
    
    //ganhador
    private void ganhouJogo(){
        
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
    //verifica se tem combinacao
    
    //linha1
    if(b1 == "X" && b2 == "X" && b3 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn1.setBackground(Color.orange);
        txtbtn2.setBackground(Color.orange);
        txtbtn3.setBackground(Color.orange);
        }
    //linha2
    if(b4 == "X" && b5 == "X" && b6 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn4.setBackground(Color.orange);
        txtbtn5.setBackground(Color.orange);
        txtbtn6.setBackground(Color.orange);
        }
    //linha3
    if(b7 == "X" && b8 == "X" && b9 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn7.setBackground(Color.orange);
        txtbtn8.setBackground(Color.orange);
        txtbtn9.setBackground(Color.orange);
        }
    //coluna1
     if(b1 == "X" && b4 == "X" && b7 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn1.setBackground(Color.orange);
        txtbtn4.setBackground(Color.orange);
        txtbtn7.setBackground(Color.orange);
        }
     //vcoluna2
     if(b2 == "X" && b5 == "X" && b8 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn2.setBackground(Color.orange);
        txtbtn5.setBackground(Color.orange);
        txtbtn8.setBackground(Color.orange);
        }
     //coluna3
     if(b3 == "X" && b6 == "X" && b9 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn3.setBackground(Color.orange);
        txtbtn6.setBackground(Color.orange);
        txtbtn9.setBackground(Color.orange);
        }
     //horizontal
     if(b1 == "X" && b5 == "X" && b9 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn1.setBackground(Color.orange);
        txtbtn5.setBackground(Color.orange);
        txtbtn9.setBackground(Color.orange);
        }
     //horizontal2
     if(b3 == "X" && b5 == "X" && b7 == "X"){
       
        JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha",JOptionPane.INFORMATION_MESSAGE);
        xContador++;
        placarJogo();
        
        txtbtn3.setBackground(Color.orange);
        txtbtn5.setBackground(Color.orange);
        txtbtn7.setBackground(Color.orange);
        }
     
     
     //jogador O
     if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);           
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn2.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn8.setBackground(Color.PINK);           
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jogador X ganhou!!!"," Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            xContador++;
            placarJogo();
            
            txtbtn3.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn7.setBackground(Color.PINK);           
        }
    }
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtsair = new javax.swing.JButton();
        txtresetar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jogadorO = new javax.swing.JLabel();
        jogadorxx = new javax.swing.JLabel();
        jogadorX = new javax.swing.JLabel();
        jogadoroo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JogoDaVelha");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jogo da Velha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbtn2.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn2.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn3.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn1.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn5.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn6.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn4.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn8.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn9.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        txtbtn7.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtsair.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        txtsair.setForeground(new java.awt.Color(255, 51, 51));
        txtsair.setText("Sair");
        txtsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsairActionPerformed(evt);
            }
        });

        txtresetar.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        txtresetar.setForeground(new java.awt.Color(102, 255, 102));
        txtresetar.setText("Resetar");
        txtresetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jogadorO.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jogadorO.setForeground(new java.awt.Color(255, 255, 255));
        jogadorO.setText("jogador o:");

        jogadorxx.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jogadorxx.setForeground(new java.awt.Color(102, 153, 255));
        jogadorxx.setText("xxxxx");

        jogadorX.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jogadorX.setForeground(new java.awt.Color(255, 255, 255));
        jogadorX.setText("Jogador x:");

        jogadoroo.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jogadoroo.setForeground(new java.awt.Color(102, 153, 255));
        jogadoroo.setText("xxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jogadorO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jogadorxx, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogadoroo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jogadorX)
                    .addContainerGap(224, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jogadorxx)
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogadorO)
                    .addComponent(jogadoroo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jogadorX)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtsair, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(txtresetar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(531, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(txtsair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(523, Short.MAX_VALUE)
                    .addComponent(txtresetar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn2.setForeground(Color.red);
        }else{
                txtbtn2.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
  
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn3.setForeground(Color.red);
        }else{
                txtbtn3.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
    txtbtn1.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn1.setForeground(Color.red);
        }else{
                txtbtn1.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
  
    
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn5.setForeground(Color.red);
        }else{
                txtbtn5.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn6.setForeground(Color.red);
        }else{
                txtbtn6.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn4.setForeground(Color.red);
        }else{
                txtbtn4.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        txtbtn8.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn8.setForeground(Color.red);
        }else{
                txtbtn8.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn9.setForeground(Color.red);
        }else{
                txtbtn9.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setText(iniciaJogo);
        if(iniciaJogo.equalsIgnoreCase("X")){
                txtbtn7.setForeground(Color.red);
        }else{
                txtbtn7.setForeground(Color.BLUE);
        }
        escolheJogador();
        ganhouJogo();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsairActionPerformed
        // TODO add your handling code here:
        //acao para confirmar se quer sair do jogo
        JFrame frame = new JFrame("Sair");
        
        if(JOptionPane.showConfirmDialog(frame, "Cofirme se voce quer sair", "Jogo da velha", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_txtsairActionPerformed

    private void txtresetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetarActionPerformed
        // TODO add your handling code here:
        //reseta 
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_txtresetarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jogadorO;
    private javax.swing.JLabel jogadorX;
    private javax.swing.JLabel jogadoroo;
    private javax.swing.JLabel jogadorxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtresetar;
    private javax.swing.JButton txtsair;
    // End of variables declaration//GEN-END:variables
}
