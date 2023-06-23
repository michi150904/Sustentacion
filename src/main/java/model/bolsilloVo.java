package model;

public class bolsilloVo {
    private int id;
    private String nombre;
    private String estado;
    private int saldo;
        
    public  bolsilloVo(){}

    public bolsilloVo(int id, String nombre, String estado, int saldo) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.saldo = saldo;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    };
    
}
