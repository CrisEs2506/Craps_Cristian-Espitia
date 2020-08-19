import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class GUI extends javax.swing.JFrame {
    
    private static Scanner sc;
    public static String nombreinterfaz;
    public static String contraseñainterfaz;
    public static String saldointerfaz;
    public static int saldototal;
    
    public GUI() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Craps");
    }

    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Icono.jpg"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jTextSaldo = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jLabelCreditos = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Usuario:");

        jLabelSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSaldo.setText("Saldo a Ingresar:");

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("REGISTRO E INGRESO");

        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });

        jButtonIngresar.setText("ACEPTAR");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelCreditos.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabelCreditos.setText("Created by Cristian Espitia");

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabelTitulo))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCreditos)
                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSaldo)
                        .addGap(18, 18, 18)
                        .addComponent(jTextSaldo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelContraseña)
                                .addGap(18, 18, 18)
                                .addComponent(jPassword))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSaldo)
                    .addComponent(jTextSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelCreditos)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        nombreinterfaz = jTextUsuario.getText();
        contraseñainterfaz = new String(jPassword.getPassword());
        saldointerfaz = jTextSaldo.getText();

        int verificar = 0;

        try
        {
            saldototal = Integer.parseInt(saldointerfaz);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Ingrese un Valor Númerico en la casilla de Saldo");
            verificar = 1;
        }

        if(verificar == 0)
        {
            if(saldototal <= 0)
            {
                JOptionPane.showMessageDialog(this, "Ingrese un Saldo Mayor a Cero");
                verificar = 1;
            }
        }

        if(verificar == 0)
        {
            FileReader fr = null;
            
            try 
            {
                int nLineas = 0;
                int i = 0;
                String [] usuarios = null;
                String linea;
                
                File f = new File("C:\\Users\\Familia Vanegas\\Documents\\NetBeansProjects\\Craps\\basedatos.txt");
                sc = new Scanner(new File("C:\\Users\\Familia Vanegas\\Documents\\NetBeansProjects\\Craps\\basedatos.txt")); 
                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                
                FileWriter escribir;
                PrintWriter renglon;
                
                if(!f.exists())
                {
                    try 
                    {
                        f.createNewFile();
                        escribir = new FileWriter(f,true);
                        renglon = new PrintWriter(escribir);
                        //Escribir en el Archivo
                        renglon.println(nombreinterfaz);
                        renglon.println(contraseñainterfaz);
                        renglon.println(saldointerfaz);
                        renglon.close();
                        escribir.close();
                    } 
                    catch (IOException ex) 
                    {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                try 
                {
                    while((linea = br.readLine()) != null)
                    {
                        nLineas++;
                    }
                    
                    usuarios = new String [nLineas];
                    
                    while(sc.hasNextLine())
                    {
                        usuarios[i++] = sc.nextLine();
                    }
                    
                    Archivo txt = new Archivo();
                    
                    txt.validarUsuario(usuarios, nombreinterfaz, contraseñainterfaz);
                    
                    if(txt.encontrado == true)
                    {
                        JOptionPane.showMessageDialog(this, "Genial!!! El Usuario ya está Registrado");
                    }
                    else
                    {
                        escribir = new FileWriter(f,true);
                        renglon = new PrintWriter(escribir);
                        renglon.println(nombreinterfaz);
                        renglon.println(contraseñainterfaz);
                        renglon.println(saldointerfaz);
                        renglon.close();
                        escribir.close();
                        JOptionPane.showMessageDialog(this, "Un Nuevo Usuario se ha Creado");
                    }
                } 
                catch (IOException ex) 
                {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            } 
            finally 
            {
                try 
                {
                    fr.close();
                } 
                catch (IOException ex) 
                {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        Jugador j = new Jugador(this.nombreinterfaz,this.contraseñainterfaz,this.saldototal);

        GUI2 ventana = new GUI2();

        if(verificar == 0)
        {
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCreditos;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextSaldo;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
