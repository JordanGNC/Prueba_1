package atlas.DTO;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    private int ID;
    private String NombreCompleto;
    private int Rut;
    private String Dv;
    private String FechaNac;
    private long Telefono;
    private String Email;
    private String NombreUsuario;
    private String Contraseña;
 
    public Usuario(){
        this.ID = 0;
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
        if(ID >= 0){
            this.ID = ID;        
        }

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

    public void setRutyDv(int Run, char Dv) {
        if(this.validarRut(Run, Dv)){
            this.Rut = Run;
            this.Dv = Dv+"";
        }else{
            System.out.println("El rut ingresado no existe");
        }
    }
    
    public String getDv() {
        return Dv;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(int anio,int mes,int dia) {
        
        Period edad = Period.between(LocalDate.of(anio, mes, dia), LocalDate.now());
        if (edad.getYears()>=18){
            String FechaNacimiento = String.valueOf(anio)+"/"+String.valueOf(mes)+"/"+String.valueOf(dia);
            this.FechaNac = FechaNacimiento;            
        }else{
            System.out.println("Usted no es mayor de edad");
        }
    }
    
    public Long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        if (Long.toString(Telefono).length()>=8){
            int num = 56;
            String cadenaResultante = String.valueOf(num) + String.valueOf(Telefono);
            long TelefonoMod = Long.parseLong(cadenaResultante);
            this.Telefono = TelefonoMod;
        }else{
            System.out.println("El numero de telefono no es valido");
        }
        
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@")){
            if(Email.contains(".cl")||Email.contains(".com")){
                this.Email = Email;
            }else{
                System.out.println("Email invalido (Asegurece que termine con .cl o .com)");
            }
            
    }else{
            System.out.println("Email invalido (Asegurece que contenga @)");
        }

    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if (NombreUsuario.length()>=4){
            this.NombreUsuario = NombreUsuario;
        }else{
            System.out.println("El nombre de usuario debe contener como minimo 4 caracteres");
        }
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        char clave;
        byte contNumero = 0, contLetraMay = 0;
        for (byte i = 0; i < Contraseña.length(); i++) {
            clave = Contraseña.charAt(i);
            String passValue = String.valueOf(clave);
            if (passValue.matches("[A-Z]")) {
                contLetraMay++;
            } else if (passValue.matches("[0-9]")) {
                contNumero++;
            }
        }
        if(Contraseña.length()>=6){
            if(contLetraMay>0&&contNumero>0){
                this.Contraseña = Contraseña;
            }else{
                System.out.println("Contrasena invalida (Asegurece que la contrasena contenga al menos 1 letra mayuscula y 1 numero)");
            } 
        }else{
            System.out.println("Contrasena invalida (Asegurece que la contrasena contenga al menos 6 caracteres)");
        }
              
    }
   
    public boolean validarRut(int Rut, char Dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; Rut != 0; Rut /= 10) {
                s = (s + Rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (Dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
                        
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(this.ID);
        sb.append("\nNombre Completo: ");
        sb.append(this.NombreCompleto);
        sb.append("\nRut: ");
        sb.append(this.Rut);
        sb.append(this.Dv);
        sb.append("\nFecha de nacimiento: ");
        sb.append(this.FechaNac);
        sb.append("\nTelefono: ");
        sb.append(this.Telefono);
        sb.append("\nEmail: ");
        sb.append(this.Email);
        sb.append("\nNombre de usuario: ");
        sb.append(this.NombreUsuario);
        sb.append("\nContrasena: ");
        sb.append(this.Contraseña);
        return sb.toString();
    }
    
}