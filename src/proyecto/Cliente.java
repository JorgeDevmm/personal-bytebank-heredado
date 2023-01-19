package proyecto;

public class Cliente implements Autenticable {

    //	atributos
    private String nombre;
    private String documento;
    private String telefono;

    private AutenticacionUtil util;

    //constructor

    public Cliente() {
        //Instancio mi propiedad de tipo autenticable util con mi clase autenticable
        this.util = new AutenticacionUtil();
    }


    //	métodos getters and setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
