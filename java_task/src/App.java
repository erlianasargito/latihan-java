import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner first = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = first.nextLine();

        Scanner last = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = last.nextLine();

        Scanner birthplace = new Scanner(System.in);
        System.out.print("Enter your place of birth: ");
        String birthPlace = birthplace.nextLine();

        Scanner birthyear = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int birthYear = birthyear.nextInt();
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy", Locale.ENGLISH);
        // LocalDate year = LocalDate.parse(birthYear, formatter);

        Scanner plfav = new Scanner(System.in);
        System.out.print("Enter your favorite program language: ");
        String progrLangFav = birthplace.nextLine();

        int n = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter total elements: ");
        n = inp.nextInt();
        int[] arr1 = new int[10];
        System.out.println("Enter the elements: ");
        for(int i=0; i < n; i++){
            arr1[i] = inp.nextInt();
        }

        int m = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total elements for array 2: ");
        m = input.nextInt();
        int[] arr2 = new int[10];
        System.out.println("Enter the elements: ");
        for(int j=0; j < m; j++){
            arr2[j] = inp.nextInt();
        }

        System.out.println("==================");
        System.out.println("My Profile");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Place of Birth: " + birthPlace);
        System.out.println("Year of Birth: " + birthYear);
        System.out.println("Favorite program language: " + progrLangFav);

        System.out.println("==================");
        System.out.println("Array");
        System.out.print("Array 1: ");
        for(int i=0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.print("Array 2: ");
        for(int j=0; j < m; j++){
            System.out.print(arr2[j] + " ");
        }

        System.out.print("The duplicate between arr1 and arr2: ");
        for(int k=0; k < arr1.length; k++){
            for(int l=0; l < arr2.length; l++){
                if (arr1[k] == arr2[l]) {
                    System.out.print(arr1[k] + " ");
                }
            }
        }

        first.close();
        last.close();
        birthplace.close();
        birthyear.close();
        plfav.close();
        inp.close();
        input.close();
    }
}