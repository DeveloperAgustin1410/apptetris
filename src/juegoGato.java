
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ekise
 */
public class juegoGato extends javax.swing.JFrame {
    
    String turno = "x";
    int puntosx = 0;
    int puntoso = 0;
    
    public void revisarGanador() {
        String p1 = jLabel1.getText().toString().trim();
        String p2 = jLabel2.getText().toString().trim();
        String p3 = jLabel3.getText().toString().trim();
        String p4 = jLabel4.getText().toString().trim();
        String p5 = jLabel5.getText().toString().trim();
        String p6 = jLabel6.getText().toString().trim();
        String p7 = jLabel7.getText().toString().trim();
        String p8 = jLabel8.getText().toString().trim();
        String p9 = jLabel9.getText().toString().trim();
        
        if (p1.equals("x") && p2.equals("x") && p3.equals("x") || p1.equals("o") && p2.equals("o") && p3.equals("o")) {
            jLabel1.setBackground(Color.green);
            jLabel2.setBackground(Color.green);
            jLabel3.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
        
        if (p4.equals("x") && p5.equals("x") && p6.equals("x") || p4.equals("o") && p5.equals("o") && p6.equals("o")) {
            jLabel4.setBackground(Color.green);
            jLabel5.setBackground(Color.green);
            jLabel6.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
        if (p7.equals("x") && p8.equals("x") && p9.equals("x") || p7.equals("o") && p8.equals("o") && p9.equals("o")) {
            jLabel7.setBackground(Color.green);
            jLabel8.setBackground(Color.green);
            jLabel9.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
        
        if (p1.equals("x") && p4.equals("x") && p7.equals("x") || p1.equals("o") && p4.equals("o") && p7.equals("o")) {
            jLabel1.setBackground(Color.green);
            jLabel4.setBackground(Color.green);
            jLabel7.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
        
        if (p2.equals("x") && p5.equals("x") && p8.equals("x") || p2.equals("o") && p5.equals("o") && p8.equals("o")) {
            jLabel2.setBackground(Color.green);
            jLabel5.setBackground(Color.green);
            jLabel8.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
        
        if (p3.equals("x") && p6.equals("x") && p9.equals("x") || p3.equals("o") && p6.equals("o") && p9.equals("o")) {
            jLabel3.setBackground(Color.green);
            jLabel6.setBackground(Color.green);
            jLabel9.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
        
        if (p1.equals("x") && p5.equals("x") && p9.equals("x") || p1.equals("o") && p5.equals("o") && p9.equals("o")) {
            jLabel1.setBackground(Color.green);
            jLabel5.setBackground(Color.green);
            jLabel9.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
        
        if (p3.equals("x") && p5.equals("x") && p7.equals("x") || p3.equals("o") && p5.equals("o") && p7.equals("o")) {
            jLabel3.setBackground(Color.green);
            jLabel5.setBackground(Color.green);
            jLabel7.setBackground(Color.green);
            JOptionPane.showMessageDialog(this, "Gana Jugador: " + turno);
            if (turno.equals("x")) {
                puntosx++;
                jLabel10.setText("Puntos x: " + puntosx);
            }
            if (turno.equals("o")) {
                puntoso++;
                jLabel11.setText("Puntos o: " + puntoso);
            }
            
            reiniciarJuego();
        }
    }

    public void reiniciarJuego() {
        jLabel1.setText("");
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
        jLabel1.setBackground(Color.white);
        jLabel2.setBackground(Color.white);
        jLabel3.setBackground(Color.white);
        jLabel4.setBackground(Color.white);
        jLabel5.setBackground(Color.white);
        jLabel6.setBackground(Color.white);
        jLabel7.setBackground(Color.white);
        jLabel8.setBackground(Color.white);
        jLabel9.setBackground(Color.white);
    }
    
    public void cambiarTurno(String t) {
        if (t.equals("x")) {
            turno = "o";
        } else {
            turno = "x";
        }
    }
    
    public juegoGato() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 151, 133));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 151, 133));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 146, 133));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 151, 133));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 146, 133));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 151, 133));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 151, 133));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 146, 133));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 151, 133));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setText("Puntos:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 230, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel11.setText("Puntos:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String d = jLabel1.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel1.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel1.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String d = jLabel2.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel2.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel2.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        String d = jLabel3.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel3.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel3.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        String d = jLabel4.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel4.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel4.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        String d = jLabel5.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel5.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel5.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        String d = jLabel6.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel6.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel6.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        String d = jLabel7.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel7.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel7.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        String d = jLabel8.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel8.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel8.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        String d = jLabel9.getText().toString().trim();
        if (d.equals("x") || d.equals("o")) {
            
        } else {
            if (turno.equals("x")) {
                jLabel9.setText("x");
                revisarGanador();
                cambiarTurno(turno);
            } else {
                jLabel9.setText("o");
                revisarGanador();
                cambiarTurno(turno);
            }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(juegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juegoGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juegoGato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
