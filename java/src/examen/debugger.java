package examen;

public class debugger {
    public static void main(String[] args) {
        String cadena = "a";
        System.out.println(cadena);
        do {
            cadena = cadena + "e";
        }while (cadena.length()< 5);
        System.out.println(cadena);
        do {
            cadena = cadena + "1";
        }while (cadena.length() < 3);
        System.out.println(cadena);
    }
}

/* Ponemos los puntos de ruptura en las líneas que veamos combenientes,
* en mi caso lo he puesto dentro de los do while y los print, para saber claramente que va pasando,
* luego le damos al bichito que esta al lado del play para que empiece la depuración,
* en la consola de abajo nos va a ir saliendo que valores toma la variable cadena
* podemos ver que de primeras tiene el valor "a", luego le damos al f5 para continuar y vemos que ahora tiene el valor "ae,
* le damos a continuar otra vez y vemos el que ahora tiene "aee", y le seguimos dando,
* una vez que nuestra cadena tiene el valor "aeeee" habra finalizado el bucle, ya que tiene una longitud de 5
* y hemos especidicado en el while que se cumpla hasta que la longitud de cadena sea menor que 5, y se nos imprimira por pantalla,
* le volvemos a dar y vemos como el valor cambia a "aeeee1" y si le volvemos a dar este valor se nos imprimira por pantalla y habra
* finalizado la depuración, como vemos solo se nos añade un 1 esto se debe a que en el while hemos puesto
* que la longitud de la cadena tiene que ser menor que 3, sin embargo, al tener el do, este nos pondra primero el 1
* y no se volvera a repetir por el while. */