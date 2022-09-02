/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author Eddye
 */
public class Estudiante
{
    private int codigo;
    private String nombre;
    private String apellido;
    private char sexo;

    public Estudiante()
    {
        
    }

    /**
     * Crea un objeto de la clase Estudiante.
     * @param codigo El código del estudiante
     * @param nombre El nombre del estudiante
     * @param apellido El apellido del estudiante.
     * @param sexo El sexo del estudiante.
     * <BR>Opciones:
     * <UL>
     * <LI>M: Masculino</LI>
     * <LI>F: Femenino</LI>
     * </UL>
     */
    public Estudiante(int codigo, String nombre, String apellido, char sexo)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
