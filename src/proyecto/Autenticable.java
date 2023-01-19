package proyecto;

public interface Autenticable {

    //setters
    public void setClave(String clave);

    //método
    public boolean iniciarSesion(String clave);

}
