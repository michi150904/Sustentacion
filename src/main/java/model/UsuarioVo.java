package model;

public class UsuarioVo {
    private String nombre;
    private String correo;
    private int telefono;
    private String usuario;
    private String clave;
    private Boolean estado;
    public  UsuarioVo() {
        
    }
    public UsuarioVo(String nombre, String correo, int telefono, String usuario, String clave, Boolean estado) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
