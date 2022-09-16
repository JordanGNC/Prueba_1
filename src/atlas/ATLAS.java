package atlas;


import atlas.DTO.Club;
import atlas.DTO.Suscripcion;
import atlas.DTO.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ATLAS {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String nuevafecha = formatter.format(new Date());       
        int correlativosu = 0;
        int correlativous = 0;
       
        
        //Creacion de usuario 1
        System.out.println("Usuario 1\n");
        
        Usuario us1 = new Usuario();
        us1.setID(999 + ++correlativous);
        us1.setNombreCompleto("Jordan Gabriel Navarro Cabrera");
        us1.setRutyDv(20940071, '5');
        us1.setFechaNac(2001, 12, 22);
        us1.setTelefono(12345678);
        us1.setEmail("Jordan@gmail.com");
        us1.setNombreUsuario("TwentyThree");
        us1.setContraseña("JN2001");
        System.out.println(us1.toString());
        
        
        //Creacion de Usuario 2
        System.out.println("\n\nUsuario 2\n");
        
        Usuario us2 = new Usuario();
        us2.setID(999 + ++correlativous);
        us2.setNombreCompleto("Jonathan Marcelo Navarro Cabrera");
        us2.setRutyDv(18938051, '8');
        us2.setFechaNac(1994, 9, 22);
        us2.setTelefono(87654321);
        us2.setEmail("Jonathan@gmail.cl");
        us2.setNombreUsuario("Jona1994");
        us2.setContraseña("JN1994");
        System.out.println(us2.toString());
        
        //Creacion de Club 1
        System.out.println("\n\nClub 1\n");
        
        Club cl1 = new Club();
        cl1.setNombre("Boca juniors");
        cl1.setNombreFundador("Alfredo Scarpati");
        cl1.setAñoFundacion(1905);
        cl1.setPaisOrigen("Argentina");
        cl1.setLema("Boquita lo mas grande");
        cl1.setValorSuscripcion(13200);
        cl1.setColores("Azul y Amarillo");
        System.out.println(cl1.toString());
        
        //Creacion de Club 2
        System.out.println("\n\nClub 2\n");
        
        Club cl2 = new Club();
        cl2.setNombre("Rivers");
        cl2.setNombreFundador("Leopoldo Bard");
        cl2.setAñoFundacion(1901);
        cl2.setPaisOrigen("Argentina");
        cl2.setLema("De River de corazon");
        cl2.setValorSuscripcion(15100);
        cl2.setColores("Rojo y Blanco");
        System.out.println(cl2.toString());
        
        //Creacion de Suscripcion de usuario 1
        System.out.println("\n\nSuscripcion de usuario 1\n");
        
        Suscripcion su1 = new Suscripcion();
        su1.setNumero(990+(10*++correlativosu));
        su1.setUsuario(us1);
        su1.setFechaInicio(nuevafecha);
        su1.agregarSuscripcion(cl1);
        su1.agregarSuscripcion(cl2);
        System.out.println(su1.toString());
        
        //Creacion de Suscripcion de usuario 2
        System.out.println("\n\nSuscripcion de usuario 2\n");
        
        Suscripcion su2 = new Suscripcion();
        su2.setNumero(990+(10*++correlativosu));
        su2.setUsuario(us2);
        su2.setFechaInicio(nuevafecha);
        su2.agregarSuscripcion(cl2);
        System.out.println(su2.toString());
        
        //Validaciones si se ingresan datos erroneos
        System.out.println("\n\nValidaciones si se ingresan datos erroneos\n");
        
        Usuario us3 = new Usuario();
        Club cl3 = new Club();
        Suscripcion su3 = new Suscripcion();
        
        System.out.println("En Usuario: ");
        //En usuario
        us3.setRutyDv(20940071, '6');
        us3.setFechaNac(2005, 12, 22);
        us3.setTelefono(1234567);
        us3.setEmail("Jordangmail.com");
        us3.setEmail("Jordan@gmail");
        us3.setNombreUsuario("Jor");
        us3.setContraseña("JN10");
        us3.setContraseña("jordan10");
        
        
        System.out.println("\n");       
        System.out.println("En Club: ");
        //En club
        cl3.setAñoFundacion(-1);
        cl3.setValorSuscripcion(-1);
        
        
        System.out.println("\n");       
        System.out.println("En Suscripcion: ");
        //En Suscripcion
        su3.setNumero(-1);
        su3.setAbonoTotal(-1);
   
    }
    
}
