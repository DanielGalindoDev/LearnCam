package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private final File BaseL = new File("BaseL.txt");//Base txt de Datos para el Login 
    private final MetodosComunes Metodos = new MetodosComunes();//Objeto de Metodos recurrentes en el programa
    private final BasesDeDatos Base = new BasesDeDatos();//Metodos que tienen que ver con base de datos

    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("LearnCam - Login");
        
        Image retValue = Toolkit.getDefaultToolkit().
                        getImage(ClassLoader.getSystemResource("img/logoRojo.png"));//colocamos icono de la interfaz
               
                this.setIconImage(retValue);

        FondoLogin.setIcon(Metodos.getImagen("src/img/FondoBlanco.jpg",//Fondo por defecto de la aplicacion
                FondoLogin.getWidth(), FondoLogin.getHeight()));
        Imagen_LogoLearn.setIcon(Metodos.getImagen("src/img/logoRojo.png",
                Imagen_LogoLearn.getWidth(), Imagen_LogoLearn.getHeight()));//Imagen dentro de la interfaz, esta en una label

        repaint();//actualizamos los cambios 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonFondo = new javax.swing.JButton();
        BotonIniciar = new javax.swing.JButton();
        Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        Etiqueta_TituloLearn = new javax.swing.JLabel();
        Imagen_LogoLearn = new javax.swing.JLabel();
        Etiqueta_GrupoEmpresarialMaxter = new javax.swing.JLabel();
        Etiqueta_Usuario = new javax.swing.JLabel();
        Etiqueta_Contraseña = new javax.swing.JLabel();
        FondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonFondo.setBackground(new java.awt.Color(153, 153, 153));
        BotonFondo.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        BotonFondo.setForeground(new java.awt.Color(51, 51, 51));
        BotonFondo.setText("Fondo");
        BotonFondo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonFondo.setContentAreaFilled(false);
        BotonFondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonFondo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFondoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 20));

        BotonIniciar.setBackground(new java.awt.Color(153, 153, 153));
        BotonIniciar.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        BotonIniciar.setForeground(new java.awt.Color(0, 0, 0));
        BotonIniciar.setText("Acceder ");
        BotonIniciar.setBorder(null);
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 30));

        Usuario.setBackground(new java.awt.Color(153, 153, 153));
        Usuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 270, 30));

        Contraseña.setBackground(new java.awt.Color(153, 153, 153));
        Contraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 270, 30));

        Etiqueta_TituloLearn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Etiqueta_TituloLearn.setForeground(new java.awt.Color(0, 0, 0));
        Etiqueta_TituloLearn.setText("LearnCam ");
        getContentPane().add(Etiqueta_TituloLearn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 100, 30));
        getContentPane().add(Imagen_LogoLearn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 90));

        Etiqueta_GrupoEmpresarialMaxter.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        Etiqueta_GrupoEmpresarialMaxter.setForeground(new java.awt.Color(51, 51, 51));
        Etiqueta_GrupoEmpresarialMaxter.setText("Grupo Empresarial Maxter ");
        getContentPane().add(Etiqueta_GrupoEmpresarialMaxter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        Etiqueta_Usuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Etiqueta_Usuario.setText("Usuario:");
        getContentPane().add(Etiqueta_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 30));

        Etiqueta_Contraseña.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Etiqueta_Contraseña.setText("Contraseña:");
        getContentPane().add(Etiqueta_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 186, 80, 20));
        getContentPane().add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Fondo
    private void BotonFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFondoActionPerformed

        try {
            String[] j = {"Blanco", "Beige"};//opciones de JOptionPane

            String TipoDeFondo = (String) JOptionPane.showInputDialog(null, "  Elige el Fondo\n ", "Fondos",//preguntmos tipos de fondo
                    JOptionPane.INFORMATION_MESSAGE, null, j, j[0]);

            int NumeroDeFondo = 0;

            if (TipoDeFondo.equals("Blanco")) {
                NumeroDeFondo = 1;

                Image retValue = Toolkit.getDefaultToolkit().
                        getImage(ClassLoader.getSystemResource("img/logoRojo.png"));//colocamos icono de la interfaz

                this.setIconImage(retValue);
                Imagen_LogoLearn.setIcon(Metodos.getImagen("src/img/logoRojo.png",
                Imagen_LogoLearn.getWidth(), Imagen_LogoLearn.getHeight()));

            } else if (TipoDeFondo.equals("Beige")) {
                NumeroDeFondo = 2;

                Image retValue = Toolkit.getDefaultToolkit().
                        getImage(ClassLoader.getSystemResource("img/icon1.jpg"));//colocamos icono de la interfaz
                this.setIconImage(retValue);
                Imagen_LogoLearn.setIcon(Metodos.getImagen("src/img/LogoLearn.png",
                Imagen_LogoLearn.getWidth(), Imagen_LogoLearn.getHeight()));

            } else {
                NumeroDeFondo = 1;
                Image retValue = Toolkit.getDefaultToolkit().
                        getImage(ClassLoader.getSystemResource("img/logoRojo.png"));//colocamos icono de la interfaz

                this.setIconImage(retValue);
            }
            FondoLogin.setIcon(Metodos.getImagen(Metodos.ColorDeFondo(NumeroDeFondo),
                    FondoLogin.getWidth(), FondoLogin.getHeight()));

        } catch (Exception e) {

        }


    }//GEN-LAST:event_BotonFondoActionPerformed

    //Boton Iniciar de Login
    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed

        String UsuarioRecuperado = Usuario.getText();
        char[] ContraseñaRecuperada1 = Contraseña.getPassword();//recuperamos valores
        String ContraseñaRecuperada = "";
        for (int i = 0; i < ContraseñaRecuperada1.length; i++) {
            ContraseñaRecuperada+=ContraseñaRecuperada1[i];            
        }
        

        if (!Metodos.CampoVacio(UsuarioRecuperado, UsuarioRecuperado)) {//verificamos que los campos esten llenos
            if (BaseL.exists()) {
                try {
                    if (Base.BuscarBase(BaseL, UsuarioRecuperado, ContraseñaRecuperada)) {//buscamos los valores ingresados y comparamos con la base de datos txt
                        Usuario.setText("");
                        Contraseña.setText("");
                        Principal principal = new Principal();//iniciamos la segunda interfaz
                        principal.setVisible(true);
                        this.setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Usuario o contraseña invalidos");//no se encontro el usuario
                        Usuario.setText("");
                        Contraseña.setText("");
                    }                    
                } catch (IOException ex) {
                }

            } else {
                try {
                    Base.CrearBase(BaseL);//si no existe la base, se crea con usuarios predeterminados
                    if (Base.BuscarBase(BaseL, UsuarioRecuperado, ContraseñaRecuperada)) {//buscamos en base los valores ingresados
                        Usuario.setText("");
                        Contraseña.setText("");
                        Principal principal = new Principal();//iniciamos la segunda interfaz
                        principal.setVisible(true);
                        this.setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Usuario o contraseña invalidos");//datos de la base no coinciden con los ingresados
                        Usuario.setText("");
                        Contraseña.setText("");
                    }

                } catch (IOException e) {

                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");//los campos estaban vacios
        }

    }//GEN-LAST:event_BotonIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFondo;
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Etiqueta_Contraseña;
    private javax.swing.JLabel Etiqueta_GrupoEmpresarialMaxter;
    private javax.swing.JLabel Etiqueta_TituloLearn;
    private javax.swing.JLabel Etiqueta_Usuario;
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JLabel Imagen_LogoLearn;
    private javax.swing.JTextField Usuario;
    // End of variables declaration//GEN-END:variables
}
