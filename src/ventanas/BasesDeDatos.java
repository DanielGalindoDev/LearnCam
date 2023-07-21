package ventanas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import static java.awt.Component.TOP_ALIGNMENT;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.IOException;
import javax.swing.JOptionPane;

public class BasesDeDatos {

    MetodosComunes metodos = new MetodosComunes();

    //Metodo que crea la base de datos de Login 
    public void CrearBase(File Base) throws IOException {

        Base.createNewFile();//crea el archivo en la ruta especificada
        try (BufferedWriter PrimeraLinea = new BufferedWriter(new FileWriter(Base))) {
            PrimeraLinea.write("(Max)[LearnCam]\n(1)[1]\n");//escribe los usuarios por defecto 
        } catch (Exception e) {

        }
    }

    //Metodo que busca que los datos ingresados en el login se encuentren en la base 
    public boolean BuscarBase(File Base, String Usuario, String Contraseña) throws FileNotFoundException, IOException {

        String auxiliar = "";//solo se utiliza para guardar el valor de leer
        BufferedReader leer = new BufferedReader(new FileReader(Base));//creamos un bufer para leer el archivo
        while ((auxiliar = leer.readLine()) != null) {//ciclo que verifica que la lista se recorra completa

            if (auxiliar.trim().equals("(" + Usuario + ")[" + Contraseña + "]")) {//comparamos si existe en dato en la base 

                return true;//si se encuentra en la base regresa un valor verdadero 
            }

        }
        return false;//si no existe en la base, se debuelve un valor falso 
    }

    //Base de datos (Escribe) 
    public void Escribir(File Base, String Cadena) throws IOException {

        try (BufferedWriter br = new BufferedWriter(new FileWriter(Base, true))) {
            br.write(Cadena + "\n");
        } catch (IOException e) {
        }
    }

    //Base de datos (Devuelve una matris con los datos de la base)
    public String[][] Obtener(File Base) {

        try (BufferedReader br = new BufferedReader(new FileReader(Base))) {
            String Linea = "";
            String[][] Datos = new String[contador(Base)][3];

            for (int o = 0; (Linea = br.readLine()) != null; o++) {
                String Fecha = "";
                String Consepto = "";
                String Gasto = "";

                for (int i = 0; i < Linea.length(); i++) {
                    if (Linea.substring(i, i + 1).equals("[") && i < 11) {
                        while (!"(".equals(Linea.substring(i, i + 1))) {
                            Fecha += Linea.substring(i, i + 1);
                            Datos[o][0] = Fecha;
                            i++;
                        }
                    }
                    if (Linea.substring(i, i + 1).equals("(")) {
                        while (!"[".equals(Linea.substring(i, i + 1))) {
                            Consepto += Linea.substring(i, i + 1);
                            Datos[o][1] = Consepto;
                            i++;
                        }

                    }
                    if (Linea.substring(i, i + 1).equals("[")) {
                        Gasto = Linea.substring(i, Linea.length());
                        Datos[o][2] = Gasto;
                    }

                }
            }
            return Datos;

        } catch (IOException e) {

        }
        return null;

    }

    public int contador(File Base) {
        String ContadordeLineas = "";
        int contador = 0;

        try (BufferedReader br1 = new BufferedReader(new FileReader(Base))) {
            while ((ContadordeLineas = br1.readLine()) != null) {
                contador++;
            }
        } catch (IOException e) {
        }
        return contador;
    }

