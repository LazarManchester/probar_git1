import java.util.ArrayList;

class Grupo
{
   //atributos
   private String nomGrupo;
   private ArrayList<Alumnos> alumnos;
   //constructor
   public Grupo(String nomGrupo){
   this.nomGrupo=nomGrupo;
   alumnos=new ArrayList<>();
   
   }
//metodos
public void add(Alumnnos a){
alimnos.add(a);
}
public String toString(){
return "Grupo[nomGrupo0"+nomGrupo+",alumnos="+alumnos+"]";


}
}