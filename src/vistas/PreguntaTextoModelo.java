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

public class PreguntaTextoModelo extends javax.swing.JPanel {

    private Question[] preguntas;
    private int posicion;
    private Question preguntaActual;
    private Participante participante;
    private PrincipalView cronometro;

    public PreguntaTextoModelo(Question[] preguntas, int posicion, Participante participante, PrincipalView cronometro) {
        initComponents();

        this.preguntas = preguntas;
        this.posicion = posicion;
        this.preguntaActual = preguntas[posicion];
        this.participante = participante;
        this.cronometro = cronometro;

        pregunta.setText("<html><p style='font-size: 10px;'>" + preguntaActual.getPregunta() + "</p></html>");
        
        respuesta.setText(preguntaActual.getRespuestaTextoUsuarioo());

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeBotonesDerecho = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnFinalizarPrueba = new javax.swing.JButton();
        panelDeBotonesIzquierdos = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnCancelarPrueba = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        contenedorPreguntas = new javax.swing.JPanel();
        pregunta = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        panelOpciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        respuesta = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 255));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("* Responder con Texto");
        jLabel1.setToolTipText("");

        contenedor.setBackground(new java.awt.Color(204, 255, 255));
        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedor.setPreferredSize(new java.awt.Dimension(830, 830));
        contenedor.setLayout(new javax.swing.BoxLayout(contenedor, javax.swing.BoxLayout.Y_AXIS));

        contenedorPreguntas.setBackground(new java.awt.Color(204, 255, 255));
        contenedorPreguntas.setPreferredSize(new java.awt.Dimension(828, 346));

        pregunta.setBackground(new java.awt.Color(204, 255, 255));
        pregunta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pregunta.setPreferredSize(new java.awt.Dimension(100, 100));

        jScrollPane6.setBorder(null);
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelOpciones.setBackground(new java.awt.Color(204, 255, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelOpciones.setLayout(new javax.swing.BoxLayout(panelOpciones, javax.swing.BoxLayout.Y_AXIS));

        respuesta.setColumns(20);
        respuesta.setRows(5);
        jScrollPane1.setViewportView(respuesta);

        panelOpciones.add(jScrollPane1);

        jScrollPane6.setViewportView(panelOpciones);

        javax.swing.GroupLayout contenedorPreguntasLayout = new javax.swing.GroupLayout(contenedorPreguntas);
        contenedorPreguntas.setLayout(contenedorPreguntasLayout);
        contenedorPreguntasLayout.setHorizontalGroup(
            contenedorPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(contenedorPreguntasLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        contenedorPreguntasLayout.setVerticalGroup(
            contenedorPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPreguntasLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contenedor.add(contenedorPreguntas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(panelDeBotonesIzquierdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDeBotonesDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDeBotonesDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(panelDeBotonesIzquierdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addContainerGap()))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (this.posicion == 0) {
            return;
        }
        
        String res = respuesta.getText();
        
        this.preguntas[posicion].setRespuestaTextoUsuario(res);

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

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (this.posicion == 24) {
            return;
        }

        String res = respuesta.getText();
        
        this.preguntas[posicion].setRespuestaTextoUsuario(res);
        
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
            System.out.println(nuevaPregunta);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnFinalizarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPruebaActionPerformed
        ShowAlert alerta = new ShowAlert("Terminar Prueba", "¿Estas seguro de querer terminar la prueba?",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        int respuesta = alerta.getRespuesta();
        
        if(respuesta == 0){
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
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel contenedorPreguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panelDeBotonesDerecho;
    private javax.swing.JPanel panelDeBotonesIzquierdos;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JLabel pregunta;
    private javax.swing.JTextArea respuesta;
    // End of variables declaration//GEN-END:variables
}
