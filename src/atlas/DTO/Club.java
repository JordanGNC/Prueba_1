package atlas.DTO;

public class Club {
    int correlativo = 9;
    private String Codigo;
    private String Nombre;
    private String NombreFundador;
    private int AñoFundacion;
    private String PaisOrigen;
    private String Lema;
    private int ValorSuscripcion;
    private String Colores;
    
    public Club(){
        this.Codigo = "";
        this.Nombre = "";
        this.NombreFundador = "";
        this.AñoFundacion = 0;
        this.PaisOrigen = "";
        this.Lema = "";
        this.ValorSuscripcion = 0;
        this.Colores = "";
    }
    
    public Club(String Codigo,String Nombre,String NombreFundador,int AñoFundacion,String PaisOrigen,String Lema,int ValorSuscripcion,String Colores){
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.NombreFundador = NombreFundador;
        this.AñoFundacion = AñoFundacion;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.ValorSuscripcion = ValorSuscripcion;
        this.Colores = Colores;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setNombre(String nombre) {
        String codigomod = nombre.substring(0, 2)+"H"+ ++correlativo;
        this.Nombre = nombre;
        this.Codigo = codigomod;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public int getAñoFundacion() {
        return AñoFundacion;
    }

    public void setAñoFundacion(int AñoFundacion) {
        if(AñoFundacion >= 0){
            this.AñoFundacion = AñoFundacion;            
        }else{
            System.out.println("El valor ingresado no puede ser negativo (AnoFundacion)");
        }

    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        if(ValorSuscripcion >= 0){
            this.ValorSuscripcion = ValorSuscripcion;        
        }else{
            System.out.println("El valor ingresado no puede ser negativo (ValorSuscripcion)");
        }
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }
    
    public String toSuscripcion(){
        StringBuilder s = new StringBuilder();
        s.append("Codigo: ");
        s.append(this.Codigo);
        s.append("\nNombre del club: ");
        s.append(this.Nombre);
        s.append("\nValor de suscripcion: $");
        s.append(this.ValorSuscripcion);
        return s.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo: ");
        sb.append(this.Codigo);
        sb.append("\nNombre del club: ");
        sb.append(this.Nombre);
        sb.append("\nNombre del fundador: ");
        sb.append(this.NombreFundador);
        sb.append("\nAnio de fundacion: ");
        sb.append(this.AñoFundacion);
        sb.append("\nPais de origen: ");
        sb.append(this.PaisOrigen);
        sb.append("\nLema: ");
        sb.append(this.Lema);
        sb.append("\nValor de suscripcion: $");
        sb.append(this.ValorSuscripcion);
        sb.append("\nColores del equipo: ");
        sb.append(this.Colores);
        return sb.toString();
    }
    
}
