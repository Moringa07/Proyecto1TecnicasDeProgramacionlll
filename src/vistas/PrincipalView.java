package vistas;

import java.awt.Color;
import java.awt.Container;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.SECONDS;
import javax.swing.JOptionPane;
import modelos.Participante;
import modelos.Question;

public class PrincipalView extends javax.swing.JFrame {

    private ScheduledExecutorService ejecucionCronometro;
    private Participante participante;
    private Question[] preguntas;
    private Container container;
    private String tipoDePrueba;

    public void comenzarCronometro() {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {
            int tiempoPrueba = 60 * 45;

            public void run() {
                tiempoPrueba--;

                int currentMinute = tiempoPrueba / 60;
                int currentSecond = tiempoPrueba - (currentMinute * 60);

                String currentMinuteString = (currentMinute < 10) ? ("0" + String.valueOf(currentMinute)) : String.valueOf(currentMinute);
                String currentSecondString = (currentSecond < 10) ? ("0" + String.valueOf(currentSecond)) : String.valueOf(currentSecond);

                temporizador.setText(currentMinuteString + ":" + currentSecondString);

                if (tiempoPrueba <= 0) {
                    terminarCronometroTiempo();
                }
            }
        };
        ejecucionCronometro = scheduler;
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }

    public void terminarCronometro() {
        Respuestas resultados = new Respuestas(this.preguntas, 0, this.participante, this);
        resultados.setSize(880, 470);
        resultados.setVisible(true);

        Container padre = this.container;

        padre.removeAll();
        padre.add(resultados);
        padre.revalidate();
        padre.repaint();
        temporizador.setText("00:00");
        ejecucionCronometro.shutdown();
    }
    
    public void terminarCronometroTiempo() {
        ShowAlert alerta = new ShowAlert("Tiempo Acabado", "Se te acabo el tiempo, pasaron 45 minutos, se mostraran tus resultados",
                JOptionPane.INFORMATION_MESSAGE);

        Respuestas resultados = new Respuestas(this.preguntas, 0, this.participante, this);
        resultados.setSize(880, 470);
        resultados.setVisible(true);

        Container padre = this.container;

        padre.removeAll();
        padre.add(resultados);
        padre.revalidate();
        padre.repaint();
        temporizador.setText("00:00");
        ejecucionCronometro.shutdown();
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setPreguntas(Question[] preguntas) {
        this.preguntas = preguntas;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public void setTipoDePrueba(String tipo) {
        this.tipoDePrueba = tipo;
    }

    public String getTipoDePrueba() {
        return this.tipoDePrueba;
    }

    int xMouse, yMouse;

    public PrincipalView() {
        initComponents();
        setLocationRelativeTo(null);

        VentanaPrincipal login = new VentanaPrincipal(this);
        login.setSize(880, 470);
        content.add(login);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        PanelSalir = new javax.swing.JPanel();
        XSalir = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        temporizador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(228, 251, 251));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Header.setBackground(new java.awt.Color(228, 251, 251));
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeaderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        PanelSalir.setBackground(new java.awt.Color(228, 251, 251));
        PanelSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelSalir.setForeground(new java.awt.Color(255, 255, 255));
        PanelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSalirMouseClicked(evt);
            }
        });

        XSalir.setBackground(new java.awt.Color(60,63,65));
        XSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        XSalir.setForeground(new java.awt.Color(60, 63, 65));
        XSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XSalir.setText("X");
        XSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XSalir.setPreferredSize(new java.awt.Dimension(40, 40));
        XSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelSalirLayout = new javax.swing.GroupLayout(PanelSalir);
        PanelSalir.setLayout(PanelSalirLayout);
        PanelSalirLayout.setHorizontalGroup(
            PanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelSalirLayout.setVerticalGroup(
            PanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalirLayout.createSequentialGroup()
                .addComponent(XSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        content.setBackground(new java.awt.Color(228, 251, 251));
        content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        content.setMaximumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        temporizador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        temporizador.setText("00:00");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(temporizador)
                .addGap(25, 25, 25))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(temporizador)))
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 877, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        System.exit(0);
        System.out.println("Header");
    }//GEN-LAST:event_HeaderMousePressed

    private void XSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XSalirMouseClicked

    private void XSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XSalirMouseEntered
        PanelSalir.setBackground(Color.red);
        // XSalir.setForeground(Color.black);
    }//GEN-LAST:event_XSalirMouseEntered

    private void XSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XSalirMouseExited
        PanelSalir.setBackground(Color.white);
    }//GEN-LAST:event_XSalirMouseExited

    private void HeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseClicked
        System.exit(0);
    }//GEN-LAST:event_HeaderMouseClicked

    private void PanelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_PanelSalirMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel PanelSalir;
    private javax.swing.JLabel XSalir;
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JLabel temporizador;
    // End of variables declaration//GEN-END:variables
}
