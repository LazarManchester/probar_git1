class Alumnos
{
//atributos
private int nm;
private String nombre;

//constructor
public Alumnos(int nm, String nombre){
this.nm=nm;
this.nombre=nombre;


}
// metodos
public int getNm(){
return nm;
 }
public String getNombre(){
return nombre;

 }
 public String toString(){
 return "Alumno[nm="+nm+", nombre=+nombr`+"];
 }
}