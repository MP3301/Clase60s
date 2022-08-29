package Modelo;
/**
 * Elaborado durante el desarrollo del curso Master en Java
 * @author H Alvarez
 */
public class UnidadDeMedida{
    
    private String idUnidadMedida;
    private String descripcion;
    
    public UnidadDeMedida() {
        this("0", "Sin descripcion");
    }

    public UnidadDeMedida(String idUnidadMedida, String descripcion){
        setIdUnidadMedida(idUnidadMedida);
        setDescripcion(descripcion);
    }

    public final String getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public final void setIdUnidadMedida(String idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public final String getDescripcion() {
        return descripcion;
    }

    public final void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "UnidadDeMedida{" + "idUnidadMedida=" + idUnidadMedida +
               ", descripcion=" + descripcion + '}';
    } 
}
