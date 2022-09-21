package Modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class Tipo_Cambio {
    
    private float compraUsd;
    private float ventaUsd;

    public Tipo_Cambio(float compraUsd, float ventaUsd) {
        this.compraUsd = compraUsd;
        this.ventaUsd = ventaUsd;
    }

    public float getCompraUsd() {
        return compraUsd;
    }

    public void setCompraUsd(float compraUsd) {
        this.compraUsd = compraUsd;
    }

    public float getVentaUsd() {
        return ventaUsd;
    }

    public void setVentaUsd(float ventaUsd) {
        this.ventaUsd = ventaUsd;
    }

    public boolean validarFormatoFloat(String valor) {
        Pattern patron = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher buscador = patron.matcher(valor);
                
        if (!buscador.find()) 
            JOptionPane.showMessageDialog(null, "(Error | Formato invalido");
        else
            return true;
        return false;
    }
    
}
