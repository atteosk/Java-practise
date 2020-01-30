
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int read = Integer.valueOf(lukija.nextLine());
         
            if (read == -1) {
                break;
            }
             lista.add(read);
            }
        System.out.println("");
        int i = 0;
        int largest = lista.get(0);
        while (i < lista.size()) {
         int number = lista.get(i);
         if (number < largest) {
            largest = number;
         }
           i++;
         System.out.println("The largest number of the list: " + largest);

        }            
        }
    }
    
