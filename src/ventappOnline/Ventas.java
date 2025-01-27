package ventappOnline;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;


/**
 * Clase Ventas que representa la interfaz principal de la aplicación 
 * de ventas, donde se gestionan las operaciones relacionadas con 
 * la venta de productos, incluyendo la adición de productos a la 
 * venta, cálculo de totales y manejo de la tabla de productos.
 */
public class Ventas extends javax.swing.JFrame {

    
    public Ventas() {
        initComponents();
    }

    int fila = 0;
    double total = 0.00; // global, para reiniciar txt correspondiente;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        btnPagar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        comboMonedas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 81, 24));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 102, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 195, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 90, 24));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 80, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 54, 90, 20));

        txtId.setText("jTextField1");
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 0, -1));

        jTableProductos.setBackground(new java.awt.Color(204, 204, 204));
        jTableProductos.setForeground(new java.awt.Color(0, 0, 0));
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 112, 427, 310));

        btnPagar.setBackground(new java.awt.Color(255, 0, 0));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Pagar");
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 460, 90, 30));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 427, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 427, 50, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 460, 0, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar producto seleccionado");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 427, 250, 30));

        btnInicio.setBackground(new java.awt.Color(255, 0, 0));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Volver a Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 527, 160, 40));

        btnGenerarFactura.setBackground(new java.awt.Color(255, 0, 0));
        btnGenerarFactura.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGenerarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 160, 30));

        jPanel1.setBackground(new java.awt.Color(84, 107, 107));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        comboMonedas.setBackground(new java.awt.Color(255, 255, 255));
        comboMonedas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "GBP", "JPY" }));
        comboMonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMonedasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Conversor de divisas.");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(comboMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 112, 490, 310));

        jPanel3.setBackground(new java.awt.Color(103, 132, 132));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondo oscuro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        
    }//GEN-LAST:event_txtTotalActionPerformed

    
    // Método para manejar el evento al presionar una tecla en el campo de texto 'txtCodigo'.
    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed

    // Si la tecla presionada es 'Enter'.
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        // Verificar que el campo de texto 'txtCodigo' no esté vacío.
        if (!"".equals(txtCodigo.getText())) {
            try {

                // Establecer la conexión a la base de datos.
                Connection conexion = ConexionBDVentApp.getConexion();

                // Preparar la consulta SQL para buscar el producto por su código.
                PreparedStatement consulta = conexion.prepareStatement(
                        "SELECT id, nombre, precio FROM productos WHERE codigo=?");

                // Asignar el valor del campo de texto 'txtCodigo' al parámetro de la consulta.
                consulta.setString(1, txtCodigo.getText());

                // Ejecutar la consulta y obtener los resultados.
                ResultSet resultado = consulta.executeQuery();

                // Si se encuentra el producto.
                if (resultado.next()) {
                    // Llenar los campos con la información del producto encontrado.
                    txtId.setText(resultado.getString("id"));
                    txtNombre.setText(resultado.getString("nombre"));
                    txtPrecio.setText(resultado.getString("precio"));

                    // Mover el foco al campo de texto 'txtCantidad' para ingresar la cantidad.
                    txtCantidad.requestFocusInWindow();
                } else {
                    // Mostrar mensaje si no se encuentra el producto.
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                }

            } catch (Exception ex) {
                // Mostrar mensaje de error en caso de excepción.
                JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
            }
        }
    }

    }//GEN-LAST:event_txtCodigoKeyPressed

    // Método para manejar el evento al presionar una tecla en el campo de texto 'txtCantidad'.
    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed

    // Si la tecla presionada es 'Enter'.
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        // Verificar que el campo de texto 'txtCantidad' no esté vacío.
        if (!"".equals(txtCantidad.getText())) {
            try {

                // Obtener el precio y la cantidad ingresada.
                double precio = Double.parseDouble(txtPrecio.getText());
                int cantidad = Integer.parseInt(txtCantidad.getText());
                int existencias = 0;  // Variable para almacenar las existencias.

                // Establecer la conexión a la base de datos.
                Connection conexion = ConexionBDVentApp.getConexion();

                // Preparar la consulta SQL para obtener las existencias del producto por su id.
                PreparedStatement consulta = conexion.prepareStatement(
                        "SELECT existencias FROM productos WHERE id=?");

                // Asignar el valor del campo de texto 'txtId' al parámetro de la consulta.
                consulta.setString(1, txtId.getText()); 
                ResultSet resultado = consulta.executeQuery();

                // Si se encuentra el producto, obtener sus existencias.
                if (resultado.next()) {
                    existencias = resultado.getInt("existencias");
                } else {
                    // Mostrar mensaje si no se encuentra el producto y detener la ejecución.
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    return; // Salir del método si no se encuentra el producto.
                }

                // Verificar si hay suficientes existencias.
                if (existencias >= cantidad) {
                    // Obtener el modelo de la tabla y añadir una nueva fila temporalmente.
                    DefaultTableModel tablaTemporal = (DefaultTableModel) jTableProductos.getModel();
                    tablaTemporal.addRow(new Object[1]);  // Añadir una fila en blanco.
                    
                    // Llenar las celdas de la fila con los datos del producto.
                    int columna = 0;  // Columna inicial (primera columna).
                    jTableProductos.setValueAt(txtCodigo.getText(), fila, columna); // Código del producto.
                    columna++;
                    jTableProductos.setValueAt(txtNombre.getText(), fila, columna); // Nombre del producto.
                    columna++;
                    jTableProductos.setValueAt(txtCantidad.getText(), fila, columna); // Cantidad.
                    columna++;
                    double importe = precio * cantidad;  // Calcular el importe total.
                    jTableProductos.setValueAt(importe, fila, columna);  // Asignar el importe total.

                    // Incrementar el índice de la fila para la próxima entrada.
                    fila++;
                    limpiarCajas();  // Limpiar los campos de entrada.
                    actualizarPago();  // Actualizar el total de la venta.
                    txtCodigo.requestFocusInWindow();  // Mover el foco al campo 'txtCodigo' para la siguiente entrada.
                } else {
                    // Mostrar mensaje si no hay suficientes existencias.
                    JOptionPane.showMessageDialog(null, "No hay suficientes existencias.");
                }

            } catch (Exception ex) {
                // Mostrar mensaje de error en caso de excepción y mostrar detalles los detalles de ésta.
                JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                ex.printStackTrace();
            }
        }
    }


    }//GEN-LAST:event_txtCantidadKeyPressed

    // Método del botón "Eliminar" para borrar un producto seleccionado.
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    // Obtener el modelo de la tabla de productos.
    DefaultTableModel modeloTabla = (DefaultTableModel) jTableProductos.getModel();
    
    // Eliminar la fila seleccionada de la tabla.
    int filaSeleccionada = jTableProductos.getSelectedRow();
    if (filaSeleccionada != -1) { // Verificar que se ha seleccionado una fila.
        modeloTabla.removeRow(filaSeleccionada);
        fila--; // Disminuir el contador de filas.

        // Actualizar el total del pago después de eliminar un producto.
        actualizarPago();

        // Volver a enfocar el campo de código para ingresar otro producto.
        txtCodigo.requestFocusInWindow();
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona un producto para eliminar."); // Mensaje si no hay selección.
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed

    // Comprobar si no hay artículos en la venta.
    if (fila == 0) {
        JOptionPane.showMessageDialog(null, "No hay artículos en la venta."); 
    } else {
        try {
            int idVenta = 0;

            // Conexión a la base de datos.
            Connection con = ConexionBDVentApp.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO ventas (total, fecha) VALUES (?, NOW())", Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, total);

            // Ejecutar la inserción.
            ps.executeUpdate();

            // Obtener la clave generada para la nueva venta.
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) { // Verificar si se generó una clave.
                idVenta = resultado.getInt(1);
            }

            // Comprobar si la venta se guardó correctamente.
            if (idVenta == 0) {
                JOptionPane.showMessageDialog(null, "Error al guardar la venta.");
                return;
            }

            // Agregar productos a la venta.
            agregaProductos(idVenta);

            // Limpiar campos y tabla.
            limpiarCajas();
            limpiarTabla();
            total = 0.00;
            txtTotal.setText("0.00");

            // Mostrar mensaje de confirmación.
            JOptionPane.showMessageDialog(null, "Venta completada.");
            txtCodigo.requestFocus(); // Volver al campo de código

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString()); // Mostrar mensaje de error.
            ex.printStackTrace(); 
        }
    }
    }//GEN-LAST:event_btnPagarActionPerformed

    // Método del botón "Inicio" para volver a la pantalla de inicio.
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // Cerrar la ventana actual.
        this.dispose();

        // Crear una nueva instancia de PantallaInicio.
        PantallaInicio inicio = new PantallaInicio();

        // Hacerla visible.
        inicio.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    // Método del botón "Generar Factura" para crear y mostrar una factura en PDF.
    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed

    // Ruta del archivo PDF.
    String path = "./factura.pdf"; // Guardar el PDF en la carpeta donde se esté ejecutando el JAR.

    try (
        // Inicializamos los recursos con try-with-resources.
        FileOutputStream outputStream = new FileOutputStream(path);
        PdfWriter writer = new PdfWriter(outputStream);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
    ) {
        // Capturar de los datos de la tabla.
        DefaultTableModel model = (DefaultTableModel) jTableProductos.getModel();
        int rowCount = model.getRowCount();
        
        // Imprimir los valores capturados para comprobar que todo está correcto.
        for (int i = 0; i < rowCount; i++) {
            String codigo = model.getValueAt(i, 0).toString();
            String nombre = model.getValueAt(i, 1).toString();
            String cantidad = model.getValueAt(i, 2).toString();
            String precio = model.getValueAt(i, 3).toString();

            System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio);
        }

        // Añadir contenido al PDF.
        document.setFontSize(12);
        document.add(new Paragraph("Factura de Venta").setFontSize(20).setBold());
        document.add(new Paragraph("Detalles de la venta...").setMarginBottom(10));
        
        // Capturar la fecha actual.
        String fechaActual = java.time.LocalDate.now().toString(); // Captura la fecha en formato YYYY-MM-DD.
        document.add(new Paragraph("Fecha: " + fechaActual).setFontSize(12).setMarginBottom(10)); // Agregar la fecha al documento.

        // Crear la tabla con 4 columnas.
        float[] columnWidths = {1, 3, 1, 1}; 
        Table table = new Table(columnWidths);
        
        // Añadir las cabeceras de la tabla.
        table.addHeaderCell(new Cell().add(new Paragraph("Código").setBold()));
        table.addHeaderCell(new Cell().add(new Paragraph("Nombre").setBold()));
        table.addHeaderCell(new Cell().add(new Paragraph("Cantidad").setBold()));
        table.addHeaderCell(new Cell().add(new Paragraph("Precio").setBold()));

        // Iterar sobre las filas de la tabla y añadirlas a la tabla PDF.
        for (int i = 0; i < rowCount; i++) {
            String codigo = model.getValueAt(i, 0).toString();
            String nombre = model.getValueAt(i, 1).toString();
            String cantidad = model.getValueAt(i, 2).toString();
            String precio = model.getValueAt(i, 3).toString();

            // Añadir las celdas.
            table.addCell(codigo);
            table.addCell(nombre);
            table.addCell(cantidad);
            table.addCell(precio);
        }

        // Agregar la tabla al documento.
        document.add(table.setMarginBottom(10));

        // Obtener el importe total desde el JTextField externo.
        String importeTotal = txtTotal.getText();
        
        // Obtener la moneda seleccionada.
        String monedaSeleccionada = comboMonedas.getSelectedItem().toString();

        // Añadir el importe total y la moneda al documento.
        document.add(new Paragraph("\nImporte Total: " + importeTotal + " " + monedaSeleccionada).setBold().setFontSize(14));

        JOptionPane.showMessageDialog(null, "Factura generada correctamente.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al generar la factura: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    // Método del combo box "Monedas" para cambiar la moneda seleccionada.
    private void comboMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMonedasActionPerformed
        actualizarPreciosSegunMoneda();  // Llamar a la función para actualizar los precios.
    }//GEN-LAST:event_comboMonedasActionPerformed
    
    // Método para actualizar los precios de los productos según la moneda seleccionada.
    private void actualizarPreciosSegunMoneda() {
    String monedaSeleccionada = comboMonedas.getSelectedItem().toString();
    String apiKey = "afe7a97541655a1d8e4e5297";  // Reemplazar con tu clave API si es necesario.
    String baseCurrency = "EUR";   // Moneda por defecto = EUR (Euro).

    try {
        // URL de la API con la moneda por defecto y la moneda seleccionada.
        String urlStr = "https://api.exchangerate-api.com/v4/latest/" + baseCurrency;
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Leer la respuesta de la API.
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        // Cerrar las conexiones.
        in.close();
        conn.disconnect();

        // Convertir la respuesta JSON en un objeto.
        JSONObject json = new JSONObject(content.toString());

        // Extraer el tipo de cambio para la moneda seleccionada.
        double tipoCambio = json.getJSONObject("rates").getDouble(monedaSeleccionada);
        System.out.println("Tipo de cambio para " + monedaSeleccionada + ": " + tipoCambio);

        // Conversión de los precios con el tipo de cambio.
        actualizarPreciosConTipoCambio(tipoCambio);

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al obtener los datos de la API: " + e.getMessage());
    }
}

