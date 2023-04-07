import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean ready = false;
        String check;

        ArrayList<Object> arr = new ArrayList<>();
        ArrayList<Object> path = new ArrayList<>();

        int n = Integer.parseInt(args[0]), m=Integer.parseInt(args[1]);

        StringBuilder out= new StringBuilder();

        for (int i =1; i <=n; i++) {
            arr.add(i);
        }

        do {

            check="";
            if (m >= n){
                while (path.size() <= m) {
                    path.addAll(arr);
                }
            } else {
                path.addAll(arr);
            }
            out.append(path.get(0));
            check = check + path.get(m-1);
            if (m > 1) {
                path.subList(0, m - 1).clear();
            }
            if (check.equals("1")) {
                ready = true;
            }
        } while (!ready);

        System.out.println(out);

    }
}
