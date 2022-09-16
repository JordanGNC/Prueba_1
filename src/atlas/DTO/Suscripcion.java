package atlas.DTO;

public class Suscripcion {
    private int Numero;
    private Usuario Usuario;
    private String FechaInicio;
    private int AbonoTotal;
    private String Equipos;
    
    public Suscripcion(){
        this.Numero = 0;
        this.Usuario = new Usuario();
        this.FechaInicio = "";
        this.AbonoTotal = 0;
        this.Equipos = "";
    }
    
    public Suscripcion(int Numero,Usuario Usuario,String FechaInicio,int AbonoTotal,String Equipos){
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
        if(Numero >= 0){
            this.Numero = Numero;       
        }else{
            System.out.println("El valor ingresado no puede ser negativo (Numero)");
        }

    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        if(AbonoTotal >= 0){
            this.AbonoTotal = AbonoTotal;        
        }else{
            System.out.println("El valor ingresado no puede ser negativo (AbonoTotal)");
        }

    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
    
    public void agregarSuscripcion(Club c){
        if(!this.Equipos.equals("")){
            this.Equipos += "\n\n";
        }
        this.Equipos += c.toSuscripcion();
        this.AbonoTotal += c.getValorSuscripcion();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------\n");
        sb.append("Venta Numero: ");
        sb.append(this.Numero);
        sb.append("\nTotal: $");
        sb.append(this.AbonoTotal);
        sb.append("\n--------------------------------------------------\n");
        sb.append("Cliente: ");
        sb.append(this.Usuario.getNombreCompleto());
        sb.append("\n--------------------------------------------------\n");
        sb.append(this.Equipos);
        
        return sb.toString();
    }
    
}