// Método para actualizar los precios de los productos utilizando un tipo de cambio proporcionado.
private void actualizarPreciosConTipoCambio(double tipoCambio) {
    System.out.println("Convertir los precios con el tipo de cambio: " + tipoCambio);
    double total = 0.0;
    DefaultTableModel modelo = (DefaultTableModel) jTableProductos.getModel();
    int numeroFilas = modelo.getRowCount();

    for (int i = 0; i < numeroFilas; i++) {
        Object precioCelda = modelo.getValueAt(i, 3); // Valor de la celda de precio.
        if (precioCelda != null) {
            try {
                double precioOriginal = Double.parseDouble(precioCelda.toString());
                double precioConvertido = calcularNuevoPrecio(precioOriginal, tipoCambio); // Aplicar el tipo de cambio.

                // Actualizar el precio en la tabla.
                modelo.setValueAt(formatearPrecio(precioConvertido), i, 3);
                total += precioConvertido; // Sumar el nuevo precio al total.
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al calcular el precio en la fila " + (i + 1) + ": " + precioCelda);
            }
        }
    }

    // Actualizar el campo de texto con el total de precios convertidos.
    txtTotal.setText(formatearPrecio(total));
}

private double calcularNuevoPrecio(double precioOriginal, double tipoCambio) {
    return precioOriginal * tipoCambio;
}

