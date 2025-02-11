package modelos;

import utilidades.UtilididadesPersona;

import java.time.LocalDate;
import java.util.Objects;

public class PersonaIMPL {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private LocalDate fechaNacimiento;
    private DireccionIMPL direccion;
    private Sexo sexo;
    private String paisOrigen;
    private String email;
    private String telefono;

    public enum Sexo{
        masculino, femenino, NA
    }

    //constructor completo
    public PersonaIMPL(int id, String nombre, String apellido1, String apellido2, String nif, LocalDate fechaNacimiento, DireccionIMPL direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        if (UtilididadesPersona.esNIFValido(nif)){
            this.nif = nif;
        } else {
            throw new IllegalArgumentException("NIF no valido");
        }
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    //constructor nuevo
    public PersonaIMPL(int id, String nombre, String apellido1, String apellido2, String nif, LocalDate fechaNacimiento, DireccionIMPL direccion, Sexo sexo, String paisOrigen, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        if (UtilididadesPersona.esNIFValido(nif)){
            this.nif = nif;
        } else {
            throw new IllegalArgumentException("NIF no valido");
        }
        if (UtilididadesPersona.esMayorEdad(this)){
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("No es mayor de edad");
        }
        this.direccion = direccion;
        this.sexo = sexo;
        this.paisOrigen = paisOrigen;
        this.email = email;
        this.telefono = telefono;
    }

    //constructor vacio
    public PersonaIMPL() {
        this.id = 0;
        this.nombre = "Ninguno";
        this.apellido1 = "Ninguno";
        this.apellido2 = "Ninguno";
        this.nif = "Ninguno";
        this.fechaNacimiento = LocalDate.now();
        this.direccion = null;
        this.sexo = Sexo.NA;
        this.paisOrigen = "Ninguno";
        this.email = "Ninguno@gmail.com";
        this.telefono = "123456789";
    }
    //constructor copia
    public PersonaIMPL(PersonaIMPL persona2) {
        this.id = persona2.getId();
        this.nombre = persona2.getNombre();
        this.apellido1 = persona2.getApellido1();
        this.apellido2 = persona2.getApellido2();
        this.nif = persona2.getNif();
        this.fechaNacimiento = persona2.getFechaNacimiento();
        this.direccion = persona2.getDireccion();
        this.sexo = persona2.getSexo();
        this.paisOrigen = persona2.getPaisOrigen();
        this.email = persona2.getEmail();
        this.telefono = persona2.getTelefono();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public DireccionIMPL getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionIMPL direccion) {
        this.direccion = direccion;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonaIMPL that = (PersonaIMPL) o;
        return getId() == that.getId() && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getApellido1(), that.getApellido1()) && Objects.equals(getApellido2(), that.getApellido2()) && Objects.equals(getNif(), that.getNif()) && Objects.equals(getFechaNacimiento(), that.getFechaNacimiento()) && Objects.equals(getDireccion(), that.getDireccion()) && getSexo() == that.getSexo() && Objects.equals(getPaisOrigen(), that.getPaisOrigen()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getTelefono(), that.getTelefono());
    }

    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido1(), getApellido2(), getNif(), getFechaNacimiento(), getDireccion(), getSexo(), getPaisOrigen(), getEmail(), getTelefono());
    }

    public String toString() {
        return "PersonaIMPL{" +
                "id=" + id + "\n"+
                ", nombre='" + nombre + '\n' +
                ", apellido1='" + apellido1 + '\n' +
                ", apellido2='" + apellido2 + '\n' +
                ", nif='" + nif + '\n' +
                ", fechaNacimiento=" + fechaNacimiento +'\n' +
                ", direccion=" + direccion +'\n' +
                ", sexo=" + sexo +'\n' +
                ", paisOrigen='" + paisOrigen + '\n' +
                ", email='" + email + '\n' +
                ", telefono='" + telefono + '\n' +
                '}';
    }
}
