import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresion {
    private String texto ;
    private Scanner sc = new Scanner(System.in);

    private  String comp;
    public Expresion(String texto){
        this.texto = texto;
        this.comp = "";
    }

    public void menu(){
        System.out.println("Que necesitas comparar?");
        setComp(sc.nextLine());
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

    public void cadenaConSoN(){
        Pattern pattern = Pattern.compile("sn.");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Si contiene S y N" +
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("No contiene S y N"+
                    "\nTexto : "+this.texto);
        }
    }
    public void cadenaConOnoseguifofr1(){
        Pattern pattern = Pattern.compile("01");
        Matcher match = pattern.matcher(this.texto);
        if(match.find()){
            System.out.println("Si contiene el 0 seguido de 1" +
                    "\nTexto : "+this.texto);
        }else{
            System.out.println("No contiene el 0 seguido de 1"+
                    "\nTexto : "+this.texto);
        }
    }
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

    public void setComp(String comp) {
        this.comp = sc.nextLine();
    }
}
