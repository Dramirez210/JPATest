
package mx.edu.uacm.jpatest.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import mx.edu.uacm.jpatest.persistencia.ControladorPersistencia;

public class Controlador {
    
    ControladorPersistencia ctrl = new ControladorPersistencia();
    
    public void crearAlumno(Alumno alumno){
        ctrl.crearAlumno(alumno);
    }
    
    public void eliminarAlumno(int id){
        ctrl.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alumno){
        ctrl.editarAlumno(alumno);
    }
    
    public Alumno findAlumno(int id){
        return ctrl.findAlumno(id);
    }
    
    public ArrayList<Alumno> findAllAlumno(){
        return ctrl.findAll();
    }
    
//Carrera ------------------------------------------------------------------
    public void crearCarrera (Carrera carrera){
        ctrl.crearCarrera(carrera);
    }
    
    public void eliminarCarrera(int id){
        ctrl.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carrera){
        ctrl.editarCarrera(carrera);
    }
    
    public Carrera findCarrera(int id){
        return ctrl.findCarrera(id);
    }
    
    public ArrayList<Carrera> findAllCarrera(){
        return ctrl.findAllCarrera();
    }
    
//Materia------------------------------------------------------------------
    public void crearMateria(Materia materia){
        ctrl.crearMateria(materia);
    }
    
    public void eliminarMateria(int id){
        ctrl.eliminarMateria(id);
    }
    
    public void editarMateria(Materia materia){
        ctrl.editarMateria(materia);
    }
    
    public Materia findMateria(int id){
        return ctrl.findMateria(id);
    }
    
    public LinkedList<Materia> findAllMaterias(){
        return ctrl.findAllMaterias();
    }
    
}
