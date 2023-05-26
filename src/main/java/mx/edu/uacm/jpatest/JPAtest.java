
package mx.edu.uacm.jpatest;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import mx.edu.uacm.jpatest.logica.Alumno;
import mx.edu.uacm.jpatest.logica.Carrera;
import mx.edu.uacm.jpatest.logica.Controlador;
import mx.edu.uacm.jpatest.logica.Materia;
import mx.edu.uacm.jpatest.persistencia.ControladorPersistencia;

public class JPAtest {

    public static void main(String[] args) {
        
        //ControladorPersistencia control = new ControladorPersistencia();
        Controlador control = new Controlador();
        
//Alumnos        
        //Test Create
        /*
        Alumno alumno1 = new Alumno(1, "Daniel", "Ramirez", new Date());
        control.crearAlumno(alumno1);
        */
        
        //Test Delete
        /*
        control.eliminarAlumno(1);
        */
        
        //Test Edit
        /*
        Alumno alumno1 = new Alumno(1, "Daniel", "Ramirez", new Date());
        alumno1.setNombre("Jorge");
        control.editarAlumno(alumno1);
        */

        //Test Find
        /*
        Alumno alumno = control.findAlumno(1);
        System.out.println("Registro: " +alumno);
        
        //Find All
        System.out.println("\nMultiples registros... ");
        ArrayList<Alumno> lista = control.findAllAlumno();
        
        for(Alumno alu : lista){
            System.out.println("Registro: " +alu);
        }
        */
        

//Carreras
        /*
        Carrera carrera = new Carrera(1, "Ingenieria en software");
        
        control.crearCarrera(carrera);
        
        Alumno a = new Alumno(4, "Jaime", "Ortega", new Date(), carrera);
        control.crearAlumno(a);
        
        System.out.println("\n--Carreras--");
        Alumno alu = control.findAlumno(4);
        System.out.println("Alumno: " +alu.getNombre() + " " +alu.getApellido() );
        System.out.println("Esta actualmente inscrito en: " +alu.getCarrera().getNombre());
        */
        
//Materias

        LinkedList<Materia> listaM = new LinkedList<>();
        Carrera carrera = new Carrera(1, "Ingenieria de software", listaM);
        control.crearCarrera(carrera);
        
        Materia materia1 = new Materia(1, "Matematicas discretas", "Ciclo Basico", carrera);
        Materia materia2 = new Materia(2, "Introduccion a la programacion", "Ciclo Basico", carrera);
        Materia materia3 = new Materia(3, "Mapeo Objeto Relacional", "Ciclo Superior", carrera);
        
        control.crearMateria(materia1);
        control.crearMateria(materia2);
        control.crearMateria(materia3);
        
        //LinkedList<Materia> listaM = new LinkedList<>();
        listaM.add(materia1);
        listaM.add(materia2);
        listaM.add(materia3);
        
        carrera.setListaMaterias(listaM);
        control.editarCarrera(carrera);
        
        //Carrera carrera = new Carrera(1, "Ingenieria de software", listaM);
        //control.crearCarrera(carrera);
        
        Alumno alum = new Alumno(1, "Daniel", "Ramirez", new Date(), carrera);
        control.crearAlumno(alum);
        
        Alumno alumnoTest = control.findAlumno(1);
        System.out.println("Alumno: " +alumnoTest.getNombre()+ " " +alumnoTest.getApellido());
        System.out.println("Cursando la carrera de: "+alumnoTest.getCarrera().getNombre());
        
    }
}
