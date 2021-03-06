package Colecciones.EqualsYhashCode;

public class Cliente {
    private String nombre;
    private int nroCuenta;
    private double saldo;

    public Cliente(String nombre, int nroCuenta, double saldo) {
        super();
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
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
        return "Clientes [nombre=" + this.nombre + ", nroCuenta=" + this.nroCuenta + ", saldo= $" + this.saldo + "]";
    }

    /*
     * Sobreescritura del método equals. Para hacerlo mirar la API de java
     */

    public boolean equals(Object obj) {

        Cliente otroCliente = (Cliente) obj;

        if (obj instanceof Cliente) {

            if (this.nroCuenta == otroCliente.nroCuenta) return true;

            else return false;

        } else return false;
    }
}
