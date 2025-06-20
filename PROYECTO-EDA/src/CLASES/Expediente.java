package CLASES;

public class Expediente {
    private String id;
    private int prioridad;
    private Interesado datos;
    private String asunto;
    private String docu;

    public Expediente(String id, int prioridad, Interesado datos, String asunto, String docu) {
        this.id = id;
        this.prioridad = prioridad;
        this.datos = datos;
        this.asunto = asunto;
        this.docu = docu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Interesado getDatos() {
        return datos;
    }

    public void setDatos(Interesado datos) {
        this.datos = datos;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDocu() {
        return docu;
    }

    public void setDocu(String docu) {
        this.docu = docu;
    }
}
