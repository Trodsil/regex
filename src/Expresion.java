import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresion {
    private String texto ;
    private Scanner sc = new Scanner(System.in);

    public Expresion(){
        this.texto = "";
    }

    /**
     * Menú de consola para escoger opción de comparación
     */
    public void menu(){
        System.out.println("Que necesitas comparar?");
        this.texto = sc.nextLine();
        System.out.println("""
        === === === === === === ===
        1. Patron exacto
        2. Patron substring
        3. Empieza por
        4. Cadena con S y N
        5. Cadena con 01
        6. Es un correo válido
        """);
        String opcion = sc.nextLine();

        switch (opcion){
            case"1":
                exactoPatron();
                menu();
                break;
            case"2":
                patronSubstring();
                menu();
                break;
            case"3":
                empiezaPor();
                menu();
                break;
            case"4":
                cadenaConSoN();
                menu();
                break;
            case"5":
                cadenaConOnoseguifofr1();
                menu();
                break;
            case"6":
                esEmailValido();
                menu();
                break;
            default:
                System.out.println("Valor no valido");
                menu();
        }
    }

    /**
     * la función comprueba si se da un patrón exacto en una
     * cadena pasada como parámetro
     */
    public void exactoPatron(){
        Pattern pattern = Pattern.compile("holamundo");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Son textos iguales"+
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("Los textos no son iguales"+
                    "\nTexto : "+this.texto);
        }

    }

    /**
     * la función comprueba si hay un substring
     * dentro de una cadena pasada como parámetro
     */
    public void patronSubstring(){
        Pattern pattern = Pattern.compile("hola.");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Contiene un patron"+
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("No contiene ningun patron"+
                    "\nTexto : "+this.texto);
        }
    }

    /**
     * la función comprueba si la cadena pasada como
     * parámetro comienza por un determinado patrón
     */
    public void empiezaPor(){
        Pattern pattern = Pattern.compile("^holamundo");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Si empieza por el mismo patron" +
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("No empieza por el mismo patron"+
                    "\nTexto : "+this.texto);
        }
    }

    /**
     * la función comprueba si la cadena pasada como
     * parámetro solo contiene unos caracteres determinados
     */
    public void cadenaConSoN(){
        Pattern pattern = Pattern.compile("^[sn]+$");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Si contiene S y N" +
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("No contiene S y N"+
                    "\nTexto : "+this.texto);
        }
    }

    /**
     * la función comprueba si la cadena pasada
     * como parámetro contiene el número cero seguido del número 1.
     */
    public void cadenaConOnoseguifofr1(){
        Pattern pattern = Pattern.compile("01+");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Si contiene el 0 seguido de 1" +
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("No contiene el 0 seguido de 1"+
                    "\nTexto : "+this.texto);
        }
    }

    /**
     * la función comprueba si el email
     * introducido como parámetro es válido.
     */
    public void esEmailValido(){
        Pattern pattern = Pattern.compile("([a-z]+)@([a-z]+)\\.([a-z]+)");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Es un correo electronico" +
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("No es un correo electronico"+
                    "\nTexto : "+this.texto);
        }
    }

}
