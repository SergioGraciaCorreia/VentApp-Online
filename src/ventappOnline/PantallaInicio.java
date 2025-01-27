package ventappOnline;
import ventappOnline.Ventas;
import ventappOnline.Almacen; 

/**
 * Clase PantallaInicio que representa la ventana inicial de la aplicación. 
 * Proporciona acceso a las funciones principales del sistema y permite 
 * la navegación hacia otras pantallas, como el manejo de ventas y almacén.
 */
public class PantallaInicio extends javax.swing.JFrame {

    public PantallaInicio() {
        initComponents(); // Inicializa las acciones de los botones Ventas y Almacén.
        
        // Acción para el botón de Ventas.
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirVentas(); // Llama al método para abrir la ventana de Ventas.
            }
        });

        // Acción para el botón de Almacén
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirAlmacen(); // Llama al método para abrir la ventana de Almacén.
            }
        });
    }

    private void abrirVentas() {
        new Ventas().setVisible(true); // Crea una nueva instancia de la clase Ventas.
        this.dispose(); // Cierra la ventana del menú principal.
    }

    private void abrirAlmacen() {
        new Almacen().setVisible(true); // Crea una nueva instancia de la clase Almacén.
        this.dispose(); // Cierra la ventana del menú principal.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        btnVentas.setBackground(new java.awt.Color(255, 0, 0));
        btnVentas.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnVentas);
        btnVentas.setBounds(550, 330, 203, 63);

        btnAlmacen.setBackground(new java.awt.Color(255, 0, 0));
        btnAlmacen.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnAlmacen.setText("Almacén ");
        btnAlmacen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAlmacen);
        btnAlmacen.setBounds(240, 330, 203, 63);

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-4, -4, 1012, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método Main.
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
