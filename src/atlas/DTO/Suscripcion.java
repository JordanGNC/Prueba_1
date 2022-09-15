package atlas.DTO;

import java.util.Date;

public class Suscripcion {
    private int Numero;
    private Usuario Usuario;
    private Date FechaInicio;
    private int AbonoTotal;
    private String Equipos;
    
    public Suscripcion(){
        this.Numero = 0;
        this.Usuario = new Usuario();
        this.FechaInicio = new Date();
        this.AbonoTotal = 0;
        this.Equipos = "";
    }
    
    public Suscripcion(int Numero,Usuario Usuario,Date FechaInicio,int AbonoTotal,String Equipos){
        this.Numero = Numero;
        this.Usuario = Usuario;
        this.FechaInicio = FechaInicio;
        this.AbonoTotal = AbonoTotal;
        this.Equipos = "";
    }
    
    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
    
    
    
}