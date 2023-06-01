/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import modelos.Participante;
import modelos.Question;

/**
 *
 * @author claud
 */
public class Respuestas extends javax.swing.JPanel {

    private Question[] preguntas;
    private int pos;
    private Participante participante;
    private PrincipalView cronometro;

    public static String createMultiline(String str, int type) {
        String stringFinal = str;
        switch (type) {
            case 0:
                // Pregunta de Texto
                stringFinal = str.replace("|\n|", "<br>");
                break;
            case 1:
                int ultimoEspacio = 0;
                int ultimo = 0;

                System.out.println(stringFinal);
                for (int i = 0; i < stringFinal.length(); i++) {
                    if (i > ultimo + 100) { // No se que pasa pero funciona eso es lo importante
                        stringFinal = stringFinal.substring(0, ultimoEspacio) + "<br>" + stringFinal.substring(ultimoEspacio + 1);
                        ultimo = i;
                    }

                    if (stringFinal.toCharArray()[i] == ' ') {
                        ultimoEspacio = i;
                    }
                }
                break;
            default:
                stringFinal = "Error";
                break;
        }
        return stringFinal;
    }

    public static boolean comprobarRespuesta(Question pregunta) {
        String[] posiblesRespuestas = pregunta.getPosiblesRespuestas();

        if (posiblesRespuestas.length == 1) {
            String respuestaTexto = pregunta.getRespuestaTextoUsuarioo();

            return respuestaTexto.equalsIgnoreCase(posiblesRespuestas[0]);
        }

        int[] respuestasCorrectas = pregunta.getRespuestasCorrectas();
        int[] respuestasUsuario = pregunta.getRespuestasDelUsuario();

        if (respuestasCorrectas.length != respuestasUsuario.length) {
            return false;
        }

        if (posiblesRespuestas.length == 2 || respuestasCorrectas.length == 1) {
            return (respuestasUsuario[0] == respuestasCorrectas[0]);
        }

        if (respuestasCorrectas.length > 1 && respuestasCorrectas.length < 4) {
            Arrays.sort(respuestasCorrectas);
            Arrays.sort(respuestasUsuario);

            boolean equal = true;

            for (int i = 0; i < respuestasCorrectas.length; i++) {
                if (respuestasCorrectas[i] != respuestasUsuario[i]) {
                    equal = false;
                    break;
                }
            }

            return equal;
        }

        return false;
    }

