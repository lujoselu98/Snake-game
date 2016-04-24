/*----------------------------------------
Práctica de Metodología de la Programación
Hecha por: Carlos Vázquez Losada
----------------------------------------*/
package clases;

public class Opciones extends javax.swing.JFrame {

    public Opciones() {
        initComponents();
        // Elección del color de fondo
        eleccion1.add("Azul verdoso");
        eleccion1.add("Azul claro");
        eleccion1.add("Verde");
        eleccion1.add("Negro");
        eleccion1.add("Blanco");
        // Elección del color de la serpiente
        eleccion2.add("Rojo");
        eleccion2.add("Negro");
        eleccion2.add("Magenta");
        eleccion2.add("Marrón");
        eleccion2.add("Blanco");
        // Elección del color del trofeo 1
        eleccion3.add("Naranja");
        eleccion3.add("Verde oscuro");
        eleccion3.add("Amarillo");
        eleccion3.add("Gris");
        // Elección del color del trofeo 2
        eleccion4.add("Naranja");
        eleccion4.add("Verde oscuro");
        eleccion4.add("Amarillo");
        eleccion4.add("Gris");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        panelColorFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eleccion1 = new java.awt.Choice();
        panelColorSerpiente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        eleccion2 = new java.awt.Choice();
        panelColorTrofeo1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eleccion3 = new java.awt.Choice();
        panelColorTrofeo2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        eleccion4 = new java.awt.Choice();
        jPanel1 = new javax.swing.JPanel();
        AlmacenarCambios = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Opciones gráficas del juego");

        panelColorFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Color del fondo");

        javax.swing.GroupLayout panelColorFondoLayout = new javax.swing.GroupLayout(panelColorFondo);
        panelColorFondo.setLayout(panelColorFondoLayout);
        panelColorFondoLayout.setHorizontalGroup(
            panelColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColorFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eleccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColorFondoLayout.setVerticalGroup(
            panelColorFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorFondoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eleccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelColorSerpiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Color de la serpiente");

        javax.swing.GroupLayout panelColorSerpienteLayout = new javax.swing.GroupLayout(panelColorSerpiente);
        panelColorSerpiente.setLayout(panelColorSerpienteLayout);
        panelColorSerpienteLayout.setHorizontalGroup(
            panelColorSerpienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addGroup(panelColorSerpienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eleccion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColorSerpienteLayout.setVerticalGroup(
            panelColorSerpienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorSerpienteLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eleccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelColorTrofeo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Color del trofeo 1");

        javax.swing.GroupLayout panelColorTrofeo1Layout = new javax.swing.GroupLayout(panelColorTrofeo1);
        panelColorTrofeo1.setLayout(panelColorTrofeo1Layout);
        panelColorTrofeo1Layout.setHorizontalGroup(
            panelColorTrofeo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
            .addGroup(panelColorTrofeo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eleccion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColorTrofeo1Layout.setVerticalGroup(
            panelColorTrofeo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorTrofeo1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eleccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelColorTrofeo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Color del trofeo 2");

        javax.swing.GroupLayout panelColorTrofeo2Layout = new javax.swing.GroupLayout(panelColorTrofeo2);
        panelColorTrofeo2.setLayout(panelColorTrofeo2Layout);
        panelColorTrofeo2Layout.setHorizontalGroup(
            panelColorTrofeo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
            .addGroup(panelColorTrofeo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eleccion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColorTrofeo2Layout.setVerticalGroup(
            panelColorTrofeo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorTrofeo2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eleccion4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AlmacenarCambios.setBackground(new java.awt.Color(0, 153, 0));
        AlmacenarCambios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlmacenarCambios.setForeground(new java.awt.Color(255, 255, 255));
        AlmacenarCambios.setText("Almacenar cambios y arrancar");
        AlmacenarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenarCambiosActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlmacenarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AlmacenarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(panelColorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(panelColorSerpiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelColorTrofeo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(panelColorTrofeo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelColorFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelColorSerpiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelColorTrofeo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelColorTrofeo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaPrincipal pp=new PantallaPrincipal();
        pp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AlmacenarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenarCambiosActionPerformed
        // El tamaño del vector donde almacenaremos los resultados es 4 porque hay 4 opciones a editar
        String[] resultados=new String[4];
        resultados[0]=eleccion1.getSelectedItem();
        resultados[1]=eleccion2.getSelectedItem();
        resultados[2]=eleccion3.getSelectedItem();
        resultados[3]=eleccion4.getSelectedItem();
        PantallaPrincipal pp=new PantallaPrincipal();
        pp.setResultadosEnInterfaz(resultados);
    }//GEN-LAST:event_AlmacenarCambiosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlmacenarCambios;
    private java.awt.Choice eleccion1;
    private java.awt.Choice eleccion2;
    private java.awt.Choice eleccion3;
    private java.awt.Choice eleccion4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelColorFondo;
    private javax.swing.JPanel panelColorSerpiente;
    private javax.swing.JPanel panelColorTrofeo1;
    private javax.swing.JPanel panelColorTrofeo2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}