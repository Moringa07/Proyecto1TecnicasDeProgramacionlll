package vistas;

import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Participante;
import modelos.Preguntas;
import modelos.Question;

public class SeleccionarLenguaje extends javax.swing.JPanel {
    private Participante participante;
    private PrincipalView cronometro;
    
    public SeleccionarLenguaje(Participante participante, PrincipalView cronometro) {
        initComponents();

        this.participante = participante;
        this.cronometro = cronometro;
        
        radioButtonGroup.add(opcionJava);
        radioButtonGroup.add(opcionC);
        radioButtonGroup.add(opcioncmas);
        radioButtonGroup.add(opcionPython);
        radioButtonGroup.add(opcioncishar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        panelVentana2 = new javax.swing.JPanel();
        barraColorTitulo = new javax.swing.JPanel();
        tituloTipoDePrueba = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cMas = new javax.swing.JLabel();
        python = new javax.swing.JLabel();
        logo3 = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        cishar = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        opcioncmas = new javax.swing.JRadioButton();
        opcionPython = new javax.swing.JRadioButton();
        opcionJava = new javax.swing.JRadioButton();
        opcionC = new javax.swing.JRadioButton();
        opcioncishar = new javax.swing.JRadioButton();

        setAlignmentX(5.0F);
        setAlignmentY(5.0F);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(870, 470));

        panelVentana2.setBackground(new java.awt.Color(228, 251, 251));
        panelVentana2.setFocusCycleRoot(true);

        barraColorTitulo.setBackground(new java.awt.Color(15, 192, 255));
        barraColorTitulo.setPreferredSize(new java.awt.Dimension(100, 520));
        barraColorTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloTipoDePrueba.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloTipoDePrueba.setText("Seleccione el lenguaje de programación para su prueba");
        barraColorTitulo.add(tituloTipoDePrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        barraColorTitulo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -50, 40, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        barraColorTitulo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -50, -1, 40));

        cMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c-.png"))); // NOI18N

        python.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/denuevo.png"))); // NOI18N

        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java.png"))); // NOI18N

        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/letra-c.png"))); // NOI18N

        cishar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Csharp_Logo (4).png"))); // NOI18N