    /**
     * Creates new form totalpreguntas1
     */
    public Respuestas(Question[] preguntas, int pos, Participante participante, PrincipalView cronometro) {
        Border bordeFalse = BorderFactory.createLineBorder(Color.red);
        Border bordeTrue = BorderFactory.createLineBorder(Color.green);
        this.cronometro = cronometro;

        initComponents();

        this.preguntas = preguntas;
        this.pos = pos;
        this.participante = participante;

        if (pos == 0) {
            atras.setVisible(false);
        }

        if (pos == 20) {
            siguiente.setVisible(false);
        } else {
            terminarRevision.setVisible(false);
        }

        for (int i = 0; i < 5; i++) {
            JPanel container = new JPanel();

            container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

            JLabel pregunta;
            
            if (preguntas[pos + i].getPosiblesRespuestas().length > 1) {
                pregunta = new JLabel("<html><div style='margin: 10px; font-size: 10px; font-weight: 600'>Pregunta N#" + (i + 1 + pos) + ": " + this.createMultiline(preguntas[pos + i].getPregunta(), 1));
            } else {
                pregunta = new JLabel("<html><div style='margin: 10px; font-size: 10px; font-weight: 600'>Pregunta N#" + (i + 1 + pos) + ": <br>" + this.createMultiline(preguntas[pos + i].getPregunta(), 0));
            }
            JPanel containerRes = new JPanel();
            containerRes.setLayout(new BoxLayout(containerRes, BoxLayout.Y_AXIS));

            System.out.println(preguntas[pos + i].getPosiblesRespuestas().length);

            if (preguntas[pos + i].getRespuestasDelUsuario().length > 0 && preguntas[pos + i].getRespuestasDelUsuario()[0] != -1) {
                if (preguntas[pos + i].getPosiblesRespuestas().length > 1) {
                    for (int j = 0; j < preguntas[pos + i].getRespuestasDelUsuario().length; j++) {
                        int index = preguntas[pos + i].getRespuestasDelUsuario()[j];

                        if (index == -1) {
                            continue;
                        }

                        JRadioButton checkbox = new JRadioButton();
                        checkbox.setText("<html><div style='font-weight: 600'><font color='#000000'>" + preguntas[pos + i].getPosiblesRespuestas()[index] + "</font></div></html>");
                        checkbox.setSelected(true);
                        checkbox.setEnabled(false);
                        checkbox.setMargin(new Insets(10, 10, 10, 10));
                        checkbox.setForeground(new Color(0, 0, 0));

                        containerRes.add(checkbox);
                    }
                }
            } else {
                JLabel incorrecto = new JLabel("<html><div style='margin: 10px'>No se ingreso ninguna respuesta</div></html>");
                containerRes.add(incorrecto);
            }

            if (Respuestas.comprobarRespuesta(preguntas[pos + i])) {
                containerRes.setBackground(new Color(11, 232, 129));
            } else {
                containerRes.setBackground(new Color(255, 118, 117));
            }
            container.setBackground(new Color(228, 251, 251));

            container.add(pregunta);
            container.add(containerRes);

            JSeparator separador = new JSeparator(JSeparator.HORIZONTAL);

            this.container.add(container);
            this.container.add(separador);
        }

        containerPadre.setBackground(new Color(228, 251, 251));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        tituloInterfaz = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        terminarRevision = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        containerPadre = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setBackground(new java.awt.Color(228, 251, 251));

        jPanel3.setBackground(new java.awt.Color(228, 251, 251));

        tituloInterfaz.setBackground(new java.awt.Color(228, 251, 251));
        tituloInterfaz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloInterfaz.setText("Preguntas presentadas en la prueba");

        jPanel1.setBackground(new java.awt.Color(228, 251, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        terminarRevision.setBackground(new java.awt.Color(255, 204, 0));
        terminarRevision.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        terminarRevision.setText("Terminar Revisión");
        terminarRevision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        terminarRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarRevisionActionPerformed(evt);
            }
        });
        jPanel1.add(terminarRevision, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        siguiente.setBackground(new java.awt.Color(255, 204, 0));
        siguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        siguiente.setText("Siguiente");
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 40));

        jPanel2.setBackground(new java.awt.Color(228, 251, 251));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setBackground(new java.awt.Color(255, 153, 153));
        atras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atras.setText("Atras");
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel2.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        containerPadre.setBackground(new java.awt.Color(228, 251, 251));
        containerPadre.setLayout(new javax.swing.BoxLayout(containerPadre, javax.swing.BoxLayout.Y_AXIS));

        container.setBackground(new java.awt.Color(228, 251, 251));
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.Y_AXIS));
        containerPadre.add(container);

        jScrollPane1.setViewportView(containerPadre);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tituloInterfaz)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloInterfaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        Respuestas respuesta = new Respuestas(this.preguntas, this.pos + 5, this.participante, this.cronometro);

        respuesta.setSize(880, 470);
        respuesta.setVisible(true);

        Container padre = this.getParent();

        padre.removeAll();
        padre.add(respuesta);
        padre.revalidate();
        padre.repaint();
    }//GEN-LAST:event_siguienteActionPerformed

    private void terminarRevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarRevisionActionPerformed
        datosFinalesPrueba finalizar = new datosFinalesPrueba(this.preguntas, this.participante, this.cronometro);

        finalizar.setSize(880, 470);
        finalizar.setVisible(true);

        Container padre = this.getParent();

        padre.removeAll();
        padre.add(finalizar);
        padre.revalidate();
        padre.repaint();
    }//GEN-LAST:event_terminarRevisionActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Respuestas respuesta = new Respuestas(this.preguntas, this.pos - 5, this.participante, this.cronometro);

        respuesta.setSize(880, 470);
        respuesta.setVisible(true);

        Container padre = this.getParent();

        padre.removeAll();
        padre.add(respuesta);
        padre.revalidate();
        padre.repaint();
    }//GEN-LAST:event_atrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JPanel container;
    private javax.swing.JPanel containerPadre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton terminarRevision;
    private javax.swing.JLabel tituloInterfaz;
    // End of variables declaration//GEN-END:variables
}
