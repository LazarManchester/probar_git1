class Programa
{
public static void main (String [] args){
    Alumnos a1=new Alumnos(1,"pepe");
    System.out.println("Nº de matricula ="+a1.getNm());
    System.out.println("Nombre="+a1.getNombre());
    System.out.println(a1);  
    Grupo g1=new Grupo("1dwn");
    g1.add(a1);
    System.out.pritnln(g1);
    
    
/*
 este texto desapareceraaa
 */

 }
}