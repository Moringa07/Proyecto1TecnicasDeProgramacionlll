
package vistas;


public class instruccionesPrueba extends javax.swing.JPanel {


    public instruccionesPrueba() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPantalla = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        barraColorTitulo = new javax.swing.JPanel();
        tituloInstrucciones = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        instruccion1 = new javax.swing.JLabel();
        instruccion2 = new javax.swing.JLabel();
        instruccion3 = new javax.swing.JLabel();
        instruccion3Continua = new javax.swing.JLabel();
        instruccion4 = new javax.swing.JLabel();
        exitosProgramador = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        fondoPantalla.setBackground(new java.awt.Color(228, 251, 251));
        fondoPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aceptar.setBackground(new java.awt.Color(255, 204, 0));
        aceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aceptar.setForeground(new java.awt.Color(0, 0, 0));
        aceptar.setText("Ingresar a la prueba");
        aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoPantalla.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 190, 40));

        regresar.setBackground(new java.awt.Color(15, 192, 255));
        regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regresar.setForeground(new java.awt.Color(0, 0, 0));
        regresar.setText("Regresar");
        regresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoPantalla.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 110, 40));

        barraColorTitulo.setBackground(new java.awt.Color(15, 192, 255));
        barraColorTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloInstrucciones.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloInstrucciones.setForeground(new java.awt.Color(0, 0, 0));
        tituloInstrucciones.setText("Instrucciones para la prueba ");
        barraColorTitulo.add(tituloInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 360, 50));

        fondoPantalla.add(barraColorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 880, 50));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        fondoPantalla.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 10, 300));

        instruccion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instruccion1.setForeground(new java.awt.Color(0, 0, 0));
        instruccion1.setText("1) Asegurese de leer bien la pregunta antes de responder.");
        fondoPantalla.add(instruccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        instruccion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instruccion2.setForeground(new java.awt.Color(0, 0, 0));
        instruccion2.setText("2) La prueba tiene una duración de 45 minutos en total.");
        fondoPantalla.add(instruccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 20));

        instruccion3.setBackground(new java.awt.Color(0, 0, 0));
        instruccion3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instruccion3.setForeground(new java.awt.Color(0, 0, 0));
        instruccion3.setText("3) Cuidado, las respuestas cuentan con distintos formatos");
        fondoPantalla.add(instruccion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 30));

        instruccion3Continua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instruccion3Continua.setForeground(new java.awt.Color(0, 0, 0));
        instruccion3Continua.setText("de selección.");
        fondoPantalla.add(instruccion3Continua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 200, 50));

        instruccion4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instruccion4.setForeground(new java.awt.Color(0, 0, 0));
        instruccion4.setText("4) La prueba cuenta con un total de 25 preguntas.");
        fondoPantalla.add(instruccion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 410, 60));

        exitosProgramador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exitosProgramador.setForeground(new java.awt.Color(0, 0, 0));
        exitosProgramador.setText("¡Éxitos programador!");
        fondoPantalla.add(exitosProgramador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/programador (1).png"))); // NOI18N
        fondoPantalla.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JPanel barraColorTitulo;
    private javax.swing.JLabel exitosProgramador;
    private javax.swing.JPanel fondoPantalla;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel instruccion1;
    private javax.swing.JLabel instruccion2;
    private javax.swing.JLabel instruccion3;
    private javax.swing.JLabel instruccion3Continua;
    private javax.swing.JLabel instruccion4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel tituloInstrucciones;
    // End of variables declaration//GEN-END:variables
}
