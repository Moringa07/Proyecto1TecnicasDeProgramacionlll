package vistas;

import java.awt.Container;
import javax.swing.JOptionPane;
import modelos.Participante;
import modelos.Question;

public class Pregunta2RespuestasModelo extends javax.swing.JPanel {

    private Question[] preguntas;
    private int posicion;
    private Question preguntaActual;
    private Participante participante;
    private PrincipalView cronometro;

    public Pregunta2RespuestasModelo(Question[] preguntas, int posicion, Participante participante, PrincipalView cronometro) {
        initComponents();

        this.preguntas = preguntas;
        this.posicion = posicion;
        this.preguntaActual = preguntas[posicion];
        this.participante = participante;
        this.cronometro = cronometro;

        pregunta3.setText("<html>" + preguntaActual.getPregunta() + "</html>");

        if (preguntaActual.getRespuestasDelUsuario().length > 0) {
            javax.swing.JRadioButton[] select = {seleccion16, seleccion17, seleccion18, seleccion19, seleccion20};
            for (int i = 0; i < preguntaActual.getRespuestasDelUsuario().length; i++) {
                int index = preguntaActual.getRespuestasDelUsuario()[i];
                if (index == -1) {
                    continue;
                }
                select[index].setSelected(true);
            }
        }

        seleccion16.setText(preguntaActual.getPosiblesRespuestas()[0]);
        seleccion17.setText(preguntaActual.getPosiblesRespuestas()[1]);
        seleccion18.setText(preguntaActual.getPosiblesRespuestas()[2]);

        if (preguntaActual.getPosiblesRespuestas().length <= 3) {
            seleccion19.setVisible(false);
            seleccion20.setVisible(false);
        } else if (preguntaActual.getPosiblesRespuestas().length == 4) {
            seleccion19.setText(preguntaActual.getPosiblesRespuestas()[3]);
            seleccion20.setVisible(false);
        } else {
            seleccion20.setText(preguntaActual.getPosiblesRespuestas()[4]);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        contenedorPreguntas = new javax.swing.JPanel();
        pregunta = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        panelOpciones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        seleccion1 = new javax.swing.JRadioButton();
        seleccion2 = new javax.swing.JRadioButton();
        seleccion3 = new javax.swing.JRadioButton();
        seleccion4 = new javax.swing.JRadioButton();
        seleccion5 = new javax.swing.JRadioButton();
        panelDeBotonesIzquierdos = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnCancelarPrueba = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contenedor3 = new javax.swing.JPanel();
        contenedorPreguntas3 = new javax.swing.JPanel();
        pregunta3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        panelOpciones3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        seleccion16 = new javax.swing.JRadioButton();
        seleccion17 = new javax.swing.JRadioButton();
        seleccion18 = new javax.swing.JRadioButton();
        seleccion19 = new javax.swing.JRadioButton();
        seleccion20 = new javax.swing.JRadioButton();
        panelDeBotonesDerecho = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnFinalizarPrueba = new javax.swing.JButton();

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
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelOpciones.setBackground(new java.awt.Color(204, 255, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelOpciones.setLayout(new javax.swing.BoxLayout(panelOpciones, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        seleccion1.setBackground(new java.awt.Color(204, 255, 255));
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
        seleccion2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion2.setText("Seleccion 4");
        seleccion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion2.setMargin(new java.awt.Insets(10, 10, 10, 10));

        seleccion3.setBackground(new java.awt.Color(204, 255, 255));
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
        seleccion5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion5.setText("Seleccion 5");
        seleccion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion5.setMargin(new java.awt.Insets(10, 10, 10, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(seleccion1)
                        .addComponent(seleccion2)
                        .addComponent(seleccion3)
                        .addComponent(seleccion4)
                        .addComponent(seleccion5))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
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

        panelOpciones.add(jPanel1);

        jScrollPane6.setViewportView(panelOpciones);

        javax.swing.GroupLayout contenedorPreguntasLayout = new javax.swing.GroupLayout(contenedorPreguntas);
        contenedorPreguntas.setLayout(contenedorPreguntasLayout);
        contenedorPreguntasLayout.setHorizontalGroup(
            contenedorPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addGroup(contenedorPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorPreguntasLayout.setVerticalGroup(
            contenedorPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6))
        );

        contenedor.add(contenedorPreguntas);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("* Seleccionar 2 opciones");
        jLabel1.setToolTipText("");

        contenedor3.setBackground(new java.awt.Color(204, 255, 255));
        contenedor3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedor3.setPreferredSize(new java.awt.Dimension(830, 830));
        contenedor3.setLayout(new javax.swing.BoxLayout(contenedor3, javax.swing.BoxLayout.Y_AXIS));

        contenedorPreguntas3.setBackground(new java.awt.Color(204, 255, 255));
        contenedorPreguntas3.setPreferredSize(new java.awt.Dimension(828, 346));

        pregunta3.setBackground(new java.awt.Color(204, 255, 255));
        pregunta3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pregunta3.setPreferredSize(new java.awt.Dimension(100, 100));

        jScrollPane9.setBorder(null);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelOpciones3.setBackground(new java.awt.Color(204, 255, 255));
        panelOpciones3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelOpciones3.setLayout(new javax.swing.BoxLayout(panelOpciones3, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        seleccion16.setBackground(new java.awt.Color(204, 255, 255));
        seleccion16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion16.setText("Seleccion 4");
        seleccion16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion16.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion16ActionPerformed(evt);
            }
        });

        seleccion17.setBackground(new java.awt.Color(204, 255, 255));
        seleccion17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion17.setText("Seleccion 4");
        seleccion17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion17.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion17ActionPerformed(evt);
            }
        });

        seleccion18.setBackground(new java.awt.Color(204, 255, 255));
        seleccion18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion18.setText("Seleccion 3");
        seleccion18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion18.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion18ActionPerformed(evt);
            }
        });

