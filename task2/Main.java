import java.io.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {

        File file1 = new File(args[0]);
        File file2 = new File(args[1]);

        FileReader fr1 = new FileReader(file1);
        FileReader fr2 = new FileReader(file2);

        BufferedReader reader1 = new BufferedReader(fr1);
        BufferedReader reader2 = new BufferedReader(fr2);

        String line1 = reader1.readLine();
        String pf = line1;
        String[] coord = pf.split("\\s");
        float cx = Float.parseFloat(coord[0]);
        float cy = Float.parseFloat(coord[1]);
        line1 = reader1.readLine();
        pf = line1;
        float r = Float.parseFloat(pf);

        String line2 = reader2.readLine();
        pf=line2;
        coord = pf.split("\\s");
        float x = Float.parseFloat(coord[0]);
        float y = Float.parseFloat(coord[1]);
        if (r == sqrt((cx-x)*(cx-x)+(cy-y)*(cy-y))){
            System.out.println(0);
        } else if (r > sqrt((cx-x)*(cx-x)+(cy-y)*(cy-y))){
            System.out.println(1);
        } else if (r < sqrt((cx-x)*(cx-x)+(cx-y)*(cx-y))){
            System.out.println(2);
        }
        while (line2 != null) {
            line2 = reader2.readLine();
            pf=line2;
            if (pf != null) {
                coord = pf.split("\\s");
                x = Float.parseFloat(coord[0]);
                y = Float.parseFloat(coord[1]);
                if (r == sqrt((cx-x)*(cx-x)+(cy-y)*(cy-y))){
                    System.out.println(0);
                } else if (r > sqrt((cx-x)*(cx-x)+(cy-y)*(cy-y))){
                    System.out.println(1);
                } else if (r < sqrt((cx-x)*(cx-x)+(cx-y)*(cx-y))){
                    System.out.println(2);
                }
            }

        }
    }
}
