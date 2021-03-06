package Colecciones.SetHashSet;

public class Clientes {
    private String nombre;
    private String nroCuenta;
    private double saldo;

    public Clientes(String nombre, String nroCuenta, double saldo){
        super();
        this.setNombre(nombre);
        this.setNroCuenta(nroCuenta);
        this.setSaldo(saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes [nombre=" + nombre + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + "]";
    }
}
