/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Container;
import javax.swing.JOptionPane;
import modelos.Participante;
import modelos.Question;

/**
 *
 * @author claud
 */
public class Pregunta1RespuestaModelo extends javax.swing.JPanel {

    private Question[] preguntas;
    private int posicion;
    private Question preguntaActual;
    private Participante participante;
    private PrincipalView cronometro;

    /**
     * Creates new form pregunta2modelo
     */
    public Pregunta1RespuestaModelo(Question[] preguntas, int posicion, Participante participante, PrincipalView cronometro) {
        initComponents();

        this.preguntas = preguntas;
        this.posicion = posicion;
        this.preguntaActual = preguntas[posicion];
        this.participante = participante;
        this.cronometro = cronometro;

        pregunta.setText("<html>Pregunta N#" + (posicion + 1) + " " + preguntaActual.getPregunta() + "</html>");

        seleccion1.setText(preguntaActual.getPosiblesRespuestas()[0]);
        seleccion2.setText(preguntaActual.getPosiblesRespuestas()[1]);
        seleccion3.setText(preguntaActual.getPosiblesRespuestas()[2]);

        if (preguntaActual.getRespuestasDelUsuario().length > 0) {
            javax.swing.JRadioButton[] select = {seleccion1, seleccion2, seleccion3, seleccion4, seleccion5};
            select[preguntaActual.getRespuestasDelUsuario()[0]].setSelected(true);
        }

        if (preguntaActual.getPosiblesRespuestas().length <= 3) {
            seleccion4.setVisible(false);
            seleccion5.setVisible(false);
        } else if (preguntaActual.getPosiblesRespuestas().length == 4) {
            seleccion4.setText(preguntaActual.getPosiblesRespuestas()[3]);
            seleccion5.setVisible(false);
        } else {
            seleccion5.setText(preguntaActual.getPosiblesRespuestas()[4]);
        }

        if (posicion == 0) {
            btnAtras.setVisible(false);
        } else {
            btnCancelarPrueba.setVisible(false);
        }

        if (posicion == preguntas.length - 1) {
            btnSiguiente.setVisible(false);
        } else {
            btnFinalizarPrueba.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelDeBotonesIzquierdos = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnCancelarPrueba = new javax.swing.JButton();
        tipoDePregunta = new javax.swing.JLabel();
        contenedor4 = new javax.swing.JPanel();
        contenedorPreguntas4 = new javax.swing.JPanel();
        pregunta = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        panelOpciones4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        seleccion1 = new javax.swing.JRadioButton();
        seleccion2 = new javax.swing.JRadioButton();
        seleccion3 = new javax.swing.JRadioButton();
        seleccion4 = new javax.swing.JRadioButton();
        seleccion5 = new javax.swing.JRadioButton();
        panelDeBotonesDerecho = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnFinalizarPrueba = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        panelDeBotonesIzquierdos.setBackground(new java.awt.Color(204, 255, 255));
        panelDeBotonesIzquierdos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setBackground(new java.awt.Color(15, 192, 255));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        panelDeBotonesIzquierdos.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 50));

