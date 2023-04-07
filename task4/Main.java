import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        String pf = "";
        pf += line;

        while(line != null){
            line = reader.readLine();
            if (line != null){
                pf = pf+" "+line;
            }
        }

        String[] arr = pf.split("\\s");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int out = Integer.MAX_VALUE;
        int c=0;
        int nums[];
        nums = new int[arr.length];

        for (int i=0; i < arr.length; i++){
            nums[i] = Integer.parseInt(arr[i]);
            max = Integer.max(nums[i],max);
            min = Integer.min(nums[i],min);
        }

        for (int i = min; i <= max; i++){
            c=0;
            for (int j=0; j < nums.length; j++){
                c = c + Math.abs(nums[j]-i);
            }
            out = Integer.min(out,c);
        }
        System.out.println(out);
    }
}