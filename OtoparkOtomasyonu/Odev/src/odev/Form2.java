/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;

import com.sun.org.apache.xml.internal.dtm.DTM;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Form2 extends javax.swing.JFrame {

    
    DefaultTableModel dtm;

    public Form2() {
        initComponents();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"ID", "ADI", "SOYADI", "NUMARA", "PLAKA", "GIRISSAATI"});
        tbl_otopark.setModel(dtm);
        try {
            //bağlantı
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/otopardb", "sa", "as");//bağlantı
            //iletişimi açıyor
            Statement stmt = con.createStatement();
            //veri tabanında sorgu çalıştırıp bize geri tablo döndürüyor
            ResultSet rs = stmt.executeQuery("select * from OTOPARK");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String adi = rs.getString("ADI");
                String soyadi = rs.getString("SOYADI");
                Integer numara = rs.getInt("NUMARA");
                String plaka = rs.getString("PLAKA");
                double girissaati = rs.getDouble("GIRISSAATI");
                dtm.addRow(new Object[]{id, adi, soyadi, numara, plaka, girissaati});

            }
        } catch (SQLException ex) {
            Logger.getLogger(myTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        otopardbPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("otopardbPU").createEntityManager();
        otoparkQuery = java.beans.Beans.isDesignTime() ? null : otopardbPUEntityManager.createQuery("SELECT o FROM Otopark o");
        otoparkList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : otoparkQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_soyad = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_plaka = new javax.swing.JTextField();
        txt_no = new javax.swing.JTextField();
        txt_saat = new javax.swing.JTextField();
        btn_sorgula = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        btn_giris = new javax.swing.JButton();
        btn_kapat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_otopark = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MÜŞTERİ GİRİŞ-ÇIKIŞ");
        setLocation(new java.awt.Point(350, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Soyad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 75, 30));

        jLabel2.setText("Müşteri Ad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 75, 30));

        jLabel3.setText("Giriş Saati");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 75, 30));

        jLabel4.setText("Numara");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 75, 30));

        jLabel5.setText("Araç Plakası");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 75, 23));
        getContentPane().add(txt_soyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 122, 32));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 122, 30));
        getContentPane().add(txt_plaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 122, 30));
        getContentPane().add(txt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 122, 27));
        getContentPane().add(txt_saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 122, 30));

        btn_sorgula.setBackground(new java.awt.Color(204, 255, 204));
        btn_sorgula.setText("SORGULA");
        btn_sorgula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sorgulaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sorgula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 215, 32));

        btn_cikis.setBackground(new java.awt.Color(255, 51, 51));
        btn_cikis.setText("ÇIKIŞ YAP");
        btn_cikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cikis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 215, 32));

        btn_giris.setBackground(new java.awt.Color(102, 255, 0));
        btn_giris.setText("GİRİŞ YAP");
        btn_giris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 215, 32));

        btn_kapat.setBackground(new java.awt.Color(204, 0, 51));
        btn_kapat.setText("PROGRAMI KAPAT");
        btn_kapat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 215, 32));

        jLabel6.setText("Müşteri ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 75, -1));
        getContentPane().add(txt_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 122, 30));

        tbl_otopark.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_otopark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_otoparkMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_otopark);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 270));

        panel1.setName(""); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("C BLOK");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("A BLOK");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("B BLOK");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 30));

        jButton1.setBackground(java.awt.Color.green);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 80, 40));

        jButton2.setBackground(java.awt.Color.green);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, 40));
        jButton2.getAccessibleContext().setAccessibleName("btn_a1");

        jButton3.setBackground(java.awt.Color.green);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, 40));

        jButton4.setBackground(java.awt.Color.green);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 80, 40));

        jButton5.setBackground(java.awt.Color.green);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, 40));

        jButton6.setBackground(java.awt.Color.green);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 80, 40));

        jButton7.setBackground(java.awt.Color.green);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 80, 40));

        jButton8.setBackground(java.awt.Color.green);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 80, 40));

        jButton9.setBackground(java.awt.Color.green);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 80, 40));

        jButton10.setBackground(java.awt.Color.green);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 80, 40));

        jButton11.setBackground(java.awt.Color.green);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, 40));

        jButton12.setBackground(java.awt.Color.green);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 80, 40));

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("4");
        panel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 20, 20));

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("1");
        panel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 20, 20));

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("2");
        panel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 20, 20));

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("3");
        panel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 20, 20));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 450, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabloyaz() throws Exception {
        try {
            //bağlantı
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/otopardb", "sa", "as");//bağlantı
            //iletişimi açıyor
            Statement stmt = con.createStatement();
            //veri tabanında sorgu çalıştırıp bize geri tablo döndürüyor
            ResultSet rs = stmt.executeQuery("select * from OTOPARK");
            myTableModel model = new myTableModel(rs);
            tbl_otopark.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(myTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
        if (txt_id.getText() == null || txt_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "bir id girmelisiniz..");
            return;
        }
        try {
            //bağlantı
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/otopardb", "sa", "as");//bağlantı
            //iletişimi açıyor
            Statement stmt = con.createStatement();

            //veri tabanında sorgu çalıştırıp bize geri tablo döndürüyor
            ResultSet rs = stmt.executeQuery("SELECT * FROM OTOPARK WHERE ID=" + txt_id.getText().trim());

            if (rs.next()) {
                String updatesorgu = "UPDATE OTOPARK SET ADI='"
                        + txt_ad.getText().trim()
                        + "',SOYADI='" + txt_soyad.getText().trim()
                        + "',NUMARA=" + txt_no.getText().trim()
                        + ",PLAKA='" + txt_plaka.getText().trim()
                        + "',GIRISSAATI=" + txt_saat.getText().trim() + " WHERE ID=" + txt_id.getText().trim();
                System.out.println("" + updatesorgu);
                stmt.executeUpdate(updatesorgu);
                tabloyaz();
            } else {
                String insertsorgu = "INSERT INTO OTOPARK (ID,ADI,SOYADI,NUMARA,PLAKA,GIRISSAATI) VALUES ("
                        + txt_id.getText() + ",'"
                        + txt_ad.getText().trim()
                        + "','" + txt_soyad.getText().trim()
                        + "'," + txt_no.getText().trim()
                        + ",'" + txt_plaka.getText().trim()
                        + "'," + txt_saat.getText().trim() + ")";
                System.out.println("" + insertsorgu);
                stmt.executeUpdate(insertsorgu);
                tabloyaz();
            }
        } catch (SQLException ex) {
            Logger.getLogger(myTableModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_girisActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        double hesap = 0;
        if (txt_id.getText() == null || txt_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "bir id girmelisiniz..");
            return;
        }
        double girissaati;
        try {
            //bağlantı
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/otopardb", "sa", "as");//bağlantı
            //iletişimi açıyor
            Statement stmt = con.createStatement();
            //veri tabanında sorgu çalıştırıp bize geri tablo döndürüyor
            ResultSet rs = stmt.executeQuery("SELECT * FROM OTOPARK WHERE ID=" + txt_id.getText().trim());

            if (rs.next()) {
                girissaati = rs.getDouble("GIRISSAATI");
                System.out.println(girissaati);
                String cikis_saati = JOptionPane.showInputDialog("çıkış saatini giriniz: ");
                double cikis_s = Double.parseDouble(cikis_saati);

                hesap = (double) cikis_s - (double) girissaati;
                System.out.println(hesap);
                hesap *= 5;
                hesap *= 1.18;
                // hesap=((double)((double)cikis_s-girissaati)*5)*(double)1.18;
                JOptionPane.showMessageDialog(rootPane, "Borcunuz: " + hesap);
                String deletesorgu = "DELETE FROM OTOPARK WHERE ID=" + txt_id.getText();
                System.out.println("" + deletesorgu);
                stmt.executeUpdate(deletesorgu);
                tabloyaz();
            }
        } catch (SQLException ex) {
            Logger.getLogger(myTableModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_sorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sorgulaActionPerformed

        txt_ad.setText("");
        txt_soyad.setText("");
        txt_no.setText("");
        txt_plaka.setText("");
        txt_saat.setText("");
        if (txt_id.getText() == null || txt_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "bir id girmelisiniz..");
            return;
        }
        int gelenid = Integer.parseInt(txt_id.getText());
        try {
            //bağlantı
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/otopardb", "sa", "as");//bağlantı
            //iletişimi açıyor
            Statement stmt = con.createStatement();
            //veri tabanında sorgu çalıştırıp bize geri tablo döndürüyor
            ResultSet rs = stmt.executeQuery("select * from OTOPARK WHERE ID=" + gelenid);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String adi = rs.getString("ADI");
                txt_ad.setText(adi);
                String soyadi = rs.getString("SOYADI");
                txt_soyad.setText(soyadi);
                Integer numara = rs.getInt("NUMARA");
                txt_no.setText(numara + "");
                String plaka = rs.getString("PLAKA");
                txt_plaka.setText(plaka);
                double girissaati = rs.getDouble("GIRISSAATI");
                txt_saat.setText(girissaati + "");
                tabloyaz();

            }
        } catch (SQLException ex) {
            Logger.getLogger(myTableModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Form2.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_sorgulaActionPerformed

    private void btn_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kapatActionPerformed
        
        dispose();

    }//GEN-LAST:event_btn_kapatActionPerformed

    private void tbl_otoparkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_otoparkMouseClicked
        
    }//GEN-LAST:event_tbl_otoparkMouseClicked

    //plakaları buttonlara yerleştiren metodlar
    public void buttonYaz(JButton a){
        
        if(a.getBackground()==java.awt.Color.green)
        {
            a.setText(txt_plaka.getText());
            a.setBackground(Color.red);
        }else {a.setText(""); a.setBackground(Color.green);}
    
    }
    public void buttonYaz(JButton a,int n){
        if(a.getBackground()==java.awt.Color.green)
        {
            a.setText(txt_plaka.getText());
            a.setBackground(Color.darkGray);
        }
        else if(a.getBackground()==java.awt.Color.blue)
        {
            a.setText(txt_plaka.getText());
            a.setBackground(Color.darkGray);
        }
        else {a.setText(""); a.setBackground(Color.blue);
    }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        buttonYaz(jButton2,5);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton4,5);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here: 
         buttonYaz(jButton5,5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton7,9);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton9,6);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton11,4);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         buttonYaz(jButton12);
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_giris;
    private javax.swing.JButton btn_kapat;
    private javax.swing.JButton btn_sorgula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.persistence.EntityManager otopardbPUEntityManager;
    private java.util.List<odev.Otopark> otoparkList;
    private javax.persistence.Query otoparkQuery;
    private java.awt.Panel panel1;
    private javax.swing.JTable tbl_otopark;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_plaka;
    private javax.swing.JTextField txt_saat;
    private javax.swing.JTextField txt_soyad;
    // End of variables declaration//GEN-END:variables
}
