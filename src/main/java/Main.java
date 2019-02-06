import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "dane.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int[] tab = new int[Integer.parseInt(reader.readLine())];

        for (int i = 0; i < tab.length; i++){
            tab[i] = Integer.parseInt(reader.readLine());
        }

        int sum = 0;
        for(int number : tab){
            sum += number;
        }
        System.out.println(sum);
    }
}
