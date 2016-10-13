import java.util.Scanner;

/**
 * Created by msrabon on 13-Oct-16.
 * Project Name: K-MAP Minimizer SOP & POS.
 */
public class K_Map {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Karnaugh_map my_map = new Karnaugh_map();

        System.out.println("**************************************");
        System.out.println("Inset 1 for 2 Variable Kmap.");
        System.out.println("Inset 2 for 3 Variable Kmap.");
        System.out.println("Inset 3 for 4 Variable Kmap.");
        System.out.println("**************************************");
        System.out.print("Enter Choice: ");

        switch (scan.nextInt()) {
            case 1:
                break;
            case 2: my_map.initiate_Kmap_3();
                my_map.kmapSolver_3();
                break;
            case 3:
                break;
            default:
        }
    }
}