        btnCancelarPrueba.setBackground(new java.awt.Color(15, 192, 255));
        btnCancelarPrueba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarPrueba.setText("Cancelar Prueba");
        btnCancelarPrueba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPruebaActionPerformed(evt);
            }
        });
        panelDeBotonesIzquierdos.add(btnCancelarPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        tipoDePregunta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipoDePregunta.setForeground(new java.awt.Color(255, 0, 51));
        tipoDePregunta.setText("* Seleccionar una opción");
        tipoDePregunta.setToolTipText("");

        contenedor4.setBackground(new java.awt.Color(204, 255, 255));
        contenedor4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedor4.setPreferredSize(new java.awt.Dimension(830, 830));
        contenedor4.setLayout(new javax.swing.BoxLayout(contenedor4, javax.swing.BoxLayout.Y_AXIS));

        contenedorPreguntas4.setBackground(new java.awt.Color(204, 255, 255));
        contenedorPreguntas4.setPreferredSize(new java.awt.Dimension(828, 346));

        pregunta.setBackground(new java.awt.Color(204, 255, 255));
        pregunta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pregunta.setPreferredSize(new java.awt.Dimension(100, 100));

        jScrollPane10.setBorder(null);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelOpciones4.setBackground(new java.awt.Color(204, 255, 255));
        panelOpciones4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelOpciones4.setLayout(new javax.swing.BoxLayout(panelOpciones4, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        seleccion1.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(seleccion1);
        seleccion1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion1.setText("Seleccion 4");
        seleccion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion1ActionPerformed(evt);
            }
        });

        seleccion2.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(seleccion2);
        seleccion2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion2.setText("Seleccion 4");
        seleccion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion2.setMargin(new java.awt.Insets(10, 10, 10, 10));

        seleccion3.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(seleccion3);
        seleccion3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion3.setText("Seleccion 3");
        seleccion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion3ActionPerformed(evt);
            }
        });

        seleccion4.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(seleccion4);
        seleccion4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion4.setText("Seleccion 4");
        seleccion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion4ActionPerformed(evt);
            }
        });

        seleccion5.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(seleccion5);
        seleccion5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion5.setText("Seleccion 5");
        seleccion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion5.setMargin(new java.awt.Insets(10, 10, 10, 10));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(seleccion1)
                        .addComponent(seleccion2)
                        .addComponent(seleccion3)
                        .addComponent(seleccion4)
                        .addComponent(seleccion5))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(seleccion1)
                    .addGap(0, 0, 0)
                    .addComponent(seleccion2)
                    .addGap(0, 0, 0)
                    .addComponent(seleccion3)
                    .addGap(0, 0, 0)
                    .addComponent(seleccion4)
                    .addGap(0, 0, 0)
                    .addComponent(seleccion5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelOpciones4.add(jPanel6);

        jScrollPane10.setViewportView(panelOpciones4);

        javax.swing.GroupLayout contenedorPreguntas4Layout = new javax.swing.GroupLayout(contenedorPreguntas4);
        contenedorPreguntas4.setLayout(contenedorPreguntas4Layout);
        contenedorPreguntas4Layout.setHorizontalGroup(
            contenedorPreguntas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPreguntas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane10)
        );
        contenedorPreguntas4Layout.setVerticalGroup(
            contenedorPreguntas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPreguntas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );

        contenedor4.add(contenedorPreguntas4);

        panelDeBotonesDerecho.setBackground(new java.awt.Color(204, 255, 255));
        panelDeBotonesDerecho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguiente.setBackground(new java.awt.Color(15, 192, 255));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        panelDeBotonesDerecho.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 50));

        btnFinalizarPrueba.setBackground(new java.awt.Color(15, 192, 255));
        btnFinalizarPrueba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinalizarPrueba.setText("Finalizar Prueba");
        btnFinalizarPrueba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPruebaActionPerformed(evt);
            }
        });
        panelDeBotonesDerecho.add(btnFinalizarPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(panelDeBotonesIzquierdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDeBotonesDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipoDePregunta)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(contenedor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(contenedor4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tipoDePregunta)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelDeBotonesDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDeBotonesIzquierdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (this.posicion == 0) {
            return;
        }

        if (seleccion1.isSelected()) {
            int[] arr = {0};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion2.isSelected()) {
            int[] arr = {1};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion3.isSelected()) {
            int[] arr = {2};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion4.isSelected()) {
            int[] arr = {3};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion5.isSelected()) {
            int[] arr = {4};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        }

        Question[] preguntasPrueba = this.preguntas;
        Question nuevaPregunta = preguntasPrueba[this.posicion - 1];

        if (nuevaPregunta.getPosiblesRespuestas().length == 1) {
            PreguntaTextoModelo pregunta = new PreguntaTextoModelo(preguntasPrueba, this.posicion - 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getPosiblesRespuestas().length == 2) {
            PreguntaTrueOrFalseModelo pregunta = new PreguntaTrueOrFalseModelo(preguntasPrueba, this.posicion - 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getRespuestasCorrectas().length == 1) {
            Pregunta1RespuestaModelo pregunta = new Pregunta1RespuestaModelo(preguntasPrueba, this.posicion - 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getRespuestasCorrectas().length == 2) {
            Pregunta2RespuestasModelo pregunta = new Pregunta2RespuestasModelo(preguntasPrueba, this.posicion - 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getRespuestasCorrectas().length == 3) {
            Pregunta3RespuestasModelo pregunta = new Pregunta3RespuestasModelo(preguntasPrueba, this.posicion - 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else {
            ShowAlert alerta = new ShowAlert("Error, tipo de pregunta no valida", "Tipo de pregunta no valida", JOptionPane.ERROR_MESSAGE);
            System.out.println(nuevaPregunta);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCancelarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPruebaActionPerformed
        ShowAlert alerta = new ShowAlert("Advertencia", "¿Seguro que quieres cancelar la prueba?, perderas todo el progreso que llevas",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (alerta.getRespuesta() == 0) {
            Container padre = this.getParent();

            SeleccionarLenguaje lenguaje = new SeleccionarLenguaje(this.participante, this.cronometro);
            lenguaje.setSize(880, 470);
            lenguaje.setVisible(true);

            padre.removeAll();
            padre.add(lenguaje);
            padre.revalidate();
            padre.repaint();
        }
    }//GEN-LAST:event_btnCancelarPruebaActionPerformed

    private void seleccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccion1ActionPerformed

    private void seleccion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccion3ActionPerformed

    private void seleccion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccion4ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (this.posicion == 24) {
            return;
        }

        if (seleccion1.isSelected()) {
            int[] arr = {0};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion2.isSelected()) {
            int[] arr = {1};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion3.isSelected()) {
            int[] arr = {2};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion4.isSelected()) {
            int[] arr = {3};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        } else if (seleccion5.isSelected()) {
            int[] arr = {4};
            preguntas[posicion].setRespuestasDelUsuario(arr);
        }

        Question[] preguntasPrueba = this.preguntas;
        Question nuevaPregunta = preguntasPrueba[this.posicion + 1];

        if (nuevaPregunta.getPosiblesRespuestas().length == 1) {
            PreguntaTextoModelo pregunta = new PreguntaTextoModelo(preguntasPrueba, this.posicion + 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getPosiblesRespuestas().length == 2) {
            PreguntaTrueOrFalseModelo pregunta = new PreguntaTrueOrFalseModelo(preguntasPrueba, this.posicion + 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getRespuestasCorrectas().length == 1) {
            Pregunta1RespuestaModelo pregunta = new Pregunta1RespuestaModelo(preguntasPrueba, this.posicion + 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getRespuestasCorrectas().length == 2) {
            Pregunta2RespuestasModelo pregunta = new Pregunta2RespuestasModelo(preguntasPrueba, this.posicion + 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else if (nuevaPregunta.getRespuestasCorrectas().length == 3) {
            Pregunta3RespuestasModelo pregunta = new Pregunta3RespuestasModelo(preguntasPrueba, this.posicion + 1, this.participante, this.cronometro);
            pregunta.setSize(880, 470);
            pregunta.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(pregunta);
            padre.revalidate();
            padre.repaint();
        } else {
            ShowAlert alerta = new ShowAlert("Error, tipo de pregunta no valida", "Tipo de pregunta no valida", JOptionPane.ERROR_MESSAGE);
            System.out.println(nuevaPregunta.getPregunta());
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnFinalizarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPruebaActionPerformed
        ShowAlert alerta = new ShowAlert("Terminar Prueba", "¿Estas seguro de querer terminar la prueba?",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        int respuesta = alerta.getRespuesta();
        
        if(respuesta == 0){
            this.cronometro.terminarCronometro();
            Respuestas resultados = new Respuestas(this.preguntas, 0, this.participante, this.cronometro);
            resultados.setSize(880, 470);
            resultados.setVisible(true);

            Container padre = this.getParent();

            padre.removeAll();
            padre.add(resultados);
            padre.revalidate();
            padre.repaint();
        }
    }//GEN-LAST:event_btnFinalizarPruebaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelarPrueba;
    private javax.swing.JButton btnFinalizarPrueba;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel contenedor4;
    private javax.swing.JPanel contenedorPreguntas4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JPanel panelDeBotonesDerecho;
    private javax.swing.JPanel panelDeBotonesIzquierdos;
    private javax.swing.JPanel panelOpciones4;
    private javax.swing.JLabel pregunta;
    private javax.swing.JRadioButton seleccion1;
    private javax.swing.JRadioButton seleccion2;
    private javax.swing.JRadioButton seleccion3;
    private javax.swing.JRadioButton seleccion4;
    private javax.swing.JRadioButton seleccion5;
    private javax.swing.JLabel tipoDePregunta;
    // End of variables declaration//GEN-END:variables
}