    public void InformePDFMensual(String mes) {
        Document PDF = new Document();
        String mes1 = "";
        switch (mes) {
            case "01":
                mes1 = "Enero";
                break;
            case "02":
                mes1 = "Febrero";
                break;
            case "03":
                mes1 = "Marzo";
                break;
            case "04":
                mes1 = "Abril";
                break;
            case "05":
                mes1 = "Mayo";
                break;
            case "06":
                mes1 = "Junio";
                break;
            case "07":
                mes1 = "Julio";
                break;
            case "08":
                mes1 = "Agosto";
                break;
            case "09":
                mes1 = "Septiembre";
                break;
            case "10":
                mes1 = "Octubre";
                break;
            case "11":
                mes1 = "Noviembre";
                break;
            case "12":
                mes1 = "Diciembre";
                break;

        }

        try {
            String ruta1 = System.getProperty("user.home");
            PdfWriter.getInstance(PDF, new FileOutputStream(ruta1 + "/desktop/Reporte Mensual " + mes1 + ".pdf"));
            System.out.println(ruta1);

            Image Banner = Image.getInstance("src/img/ReporteMensualBaner.png");
            Banner.scaleToFit(500, 100);
            Banner.setAlignment(Chunk.ALIGN_CENTER);

            PDF.open();

            PDF.add(Banner);
            PDF.add(setFuente("\n"+mes1+" "+metodos.Fecha().substring(6,10), 15, 3, 1));
            PDF.add(setFuente("\nIngresos                     \n\n", 10, 3, 3));

            PdfPTable tabla = new PdfPTable(3);
            tabla.setTotalWidth(MAXIMIZED_BOTH);
            tabla.setSpacingAfter(TOP_ALIGNMENT);

            tabla.addCell(setFuente("Fecha", 10, 3, 1));
            tabla.addCell(setFuente("Concepto", 9, 3, 1));
            tabla.addCell(setFuente("Monto", 10, 3, 1));
            String[][] Ingresos = new String[contador(new File("Ingresos.txt"))][3];
            Ingresos = Obtener(new File("Ingresos.txt"));            
            int i = 0;
            int ingresos = 0;

            while (i < Ingresos.length) {

                if (Ingresos[i][0].substring(4, 6).equals(mes) && Ingresos[i][0].substring(7, 11).equals(metodos.Fecha().substring(6,10))) {
                    tabla.addCell(setFuente(Ingresos[i][0], 10, 1, 2));
                    tabla.addCell(setFuente(Ingresos[i][1], 10, 1, 2));
                    tabla.addCell(setFuente(Ingresos[i][2], 10, 1, 2));
                    String auxiliar = Ingresos[i][2];
                    ingresos += Integer.parseInt(auxiliar.substring(1, auxiliar.length() - 1));
                }

                i++;
            }
            tabla.addCell("");
            tabla.addCell(setFuente("Total:", 10, 1, 2));

            tabla.addCell(setFuente(ingresos + "", 10, 1, 2));
            PDF.add(tabla);

            PDF.add(setFuente("\nCostos del mes                    \n\n", 10, 3, 3));

            PdfPTable tablaCostos = new PdfPTable(3);
            tablaCostos.setTotalWidth(MAXIMIZED_BOTH);
            tablaCostos.setSpacingAfter(TOP_ALIGNMENT);

            tablaCostos.addCell(setFuente("Fecha", 10, 3, 1));
            tablaCostos.addCell(setFuente("Concepto", 9, 3, 1));
            tablaCostos.addCell(setFuente("Monto", 10, 3, 1));
            String[][] Costos = new String[contador(new File("Gastos.txt"))][3];
            Costos = Obtener(new File("Gastos.txt"));

            System.out.println(Costos[0][0].substring(4, 6));
            System.out.println(metodos.Fecha().substring(3, 5));
            int j = 0;
            int costos = 0;

            while (j < Costos.length) {

                if (Costos[j][0].substring(4, 6).equals(mes) && Costos[j][0].substring(7, 11).equals(metodos.Fecha().substring(6,10))) {
                    tablaCostos.addCell(setFuente(Costos[j][0], 10, 1, 2));
                    tablaCostos.addCell(setFuente(Costos[j][1], 10, 1, 2));
                    tablaCostos.addCell(setFuente(Costos[j][2], 10, 1, 2));
                    String auxiliar = Costos[j][2];
                    costos += Integer.parseInt(auxiliar.substring(1, auxiliar.length() - 1));
                }

                j++;
            }
            tablaCostos.addCell("");
            tablaCostos.addCell(setFuente("Total:", 10, 1, 2));

            tablaCostos.addCell(setFuente(costos + "", 10, 1, 2));
            PDF.add(tablaCostos);

            PDF.add(setFuente("\nImpuestos a pagar                   \n\n", 10, 3, 3));

            PdfPTable tablaImpuestos = new PdfPTable(3);
            tablaImpuestos.setTotalWidth(MAXIMIZED_BOTH);
            tablaImpuestos.setSpacingAfter(TOP_ALIGNMENT);

            tablaImpuestos.addCell(setFuente("Fecha", 10, 3, 1));
            tablaImpuestos.addCell(setFuente("Concepto", 9, 3, 1));
            tablaImpuestos.addCell(setFuente("Monto", 10, 3, 1));
            String[][] Impuestos = new String[contador(new File("Impuestos.txt"))][3];
            Impuestos = Obtener(new File("Impuestos.txt"));            
            int k = 0;
            int impuestos = 0;

            while (k < Impuestos.length) {

                if (Impuestos[k][0].substring(4, 6).equals(mes) && Impuestos[k][0].substring(7, 11).equals(metodos.Fecha().substring(6,10))) {
                    tablaImpuestos.addCell(setFuente(Impuestos[k][0], 10, 1, 2));
                    tablaImpuestos.addCell(setFuente(Impuestos[k][1], 10, 1, 2));
                    tablaImpuestos.addCell(setFuente(Impuestos[k][2], 10, 1, 2));
                    String auxiliar = Impuestos[k][2];
                    impuestos += Integer.parseInt(auxiliar.substring(1, auxiliar.length() - 1));
                }

                k++;
            }

            tablaImpuestos.addCell("");
            tablaImpuestos.addCell(setFuente("Total:", 10, 1, 2));

            tablaImpuestos.addCell(setFuente(impuestos + "", 10, 1, 2));
            PDF.add(tablaImpuestos);
            PDF.newPage();
            PDF.add(setFuente("Estadisticas Generales", 15, 3, 1));
            PDF.add(setFuente("\n\n                                  Ingresos: " + ingresos, 10, 2, 2));
            PDF.add(setFuente("                                  Gastos: " + costos, 10, 2, 2));
            PDF.add(setFuente("                                  Impuestos: " + impuestos, 10, 2, 2));
            PDF.add(setFuente("                                  Utilidades: " + (ingresos - costos), 10, 2, 2));
            PDF.add(setFuente("                                  Utilidades despues de impuetsos: " + (ingresos - costos - impuestos), 10, 2, 2));

            PDF.close();
            JOptionPane.showMessageDialog(null, "Reporte Generado Correctamente");

        } catch (DocumentException | IOException e) {
            PDF.close();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte");

        }

    }

