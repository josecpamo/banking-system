package Modelos;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class Movimiento {
    
    private int movimientoId;
    private String fecha;
    private String mensaje;
    private float cantidad;
    private float saldoAnterior;
    private int cuentaId;

    public Movimiento(int movimientoId, String fecha, String mensaje, float cantidad, float saldoAnterior, int cuentaId) {
        this.movimientoId = movimientoId;
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.cantidad = cantidad;
        this.saldoAnterior = saldoAnterior;
        this.cuentaId = cuentaId;
    }

    public int getMovimientoId() {
        return movimientoId;
    }

    public void setMovimientoId(int movimientoId) {
        this.movimientoId = movimientoId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }
    
}
