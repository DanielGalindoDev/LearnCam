package ventanas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    MetodosComunes Metodos = new MetodosComunes();
    BasesDeDatos Base = new BasesDeDatos();
    private final File BaseIngresos = new File("Ingresos.txt");//Base txt de Datos para el Login 
    private final File BaseGastos = new File("Gastos.txt");//Base txt de Datos para el Login
    private final File BaseImpuestos = new File("Impuestos.txt");

    public Principal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("LearnCam - Principal");
        ColocarIconos();
        OcultarTodo();
        MostrarInicio();
        Auxiliar.setVisible(false);
        bandera = false;
    }

    public void ColocarIconos() {
        Fondo.setIcon(Metodos.getImagen(Metodos.ColorDeFondo(Metodos.FondoSeleccionado),
                Fondo.getWidth(), Fondo.getHeight()));//imagen de fondo

        if (Metodos.FondoSeleccionado == 1) {

            LineaFondoDeOpciones.setIcon(Metodos.getImagen("./src/img/LineaBlanca.jpg",
                    LineaFondoDeOpciones.getWidth(), LineaFondoDeOpciones.getHeight()));
            LearnCam.setIcon(Metodos.getImagen("./src/img/LogoRojoInclinado.png",
                    LearnCam.getWidth() - 70, LearnCam.getHeight() - 20));
            LearnCam.setPressedIcon(Metodos.getImagen("./src/img/LogoRojoInclinado.png",
                    LearnCam.getWidth() - 70, LearnCam.getHeight() - 20));
            LearnCam.setRolloverIcon(Metodos.getImagen("./src/img/LogoRojo.png",
                    LearnCam.getWidth() - 60, LearnCam.getHeight() - 30));
            Image retValue = Toolkit.getDefaultToolkit().
                    getImage(ClassLoader.getSystemResource("./img/LogoRojo.png"));//colocamos icono de la interfaz
            this.setIconImage(retValue);

        } else {

            Image retValue = Toolkit.getDefaultToolkit().
                    getImage(ClassLoader.getSystemResource("./img/LogoLearn.png"));//colocamos icono de la interfaz
            this.setIconImage(retValue);

            LineaFondoDeOpciones.setIcon(Metodos.getImagen("./src/img/LineaBeige.jpg",
                    LineaFondoDeOpciones.getWidth(), LineaFondoDeOpciones.getHeight()));

            LearnCam.setIcon(Metodos.getImagen("./src/img/LogoLearnInclinado.png",
                    LearnCam.getWidth(), LearnCam.getHeight()));
            LearnCam.setPressedIcon(Metodos.getImagen("./src/img/LogoLearnInclinado.png",
                    LearnCam.getWidth(), LearnCam.getHeight()));
            LearnCam.setRolloverIcon(Metodos.getImagen("./src/img/LogoLearn.png",
                    LearnCam.getWidth() - 70, LearnCam.getHeight() - 30));

        }

        UNAM.setIcon(Metodos.getImagen("./src/img/UNAM.png",
                UNAM.getWidth(), UNAM.getHeight()));
        bandera = false;
    }

    public void OcultarTodo() {

        UNAM.setVisible(false);
        NaranjaFuerte.setVisible(false);
        NaranjaClaro.setVisible(false);
        Salir.setVisible(false);
        QueEsLearn.setVisible(false);
        TextoIntroduccionLearn.setVisible(false);
        FotoMax.setVisible(false);
        CurriculumMax.setVisible(false);
        NombreMax.setVisible(false);
        Auxiliar.setVisible(false);
        CreditosImagenes.setVisible(true);
        Declarar.setVisible(false);
        Txt_Ingreso.setVisible(false);
        Text_Consepto.setVisible(false);
        IngresoEtiqueta.setVisible(false);
        ConceptoEtiqueta.setVisible(false);
        NumeroDeEmpleados.setVisible(false);
        EtiquetaParticipantes.setVisible(false);
        Empleados(false);
        NumeroDeEmpleados.setSelectedItem("0");
        Impuestos.setVisible(false);
        impuestosporcentual.setVisible(false);
        EtiquetaCostosOperativos.setVisible(false);
        EtiquetaIngresoNeto.setVisible(false);
        EtiquetaUtilidad.setVisible(false);
        EtiquetaUtilidad1.setVisible(false);
        Etiqueta1.setVisible(false);
        Etiqueta2.setVisible(false);
        Etiqueta3.setVisible(false);
        Etiqueta4.setVisible(false);
        Etiqueta5.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        ReporteMensual.setVisible(false);
        ReporteCompleto.setVisible(false);
        MesDelReporte.setVisible(false);
        Mes.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        bandera = false; 
    }

    public void MostrarInicio() {
        UNAM.setVisible(true);
        NaranjaFuerte.setVisible(true);
        NaranjaClaro.setVisible(true);
        Salir.setVisible(true);
        QueEsLearn.setVisible(true);
        TextoIntroduccionLearn.setVisible(true);
        CreditosImagenes.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Auxiliar = new javax.swing.JLabel();
        MesDelReporte = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox<>();
        ReporteMensual = new javax.swing.JButton();
        ReporteCompleto = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Etiqueta1 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        Etiqueta3 = new javax.swing.JLabel();
        Etiqueta4 = new javax.swing.JLabel();
        Etiqueta5 = new javax.swing.JLabel();
        EtiquetaIngresoNeto = new javax.swing.JLabel();
        EtiquetaCostosOperativos = new javax.swing.JLabel();
        EtiquetaUtilidad = new javax.swing.JLabel();
        EtiquetaUtilidad1 = new javax.swing.JLabel();
        impuestosporcentual = new javax.swing.JComboBox<>();
        Impuestos = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JTextField();
        Porcentaje1 = new javax.swing.JTextField();
        Nombre2 = new javax.swing.JTextField();
        Porcentaje2 = new javax.swing.JTextField();
        Nombre3 = new javax.swing.JTextField();
        Porcentaje3 = new javax.swing.JTextField();
        Nombre4 = new javax.swing.JTextField();
        Porcentaje4 = new javax.swing.JTextField();
        Nombre5 = new javax.swing.JTextField();
        Porcentaje5 = new javax.swing.JTextField();
        Nombre6 = new javax.swing.JTextField();
        Porcentaje6 = new javax.swing.JTextField();
        PocentajeRemunerado = new javax.swing.JLabel();
        EtiquetaNombreEmpleado = new javax.swing.JLabel();
        Empleado1 = new javax.swing.JLabel();
        Empleado2 = new javax.swing.JLabel();
        Empleado3 = new javax.swing.JLabel();
        Empleado4 = new javax.swing.JLabel();
        Empleado5 = new javax.swing.JLabel();
        Empleado6 = new javax.swing.JLabel();
        EtiquetaParticipantes = new javax.swing.JLabel();
        NumeroDeEmpleados = new javax.swing.JComboBox<>();
        Declarar = new javax.swing.JButton();
        Text_Consepto = new javax.swing.JTextArea();
        ConceptoEtiqueta = new javax.swing.JLabel();
        Txt_Ingreso = new javax.swing.JTextField();
        IngresoEtiqueta = new javax.swing.JLabel();
        CreditosImagenes = new javax.swing.JLabel();
        CurriculumMax = new javax.swing.JLabel();
        NombreMax = new javax.swing.JLabel();
        FotoMax = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Ingresos = new javax.swing.JButton();
        Gastos = new javax.swing.JButton();
        Perfil = new javax.swing.JButton();
        Estadisticas = new javax.swing.JButton();
        LearnCam = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        QueEsLearn = new javax.swing.JTextArea();
        TextoIntroduccionLearn = new javax.swing.JLabel();
        UNAM = new javax.swing.JLabel();
        NaranjaClaro = new javax.swing.JLabel();
        NaranjaFuerte = new javax.swing.JLabel();
        GrupoMaxter = new javax.swing.JLabel();
        LineaFondoDeOpciones = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 160, 150));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 140, 130));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 380, 330));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Desarrollador: Daniel Galindo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 200, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("56-17-61-78-41");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 160, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("LearnCam");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 110, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("55-88-33-95-19");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 140, 40));

        Auxiliar.setBackground(new java.awt.Color(255, 255, 255));
        Auxiliar.setOpaque(true);
        getContentPane().add(Auxiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 780, 600));

        MesDelReporte.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        MesDelReporte.setText("Mes del Reporte");
        getContentPane().add(MesDelReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, -1, 30));

        Mes.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 50, 30));

        ReporteMensual.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ReporteMensual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DescargarReporte.png"))); // NOI18N
        ReporteMensual.setText("Descargar Reporte Mensual");
        ReporteMensual.setBorderPainted(false);
        ReporteMensual.setContentAreaFilled(false);
        ReporteMensual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReporteMensual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DescargarReporte.png"))); // NOI18N
        ReporteMensual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DescargarGrande.png"))); // NOI18N
        ReporteMensual.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ReporteMensual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ReporteMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteMensualActionPerformed(evt);
            }
        });
        getContentPane().add(ReporteMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 240, 140));

        ReporteCompleto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ReporteCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DescargarReporte.png"))); // NOI18N
        ReporteCompleto.setText("Descargar Reporte Completo");
        ReporteCompleto.setBorderPainted(false);
        ReporteCompleto.setContentAreaFilled(false);
        ReporteCompleto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReporteCompleto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DescargarReporte.png"))); // NOI18N
        ReporteCompleto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DescargarGrande.png"))); // NOI18N
        ReporteCompleto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ReporteCompleto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ReporteCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(ReporteCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 240, 140));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 190, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 190, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 190, -1));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 190, -1));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 190, -1));

        Etiqueta1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Etiqueta1.setText("Ingreso Bruto Total :");
        getContentPane().add(Etiqueta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 170, -1));

        Etiqueta2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Etiqueta2.setText("Costos Operativos Totales:");
        getContentPane().add(Etiqueta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 220, -1));

        Etiqueta3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Etiqueta3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Etiqueta3.setText("Utilidades Totales:");
        getContentPane().add(Etiqueta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 160, -1));

        Etiqueta4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Etiqueta4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Etiqueta4.setText("Impuetos a Cobrar:");
        getContentPane().add(Etiqueta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 160, -1));

        Etiqueta5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Etiqueta5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Etiqueta5.setText("Utilidades Despues de Impuestos:");
        getContentPane().add(Etiqueta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 270, -1));

        EtiquetaIngresoNeto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EtiquetaIngresoNeto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaIngresoNeto.setText("Ingreso Neto");
        getContentPane().add(EtiquetaIngresoNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 210, -1));

        EtiquetaCostosOperativos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EtiquetaCostosOperativos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaCostosOperativos.setText("Costos Operativos ");
        getContentPane().add(EtiquetaCostosOperativos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 270, -1));

        EtiquetaUtilidad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EtiquetaUtilidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaUtilidad.setText("Utilidades Antes De Impuestos");
        getContentPane().add(EtiquetaUtilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 280, -1));

        EtiquetaUtilidad1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        EtiquetaUtilidad1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaUtilidad1.setText("Utilidades Despues De Impuestos");
        getContentPane().add(EtiquetaUtilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 300, -1));

        impuestosporcentual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33" }));
        getContentPane().add(impuestosporcentual, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 120, -1));

        Impuestos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Impuestos.setText("Porcentaje de impuestos: ");
        getContentPane().add(Impuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 170, 30));
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 210, -1));
        getContentPane().add(Porcentaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 120, -1));
        getContentPane().add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 210, -1));
        getContentPane().add(Porcentaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 120, -1));
        getContentPane().add(Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 210, -1));
        getContentPane().add(Porcentaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 120, -1));
        getContentPane().add(Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 210, -1));
        getContentPane().add(Porcentaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 120, -1));
        getContentPane().add(Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 210, -1));
        getContentPane().add(Porcentaje5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 120, -1));
        getContentPane().add(Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 210, -1));
        getContentPane().add(Porcentaje6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 120, -1));

        PocentajeRemunerado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PocentajeRemunerado.setText("Porcentaje");
        getContentPane().add(PocentajeRemunerado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 80, 20));

        EtiquetaNombreEmpleado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        EtiquetaNombreEmpleado.setText("Nombre de Participante");
        getContentPane().add(EtiquetaNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 160, -1));

        Empleado1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Empleado1.setText("Participante 1:                                                                                                         %");
        getContentPane().add(Empleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 550, -1));

        Empleado2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Empleado2.setText("Participante 2:                                                                                                         %");
        getContentPane().add(Empleado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 540, -1));

        Empleado3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Empleado3.setText("Participante 3:                                                                                                         %");
        getContentPane().add(Empleado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 540, -1));

        Empleado4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Empleado4.setText("Participante 4:                                                                                                         %");
        getContentPane().add(Empleado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 540, -1));

        Empleado5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Empleado5.setText("Participante 5:                                                                                                         %");
        getContentPane().add(Empleado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 540, -1));

        Empleado6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Empleado6.setText("Participante 6:                                                                                                         %");
        getContentPane().add(Empleado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 540, -1));

        EtiquetaParticipantes.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        EtiquetaParticipantes.setText("Numero de Participantes: ");
        getContentPane().add(EtiquetaParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        NumeroDeEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));
        NumeroDeEmpleados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NumeroDeEmpleadosItemStateChanged(evt);
            }
        });
        getContentPane().add(NumeroDeEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 130, -1));

        Declarar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Declarar.setForeground(new java.awt.Color(0, 0, 0));
        Declarar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Declarar.png"))); // NOI18N
        Declarar.setText("Declarar");
        Declarar.setBorderPainted(false);
        Declarar.setContentAreaFilled(false);
        Declarar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Declarar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Declarar.png"))); // NOI18N
        Declarar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DeclararGrande.png"))); // NOI18N
        Declarar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Declarar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeclararActionPerformed(evt);
            }
        });
        getContentPane().add(Declarar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 150, 120));

        Text_Consepto.setColumns(20);
        Text_Consepto.setRows(5);
        getContentPane().add(Text_Consepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 230, 30));

        ConceptoEtiqueta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConceptoEtiqueta.setText("Consepto:");
        getContentPane().add(ConceptoEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 80, -1));
        getContentPane().add(Txt_Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, -1));

        IngresoEtiqueta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        IngresoEtiqueta.setText("Ingreso :");
        getContentPane().add(IngresoEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        CreditosImagenes.setBackground(new java.awt.Color(153, 153, 153));
        CreditosImagenes.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CreditosImagenes.setForeground(new java.awt.Color(204, 204, 204));
        CreditosImagenes.setText("Designed by Dotstudio / Freepik                                                                                  LearnCam-Derechos Reservados");
        getContentPane().add(CreditosImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 760, 20));
        getContentPane().add(CurriculumMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 500, 500));

        NombreMax.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NombreMax.setForeground(new java.awt.Color(51, 51, 51));
        NombreMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreMax.setText("Max Padilla");
        getContentPane().add(NombreMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 140, 30));
        getContentPane().add(FotoMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 120));

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setText("LearnCam");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 70, 20));

        Ingresos.setBackground(new java.awt.Color(0, 0, 0));
        Ingresos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Ingresos.setForeground(new java.awt.Color(0, 0, 0));
        Ingresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GestionIngresosPequeño.png"))); // NOI18N
        Ingresos.setText("Gestion de ingresos");
        Ingresos.setBorderPainted(false);
        Ingresos.setContentAreaFilled(false);
        Ingresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ingresos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GestionIngresosPequeño.png"))); // NOI18N
        Ingresos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GestionIngresosGrande.png"))); // NOI18N
        Ingresos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Ingresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresosActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 120));

        Gastos.setBackground(new java.awt.Color(0, 0, 0));
        Gastos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Gastos.setForeground(new java.awt.Color(0, 0, 0));
        Gastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacionChico.png"))); // NOI18N
        Gastos.setText("Informacion");
        Gastos.setBorderPainted(false);
        Gastos.setContentAreaFilled(false);
        Gastos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Gastos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacionChico.png"))); // NOI18N
        Gastos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/InformacionGrande.png"))); // NOI18N
        Gastos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Gastos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Gastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GastosActionPerformed(evt);
            }
        });
        getContentPane().add(Gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 120));

        Perfil.setBackground(new java.awt.Color(0, 0, 0));
        Perfil.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Perfil.setForeground(new java.awt.Color(0, 0, 0));
        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PerfilPequeño.png"))); // NOI18N
        Perfil.setText("Perfil");
        Perfil.setBorderPainted(false);
        Perfil.setContentAreaFilled(false);
        Perfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Perfil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PerfilPequeño.png"))); // NOI18N
        Perfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PerfilGrande.png"))); // NOI18N
        Perfil.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Perfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });
        getContentPane().add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 120, 120));

        Estadisticas.setBackground(new java.awt.Color(0, 0, 0));
        Estadisticas.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Estadisticas.setForeground(new java.awt.Color(0, 0, 0));
        Estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EstadisticasGrande.png"))); // NOI18N
        Estadisticas.setText("Estadisticas");
        Estadisticas.setBorderPainted(false);
        Estadisticas.setContentAreaFilled(false);
        Estadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Estadisticas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EstadisticasGrande.png"))); // NOI18N
        Estadisticas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EstaditicaGrande.png"))); // NOI18N
        Estadisticas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Estadisticas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(Estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, 120));

        LearnCam.setBorderPainted(false);
        LearnCam.setContentAreaFilled(false);
        LearnCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearnCamActionPerformed(evt);
            }
        });
        getContentPane().add(LearnCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 100));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SalirPequeño.png"))); // NOI18N
        Salir.setText("salir");
        Salir.setContentAreaFilled(false);
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SalirPequeño.png"))); // NOI18N
        Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SalirGrande.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 130, 80));

        QueEsLearn.setEditable(false);
        QueEsLearn.setBackground(new java.awt.Color(255, 153, 0));
        QueEsLearn.setColumns(20);
        QueEsLearn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        QueEsLearn.setForeground(new java.awt.Color(255, 255, 255));
        QueEsLearn.setRows(5);
        QueEsLearn.setText("Learn Cam es una empresa de educación creada \npor Max Padilla, está se encarga principalmente \nde la distribución de material educativo, así como \nrealiza la impartición de diversos cursos en su\nprincipal modalidad a distancia.\n\nEstos cursos son impartidos por alumnos y para \nalumnos, es decir que su principal ventaja es que \nlos asesores conocen las dificultades a las que se\nenfrenta un alumno en estos dias. Los asesores \ncuentan con un alto rendimiento principalmente\negresados de la UNAM y diversas instituciones\nde alto prestigio como el IPN.");
        QueEsLearn.setBorder(null);
        QueEsLearn.setOpaque(false);
        getContentPane().add(QueEsLearn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 420, 300));

        TextoIntroduccionLearn.setBackground(new java.awt.Color(255, 102, 0));
        TextoIntroduccionLearn.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        TextoIntroduccionLearn.setForeground(new java.awt.Color(255, 255, 255));
        TextoIntroduccionLearn.setText("¿Que es Learn Cam y porque es importante?");
        getContentPane().add(TextoIntroduccionLearn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 176, 400, 60));
        getContentPane().add(UNAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, 230));

        NaranjaClaro.setBackground(new java.awt.Color(255, 153, 0));
        NaranjaClaro.setOpaque(true);
        getContentPane().add(NaranjaClaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 460, 360));

        NaranjaFuerte.setBackground(new java.awt.Color(255, 102, 0));
        NaranjaFuerte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NaranjaFuerte.setOpaque(true);
        getContentPane().add(NaranjaFuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 460, 80));

        GrupoMaxter.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        GrupoMaxter.setForeground(new java.awt.Color(0, 0, 0));
        GrupoMaxter.setText("Grupo Empresarial Maxter");
        GrupoMaxter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(GrupoMaxter, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, -1));
        getContentPane().add(LineaFondoDeOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 780, 110));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 750));

        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void IngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresosActionPerformed
        OcultarTodo();
        this.setTitle("LearnCam - Ingresos");
        Declarar.setVisible(true);
        Txt_Ingreso.setVisible(true);
        Text_Consepto.setVisible(true);
        IngresoEtiqueta.setVisible(true);
        ConceptoEtiqueta.setVisible(true);
        NumeroDeEmpleados.setVisible(true);
        EtiquetaParticipantes.setVisible(true);
        Impuestos.setVisible(true);
        impuestosporcentual.setVisible(true);
        impuestosporcentual.setSelectedItem("1");
        Txt_Ingreso.setText("");
        Text_Consepto.setText("");
    }//GEN-LAST:event_IngresosActionPerformed

    private void LearnCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LearnCamActionPerformed
        OcultarTodo();
        MostrarInicio();
        this.setTitle("LearnCam - Principal");

    }//GEN-LAST:event_LearnCamActionPerformed

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        OcultarTodo();
        NombreMax.setVisible(true);
        FotoMax.setVisible(true);
        CurriculumMax.setVisible(true);

        FotoMax.setIcon(Metodos.getImagen("src/img/circuloMax.png",
                FotoMax.getWidth(), FotoMax.getHeight()));
        CurriculumMax.setIcon(Metodos.getImagen("src/img/CurriculumMax.png",
                CurriculumMax.getWidth(), CurriculumMax.getHeight()));
        this.setTitle("LearnCam - Perfil Max Padilla");

    }//GEN-LAST:event_PerfilActionPerformed

    private void EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasActionPerformed

        OcultarTodo();
        this.setTitle("LearnCam - Estadisticas");
        EtiquetaCostosOperativos.setVisible(true);
        EtiquetaIngresoNeto.setVisible(true);
        EtiquetaUtilidad.setVisible(true);
        EtiquetaUtilidad1.setVisible(true);
        Etiqueta1.setVisible(true);
        Etiqueta2.setVisible(true);
        Etiqueta3.setVisible(true);
        Etiqueta4.setVisible(true);
        Etiqueta5.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        ReporteMensual.setVisible(true);
        ReporteCompleto.setVisible(true);
        Mes.setVisible(true);
        MesDelReporte.setVisible(true);
        Mes.setSelectedItem(Metodos.Fecha().substring(3, 5));        
        bandera = true;
        repaint();

    }//GEN-LAST:event_EstadisticasActionPerformed

    private void GastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GastosActionPerformed
        OcultarTodo();
        this.setTitle("LearnCam - informaciòn");
        
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel1.setIcon(Metodos.getImagen("src/img/LogoLearn.png", jLabel1.getWidth(), jLabel1.getHeight()));
        jLabel2.setIcon(Metodos.getImagen("src/img/Whatsapp.png", jLabel2.getWidth(), jLabel2.getHeight()));
        jLabel3.setIcon(Metodos.getImagen("src/img/CurriculumDaniel.jpg", jLabel3.getWidth(), jLabel3.getHeight()));

    }//GEN-LAST:event_GastosActionPerformed

    private void NumeroDeEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NumeroDeEmpleadosItemStateChanged

        int Caso = parseInt((String) NumeroDeEmpleados.getSelectedItem());
        System.out.println(Caso);

        switch (Caso) {
            case 0:
                Empleados(false);
                Porcentaje1.setText("0");
                Nombre1.setText("0");
                Porcentaje2.setText("0");
                Nombre2.setText("0");
                Porcentaje3.setText("0");
                Nombre3.setText("0");
                Porcentaje4.setText("0");
                Nombre4.setText("0");
                Porcentaje5.setText("0");
                Nombre5.setText("0");
                Porcentaje6.setText("0");
                Nombre6.setText("0");
                break;
            case 1:
                Empleados(false);
                EtiquetaNombreEmpleado.setVisible(true);
                PocentajeRemunerado.setVisible(true);
                Empleado1.setVisible(true);
                Porcentaje1.setVisible(true);
                Nombre1.setVisible(true);

                Porcentaje1.setText("0");
                Nombre1.setText("");
                Porcentaje2.setText("0");
                Nombre2.setText("0");
                Porcentaje3.setText("0");
                Nombre3.setText("0");
                Porcentaje4.setText("0");
                Nombre4.setText("0");
                Porcentaje5.setText("0");
                Nombre5.setText("0");
                Porcentaje6.setText("0");
                Nombre6.setText("0");

                break;

            case 2:
                Empleados(false);
                EtiquetaNombreEmpleado.setVisible(true);
                PocentajeRemunerado.setVisible(true);
                Empleado1.setVisible(true);
                Porcentaje1.setVisible(true);
                Nombre1.setVisible(true);
                Empleado2.setVisible(true);
                Porcentaje2.setVisible(true);
                Nombre2.setVisible(true);

                Porcentaje1.setText("0");
                Nombre1.setText("");
                Porcentaje2.setText("0");
                Nombre2.setText("");
                Porcentaje3.setText("0");
                Nombre3.setText("0");
                Porcentaje4.setText("0");
                Nombre4.setText("0");
                Porcentaje5.setText("0");
                Nombre5.setText("0");
                Porcentaje6.setText("0");
                Nombre6.setText("0");
                break;
            case 3:
                Empleados(false);
                EtiquetaNombreEmpleado.setVisible(true);
                PocentajeRemunerado.setVisible(true);
                Empleado1.setVisible(true);
                Porcentaje1.setVisible(true);
                Nombre1.setVisible(true);
                Empleado2.setVisible(true);
                Porcentaje2.setVisible(true);
                Nombre2.setVisible(true);
                Empleado3.setVisible(true);
                Porcentaje3.setVisible(true);
                Nombre3.setVisible(true);
                Porcentaje1.setText("0");
                Nombre1.setText("");
                Porcentaje2.setText("0");
                Nombre2.setText("");
                Porcentaje3.setText("0");
                Nombre3.setText("");
                Porcentaje4.setText("0");
                Nombre4.setText("0");
                Porcentaje5.setText("0");
                Nombre5.setText("0");
                Porcentaje6.setText("0");
                Nombre6.setText("0");
                break;
            case 4:
                Empleados(true);
                Empleado5.setVisible(false);
                Porcentaje5.setVisible(false);
                Nombre5.setVisible(false);
                Empleado6.setVisible(false);
                Porcentaje6.setVisible(false);
                Nombre6.setVisible(false);
                Porcentaje1.setText("0");
                Nombre1.setText("");
                Porcentaje2.setText("0");
                Nombre2.setText("");
                Porcentaje3.setText("0");
                Nombre3.setText("");
                Porcentaje4.setText("0");
                Nombre4.setText("");
                Porcentaje5.setText("0");
                Nombre5.setText("0");
                Porcentaje6.setText("0");
                Nombre6.setText("0");
                break;
            case 5:
                Empleados(true);
                Empleado6.setVisible(false);
                Porcentaje6.setVisible(false);
                Nombre6.setVisible(false);
                Porcentaje1.setText("0");
                Nombre1.setText("");
                Porcentaje2.setText("0");
                Nombre2.setText("");
                Porcentaje3.setText("0");
                Nombre3.setText("");
                Porcentaje4.setText("0");
                Nombre4.setText("");
                Porcentaje5.setText("0");
                Nombre5.setText("");
                Porcentaje6.setText("0");
                Nombre6.setText("0");
                break;
            case 6:
                Empleados(true);
                Porcentaje1.setText("0");
                Nombre1.setText("");
                Porcentaje2.setText("0");
                Nombre2.setText("");
                Porcentaje3.setText("0");
                Nombre3.setText("");
                Porcentaje4.setText("0");
                Nombre4.setText("");
                Porcentaje5.setText("0");
                Nombre5.setText("");
                Porcentaje6.setText("0");
                Nombre6.setText("");
                break;
            default:
                Empleados(false);
                Porcentaje1.setText("0");
                Nombre1.setText("0");
                Porcentaje2.setText("0");
                Nombre2.setText("0");
                Porcentaje3.setText("0");
                Nombre3.setText("0");
                Porcentaje4.setText("0");
                Nombre4.setText("0");
                Porcentaje5.setText("0");
                Nombre5.setText("0");
                Porcentaje6.setText("0");
                Nombre6.setText("0");
                break;

        }

    }//GEN-LAST:event_NumeroDeEmpleadosItemStateChanged

    private void DeclararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeclararActionPerformed
        try {
            if (NumeroDeEmpleados.getSelectedItem().equals("1")) {
                if (Metodos.CampoVacio(Nombre1.getText(), Porcentaje1.getText())
                        || Metodos.CampoVacio(Txt_Ingreso.getText(), Text_Consepto.getText())) {

                    JOptionPane.showMessageDialog(null, "Llena los campos vacios");
                } else if (parseInt(Porcentaje1.getText()) <= 100 && parseInt(Porcentaje1.getText()) >= 0) {

                    int IngresoBruto = parseInt(Txt_Ingreso.getText().trim());
                    int PagoEmpleado1 = (IngresoBruto * parseInt(Porcentaje1.getText().trim())) / 100;
                    int Impuestos = (parseInt((String) impuestosporcentual.getSelectedItem()) * (IngresoBruto - PagoEmpleado1)) / 100;
                    String NombreEmpleado1 = Nombre1.getText().trim();
                    String Consepto = Text_Consepto.getText().trim();
                    String Fecha = Metodos.Fecha();

                    String LineaIngreso = "[" + Fecha + "](" + Consepto + ")[" + IngresoBruto + "]";
                    String LineaCostos = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado1 + ")[" + PagoEmpleado1 + "]";
                    String LineaImpuestos = "[" + Fecha + "](Impuesto de: " + Consepto + ")[" + Impuestos + "]";
                    try {
                        if (BaseIngresos.exists()) {

                            Base.Escribir(BaseIngresos, LineaIngreso);

                        } else {

                            BaseIngresos.createNewFile();
                            Base.Escribir(BaseIngresos, LineaIngreso);

                        }
                        if (BaseGastos.exists()) {
                            Base.Escribir(BaseGastos, LineaCostos);

                        } else {
                            BaseGastos.createNewFile();
                            Base.Escribir(BaseGastos, LineaCostos);
                        }
                        if (BaseImpuestos.exists()) {
                            Base.Escribir(BaseImpuestos, LineaImpuestos);

                        } else {
                            BaseImpuestos.createNewFile();
                            Base.Escribir(BaseImpuestos, LineaImpuestos);
                        }

                    } catch (IOException e) {

                        JOptionPane.showMessageDialog(null, "Error: " + e);

                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Obtenido Correctamente");
                    BorrarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "Porcentaje no puede ser mayor al 100% ni menor al 0%");
                    System.out.println((parseInt(Porcentaje1.getText()) + parseInt((String) impuestosporcentual.getSelectedItem())));
                }

            } else if (NumeroDeEmpleados.getSelectedItem().equals("2")) {
                int auxiliar = parseInt(Porcentaje1.getText());
                auxiliar += parseInt(Porcentaje2.getText());

                if (Metodos.CampoVacio(Nombre1.getText(), Porcentaje1.getText())
                        || Metodos.CampoVacio(Nombre2.getText(), Porcentaje2.getText())
                        || Metodos.CampoVacio(Txt_Ingreso.getText(), Text_Consepto.getText())) {

                    JOptionPane.showMessageDialog(null, "Llena los campos vacios");
                } else if (auxiliar <= 100 && auxiliar >= 0) {

                    int IngresoBruto = parseInt(Txt_Ingreso.getText().trim());
                    int PagoEmpleado1 = (IngresoBruto * parseInt(Porcentaje1.getText().trim())) / 100;
                    int PagoEmpleado2 = (IngresoBruto * parseInt(Porcentaje2.getText().trim())) / 100;
                    int Impuestos = (parseInt((String) impuestosporcentual.getSelectedItem()) * (IngresoBruto - PagoEmpleado1 - PagoEmpleado2)) / 100;
                    String NombreEmpleado1 = Nombre1.getText().trim();
                    String NombreEmpleado2 = Nombre2.getText().trim();
                    String Consepto = Text_Consepto.getText().trim();
                    String Fecha = Metodos.Fecha();

                    String LineaIngreso = "[" + Fecha + "](" + Consepto + ")[" + IngresoBruto + "]";
                    String LineaCostos1 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado1 + ")[" + PagoEmpleado1 + "]";
                    String LineaCostos2 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado2 + ")[" + PagoEmpleado2 + "]";
                    String LineaImpuestos = "[" + Fecha + "](Impuesto de: " + Consepto + ")[" + Impuestos + "]";
                    try {
                        if (BaseIngresos.exists()) {

                            Base.Escribir(BaseIngresos, LineaIngreso);

                        } else {

                            BaseIngresos.createNewFile();
                            Base.Escribir(BaseIngresos, LineaIngreso);

                        }
                        if (BaseGastos.exists()) {
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);

                        } else {
                            BaseGastos.createNewFile();
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                        }
                        if (BaseImpuestos.exists()) {
                            Base.Escribir(BaseImpuestos, LineaImpuestos);

                        } else {
                            BaseImpuestos.createNewFile();
                            Base.Escribir(BaseImpuestos, LineaImpuestos);
                        }

                    } catch (IOException e) {

                        JOptionPane.showMessageDialog(null, "Error: " + e);

                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Obtenido Correctamente");
                    BorrarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "La suma de porcentajes no puede ser mayor al 100%\n ni menor al 0%");
                }

            } else if (NumeroDeEmpleados.getSelectedItem().equals("3")) {

                int auxiliar = parseInt(Porcentaje1.getText());
                auxiliar += parseInt(Porcentaje2.getText());
                auxiliar += parseInt(Porcentaje3.getText());

                if (Metodos.CampoVacio(Nombre1.getText(), Porcentaje1.getText())
                        || Metodos.CampoVacio(Nombre2.getText(), Porcentaje2.getText())
                        || Metodos.CampoVacio(Nombre3.getText(), Porcentaje3.getText())
                        || Metodos.CampoVacio(Txt_Ingreso.getText(), Text_Consepto.getText())) {

                    JOptionPane.showMessageDialog(null, "Llena los campos vacios");
                } else if (auxiliar <= 100 && auxiliar >= 0) {
                    int IngresoBruto = parseInt(Txt_Ingreso.getText().trim());
                    int PagoEmpleado1 = (IngresoBruto * parseInt(Porcentaje1.getText().trim())) / 100;
                    int PagoEmpleado2 = (IngresoBruto * parseInt(Porcentaje2.getText().trim())) / 100;
                    int PagoEmpleado3 = (IngresoBruto * parseInt(Porcentaje3.getText().trim())) / 100;
                    int Impuestos = (parseInt((String) impuestosporcentual.getSelectedItem())
                            * (IngresoBruto - PagoEmpleado1 - PagoEmpleado2 - PagoEmpleado3)) / 100;

                    String NombreEmpleado1 = Nombre1.getText().trim();
                    String NombreEmpleado2 = Nombre2.getText().trim();
                    String NombreEmpleado3 = Nombre3.getText().trim();
                    String Consepto = Text_Consepto.getText().trim();
                    String Fecha = Metodos.Fecha();

                    String LineaIngreso = "[" + Fecha + "](" + Consepto + ")[" + IngresoBruto + "]";
                    String LineaCostos1 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado1 + ")[" + PagoEmpleado1 + "]";
                    String LineaCostos2 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado2 + ")[" + PagoEmpleado2 + "]";
                    String LineaCostos3 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado3 + ")[" + PagoEmpleado3 + "]";
                    String LineaImpuestos = "[" + Fecha + "](Impuesto de: " + Consepto + ")[" + Impuestos + "]";
                    try {
                        if (BaseIngresos.exists()) {

                            Base.Escribir(BaseIngresos, LineaIngreso);

                        } else {

                            BaseIngresos.createNewFile();
                            Base.Escribir(BaseIngresos, LineaIngreso);

                        }
                        if (BaseGastos.exists()) {
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);

                        } else {
                            BaseGastos.createNewFile();
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);
                        }
                        if (BaseImpuestos.exists()) {
                            Base.Escribir(BaseImpuestos, LineaImpuestos);

                        } else {
                            BaseImpuestos.createNewFile();
                            Base.Escribir(BaseImpuestos, LineaImpuestos);
                        }

                    } catch (IOException e) {

                        JOptionPane.showMessageDialog(null, "Error: " + e);

                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Obtenido Correctamente");
                    BorrarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "La suma de porcentajes no puede ser mayor al 100%\n ni menor al 0%");
                }

            } else if (NumeroDeEmpleados.getSelectedItem().equals("4")) {

                int auxiliar = parseInt(Porcentaje1.getText());
                auxiliar += parseInt(Porcentaje2.getText());
                auxiliar += parseInt(Porcentaje3.getText());
                auxiliar += parseInt(Porcentaje4.getText());

                if (Metodos.CampoVacio(Nombre1.getText(), Porcentaje1.getText())
                        || Metodos.CampoVacio(Nombre2.getText(), Porcentaje2.getText())
                        || Metodos.CampoVacio(Nombre3.getText(), Porcentaje3.getText())
                        || Metodos.CampoVacio(Nombre4.getText(), Porcentaje4.getText())
                        || Metodos.CampoVacio(Txt_Ingreso.getText(), Text_Consepto.getText())) {

                    JOptionPane.showMessageDialog(null, "Llena los campos vacios");
                } else if (auxiliar <= 100 && auxiliar >= 0) {

                    int IngresoBruto = parseInt(Txt_Ingreso.getText().trim());
                    int PagoEmpleado1 = (IngresoBruto * parseInt(Porcentaje1.getText().trim())) / 100;
                    int PagoEmpleado2 = (IngresoBruto * parseInt(Porcentaje2.getText().trim())) / 100;
                    int PagoEmpleado3 = (IngresoBruto * parseInt(Porcentaje3.getText().trim())) / 100;
                    int PagoEmpleado4 = (IngresoBruto * parseInt(Porcentaje4.getText().trim())) / 100;
                    int Impuestos = (parseInt((String) impuestosporcentual.getSelectedItem())
                            * (IngresoBruto - PagoEmpleado1 - PagoEmpleado2 - PagoEmpleado3 - PagoEmpleado4)) / 100;

                    String NombreEmpleado1 = Nombre1.getText().trim();
                    String NombreEmpleado2 = Nombre2.getText().trim();
                    String NombreEmpleado3 = Nombre3.getText().trim();
                    String NombreEmpleado4 = Nombre4.getText().trim();
                    String Consepto = Text_Consepto.getText().trim();
                    String Fecha = Metodos.Fecha();

                    String LineaIngreso = "[" + Fecha + "](" + Consepto + ")[" + IngresoBruto + "]";
                    String LineaCostos1 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado1 + ")[" + PagoEmpleado1 + "]";
                    String LineaCostos2 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado2 + ")[" + PagoEmpleado2 + "]";
                    String LineaCostos3 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado3 + ")[" + PagoEmpleado3 + "]";
                    String LineaCostos4 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado4 + ")[" + PagoEmpleado4 + "]";
                    String LineaImpuestos = "[" + Fecha + "](Impuesto de: " + Consepto + ")[" + Impuestos + "]";
                    try {
                        if (BaseIngresos.exists()) {

                            Base.Escribir(BaseIngresos, LineaIngreso);

                        } else {

                            BaseIngresos.createNewFile();
                            Base.Escribir(BaseIngresos, LineaIngreso);

                        }
                        if (BaseGastos.exists()) {
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);
                            Base.Escribir(BaseGastos, LineaCostos4);

                        } else {
                            BaseGastos.createNewFile();
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);
                            Base.Escribir(BaseGastos, LineaCostos4);
                        }
                        if (BaseImpuestos.exists()) {
                            Base.Escribir(BaseImpuestos, LineaImpuestos);

                        } else {
                            BaseImpuestos.createNewFile();
                            Base.Escribir(BaseImpuestos, LineaImpuestos);
                        }

                    } catch (IOException e) {

                        JOptionPane.showMessageDialog(null, "Error: " + e);

                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Obtenido Correctamente");
                    BorrarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "La suma de porcentajes no puede ser mayor al 100%\n ni menor al 0%");
                }

            } else if (NumeroDeEmpleados.getSelectedItem().equals("5")) {

                int auxiliar = parseInt(Porcentaje1.getText());
                auxiliar += parseInt(Porcentaje2.getText());
                auxiliar += parseInt(Porcentaje3.getText());
                auxiliar += parseInt(Porcentaje4.getText());
                auxiliar += parseInt(Porcentaje5.getText());

                if (Metodos.CampoVacio(Nombre1.getText(), Porcentaje1.getText())
                        || Metodos.CampoVacio(Nombre2.getText(), Porcentaje2.getText())
                        || Metodos.CampoVacio(Nombre3.getText(), Porcentaje3.getText())
                        || Metodos.CampoVacio(Nombre4.getText(), Porcentaje4.getText())
                        || Metodos.CampoVacio(Nombre5.getText(), Porcentaje5.getText())
                        || Metodos.CampoVacio(Txt_Ingreso.getText(), Text_Consepto.getText())) {

                    JOptionPane.showMessageDialog(null, "Llena los campos vacios");
                } else if (auxiliar <= 100 && auxiliar >= 0) {

                    int IngresoBruto = parseInt(Txt_Ingreso.getText().trim());
                    int PagoEmpleado1 = (IngresoBruto * parseInt(Porcentaje1.getText().trim())) / 100;
                    int PagoEmpleado2 = (IngresoBruto * parseInt(Porcentaje2.getText().trim())) / 100;
                    int PagoEmpleado3 = (IngresoBruto * parseInt(Porcentaje3.getText().trim())) / 100;
                    int PagoEmpleado4 = (IngresoBruto * parseInt(Porcentaje4.getText().trim())) / 100;
                    int PagoEmpleado5 = (IngresoBruto * parseInt(Porcentaje5.getText().trim())) / 100;
                    int Impuestos = (parseInt((String) impuestosporcentual.getSelectedItem())
                            * (IngresoBruto - PagoEmpleado1 - PagoEmpleado2 - PagoEmpleado3 - PagoEmpleado4 - PagoEmpleado5)) / 100;

                    String NombreEmpleado1 = Nombre1.getText().trim();
                    String NombreEmpleado2 = Nombre2.getText().trim();
                    String NombreEmpleado3 = Nombre3.getText().trim();
                    String NombreEmpleado4 = Nombre4.getText().trim();
                    String NombreEmpleado5 = Nombre5.getText().trim();
                    String Consepto = Text_Consepto.getText().trim();
                    String Fecha = Metodos.Fecha();

                    String LineaIngreso = "[" + Fecha + "](" + Consepto + ")[" + IngresoBruto + "]";
                    String LineaCostos1 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado1 + ")[" + PagoEmpleado1 + "]";
                    String LineaCostos2 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado2 + ")[" + PagoEmpleado2 + "]";
                    String LineaCostos3 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado3 + ")[" + PagoEmpleado3 + "]";
                    String LineaCostos4 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado4 + ")[" + PagoEmpleado4 + "]";
                    String LineaCostos5 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado5 + ")[" + PagoEmpleado5 + "]";
                    String LineaImpuestos = "[" + Fecha + "](Impuesto de: " + Consepto + ")[" + Impuestos + "]";
                    try {
                        if (BaseIngresos.exists()) {

                            Base.Escribir(BaseIngresos, LineaIngreso);

                        } else {

                            BaseIngresos.createNewFile();
                            Base.Escribir(BaseIngresos, LineaIngreso);

                        }
                        if (BaseGastos.exists()) {
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);
                            Base.Escribir(BaseGastos, LineaCostos4);
                            Base.Escribir(BaseGastos, LineaCostos5);

                        } else {
                            BaseGastos.createNewFile();
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);
                            Base.Escribir(BaseGastos, LineaCostos4);
                            Base.Escribir(BaseGastos, LineaCostos5);
                        }
                        if (BaseImpuestos.exists()) {
                            Base.Escribir(BaseImpuestos, LineaImpuestos);

                        } else {
                            BaseImpuestos.createNewFile();
                            Base.Escribir(BaseImpuestos, LineaImpuestos);
                        }

                    } catch (IOException e) {

                        JOptionPane.showMessageDialog(null, "Error: " + e);

                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Obtenido Correctamente");
                    BorrarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "La suma de porcentajes no puede ser mayor al 100%\n ni menor al 0%");
                }

            } else if (NumeroDeEmpleados.getSelectedItem().equals("6")) {

                int auxiliar = parseInt(Porcentaje1.getText());
                auxiliar += parseInt(Porcentaje2.getText());
                auxiliar += parseInt(Porcentaje3.getText());
                auxiliar += parseInt(Porcentaje4.getText());
                auxiliar += parseInt(Porcentaje5.getText());
                auxiliar += parseInt(Porcentaje6.getText());

                if (Metodos.CampoVacio(Nombre1.getText(), Porcentaje1.getText())
                        || Metodos.CampoVacio(Nombre2.getText(), Porcentaje2.getText())
                        || Metodos.CampoVacio(Nombre3.getText(), Porcentaje3.getText())
                        || Metodos.CampoVacio(Nombre4.getText(), Porcentaje4.getText())
                        || Metodos.CampoVacio(Nombre5.getText(), Porcentaje5.getText())
                        || Metodos.CampoVacio(Nombre6.getText(), Porcentaje6.getText())
                        || Metodos.CampoVacio(Txt_Ingreso.getText(), Text_Consepto.getText())) {

                    JOptionPane.showMessageDialog(null, "Llena los campos vacios");
                } else if (auxiliar <= 100 && auxiliar >= 0) {

                    int IngresoBruto = parseInt(Txt_Ingreso.getText().trim());
                    int PagoEmpleado1 = (IngresoBruto * parseInt(Porcentaje1.getText().trim())) / 100;
                    int PagoEmpleado2 = (IngresoBruto * parseInt(Porcentaje2.getText().trim())) / 100;
                    int PagoEmpleado3 = (IngresoBruto * parseInt(Porcentaje3.getText().trim())) / 100;
                    int PagoEmpleado4 = (IngresoBruto * parseInt(Porcentaje4.getText().trim())) / 100;
                    int PagoEmpleado5 = (IngresoBruto * parseInt(Porcentaje5.getText().trim())) / 100;
                    int PagoEmpleado6 = (IngresoBruto * parseInt(Porcentaje6.getText().trim())) / 100;
                    int Impuestos = (parseInt((String) impuestosporcentual.getSelectedItem())
                            * (IngresoBruto - PagoEmpleado1 - PagoEmpleado2 - PagoEmpleado3 - PagoEmpleado4 - PagoEmpleado5 - PagoEmpleado6)) / 100;

                    String NombreEmpleado1 = Nombre1.getText().trim();
                    String NombreEmpleado2 = Nombre2.getText().trim();
                    String NombreEmpleado3 = Nombre3.getText().trim();
                    String NombreEmpleado4 = Nombre4.getText().trim();
                    String NombreEmpleado5 = Nombre5.getText().trim();
                    String NombreEmpleado6 = Nombre6.getText().trim();
                    String Consepto = Text_Consepto.getText().trim();
                    String Fecha = Metodos.Fecha();

                    String LineaIngreso = "[" + Fecha + "](" + Consepto + ")[" + IngresoBruto + "]";
                    String LineaCostos1 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado1 + ")[" + PagoEmpleado1 + "]";
                    String LineaCostos2 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado2 + ")[" + PagoEmpleado2 + "]";
                    String LineaCostos3 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado3 + ")[" + PagoEmpleado3 + "]";
                    String LineaCostos4 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado4 + ")[" + PagoEmpleado4 + "]";
                    String LineaCostos5 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado5 + ")[" + PagoEmpleado5 + "]";
                    String LineaCostos6 = "[" + Fecha + "](Trabajo Realizado de: " + NombreEmpleado6 + ")[" + PagoEmpleado6 + "]";
                    String LineaImpuestos = "[" + Fecha + "](Impuesto de: " + Consepto + ")[" + Impuestos + "]";
                    try {
                        if (BaseIngresos.exists()) {

                            Base.Escribir(BaseIngresos, LineaIngreso);

                        } else {

                            BaseIngresos.createNewFile();
                            Base.Escribir(BaseIngresos, LineaIngreso);

                        }
                        if (BaseGastos.exists()) {
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);
                            Base.Escribir(BaseGastos, LineaCostos4);
                            Base.Escribir(BaseGastos, LineaCostos5);
                            Base.Escribir(BaseGastos, LineaCostos6);

                        } else {
                            BaseGastos.createNewFile();
                            Base.Escribir(BaseGastos, LineaCostos1);
                            Base.Escribir(BaseGastos, LineaCostos2);
                            Base.Escribir(BaseGastos, LineaCostos3);
                            Base.Escribir(BaseGastos, LineaCostos4);
                            Base.Escribir(BaseGastos, LineaCostos5);
                            Base.Escribir(BaseGastos, LineaCostos6);
                        }
                        if (BaseImpuestos.exists()) {
                            Base.Escribir(BaseImpuestos, LineaImpuestos);

                        } else {
                            BaseImpuestos.createNewFile();
                            Base.Escribir(BaseImpuestos, LineaImpuestos);
                        }

                    } catch (IOException e) {

                        JOptionPane.showMessageDialog(null, "Error: " + e);

                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Obtenido Correctamente");
                    BorrarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "La suma de porcentajes no puede ser mayor al 100%\n ni menor al 0%");
                }

            } else {

                if (Metodos.CampoVacio(Txt_Ingreso.getText(), Text_Consepto.getText())) {
                    JOptionPane.showMessageDialog(null, "Llena todos los campos");
                } else {
                    int IngresoBruto = parseInt(Txt_Ingreso.getText().trim());
                    int Impuestos = (parseInt((String) impuestosporcentual.getSelectedItem()) * IngresoBruto) / 100;
                    String Consepto = Text_Consepto.getText().trim();
                    String Fecha = Metodos.Fecha();

                    String LineaIngreso = "[" + Fecha + "](" + Consepto + ")[" + IngresoBruto + "]";
                    String LineaImpuestos = "[" + Fecha + "](Impuesto de: " + Consepto + ")[" + Impuestos + "]";
                    try {
                        if (BaseIngresos.exists()) {

                            Base.Escribir(BaseIngresos, LineaIngreso);

                        } else {

                            BaseIngresos.createNewFile();
                            Base.Escribir(BaseIngresos, LineaIngreso);

                        }
                        if (BaseImpuestos.exists()) {
                            Base.Escribir(BaseImpuestos, LineaImpuestos);

                        } else {
                            BaseImpuestos.createNewFile();
                            Base.Escribir(BaseImpuestos, LineaImpuestos);
                        }

                    } catch (IOException e) {

                        JOptionPane.showMessageDialog(null, "Error: " + e);

                    }
                    JOptionPane.showMessageDialog(null, "Ingreso Obtenido Correctamente");
                    BorrarCampos();

                }

            }

        } catch (HeadlessException e) {

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa solo numeros");

        }


    }//GEN-LAST:event_DeclararActionPerformed

    private void ReporteMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteMensualActionPerformed
        if (BaseGastos.exists()) {

        } else {
            try {
                BaseGastos.createNewFile();
            } catch (Exception e) {

            }
        }
        if (BaseIngresos.exists()) {

        } else {
            try {
                BaseIngresos.createNewFile();
            } catch (Exception e) {

            }

        }
        if (BaseImpuestos.exists()) {

        } else {
            try {
                BaseImpuestos.createNewFile();
            } catch (Exception e) {

            }

        }

        try {
            Base.InformePDFMensual((String) Mes.getSelectedItem());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El reporte no pudo ser generado");
        }


    }//GEN-LAST:event_ReporteMensualActionPerformed

    private void ReporteCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteCompletoActionPerformed
        Base.ReporteCompleto();
    }//GEN-LAST:event_ReporteCompletoActionPerformed

    public void BorrarCampos() {
        OcultarTodo();
        Declarar.setVisible(true);
        Txt_Ingreso.setVisible(true);
        Text_Consepto.setVisible(true);
        IngresoEtiqueta.setVisible(true);
        ConceptoEtiqueta.setVisible(true);
        NumeroDeEmpleados.setVisible(true);
        EtiquetaParticipantes.setVisible(true);
        Txt_Ingreso.setText("");
        Text_Consepto.setText("");
        Impuestos.setVisible(true);
        impuestosporcentual.setVisible(true);
        impuestosporcentual.setSelectedItem("1");
    }

    public void Empleados(boolean bolean) {
        Empleado1.setVisible(bolean);
        Empleado2.setVisible(bolean);
        Empleado3.setVisible(bolean);
        Empleado4.setVisible(bolean);
        Empleado5.setVisible(bolean);
        Empleado6.setVisible(bolean);
        EtiquetaNombreEmpleado.setVisible(bolean);
        PocentajeRemunerado.setVisible(bolean);
        Porcentaje1.setVisible(bolean);
        Porcentaje2.setVisible(bolean);
        Porcentaje3.setVisible(bolean);
        Porcentaje4.setVisible(bolean);
        Porcentaje5.setVisible(bolean);
        Porcentaje6.setVisible(bolean);
        Nombre1.setVisible(bolean);
        Nombre2.setVisible(bolean);
        Nombre3.setVisible(bolean);
        Nombre4.setVisible(bolean);
        Nombre5.setVisible(bolean);
        Nombre6.setVisible(bolean);
    }
    boolean bandera = false;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (bandera) {

            double IngresoBruto = 0;
            double Costos = 0;
            double Impuestos = 0;

            for (int i = 0; i < Base.contador(BaseIngresos); i++) {
                String auxiliar = Base.Obtener(BaseIngresos)[i][2];
                IngresoBruto += parseInt(auxiliar.substring(1, auxiliar.length() - 1));
            }

            for (int i = 0; i < Base.contador(BaseGastos); i++) {
                String auxiliar = Base.Obtener(BaseGastos)[i][2];
                Costos += parseInt(auxiliar.substring(1, auxiliar.length() - 1));
            }

            for (int i = 0; i < Base.contador(BaseImpuestos); i++) {
                String auxiliar = Base.Obtener(BaseImpuestos)[i][2];
                Impuestos += parseInt(auxiliar.substring(1, auxiliar.length() - 1));
            }

            double Utilidades = IngresoBruto - Costos;
            double UtilidadesDespuesDeImpuestos = Utilidades - Impuestos;

            int PorcentajeCostos = (int) Math.ceil((Costos / IngresoBruto) * 100);
            int PorcentajeUtilidades = (int) Math.ceil((Utilidades / IngresoBruto) * 100);
            int PorcentajeUtilidadesImpuestos = (int) Math.ceil((UtilidadesDespuesDeImpuestos / IngresoBruto) * 100);

            int anchoC = (int) Math.ceil((PorcentajeCostos * 330) / 100);
            int anchoU = (int) Math.ceil((PorcentajeUtilidades * 330) / 100);
            int anchoUCI = (int) Math.ceil((PorcentajeUtilidadesImpuestos * 330) / 100);

            g.setColor(new Color(0, 153, 0));
            g.fillRect(310, 210, 330, 30);

            g.setColor(new Color(255, 102, 0));
            g.fillRect(310, 250, anchoC, 30);

            g.setColor(new Color(255, 204, 0));
            g.fillRect(310, 290, anchoU, 30);

            g.setColor(new Color(0, 51, 51));
            g.fillRect(310, 330, anchoUCI, 30);

            jTextField1.setText(IngresoBruto + "");
            jTextField2.setText(Costos + "");
            jTextField3.setText(Utilidades + "");
            jTextField4.setText(Impuestos + "");
            jTextField5.setText(UtilidadesDespuesDeImpuestos + "");
            

        }

    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Auxiliar;
    private javax.swing.JLabel ConceptoEtiqueta;
    private javax.swing.JLabel CreditosImagenes;
    private javax.swing.JLabel CurriculumMax;
    private javax.swing.JButton Declarar;
    private javax.swing.JLabel Empleado1;
    private javax.swing.JLabel Empleado2;
    private javax.swing.JLabel Empleado3;
    private javax.swing.JLabel Empleado4;
    private javax.swing.JLabel Empleado5;
    private javax.swing.JLabel Empleado6;
    private javax.swing.JButton Estadisticas;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JLabel Etiqueta3;
    private javax.swing.JLabel Etiqueta4;
    private javax.swing.JLabel Etiqueta5;
    private javax.swing.JLabel EtiquetaCostosOperativos;
    private javax.swing.JLabel EtiquetaIngresoNeto;
    private javax.swing.JLabel EtiquetaNombreEmpleado;
    private javax.swing.JLabel EtiquetaParticipantes;
    private javax.swing.JLabel EtiquetaUtilidad;
    private javax.swing.JLabel EtiquetaUtilidad1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FotoMax;
    private javax.swing.JButton Gastos;
    private javax.swing.JLabel GrupoMaxter;
    private javax.swing.JLabel Impuestos;
    private javax.swing.JLabel IngresoEtiqueta;
    private javax.swing.JButton Ingresos;
    private javax.swing.JButton LearnCam;
    private javax.swing.JLabel LineaFondoDeOpciones;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JLabel MesDelReporte;
    private javax.swing.JLabel NaranjaClaro;
    private javax.swing.JLabel NaranjaFuerte;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JTextField Nombre3;
    private javax.swing.JTextField Nombre4;
    private javax.swing.JTextField Nombre5;
    private javax.swing.JTextField Nombre6;
    private javax.swing.JLabel NombreMax;
    private javax.swing.JComboBox<String> NumeroDeEmpleados;
    private javax.swing.JButton Perfil;
    private javax.swing.JLabel PocentajeRemunerado;
    private javax.swing.JTextField Porcentaje1;
    private javax.swing.JTextField Porcentaje2;
    private javax.swing.JTextField Porcentaje3;
    private javax.swing.JTextField Porcentaje4;
    private javax.swing.JTextField Porcentaje5;
    private javax.swing.JTextField Porcentaje6;
    private javax.swing.JTextArea QueEsLearn;
    private javax.swing.JButton ReporteCompleto;
    private javax.swing.JButton ReporteMensual;
    private javax.swing.JButton Salir;
    private javax.swing.JTextArea Text_Consepto;
    private javax.swing.JLabel TextoIntroduccionLearn;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Txt_Ingreso;
    private javax.swing.JLabel UNAM;
    private javax.swing.JComboBox<String> impuestosporcentual;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
