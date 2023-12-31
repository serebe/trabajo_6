/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package last;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_Title_cilindro = new javax.swing.JLabel();
        lbl_bourder = new javax.swing.JLabel();
        btnborrar = new javax.swing.JButton();
        btncreate = new javax.swing.JButton();
        btnleer = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraUP.setBackground(new java.awt.Color(200, 100, 0));
        barraUP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraUPMouseDragged(evt);
            }
        });
        barraUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraUPMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(200, 100, 0));

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lbl_Title_cilindro.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_Title_cilindro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title_cilindro.setText("LISTA DE AMIGOS");

        javax.swing.GroupLayout barraUPLayout = new javax.swing.GroupLayout(barraUP);
        barraUP.setLayout(barraUPLayout);
        barraUPLayout.setHorizontalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Title_cilindro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbl_Title_cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 100, 0), 3));

        btnborrar.setText("BORRAR");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btncreate.setText("CREAR");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnleer.setText("LEER");
        btnleer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleerActionPerformed(evt);
            }
        });

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE:");

        jLabel3.setText("NÚMERO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraUP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(btnleer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnumero)
                        .addGap(36, 36, 36)
                        .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_bourder, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnleer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addComponent(lbl_bourder, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraUPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraUPMouseDragged

    private void barraUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_barraUPMousePressed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
      try {
        // Obtener el nombre y número del contacto a crear
        String newName = txtnombre.getText();
        long newNumber = Long.parseLong(txtnumero.getText());

        String nameNumberString;
        String name;
        long number;

        // Crear el archivo si no existe
        File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\proyecto\\src\\friendsContact.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        // Abrir el archivo en modo de lectura y escritura
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        boolean found = false;

        // Comprobar si el nombre o número del contacto ya existe
        while (raf.getFilePointer() < raf.length()) {
            // Leer una línea del archivo
            nameNumberString = raf.readLine();

            // Separar el nombre y número
            String[] lineSplit = nameNumberString.split("!");
            name = lineSplit[0];
            number = Long.parseLong(lineSplit[1]);

            // Comprobar si el nombre o número ya existe
            if (name.equals(newName) || number == newNumber) {
                found = true;
                break;
            }
        }

        if (!found) {
            // Si el contacto no existe, agregarlo al archivo
            nameNumberString = newName + "!" + newNumber;
            raf.writeBytes(nameNumberString);
            raf.writeBytes(System.lineSeparator());

            // Imprimir mensaje de éxito
            System.out.println("Amigo agregado.");

            // Cerrar el archivo
            raf.close();
        } else {
            // Si el contacto ya existe, imprimir mensaje de error
            raf.close();
            System.out.println("El nombre o número ya existe.");
        }
    } catch (IOException ioe) {
        System.out.println(ioe);
    } catch (NumberFormatException nef) {
        System.out.println(nef);
    }
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        try {
        // Obtener el nombre del contacto a borrar
        String newName = txtnombre.getText();

        String nameNumberString;
        String name;
        long number;
        int index;

        // Abrir el archivo en modo de lectura y escritura
        File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\proyecto\\src\\friendsContact.txt");

        if (!file.exists()) {
            // Si el archivo no existe, imprimir mensaje de error
            System.out.println("Archivo no encontrado.");
            return;
        }

        // Crear un archivo temporal
        File tmpFile = new File("temp.txt");

        // Abrir el archivo temporal en modo de lectura y escritura
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
        boolean found = false;

        // Buscar el contacto por su nombre
        while (raf.getFilePointer() < raf.length()) {
            // Leer una línea del archivo
            nameNumberString = raf.readLine();

            // Separar el nombre y número
            String[] lineSplit = nameNumberString.split("!");

            // Separar el nombre
            name = lineSplit[0];

            // Comprobar si el nombre coincide
            if (name.equals(newName)) {
                found = true;
                break;
            }
        }

        // Borrar el contacto si se encontró
        if (found) {
            // Volver al principio del archivo
            raf.seek(0);

            // Copiar los contactos al archivo temporal, excepto el que se desea borrar
            while (raf.getFilePointer() < raf.length()) {
                // Leer una línea del archivo
                nameNumberString = raf.readLine();

                // Separar el nombre
                index = nameNumberString.indexOf('!');
                name = nameNumberString.substring(0, index);

                // Comprobar si el contacto es el que se desea borrar
                if (name.equals(newName)) {
                    continue; // Saltar la escritura de este contacto en el archivo temporal
                }

                // Escribir el contacto en el archivo temporal
                tmpraf.writeBytes(nameNumberString);
                tmpraf.writeBytes(System.lineSeparator());
            }

            // Copiar el contenido del archivo temporal al archivo original
            raf.seek(0);
            tmpraf.seek(0);

            while (tmpraf.getFilePointer() < tmpraf.length()) {
                raf.writeBytes(tmpraf.readLine());
                raf.writeBytes(System.lineSeparator());
            }

            // Establecer la longitud del archivo original como la del archivo temporal
            raf.setLength(tmpraf.length());

            // Cerrar los recursos
            tmpraf.close();
            raf.close();

            // Eliminar el archivo temporal
            tmpFile.delete();

            System.out.println("Amigo borrado.");
        } else {
            // Si el contacto no se encontró, imprimir mensaje de error
            raf.close();
            System.out.println("El nombre no existe.");
        }
    } catch (IOException ioe) {
        System.out.println(ioe);
    }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {
        // Obtener el nombre del contacto a actualizar
        String newName = txtnombre.getText();

        // Obtener el nuevo número del contacto a actualizar
        long newNumber = Long.parseLong(txtnumero.getText());

        String nameNumberString;
        String name;
        long number;
        int index;

        // Abrir el archivo en modo de lectura y escritura
        File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\proyecto\\src\\friendsContact.txt");

        if (!file.exists()) {
            // Si el archivo no existe, imprimir mensaje de error
            System.out.println("Archivo no encontrado.");
            return;
        }

        // Crear un archivo temporal
        File tmpFile = new File("temp.txt");

        // Abrir el archivo temporal en modo de lectura y escritura
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
        boolean found = false;

        // Buscar el contacto por su nombre o número
        while (raf.getFilePointer() < raf.length()) {
            // Leer una línea del archivo
            nameNumberString = raf.readLine();

            // Separar el nombre y número
            String[] lineSplit = nameNumberString.split("!");

            // Separar el nombre y número
            name = lineSplit[0];
            number = Long.parseLong(lineSplit[1]);

            // Comprobar si el nombre o número coincide
            if (name.equals(newName) || number == newNumber) {
                found = true;
                break;
            }
        }

        // Actualizar el contacto si se encontró
        if (found) {
            // Volver al principio del archivo
            raf.seek(0);

            // Actualizar el número del contacto en el archivo temporal
            while (raf.getFilePointer() < raf.length()) {
                // Leer una línea del archivo
                nameNumberString = raf.readLine();

                // Separar el nombre y número
                index = nameNumberString.indexOf('!');
                name = nameNumberString.substring(0, index);

                // Comprobar si el contacto es el que se desea actualizar
                if (name.equals(newName)) {
                    // Actualizar el número del contacto
                    nameNumberString = name + "!" + newNumber;
                }

                // Escribir el contacto en el archivo temporal
                tmpraf.writeBytes(nameNumberString);
                tmpraf.writeBytes(System.lineSeparator());
            }

            // Copiar el contenido del archivo temporal al archivo original
            raf.seek(0);
            tmpraf.seek(0);

            while (tmpraf.getFilePointer() < tmpraf.length()) {
                raf.writeBytes(tmpraf.readLine());
                raf.writeBytes(System.lineSeparator());
            }

            // Establecer la longitud del archivo original como la del archivo temporal
            raf.setLength(tmpraf.length());

            // Cerrar los recursos
            tmpraf.close();
            raf.close();

            // Eliminar el archivo temporal
            tmpFile.delete();

            System.out.println("Amigo actualizado.");
        } else {
            // Si el contacto no se encontró, imprimir mensaje de error
            raf.close();
            System.out.println("El nombre o número no existe.");
        }
    } catch (IOException ioe) {
        System.out.println(ioe);
    } catch (NumberFormatException nef) {
        System.out.println(nef);
    }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnleerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleerActionPerformed
         try {
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\proyecto\\src\\friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
 
            RandomAccessFile raf= new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Traversing the file
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Print the contact data
                System.out.println(
                    "Friend Name: " + name + "\n"
                    + "Contact Number: " + number + "\n");
            }}
            catch (IOException ioe){
                System.out.println(ioe);
            }
            catch (NumberFormatException nef){
                System.out.println(nef);
            }
    }//GEN-LAST:event_btnleerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnleer;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_Title_cilindro;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
