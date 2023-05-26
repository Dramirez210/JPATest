
package mx.edu.uacm.jpatest.persistencia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.edu.uacm.jpatest.logica.Alumno;
import mx.edu.uacm.jpatest.logica.Carrera;
import mx.edu.uacm.jpatest.logica.Materia;
import mx.edu.uacm.jpatest.persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {
    AlumnoJpaController alumnoJPA = new AlumnoJpaController();
    CarreraJpaController carreraJPA = new CarreraJpaController();
    MateriaJpaController materiaJPA = new MateriaJpaController();

    
    public void crearAlumno(Alumno alumno) {
         alumnoJPA.create(alumno);
    }

    public void eliminarAlumno(int id) {
        try {
            alumnoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            alumnoJPA.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno findAlumno(int id) {
        return alumnoJPA.findAlumno(id);
    }

    public ArrayList<Alumno> findAll() {
        List<Alumno> listaAlumnos = alumnoJPA.findAlumnoEntities();
        ArrayList<Alumno> listaArrayAlumnos = new ArrayList<> (listaAlumnos);
        return listaArrayAlumnos;
    }

    public void crearCarrera(Carrera carrera) {
        carreraJPA.create(carrera);
    }

    public void eliminarCarrera(int id) {
        try {
            carreraJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carrera) {
        try {
            carreraJPA.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera findCarrera(int id) {
        return carreraJPA.findCarrera(id);
    }

    public ArrayList<Carrera> findAllCarrera() {
        List<Carrera> lista = carreraJPA.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<> (lista);
        return listaCarreras;
    }

    public void crearMateria(Materia materia) {
        materiaJPA.create(materia);
    }

    public void eliminarMateria(int id) {
        try {
            materiaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia materia) {
        try {
            materiaJPA.edit(materia);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia findMateria(int id) {
        return materiaJPA.findMateria(id);
    }

    public LinkedList<Materia> findAllMaterias() {
        List<Materia> lista = materiaJPA.findMateriaEntities();
        LinkedList<Materia> listaMaterias = new LinkedList<>(lista);
        return listaMaterias;
    }
    
    
}
