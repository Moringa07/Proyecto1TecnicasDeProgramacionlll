/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author claud
 */
public class pregunta3modelo extends javax.swing.JPanel {

    /**
     * Creates new form pregunta3modelo
     */
    public pregunta3modelo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pregunta = new javax.swing.JLabel();
        seleccion1 = new javax.swing.JRadioButton();
        seleccion2 = new javax.swing.JRadioButton();
        seleccion3 = new javax.swing.JRadioButton();
        seleccion4 = new javax.swing.JRadioButton();
        seleccion5 = new javax.swing.JRadioButton();
        cuadroDecorado = new javax.swing.JLabel();
        btnSig = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setBackground(new java.awt.Color(228, 251, 251));

        pregunta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pregunta.setForeground(new java.awt.Color(0, 0, 0));
        pregunta.setText("Pregunta #n------------------------------------------");

        seleccion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seleccion1.setForeground(new java.awt.Color(0, 0, 0));
        seleccion1.setText("Seleccion1");

        seleccion2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seleccion2.setForeground(new java.awt.Color(0, 0, 0));
        seleccion2.setText("Seleccion 2");

        seleccion3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seleccion3.setForeground(new java.awt.Color(0, 0, 0));
        seleccion3.setText("Seleccion 3");

        seleccion4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seleccion4.setForeground(new java.awt.Color(0, 0, 0));
        seleccion4.setText("Seleccion 4");

        seleccion5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seleccion5.setForeground(new java.awt.Color(0, 0, 0));
        seleccion5.setText("Seleccion 5");

        cuadroDecorado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSig.setBackground(new java.awt.Color(15, 192, 255));
        btnSig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSig.setForeground(new java.awt.Color(0, 0, 0));
        btnSig.setText("Siguiente");
        btnSig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAtras.setBackground(new java.awt.Color(15, 192, 255));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(360, 360, 360)
                            .addComponent(seleccion1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(360, 360, 360)
                            .addComponent(seleccion4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(pregunta))
                        .addComponent(cuadroDecorado, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(360, 360, 360)
                            .addComponent(seleccion5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(360, 360, 360)
                            .addComponent(seleccion2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(360, 360, 360)
                            .addComponent(seleccion3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(130, 130, 130)
                            .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(seleccion1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(seleccion4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(pregunta))
                        .addComponent(cuadroDecorado, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(seleccion5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(seleccion2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(seleccion3)))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel cuadroDecorado;
    private javax.swing.JLabel pregunta;
    private javax.swing.JRadioButton seleccion1;
    private javax.swing.JRadioButton seleccion2;
    private javax.swing.JRadioButton seleccion3;
    private javax.swing.JRadioButton seleccion4;
    private javax.swing.JRadioButton seleccion5;
    // End of variables declaration//GEN-END:variables
}