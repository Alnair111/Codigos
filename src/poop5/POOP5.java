package poop5;
//@author Juárez Terrazas Al Nair
public class POOP5 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(8);
        System.out.println("radio cir1 = "+circulo1.getRadio());
        
        Circulo circulo2 = new Circulo();
        System.out.println(circulo2);
        circulo2.setRadio(2);
        System.out.println(circulo2);
        circulo2.setRadio(-10);
        System.out.println(circulo2);    
       
        System.out.println("########## E2 ##########");
        Persona per1 = new Persona();
        Fecha fnac = new Fecha();
        Coche car1 = new Coche();
        
        per1.setNombre("Raul");
        per1.setApellido("Hernandez");
        car1.setChofer(per1);
        fnac.setDia(10);
        fnac.setMes(6);
        fnac.setAnio(2000);
        per1.setfNacimiento(fnac);
        System.out.println(car1);
        System.out.println(per1);
        
        System.out.println("Fecha nacimiento "+per1.getfNacimiento().getDia()+
                "/"+per1.getfNacimiento().getMes()+"/"+per1.getfNacimiento().getAnio());
        System.out.println("Fecha nacimiento "+per1.getfNacimiento());
    }
}

