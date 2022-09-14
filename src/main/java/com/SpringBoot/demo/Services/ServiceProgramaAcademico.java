package com.SpringBoot.demo.Services;

import com.SpringBoot.demo.Domain.Persona;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service //le entrego datos para que service los procese
public class ServiceProgramaAcademico {

    @Getter  @Setter
    private String nombrePrograma;


    //metodo
    public String incribirAlumno (Persona alumno){// 1.le entrego al servicio un objeto de tipo "Persona"...
    String inscripcion="El alumno"+alumno.getNombre()+" "+alumno.getApellido()+" "+alumno.getEdad()+"años, quedó inscrito al programa";//1.a
    return inscripcion;// // 3.aquí esta usando la instancia de tipo Persona con datos  y 3.a retorna a controller con el metodo incribiralumno valores con datos
    }

        //ejemplo de trazabilidad o primera vez (controlar tareas de primera ejecucion )
    public void doWhile1 (int x){
        do{
            System.out.println("holi"+ x);
            x++;
            //ejecuta siempre y cuando se cumpla, siempre hace un ciclo
        }while(x<10); //lo llevo al controller

    }


    //ejemplo de trazabilidad  2 o primera vez, debo crear una lista para llenarla y subirla al browser
    public ArrayList doWhile (int a){
        ArrayList<String> objTraza =new ArrayList();
        do{
            System.out.println("hola mundo"+ a); //para consola
            objTraza.add("hola mundo"+String.valueOf(a)); //para browser
        a++;
        //ejecuta siempre y cuando se cumpla, siempre hace un ciclo
       }while(a<10); //lo llevo al controller
        return objTraza;
    }

    /**********************************************************************************/

    ArrayList<Persona> listaP;
    //Constructor
    public ServiceProgramaAcademico(ArrayList<Persona> listaP) {
        this.listaP = listaP;
    }



    public Boolean addPersona(Persona persona){

        //Implemento: //cargo los datos "Postman"con lo que viene del RequestEntity, lo guarda
        Persona objPersona= new Persona();
        objPersona.setNombre(persona.getNombre());
        objPersona.setApellido(persona.getApellido());
        objPersona.setEdad(persona.getEdad());
        objPersona.setId(persona.getId());

        //los guarda en la lista
        listaP.add(objPersona);
        return Boolean.TRUE; //viene hace eso y devuelve un true,para que diga que procesó
    }

    //metodo**
    public ArrayList<Persona> listar(){
        System.out.println("metodo listar del service");
        return listaP;

        /*Explicación
        * cuando ejecuto llega al service "listar" a traves del controlador
        * el controlador en linea 77 dispara el servicio
        * el servicio al metodo** "listaP"
        * */
    }


    //******************METODO EMULADO (sin persistencia) PARA BUSCAR PERSONAS  "GET con parámetros"*******************************

    public Persona buscarPersona(int id){
        Persona persona =null;
        for (Persona p:listaP
             ) { if (p.getId()==id){
                 return p;
        }

        }
        return persona;
    }
    /*Explicación
    * llega un número id, persona lo inicializo en null
    * va a entidad Persona si la encuentra con ese numero  retorna esa persona y rompe ciclo
    * si no la encuentra retorna un null
    * */


    //******************METODO EMULADO (sin persistencia) PARA CREAR PERSONAS  "POST con parámetros"*******************************
    public Boolean addPersonaCC(Persona persona, String doc){

        //Implemento: //cargo los datos "Postman"con lo que viene del RequestEntity, lo guarda
        Persona objPersona= new Persona();
        objPersona.setNombre(persona.getNombre());
        objPersona.setApellido(persona.getApellido());
        objPersona.setEdad(persona.getEdad());
        objPersona.setId(persona.getId());
        objPersona.setDoc(persona.getDoc());

        System.out.println("creo la persona con c.c");

        //los guarda en la lista
        listaP.add(objPersona);
        return Boolean.TRUE; //viene hace eso y devuelve un true,para que diga que procesó
    }


    public Boolean addPersonaTI(Persona persona, String doc){

        //Implemento: //cargo los datos "Postman"con lo que viene del RequestEntity, lo guarda
        Persona objPersona= new Persona();
        objPersona.setNombre(persona.getNombre());
        objPersona.setApellido(persona.getApellido());
        objPersona.setEdad(persona.getEdad());
        objPersona.setId(persona.getId());
        objPersona.setDoc(persona.getDoc());

        System.out.println("creo la persona con TI");
        //los guarda en la lista
        listaP.add(objPersona);
        return Boolean.TRUE; //viene hace eso y devuelve un true,para que diga que procesó
    }



}
