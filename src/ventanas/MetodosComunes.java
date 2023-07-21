package ventanas;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class MetodosComunes {
    
    public static int FondoSeleccionado = 1; 
       
    //Metodo que transforma las dimenciones de una imagen
    public Icon getImagen(String URL, int Whidth, int Height) {

        ImageIcon imagen = new ImageIcon(URL);//tomamos URL d la imagen
        java.awt.Image imagen1 = imagen.getImage().getScaledInstance(Whidth, Height
                , java.awt.Image.SCALE_DEFAULT);//transformamos a las medidas deceadas 
        Icon imagen2 = new ImageIcon(imagen1);//creamos un icono para retornar

        return imagen2; //retornamos un Icon para las etiquetas o botones
    }
    
    //Metodo que revisa si 2 campos estan vacios 
    public boolean CampoVacio(String Campo1,String Campo2) {        
        if (Campo1.equals("")) {//revisa primer campo
            return true;//si esta vacio retorna verdadero
        } else if(Campo2.equals("")){//revisa segundo campo
            return true;//si esta vacio retorna verdadero
        }else{
            return false;//si los campos estan llenos retorna falso 
        }        

    }
    
    //Metodo para Cambiar Fondo
    public String ColorDeFondo(int Color){
        String ColorFondo = "./src/img/";
        FondoSeleccionado = Color;//guardo el valor en una variable para ocupar despues en otras interfaces        
        switch(Color){//segun numero seleccionado, retorna una direccion de imagen
            case 1:
                return ColorFondo +="FondoBlanco.jpg";                               
            case 2:
                return ColorFondo +="FondoBeige.jpg";
            default:
                FondoSeleccionado = 1;
                return "FondoBlanco";            
        } 
    }
    //Metodo para la obtencion de fecha
    public String Fecha() {
        Calendar c = Calendar.getInstance();

        int dd = c.get(Calendar.DATE);
        int mm = c.get(Calendar.MONTH) + 1;
        int aa = c.get(Calendar.YEAR);
        String ddd = "";
        String mmm = "";

        if (dd < 10) {
            ddd = "0" + dd;

        } else {
            ddd = dd + "";
        }

        if (mm < 10) {
            mmm = "0" + mm;

        } else {
            mmm = mm + "";
        }

        String Date = ddd + "-" + mmm + "-" + aa;

        return Date;
    }
    
}
