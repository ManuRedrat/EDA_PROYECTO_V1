package CLASES;

public class Expediente extends Interesado{
    private String id;
    private int prioridad;
    private String asunto;
    private String docu;

    public Expediente(String id, int prioridad, String asunto, String docu, String numId, String nombres, String telefono, String email) {
        super(numId, nombres, telefono, email);
        this.id = id;
        this.prioridad = prioridad;
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
