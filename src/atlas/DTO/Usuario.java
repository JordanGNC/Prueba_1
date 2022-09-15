package atlas.DTO;

public class Usuario {
    private int ID;
    private String NombreCompleto;
    private int Rut;
    private String Dv;
    private String FechaNac;
    private int Telefono;
    private String Email;
    private String NombreUsuario;
    private String Contraseña;
 
    public Usuario(){
        this.ID = 1000;
        this.NombreCompleto = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNac = "";
        this.Telefono = 0;
        this.Email = "";
        this.NombreUsuario = "";
        this.Contraseña = "";
    }   

   public Usuario(int ID,String NombreCompleto,int Rut,String Dv,String FechaNac,int Telefono,String Email,String NombreUsuario,String Contraseña){
       this.ID = ID;
       this.NombreCompleto = NombreCompleto;
       this.NombreUsuario = NombreUsuario;
       this.Rut = Rut;
       this.Dv = Dv;
       this.FechaNac = FechaNac;
       this.Telefono = Telefono;
       this.Email = Email;
       this.NombreUsuario = NombreUsuario;
       this.Contraseña = Contraseña;
   }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
}