private String formatearPrecio(double precio) {
    return String.format("%.2f", precio);
}



    // Limpiar todos los campos de texto en la interfaz.
    private void limpiarCajas() {
        txtCodigo.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");

    }

    // Método para calcular y actualizar el total de pago basado en los importes de los productos en la tabla.
    private void actualizarPago() {
        total = 0.00; // Reiniciar el total a 0.

        int numeroFilas = jTableProductos.getRowCount();

        for (int a = 0; a < numeroFilas; a++) {
            Object valorImporte = jTableProductos.getModel().getValueAt(a, 3); // Obtener el valor de la columna 4 (índice 3).

            // Comprobar si el valor es nulo o vacío antes de convertirlo.
            if (valorImporte != null && !valorImporte.toString().isEmpty()) {
                try {
                    total = total + Double.parseDouble(valorImporte.toString());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error en el formato del importe en la fila " + (a + 1));

                }
            }
        }

        // Actualizar el campo de texto con el total formateado.
        txtTotal.setText(String.format("%.2f", total));
    }

    // Método para agregar productos a una venta en la base de datos según el ID de venta y los productos listados en la tabla.
    private void agregaProductos(int idVenta) {
        double precioProducto; // Precio del producto.
        int idProducto, cantidadProducto; // Identificador y cantidad del producto.
        String codigoProducto, nombreProducto; // Código y nombre del producto.

        Connection conexion = ConexionBDVentApp.getConexion(); // Obtener conexión con la base de datos.
        int totalFilas = jTableProductos.getRowCount(); // Número total de filas en la tabla.

        System.out.println("Filas en jTable antes de agregar productos: " + totalFilas);

        // Iterar sobre las filas de la tabla de productos.
        for (int fila = 0; fila < totalFilas; fila++) {
            codigoProducto = (String) jTableProductos.getValueAt(fila, 0); // Obtener código del producto.

            // Validar que el código no esté vacío.
            if (codigoProducto == null || codigoProducto.isEmpty()) {
                System.out.println("Código vacío en fila: " + fila);
                continue; // Saltar a la siguiente iteración si es vacío.
            }

            try {
                // Preparar consulta para obtener el producto por código.
                PreparedStatement psConsulta = conexion.prepareStatement("SELECT id, nombre, precio FROM productos WHERE codigo =?");
                psConsulta.setString(1, codigoProducto);
                ResultSet resultadoConsulta = psConsulta.executeQuery();

                // Verificar que haya resultados.
                if (!resultadoConsulta.next()) {
                    System.out.println("Producto no encontrado para el código: " + codigoProducto);
                    continue; // Saltar si no se encuentra el producto.
                }

                // Obtener datos del producto.
                idProducto = resultadoConsulta.getInt("id");
                nombreProducto = resultadoConsulta.getString("nombre");
                precioProducto = resultadoConsulta.getDouble("precio");

                // Obtener cantidad del producto de la tabla.
                cantidadProducto = Integer.parseInt(jTableProductos.getValueAt(fila, 2).toString());

                // Verificar que la cantidad sea válida.
                if (cantidadProducto <= 0) {
                    System.out.println("Cantidad no válida en fila " + fila + ": " + cantidadProducto);
                    continue; // Ignorar si la cantidad es cero o negativa.
                }

                // Agregar el detalle de la venta en la base de datos.
                PreparedStatement psInsertar = conexion.prepareStatement("INSERT INTO detalle_venta_producto (id_venta, id_producto, nombre, precio, cantidad) VALUES (?,?,?,?,?)");
                psInsertar.setInt(1, idVenta);
                psInsertar.setInt(2, idProducto);
                psInsertar.setString(3, nombreProducto);
                psInsertar.setDouble(4, precioProducto);
                psInsertar.setInt(5, cantidadProducto);
                psInsertar.executeUpdate(); // Ejecutar la inserción.

                // Actualizar existencias del producto.
                PreparedStatement psActualizar = conexion.prepareStatement("UPDATE productos SET existencias = existencias - ? WHERE id=?");
                psActualizar.setInt(1, cantidadProducto);
                psActualizar.setInt(2, idProducto);
                psActualizar.executeUpdate(); // Ejecutar la actualización.

                // Mostrar mensaje de éxito en la consola.
                System.out.println("Producto agregado: " + nombreProducto + " (ID: " + idProducto + ", Cantidad: " + cantidadProducto + ")");

            } catch (Exception ex) {
                // Mostrar mensaje de error en caso de excepción.
                JOptionPane.showMessageDialog(null, ex.toString());
                ex.printStackTrace(); // Imprimir la traza del error para depuración.
            }
        }
    }

    // Método para limpiar todas las filas de la tabla de productos.
    private void limpiarTabla() {
        DefaultTableModel modeloTemporal = (DefaultTableModel) jTableProductos.getModel(); // Obtener el modelo de la tabla.

        // Mostrar cuántas filas hay antes de limpiar.
        System.out.println("Filas antes de limpiar: " + modeloTemporal.getRowCount());

        // Eliminar todas las filas de la tabla.
        while (modeloTemporal.getRowCount() > 0) {
            modeloTemporal.removeRow(0); // Eliminar siempre la primera fila.
        }

        // Mostrar cuántas filas hay después de limpiar.
        System.out.println("Filas después de limpiar: " + modeloTemporal.getRowCount());
    }

    // Método Main.
    public static void main(String args[]) {
        // Ejecuta el hilo de eventos de la interfaz gráfica de usuario
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crea una nueva instancia de la clase Ventas y la hace visible
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> comboMonedas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
