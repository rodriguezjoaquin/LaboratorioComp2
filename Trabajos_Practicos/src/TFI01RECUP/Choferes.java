package TFI01RECUP;

public class Choferes extends Personas implements ParaMostrar{

    private Vehiculos vehiculos;

    public Choferes(String nombre, int dni){
        super.setDni(dni);
        super.setNombre(nombre);
    }

    @Override
    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    @Override
    public void setVehiculos (Vehiculos vehiculos) {
        this.vehiculos=vehiculos;
    }

    public String toString(){
        return "Nombre: "+super.getNombre()+"\nDni: "+super.getDni()+"\n";
    }
}
