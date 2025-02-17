package nomina;

public class Nomina {
   
   public Nomina(){
      System.out.println("Se ha creado una nomina");
   }

    public double calcularSalario(int numeroHora, double valorHora){
      double salario = 0;
      if(numeroHora > 40){
         salario = ((40*valorHora)+((numeroHora-40)*(valorHora*2)));
      }else{
         salario = ((numeroHora*valorHora)+((numeroHora-40)*(valorHora*2)));
      }
      return salario;
    }
    
    public double calcularSalario(Persona persona){
      double salario = 0;
      if(persona.getNumeroHora() > 40){
         salario = ((40*persona.getValorHora())+((persona.getNumeroHora()-40)*(persona.getValorHora()*2)));
      }else{
         salario = ((persona.getNumeroHora()*persona.getValorHora())+((persona.getNumeroHora()-40)*(persona.getValorHora()*2)));
      }
      return salario;
    }

    public void imprimirNomina(Persona persona){
       System.out.println("Nombre Empleado " + persona.getNombre());
       System.out.println("Cargo Empleado " + persona.getCargo());
       System.out.println("Horas Trabajadas " + persona.getNumeroHora());
       System.out.println("Valor Hora " + persona.getValorHora());
       System.out.println("Salario " + persona.getSalario());
    }
    
    
}
