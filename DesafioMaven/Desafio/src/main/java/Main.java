import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.time.Clock;

public final class Main {

    private Main() {
    }
    static Scanner sc = new Scanner(System.in);
    static Clock clock = Clock.systemUTC();
    public static void main(String[] args) {
        System.out.println("Hora actual: " + clock.instant());
        ArrayList<Pais> paises = new ArrayList<Pais>();
        paises.add(new Pais(5, "Argentina", 54));
        paises.add(new Pais(4, "Brasil", 55));
        paises.add(new Pais(3, "Chile", 56));
        paises.add(new Pais(2, "Uruguay", 57));
        paises.add(new Pais(1, "Paraguay", 58));
        paises.add(new Pais(0, "Venezuela", 59));
        paises.add(new Pais(6, "Bolivia", 60));
        paises.add(new Pais(7, "Peru", 61));

        Message message = new Message();


        System.out.println("Ingrese el codigo de area del pais: ");
        try {
            int userInput = sc.nextInt();
            if (paises.stream().filter(p -> p.getCodArea() == userInput).collect(Collectors.toList()).size() == 0) {
                message.errorMessage("No existe el pais con el codigo ingresado");
            } else {
                message.errorMessage("El pais es: " + paises.stream().filter(p -> p.getCodArea() == userInput)
                        .collect(Collectors.toList()).get(0).getNombre());
                
            }
            System.out.println("Hora luego de la ejecucion " + clock.instant());

        } catch (Exception InputMismatchException) {
            message.fatalMessage("Error: Ingreso un caracter invalido");

        }
    }
}