        Aceptar.setBackground(new java.awt.Color(15, 192, 255));
        Aceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(15, 192, 255));
        Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        opcioncmas.setBackground(new java.awt.Color(228, 251, 251));
        opcioncmas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        opcioncmas.setText("  C ++");
        opcioncmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcioncmasActionPerformed(evt);
            }
        });

        opcionPython.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        opcionPython.setText(" Python");
        opcionPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPythonActionPerformed(evt);
            }
        });

        opcionJava.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        opcionJava.setText(" Java");
        opcionJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionJavaActionPerformed(evt);
            }
        });

        opcionC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        opcionC.setText("  C");
        opcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCActionPerformed(evt);
            }
        });

        opcioncishar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        opcioncishar.setText(" C#");
        opcioncishar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcioncisharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVentana2Layout = new javax.swing.GroupLayout(panelVentana2);
        panelVentana2.setLayout(panelVentana2Layout);
        panelVentana2Layout.setHorizontalGroup(
            panelVentana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraColorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelVentana2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(cMas)
                .addGap(26, 26, 26)
                .addComponent(opcioncmas)
                .addGap(301, 301, 301)
                .addComponent(logo3)
                .addGap(16, 16, 16)
                .addComponent(opcionJava, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelVentana2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(python)
                .addGap(26, 26, 26)
                .addComponent(opcionPython)
                .addGap(25, 25, 25)
                .addComponent(cishar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(opcioncishar)
                .addGap(81, 81, 81)
                .addComponent(C)
                .addGap(16, 16, 16)
                .addComponent(opcionC))
            .addGroup(panelVentana2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelVentana2Layout.setVerticalGroup(
            panelVentana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentana2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(barraColorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelVentana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cMas))
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(opcioncmas))
                    .addComponent(logo3)
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(opcionJava)))
                .addGap(26, 26, 26)
                .addGroup(panelVentana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(python))
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(opcionPython))
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cishar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(opcioncishar))
                    .addComponent(C)
                    .addGroup(panelVentana2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(opcionC)))
                .addGap(17, 17, 17)
                .addGroup(panelVentana2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentana2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentana2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void opcioncmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcioncmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcioncmasActionPerformed

    private void opcionPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPythonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionPythonActionPerformed

    private void opcionJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionJavaActionPerformed

    }//GEN-LAST:event_opcionJavaActionPerformed

    private void opcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionCActionPerformed

    private void opcioncisharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcioncisharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcioncisharActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        VentanaPrincipal login = new VentanaPrincipal(this.cronometro);
        login.setSize(880, 470);
        login.setVisible(true);

        Container padre = this.getParent();

        padre.removeAll();
        padre.add(login);
        padre.repaint();
        padre.revalidate();
    }//GEN-LAST:event_RegresarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        Preguntas preguntas = null;
        if (opcioncmas.isSelected()) { // C++
            String path = new File(".").getAbsolutePath();
            path = path.substring(0, path.length() - 2);
            preguntas = new Preguntas(path + "\\src\\Preguntas\\preguntasC++.json");
            this.cronometro.setTipoDePrueba("C++");
        } else if (opcionC.isSelected()) { // C
            String path = new File(".").getAbsolutePath();
            path = path.substring(0, path.length() - 2);
            preguntas = new Preguntas(path + "\\src\\Preguntas\\preguntasC.json");
            this.cronometro.setTipoDePrueba("C");
        } else if (opcionJava.isSelected()) { // Java
            String path = new File(".").getAbsolutePath();
            path = path.substring(0, path.length() - 2);
            preguntas = new Preguntas(path + "\\src\\Preguntas\\preguntasJava.json");
            this.cronometro.setTipoDePrueba("Java");
        } else if (opcioncishar.isSelected()) { // C#
            String path = new File(".").getAbsolutePath();
            path = path.substring(0, path.length() - 2);
            preguntas = new Preguntas(path + "\\src\\Preguntas\\preguntasC#.json");
            this.cronometro.setTipoDePrueba("C#");
        } else if (opcionPython.isSelected()) { // Python
            String path = new File(".").getAbsolutePath();
            path = path.substring(0, path.length() - 2);
            preguntas = new Preguntas(path + "\\src\\Preguntas\\preguntasPython.json");
            this.cronometro.setTipoDePrueba("Python");
        } else { // Error
            ShowAlert alerta = new ShowAlert("Error", "No se ha seleccionado ningun lenguaje para la prueba :c", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Question[] listaDePreguntas = null;
        try {
            listaDePreguntas = preguntas.obtenerPreguntas();
        } catch (IOException ex) {
            Logger.getLogger(SeleccionarLenguaje.class.getName()).log(Level.SEVERE, null, ex);
        }

        Question[] preguntasPrueba = preguntas.pruebaAleatoria(listaDePreguntas, 25);
        this.cronometro.setPreguntas(preguntasPrueba);
        
        InstruccionesPrueba instruc = new InstruccionesPrueba(preguntasPrueba, this.participante, this.cronometro);
        instruc.setSize(880, 470);
        
        Container padre = this.getParent();

        padre.removeAll();
        padre.add(instruc);
        padre.repaint();
        padre.revalidate();
    }//GEN-LAST:event_AceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel C;
    private javax.swing.JButton Regresar;
    private javax.swing.JPanel barraColorTitulo;
    private javax.swing.JLabel cMas;
    private javax.swing.JLabel cishar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo3;
    private javax.swing.JRadioButton opcionC;
    private javax.swing.JRadioButton opcionJava;
    private javax.swing.JRadioButton opcionPython;
    private javax.swing.JRadioButton opcioncishar;
    private javax.swing.JRadioButton opcioncmas;
    private javax.swing.JPanel panelVentana2;
    private javax.swing.JLabel python;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JLabel tituloTipoDePrueba;
    // End of variables declaration//GEN-END:variables
}
