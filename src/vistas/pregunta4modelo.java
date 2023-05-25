
package vistas;


public class pregunta4modelo extends javax.swing.JPanel {

    public pregunta4modelo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pregunta = new javax.swing.JLabel();
        btnSeleccion1 = new javax.swing.JRadioButton();
        btnSeleccion2 = new javax.swing.JRadioButton();
        btnSeleccion3 = new javax.swing.JRadioButton();
        btnSeleccion4 = new javax.swing.JRadioButton();
        btnSeleccion5 = new javax.swing.JRadioButton();
        cuadroDecorado = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();

        setBackground(new java.awt.Color(228, 251, 251));

        pregunta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pregunta.setForeground(new java.awt.Color(0, 0, 0));
        pregunta.setText("Pregunta #n-----------------------------------------------------");

        btnSeleccion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeleccion1.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccion1.setText("Seleccion 1");
        btnSeleccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccion1ActionPerformed(evt);
            }
        });

        btnSeleccion2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeleccion2.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccion2.setText("Seleccion 2");

        btnSeleccion3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeleccion3.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccion3.setText("Seleccion 3");

        btnSeleccion4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeleccion4.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccion4.setText("Seleccion 4");

        btnSeleccion5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSeleccion5.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccion5.setText("Seleccion 5");

        cuadroDecorado.setBackground(new java.awt.Color(228, 251, 251));
        cuadroDecorado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroDecorado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cuadroDecoradoFocusGained(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(15, 192, 255));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSig.setBackground(new java.awt.Color(15, 192, 255));
        btnSig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSig.setForeground(new java.awt.Color(0, 0, 0));
        btnSig.setText("Siguiente");
        btnSig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cuadroDecorado, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(btnSeleccion5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(btnSeleccion3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(btnSeleccion1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(btnSeleccion4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(pregunta))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(btnSeleccion2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(130, 130, 130)
                            .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cuadroDecorado, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(290, 290, 290)
                            .addComponent(btnSeleccion5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(btnSeleccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(btnSeleccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(236, 236, 236)
                            .addComponent(btnSeleccion4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(pregunta))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(btnSeleccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccion1ActionPerformed

    private void cuadroDecoradoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuadroDecoradoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroDecoradoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JRadioButton btnSeleccion1;
    private javax.swing.JRadioButton btnSeleccion2;
    private javax.swing.JRadioButton btnSeleccion3;
    private javax.swing.JRadioButton btnSeleccion4;
    private javax.swing.JRadioButton btnSeleccion5;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel cuadroDecorado;
    private javax.swing.JLabel pregunta;
    // End of variables declaration//GEN-END:variables
}