    public void ReporteCompleto() {
        Document PDF = new Document();

        try {
            String ruta1 = System.getProperty("user.home");
            String ruta2 = metodos.Fecha().trim() + "";
            PdfWriter.getInstance(PDF, new FileOutputStream(ruta1 + "/desktop/Reporte Completo " + ruta2 + ".pdf"));
            System.out.println(ruta1);

            Image Banner = Image.getInstance("src/img/ReporteCompletoBaner.png");
            Banner.scaleToFit(500, 100);
            Banner.setAlignment(Chunk.ALIGN_CENTER);

            PDF.open();

            PDF.add(Banner);
            PDF.add(setFuente("\nIngresos                     \n\n", 10, 3, 3));

            PdfPTable tabla = new PdfPTable(3);
            tabla.setTotalWidth(MAXIMIZED_BOTH);
            tabla.setSpacingAfter(TOP_ALIGNMENT);

            tabla.addCell(setFuente("Fecha", 10, 3, 1));
            tabla.addCell(setFuente("Concepto", 9, 3, 1));
            tabla.addCell(setFuente("Monto", 10, 3, 1));
            String[][] Ingresos = new String[contador(new File("Ingresos.txt"))][3];
            Ingresos = Obtener(new File("Ingresos.txt"));
            int ingresos = 0;

            for (int i = 0; i < Ingresos.length; i++) {
                tabla.addCell(setFuente(Ingresos[i][0], 10, 1, 2));
                tabla.addCell(setFuente(Ingresos[i][1], 10, 1, 2));
                tabla.addCell(setFuente(Ingresos[i][2], 10, 1, 2));
                String auxiliar = Ingresos[i][2];
                ingresos += Integer.parseInt(auxiliar.substring(1, auxiliar.length() - 1));

            }
            tabla.addCell("");
            tabla.addCell(setFuente("Total:", 10, 1, 2));

            tabla.addCell(setFuente(ingresos + "", 10, 1, 2));
            PDF.add(tabla);

            PDF.add(setFuente("\nCostos del mes                    \n\n", 10, 3, 3));

            PdfPTable tablaCostos = new PdfPTable(3);
            tablaCostos.setTotalWidth(MAXIMIZED_BOTH);
            tablaCostos.setSpacingAfter(TOP_ALIGNMENT);

            tablaCostos.addCell(setFuente("Fecha", 10, 3, 1));
            tablaCostos.addCell(setFuente("Concepto", 9, 3, 1));
            tablaCostos.addCell(setFuente("Monto", 10, 3, 1));
            String[][] Costos = new String[contador(new File("Gastos.txt"))][3];
            Costos = Obtener(new File("Gastos.txt"));
            int costos = 0;

            for (int i = 0; i < Costos.length; i++) {
                tablaCostos.addCell(setFuente(Costos[i][0], 10, 1, 2));
                tablaCostos.addCell(setFuente(Costos[i][1], 10, 1, 2));
                tablaCostos.addCell(setFuente(Costos[i][2], 10, 1, 2));
                String auxiliar = Costos[i][2];
                costos += Integer.parseInt(auxiliar.substring(1, auxiliar.length() - 1));

            }
            tablaCostos.addCell("");
            tablaCostos.addCell(setFuente("Total:", 10, 1, 2));

            tablaCostos.addCell(setFuente(costos + "", 10, 1, 2));
            PDF.add(tablaCostos);

            PDF.add(setFuente("\nImpuestos a pagar                   \n\n", 10, 3, 3));

            PdfPTable tablaImpuestos = new PdfPTable(3);
            tablaImpuestos.setTotalWidth(MAXIMIZED_BOTH);
            tablaImpuestos.setSpacingAfter(TOP_ALIGNMENT);

            tablaImpuestos.addCell(setFuente("Fecha", 10, 3, 1));
            tablaImpuestos.addCell(setFuente("Concepto", 9, 3, 1));
            tablaImpuestos.addCell(setFuente("Monto", 10, 3, 1));
            String[][] Impuestos = new String[contador(new File("Impuestos.txt"))][3];
            Impuestos = Obtener(new File("Impuestos.txt"));

            int impuestos = 0;
            for (int i = 0; i < Impuestos.length; i++) {
                tablaImpuestos.addCell(setFuente(Impuestos[i][0], 10, 1, 2));
                tablaImpuestos.addCell(setFuente(Impuestos[i][1], 10, 1, 2));
                tablaImpuestos.addCell(setFuente(Impuestos[i][2], 10, 1, 2));
                String auxiliar = Impuestos[i][2];
                impuestos += Integer.parseInt(auxiliar.substring(1, auxiliar.length() - 1));
            }
            tablaImpuestos.addCell("");
            tablaImpuestos.addCell(setFuente("Total:", 10, 1, 2));

            tablaImpuestos.addCell(setFuente(impuestos + "", 10, 1, 2));
            PDF.add(tablaImpuestos);
            PDF.newPage();
            PDF.add(setFuente("Estadisticas Generales", 15, 3, 1));
            PDF.add(setFuente("\n\n                                  Ingresos: " + ingresos, 10, 2, 2));
            PDF.add(setFuente("                                  Gastos: " + costos, 10, 2, 2));
            PDF.add(setFuente("                                  Impuestos: " + impuestos, 10, 2, 2));
            PDF.add(setFuente("                                  Utilidades: " + (ingresos - costos), 10, 2, 2));
            PDF.add(setFuente("                                  Utilidades despues de impuetsos: " + (ingresos - costos - impuestos), 10, 2, 2));

            PDF.close();
            JOptionPane.showMessageDialog(null, "Reporte Generado Correctamente");

        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte");

        }

    }

    public Paragraph setFuente(String palabra, int tamano, int a, int v) {

        Paragraph palabraConFuente = new Paragraph();
        palabraConFuente.setFont(FontFactory.getFont("arial black", tamano, a, BaseColor.DARK_GRAY));
        palabraConFuente.add(palabra);

        switch (v) {
            case 1:
                palabraConFuente.setAlignment(Chunk.ALIGN_CENTER);
                break;
            case 2:
                palabraConFuente.setAlignment(Chunk.ALIGN_LEFT);
                break;
            case 3:
                palabraConFuente.setAlignment(Chunk.ALIGN_RIGHT);
                break;
            default:
                return palabraConFuente;

        }
        return palabraConFuente;

    }

}
