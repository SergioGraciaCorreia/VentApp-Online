
package ventappOnline;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase Almacen que representa la ventana de gestión de inventario de productos. 
 * Permite al usuario visualizar, agregar, modificar y eliminar productos en el almacén, 
 * además de gestionar sus existencias y precios.
 */
public class Almacen extends javax.swing.JFrame {

    
    public Almacen() {
        initComponents();
        actualizarTablaProductos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProductos = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        btnCrearProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondo letras.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setOpaque(false);

        jtableProductos.setBackground(new java.awt.Color(204, 204, 204));
        jtableProductos.setForeground(new java.awt.Color(0, 0, 0));
        jtableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableProductos);

        btnInicio.setBackground(new java.awt.Color(255, 0, 0));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Volver a Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Código:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Precio:");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Existencias:");

        txtExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistenciasActionPerformed(evt);
            }
        });

        btnCrearProducto.setBackground(new java.awt.Color(255, 0, 0));
        btnCrearProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearProducto.setText("Crear");
        btnCrearProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarProducto.setText("Actualizar");
        btnActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.setMaximumSize(new java.awt.Dimension(76, 27));
        btnEliminarProducto.setMinimumSize(new java.awt.Dimension(76, 27));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtId.setPreferredSize(new java.awt.Dimension(0, 0));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnActualizarProducto)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecio))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 27, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearProducto)
                    .addComponent(btnActualizarProducto)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(btnInicio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Métodos de Inicialización.
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistenciasActionPerformed
        
    }//GEN-LAST:event_txtExistenciasActionPerformed
    
    //Botón Crear.
    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
        
         try {
        // Establece una conexión con la base de datos.
        Connection con = ConexionBDVentApp.getConexion();
        
        // Prepara la sentencia SQL para insertar un nuevo producto.
        PreparedStatement ps = con.prepareStatement("INSERT INTO productos (codigo, nombre, precio, existencias) VALUES (?,?,?,?)");
        
        // Establece los parámetros de la sentencia SQL con los valores que ingresa el usuario.
        ps.setString(1, txtCodigo.getText()); 
        ps.setString(2, txtNombre.getText());
        ps.setDouble(3, Double.parseDouble(txtPrecio.getText()));  
        ps.setInt(4, Integer.parseInt(txtExistencias.getText())); 
        
        // Ejecuta la sentencia SQL para obtener el resultado.
        int resultado = ps.executeUpdate();
        
        // Verifica si la inserción es correcta.
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Producto guardado correctamente.");
            limpiarCampos();      // Limpiar los campos de entrada
            actualizarTablaProductos();  // Recargar la tabla para mostrar los productos actualizados.
        } else {
            // Si no se guarda ningún producto, muestra un mensaje de error.
            JOptionPane.showMessageDialog(null, "Error al guardar el producto.");
        }
        
    } catch (Exception ex) {
        // Si ocurre un error, muestra el mensaje de excepción.
        JOptionPane.showMessageDialog(null, ex.toString());
    }
        
    }//GEN-LAST:event_btnCrearProductoActionPerformed
    
