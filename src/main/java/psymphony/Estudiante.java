/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psymphony;

/**
 *
 * @author Spiri
 */
public class Estudiante {
    //declaramos las variables como private para proteger los datos y garantizar el principio de encapsulamiento
    private int id;
    private String nombreAlumno;
    private String apellidoAlumno;
    private String telefono;
    private String direccion;
    private String email;
    private String Genero;
    // constructor vacio de utilidad para cuando aun no tenemos los datos
    public Estudiante()
    {}
    //constructor completo que nos permite crear un estudiante con todos sus datos de una sola vez.
    public Estudiante(int id,String nombreAlumno, String apellidoAlumno, String telefono,String direccion, String correo, String genero)
    {
     this.id=id;
     this.nombreAlumno=nombreAlumno;
     this.apellidoAlumno=apellidoAlumno;
     this.telefono=telefono;
     this.direccion=direccion;
     this.email=email;
     this.Genero=genero;
    }
    //creamos los metodos set y get de tipo publico los cuales nos permiten asignar y obtener el valor de atributos privados de clase estudiante
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return email;
    }

    public void setCorreo(String correo) {
        this.email = email;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    @Override
    public String toString(){
     return "Nota{" +
               "id=" + id +
               ", nombreAlumno='" + nombreAlumno + '\'' +
               ", apellidoAlumno='" + apellidoAlumno + '\'' +
               ", telefono=" + telefono +
               ", direccion='" + direccion + '\'' +
               ", correo=" + email +
               ", genero=" +Genero +
               '}';
    }
}