        seleccion19.setBackground(new java.awt.Color(204, 255, 255));
        seleccion19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion19.setText("Seleccion 4");
        seleccion19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion19.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion19ActionPerformed(evt);
            }
        });

        seleccion20.setBackground(new java.awt.Color(204, 255, 255));
        seleccion20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seleccion20.setText("Seleccion 5");
        seleccion20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seleccion20.setMargin(new java.awt.Insets(10, 10, 10, 10));
        seleccion20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccion16)
                    .addComponent(seleccion17)
                    .addComponent(seleccion18)
                    .addComponent(seleccion19)
                    .addComponent(seleccion20))
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(seleccion16)
                .addGap(0, 0, 0)
                .addComponent(seleccion17)
                .addGap(0, 0, 0)
                .addComponent(seleccion18)
                .addGap(0, 0, 0)
                .addComponent(seleccion19)
                .addGap(0, 0, 0)
                .addComponent(seleccion20)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        panelOpciones3.add(jPanel5);

        jScrollPane9.setViewportView(panelOpciones3);

        javax.swing.GroupLayout contenedorPreguntas3Layout = new javax.swing.GroupLayout(contenedorPreguntas3);
        contenedorPreguntas3.setLayout(contenedorPreguntas3Layout);
        contenedorPreguntas3Layout.setHorizontalGroup(
            contenedorPreguntas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPreguntas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane9)
        );
        contenedorPreguntas3Layout.setVerticalGroup(
            contenedorPreguntas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPreguntas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );

        contenedor3.add(contenedorPreguntas3);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(contenedor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(panelDeBotonesIzquierdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDeBotonesDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(contenedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelDeBotonesDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDeBotonesIzquierdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (this.posicion == 0) {
            return;
        }

        int[] arr = {-1, -1};

        if (seleccion16.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 0;
            } else {
                arr[1] = 0;
            }
        }
        if (seleccion17.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 1;
            } else {
                arr[1] = 1;
            }
        }
        if (seleccion18.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 2;
            } else {
                arr[1] = 2;
            }
        }
        if (seleccion19.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 3;
            } else {
                arr[1] = 3;
            }
        }
        if (seleccion20.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 4;
            } else {
                arr[1] = 4;
            }
        }

        this.preguntas[posicion].setRespuestasDelUsuario(arr);

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

    private void seleccion16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion16ActionPerformed
        int count = 0;
        
        if(seleccion16.isSelected()){
            count++;
        }
        
        if(seleccion17.isSelected()){
            count++;
        }
        
        if(seleccion18.isSelected()){
            count++;
        }
        
        if(seleccion19.isSelected()){
            count++;
        }
        
        if(seleccion20.isSelected()){
            count++;
        }
        
        if(count > 2){
            seleccion16.setSelected(false);
            ShowAlert alerta = new ShowAlert("Error", "Solo se puede elegir como maximo 2 opciones", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_seleccion16ActionPerformed

    private void seleccion18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion18ActionPerformed
        int count = 0;
        
        if(seleccion16.isSelected()){
            count++;
        }
        
        if(seleccion17.isSelected()){
            count++;
        }
        
        if(seleccion18.isSelected()){
            count++;
        }
        
        if(seleccion19.isSelected()){
            count++;
        }
        
        if(seleccion20.isSelected()){
            count++;
        }
        
        if(count > 2){
            seleccion18.setSelected(false);
            ShowAlert alerta = new ShowAlert("Error", "Solo se puede elegir como maximo 2 opciones", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_seleccion18ActionPerformed

    private void seleccion19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion19ActionPerformed
        int count = 0;
        
        if(seleccion16.isSelected()){
            count++;
        }
        
        if(seleccion17.isSelected()){
            count++;
        }
        
        if(seleccion18.isSelected()){
            count++;
        }
        
        if(seleccion19.isSelected()){
            count++;
        }
        
        if(seleccion20.isSelected()){
            count++;
        }
        
        if(count > 2){
            seleccion19.setSelected(false);
            ShowAlert alerta = new ShowAlert("Error", "Solo se puede elegir como maximo 2 opciones", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_seleccion19ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (this.posicion == 24) {
            return;
        }

        int[] arr = {-1, -1};

        if (seleccion16.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 0;
            } else {
                arr[1] = 0;
            }
        }
        if (seleccion17.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 1;
            } else {
                arr[1] = 1;
            }
        }
        if (seleccion18.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 2;
            } else {
                arr[1] = 2;
            }
        }
        if (seleccion19.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 3;
            } else {
                arr[1] = 3;
            }
        }
        if (seleccion20.isSelected()) {
            if (arr[0] == -1) {
                arr[0] = 4;
            } else {
                arr[1] = 4;
            }
        }

        this.preguntas[posicion].setRespuestasDelUsuario(arr);

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

    private void seleccion17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion17ActionPerformed
        int count = 0;
        
        if(seleccion16.isSelected()){
            count++;
        }
        
        if(seleccion17.isSelected()){
            count++;
        }
        
        if(seleccion18.isSelected()){
            count++;
        }
        
        if(seleccion19.isSelected()){
            count++;
        }
        
        if(seleccion20.isSelected()){
            count++;
        }
        
        if(count > 2){
            seleccion17.setSelected(false);
            ShowAlert alerta = new ShowAlert("Error", "Solo se puede elegir como maximo 2 opciones", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_seleccion17ActionPerformed

    private void seleccion20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion20ActionPerformed
        int count = 0;
        
        if(seleccion16.isSelected()){
            count++;
        }
        
        if(seleccion17.isSelected()){
            count++;
        }
        
        if(seleccion18.isSelected()){
            count++;
        }
        
        if(seleccion19.isSelected()){
            count++;
        }
        
        if(seleccion20.isSelected()){
            count++;
        }
        
        if(count > 2){
            seleccion20.setSelected(false);
            ShowAlert alerta = new ShowAlert("Error", "Solo se puede elegir como maximo 2 opciones", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_seleccion20ActionPerformed

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
    private javax.swing.JPanel contenedor3;
    private javax.swing.JPanel contenedorPreguntas;
    private javax.swing.JPanel contenedorPreguntas3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel panelDeBotonesDerecho;
    private javax.swing.JPanel panelDeBotonesIzquierdos;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelOpciones3;
    private javax.swing.JLabel pregunta;
    private javax.swing.JLabel pregunta3;
    private javax.swing.JRadioButton seleccion1;
    private javax.swing.JRadioButton seleccion16;
    private javax.swing.JRadioButton seleccion17;
    private javax.swing.JRadioButton seleccion18;
    private javax.swing.JRadioButton seleccion19;
    private javax.swing.JRadioButton seleccion2;
    private javax.swing.JRadioButton seleccion20;
    private javax.swing.JRadioButton seleccion3;
    private javax.swing.JRadioButton seleccion4;
    private javax.swing.JRadioButton seleccion5;
    // End of variables declaration//GEN-END:variables
}
