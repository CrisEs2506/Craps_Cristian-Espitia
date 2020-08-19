import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI2 extends javax.swing.JFrame {

    public static String txtsaldo;
    public static int apuesta, clicks;
    int primerresultado, resultado;
    
    public GUI2() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Craps");
        
        GUI ventana = new GUI();
        LabelVarNombre.setText(ventana.nombreinterfaz);
        LabelVarSaldo.setText(ventana.saldointerfaz);
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
        LabelDado1 = new javax.swing.JLabel();
        LabelDado2 = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelSaldo = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        LabelVarNombre = new javax.swing.JLabel();
        LabelVarSaldo = new javax.swing.JLabel();
        LabelApostar = new javax.swing.JLabel();
        LabelGanar = new javax.swing.JLabel();
        FieldApostar = new javax.swing.JTextField();
        ButtonLanzar = new javax.swing.JButton();
        ButtonRetirar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dado6.PNG"))); // NOI18N
        jPanel1.add(LabelDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 60, 60));

        LabelDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dado6.PNG"))); // NOI18N
        jPanel1.add(LabelDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 60, 60));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoDados.png"))); // NOI18N
        jPanel1.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, -1, -1));

        LabelNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("Nombre:");
        jPanel1.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, -1, -1));

        LabelSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSaldo.setForeground(new java.awt.Color(255, 255, 255));
        LabelSaldo.setText("Saldo:");
        jPanel1.add(LabelSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, -1, -1));

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("CRAPS");
        jPanel1.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 75, -1, -1));

        LabelVarNombre.setBackground(new java.awt.Color(255, 255, 255));
        LabelVarNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelVarNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LabelVarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 14, 271, 22));

        LabelVarSaldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelVarSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LabelVarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 47, 295, 22));

        LabelApostar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelApostar.setForeground(new java.awt.Color(255, 255, 255));
        LabelApostar.setText("Saldo a Apostar:");
        jPanel1.add(LabelApostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 538, -1, -1));

        LabelGanar.setBackground(new java.awt.Color(255, 255, 255));
        LabelGanar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelGanar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LabelGanar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 658, 400, 62));
        LabelGanar.setOpaque(true);
        jPanel1.add(FieldApostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 538, 198, 22));

        ButtonLanzar.setText("Lanzar Dados");
        ButtonLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLanzarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 589, 172, 44));

        ButtonRetirar.setText("Retirarse");
        ButtonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 589, 172, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ButtonLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLanzarActionPerformed
        GUI ventana = new GUI();
        Jugador j = new Jugador(ventana.nombreinterfaz,ventana.contraseñainterfaz,ventana.saldototal);
        Dado d1 = new Dado(0);
        Dado d2 = new Dado(0);
        Juego craps = new Juego(0,0," ");

        int dado1, dado2, verificar;
        
        clicks++;
        
        Color verdeoscuro = new Color(0, 102, 0);
        
        txtsaldo = FieldApostar.getText();
        
        //Validación de la Apuesta
        try
        {
            apuesta = Integer.parseInt(txtsaldo);
            verificar = 1;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Ingrese un Valor Númerico en la casilla de Saldo a Apostar");
            verificar = 0;
            clicks = 0;
        }
        
        //Verificar si la Apuesta es Posible
        if(verificar == 1)
        {
            if((apuesta > ventana.saldototal) || (apuesta < 0))
            {
                JOptionPane.showMessageDialog(this, "Ingrese una Apuesta que este Dentro de su Saldo Disponible");
                verificar = 0;
                clicks = 0;
            }
        }
         
        //Juego Craps
        if(clicks == 1 && verificar == 1)
        {
            d1.azar();
            
            Icon icono;
            
            switch(d1.getValor())
            {
                case 1:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado1.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 2:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado2.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 3:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado3.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
            
                case 4:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado4.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 5:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado5.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 6:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado6.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;                
            }

            d2.azar();
            
            switch(d2.getValor())
            {
                case 1:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado1.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 2:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado2.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 3:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado3.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
            
                case 4:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado4.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 5:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado5.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 6:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado6.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;                
            }
            
            dado1 = d1.getValor();
            dado2 = d2.getValor();
        
            //Sumar Valor de los Dados
            primerresultado = dado1+dado2;
            craps.setPrimerlanzamiento(primerresultado);
            
            //Verificacion
            craps.comprobar1();
            
            if(craps.ganar == "Vuelves a Lanzar los Dados")
            {
                LabelGanar.setForeground(Color.BLACK);
                LabelGanar.setText(craps.ganar);
                FieldApostar.setEditable(false);
                clicks++;
            }
            else if(craps.ganar == "Felicidades Ganaste!!!")
            {
                LabelGanar.setForeground(verdeoscuro);
                LabelGanar.setText(craps.ganar);
                ventana.saldototal = ventana.saldototal + apuesta;
                ventana.saldointerfaz = String.valueOf(ventana.saldototal);
                LabelVarSaldo.setText(ventana.saldointerfaz);
                JOptionPane.showMessageDialog(this, "Grandioso, Tú Saldo ahora es: "+ventana.saldointerfaz);
                FieldApostar.setEditable(true);
                clicks = 0;
            }
            else
            {
                LabelGanar.setForeground(Color.RED);
                LabelGanar.setText(craps.ganar);
                ventana.saldototal = ventana.saldototal - apuesta;
                ventana.saldointerfaz = String.valueOf(ventana.saldototal);
                LabelVarSaldo.setText(ventana.saldointerfaz);
                JOptionPane.showMessageDialog(this, "Mala Suerte, Tú Saldo ahora es: "+ventana.saldointerfaz);
                FieldApostar.setEditable(true);
                clicks = 0;
            }
        }
        
        if(clicks > 2 && verificar == 1)
        {
            d1.azar();

            Icon icono;
            
            switch(d1.getValor())
            {
                case 1:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado1.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 2:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado2.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 3:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado3.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
            
                case 4:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado4.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 5:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado5.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;
                
                case 6:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado6.PNG"));
                    this.LabelDado1.setIcon(icono);
                break;                
            }            
            
            d2.azar();
            
            switch(d2.getValor())
            {
                case 1:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado1.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 2:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado2.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 3:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado3.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
            
                case 4:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado4.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 5:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado5.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;
                
                case 6:
                    icono = new ImageIcon(getClass().getResource("/Imagenes/Dado6.PNG"));
                    this.LabelDado2.setIcon(icono);
                break;                
            }            
            
            dado1 = d1.getValor();
            dado2 = d2.getValor();
            
            resultado = dado1+dado2;
            
            craps.setLanzamiento(resultado);
            
            craps.comprobar2();
            
            if(primerresultado == resultado)
            {
                craps.ganar = "Felicidades Ganaste!!!";
            }
            
            if(craps.ganar == "Vuelves a Lanzar los Dados")
            {
                LabelGanar.setForeground(Color.BLACK);
                LabelGanar.setText(craps.ganar);
                FieldApostar.setEditable(false);
            }
            else if(craps.ganar == "Felicidades Ganaste!!!")
            {
                LabelGanar.setForeground(verdeoscuro);
                LabelGanar.setText(craps.ganar);
                ventana.saldototal = ventana.saldototal + apuesta;
                ventana.saldointerfaz = String.valueOf(ventana.saldototal);
                LabelVarSaldo.setText(ventana.saldointerfaz);
                JOptionPane.showMessageDialog(this, "Grandioso, Tú Saldo ahora es: "+ventana.saldointerfaz);
                FieldApostar.setEditable(true);
                clicks = 0;        
            }
            else
            {
                LabelGanar.setForeground(Color.RED);
                LabelGanar.setText(craps.ganar);
                ventana.saldototal = ventana.saldototal - apuesta;
                ventana.saldointerfaz = String.valueOf(ventana.saldototal);
                LabelVarSaldo.setText(ventana.saldointerfaz);
                JOptionPane.showMessageDialog(this, "Mala Suerte, Tú Saldo ahora es: "+ventana.saldointerfaz);
                FieldApostar.setEditable(true);
                clicks = 0;
            }   
        }
        
        if(ventana.saldototal <= 0)
        {
            JOptionPane.showMessageDialog(this, "Te Has Quedado sin Saldo, Gracias por Jugar!!!");
            this.setVisible(false);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_ButtonLanzarActionPerformed

    private void ButtonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRetirarActionPerformed
        GUI ventana = new GUI();
        JOptionPane.showMessageDialog(this, "Gracias por jugar " + ventana.nombreinterfaz + ", usted se retira con un Saldo de: " + ventana.saldototal + "\nVuelva Pronto...");
        this.setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_ButtonRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLanzar;
    private javax.swing.JButton ButtonRetirar;
    private javax.swing.JTextField FieldApostar;
    private javax.swing.JLabel LabelApostar;
    public javax.swing.JLabel LabelDado1;
    public javax.swing.JLabel LabelDado2;
    private javax.swing.JLabel LabelFondo;
    public javax.swing.JLabel LabelGanar;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelSaldo;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelVarNombre;
    private javax.swing.JLabel LabelVarSaldo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