// Métodos de funcionalidad
    
    // Método para limpiar los campos de entrada.
    private void limpiarCampos (){
        // Dejar los campos de texto vacíos.
         txtId.setText("");
         txtNombre.setText("");
         txtCodigo.setText("");
         txtPrecio.setText("");
         txtExistencias.setText("");
         
    }
    
    // Método para definir las columnas de la tabla.
    private void definirColumnas(DefaultTableModel modeloTabla) {
        // Definir las columnas del modelo.
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Existencias");
}
    
    // Método para cargar los datos en la tabla
    private void actualizarTablaProductos(){
        try {
        // Crear un nuevo modelo de tabla.
        DefaultTableModel modeloTabla = new DefaultTableModel();
        jtableProductos.setModel(modeloTabla);

        // Establecer la conexión.
        Connection conexion = ConexionBDVentApp.getConexion();
        PreparedStatement consulta = conexion.prepareStatement(
                "SELECT id, codigo, nombre, precio, existencias FROM productos");

        // Ejecutar la consulta.
        ResultSet resultadoConsulta = consulta.executeQuery();
        ResultSetMetaData metadatos = resultadoConsulta.getMetaData();

        // Obtener la cantidad de columnas.
        int numeroColumnas = metadatos.getColumnCount();

        // Llamar al método para definir las columnas.
        definirColumnas(modeloTabla);

        // Definir el ancho de cada columna.
        int[] anchosColumnas = {20, 75, 120, 75, 75};
        for (int i = 0; i < numeroColumnas; i++) {
            jtableProductos.getColumnModel().getColumn(i).setPreferredWidth(anchosColumnas[i]);
        }

        // Iterar por los resultados de la consulta.
        while (resultadoConsulta.next()) {
            Object[] fila = new Object[numeroColumnas];
            for (int j = 0; j < numeroColumnas; j++) {
                fila[j] = resultadoConsulta.getObject(j + 1); // Obtener datos por índice.
            }
            modeloTabla.addRow(fila); // Añadir fila al modelo de tabla.
        }

    } catch (Exception e) {
        // Mostrar error en caso de fallo.
        JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.toString());
    }
    }
    
    //Botón Actualizar.
    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        try {
        // Establecer la conexión con la base de datos.
        Connection conexion = ConexionBDVentApp.getConexion();
        
        // Crear la consulta SQL para actualizar los datos del producto.
        PreparedStatement actualizarProducto = conexion.prepareStatement(
            "UPDATE productos SET codigo=?, nombre=?, precio=?, existencias=? WHERE id=?");

        // Asignar los valores de los campos de texto a los parámetros de la consulta.
        actualizarProducto.setString(1, txtCodigo.getText());
        actualizarProducto.setString(2, txtNombre.getText());
        actualizarProducto.setDouble(3, Double.parseDouble(txtPrecio.getText()));
        actualizarProducto.setInt(4, Integer.parseInt(txtExistencias.getText()));
        actualizarProducto.setInt(5, Integer.parseInt(txtId.getText()));
        
        // Ejecutar la consulta.
        int resultadoActualizacion = actualizarProducto.executeUpdate();
        
        // Verificar si la actualización fue exitosa.
        if (resultadoActualizacion > 0) {
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente.");
            limpiarCampos(); // Limpiar los campos de entrada.
            actualizarTablaProductos(); // Actualizar los datos en la tabla.
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el producto.");
        }
        
    } catch (NumberFormatException e) {
        // Manejar excepción en caso de que no se pueda convertir algún campo numérico.
        JOptionPane.showMessageDialog(null, "Error en el formato de datos: " + e.getMessage());
        
    } catch (SQLException e) {
        // Manejar cualquier error de SQL.
        JOptionPane.showMessageDialog(null, "Error al actualizar el producto: " + e.getMessage());
        
    } catch (Exception e) {
        // Manejar cualquier otra excepción no prevista.
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
    }
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    //Tabla productos.
    private void jtableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProductosMouseClicked
        try {
        // Obtener la fila seleccionada.
        int filaSeleccionada = jtableProductos.getSelectedRow();

        // Verificar que la fila seleccionada sea válida.
        if (filaSeleccionada >= 0) {
            // Obtener el ID del producto de la primera columna.
            int idProducto = Integer.parseInt(jtableProductos.getValueAt(filaSeleccionada, 0).toString());

            // Establecer la conexión a la base de datos.
            Connection conexion = ConexionBDVentApp.getConexion();
            PreparedStatement consulta = conexion.prepareStatement(
                    "SELECT id, codigo, nombre, precio, existencias FROM productos WHERE id = ?");
            
            // Asignar el ID del producto al parámetro de la consulta.
            consulta.setInt(1, idProducto);

            // Ejecutar la consulta y obtener los resultados.
            ResultSet resultadoConsulta = consulta.executeQuery();

            // Rellenar los campos de texto con los datos obtenidos.
            if (resultadoConsulta.next()) {
                txtId.setText(resultadoConsulta.getString("id"));
                txtCodigo.setText(resultadoConsulta.getString("codigo"));
                txtNombre.setText(resultadoConsulta.getString("nombre"));
                txtPrecio.setText(resultadoConsulta.getString("precio"));
                txtExistencias.setText(resultadoConsulta.getString("existencias"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para el ID seleccionado.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error al convertir el ID del producto: " + e.getMessage());
    } catch (Exception ex) {
        // Mostrar un mensaje de error si algo falla.
        JOptionPane.showMessageDialog(null, "Error al cargar datos del producto: " + ex.toString());
    }
    }//GEN-LAST:event_jtableProductosMouseClicked

    //Botón Limpiar.
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Botón Eliminar.
    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        try {
        // Verificar si el campo de ID no está vacío antes de proceder.
        if (txtId.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un producto para eliminar.");
            return; // Salir del método si no hay ID.
        }

        // Confirmar con el usuario antes de eliminar el producto.
        int confirmacion = JOptionPane.showConfirmDialog(null, 
                "¿Estás seguro de que deseas eliminar este producto?", 
                "Confirmar eliminación", 
                JOptionPane.YES_NO_OPTION);

        // Si el usuario confirma la eliminación.
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Establecer la conexión.
            Connection conexion = ConexionBDVentApp.getConexion();
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM productos WHERE id = ?");
            
            // Asignar el valor del ID a la consulta.
            consulta.setInt(1, Integer.parseInt(txtId.getText()));

            // Ejecutar la consulta y obtener el resultado.
            int resultado = consulta.executeUpdate();

            // Verificar si se eliminó el producto.
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
                limpiarCampos();
                actualizarTablaProductos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el producto.");
            }
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "ID inválido: " + e.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + ex.toString());
    }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    //Botón volver a Inicio.
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // Cerrar la ventana actual.
        this.dispose();

        // Crear una nueva instancia de PantallaInicio.
        PantallaInicio inicio = new PantallaInicio();

        // Hacerla visible.
        inicio.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    // Método main.
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            PantallaInicio inicio = new PantallaInicio();
            inicio.setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
