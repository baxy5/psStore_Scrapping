import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class twoEntriesSum2020 {
    public static void main(String [] args) throws FileNotFoundException {
        //1. Create an integer arraylist
        //2. read input file
        //3. watch naruto
        //4. select the two number
        //5. multiply them
        //6. ready

        ArrayList<Integer> input = new ArrayList<>();
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNext())
        {
            input.add(Integer.parseInt(sc.nextLine()));
        }
        sc.close();

        for(int i = 0;i<input.size();i++) {
            for(int j = i+1;j<input.size();j++) {
                if(input.get(i) + input.get(j) == 2020)
                {
                    System.out.println("The two numbers: " + input.get(i) + " and " + input.get(j));
                    System.out.print("Multiplied: " + input.get(i) * input.get(j));
                    System.out.println();
                }
            }
        }

        for(int i = 0;i<input.size();i++) {
            for(int j = i+1;j<input.size();j++) {
                for(int k = i+2;k<input.size();k++){
                    if(input.get(i) + input.get(j) + input.get(k) == 2020)
                    {
                        System.out.println("The three numbers: " + input.get(i) + ", " + input.get(j) + " and " + input.get(k));
                        System.out.print("Multiplied: " + input.get(i) * input.get(j) * input.get(k));
                        System.out.println();
                    }
                }
            }
        }


    }
}