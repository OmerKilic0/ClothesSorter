import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClothesSorter {

    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String> colors = new ArrayList<String>();
    private ArrayList<Integer> price = new ArrayList<Integer>();
    private ArrayList<Float> percentage = new ArrayList<Float>();

    public ClothesSorter(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner scan = new Scanner(f);
        int i=0;
        while(scan.hasNext()){
            names.add(scan.next());
            colors.add(scan.next());
            price.add(scan.nextInt());
            percentage.add(scan.nextFloat());
            i++;
        }
        scan.close();
    }

    public void sortByName(){
        String temp1;
        String temp2;
        int temp3;
        float temp4;
        for(int i=0; i<names.size()-1; i++) {
            for(int j=i+1; j<names.size(); j++) {
                if(names.get(i).compareTo(names.get(j)) > 0) {
                    temp1 = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j,temp1);

                    temp2 = colors.get(i);
                    colors.set(i, colors.get(j));
                    colors.set(j, temp2);

                    temp3 = price.get(i);
                    price.set(i, price.get(j));
                    price.set(j, temp3);

                    temp4 = percentage.get(i);
                    percentage.set(i, percentage.get(j));
                    percentage.set(j, temp4);
                }
            }
        }
        for(int i=0; i< names.size(); i++){
            System.out.println(names.get(i) + " " + colors.get(i) + " " + price.get(i) + " " + percentage.get(i));
        }
    }

    public void sortByColor(){
        String temp1;
        String temp2;
        int temp3;
        float temp4;
        for(int i=0; i<colors.size()-1; i++) {
            for(int j=i+1; j<colors.size(); j++) {
                if(colors.get(i).compareTo(colors.get(j)) > 0) {
                    temp2 = colors.get(i);
                    colors.set(i, colors.get(j));
                    colors.set(j,temp2);

                    temp1 = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j,temp1);

                    temp3 = price.get(i);
                    price.set(i, price.get(j));
                    price.set(j, temp3);

                    temp4 = percentage.get(i);
                    percentage.set(i, percentage.get(j));
                    percentage.set(j, temp4);
                }
            }
        }
        for(int i=0; i< colors.size(); i++){
            System.out.println(names.get(i) + " " + colors.get(i) + " " + price.get(i) + " " + percentage.get(i));        }
    }

    public void sortByPrice() {
        String temp1;
        String temp2;
        int temp3;
        float temp4;
        int n = price.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (price.get(j) > price.get(j + 1)) {
                    temp3 = price.get(j);
                    price.set(j, price.get(j + 1));
                    price.set(j + 1, temp3);

                    temp1 = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j,temp1);

                    temp2 = colors.get(i);
                    colors.set(i, colors.get(j));
                    colors.set(j, temp2);

                    temp4 = percentage.get(i);
                    percentage.set(i, percentage.get(j));
                    percentage.set(j, temp4);
                }
            }
        }
        for (int i = 0; i < price.size(); i++) {
            System.out.println(names.get(i) + " " + colors.get(i) + " " + price.get(i) + " " + percentage.get(i));        }
    }

    public void sortByDiscountPercentage(){
        String temp1;
        String temp2;
        int temp3;
        float temp4;
        int n = percentage.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (percentage.get(j) > percentage.get(j + 1)) {
                    temp4 = percentage.get(j);
                    percentage.set(j, percentage.get(j + 1));
                    percentage.set(j + 1, temp4);

                    temp1 = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j,temp1);

                    temp2 = colors.get(i);
                    colors.set(i, colors.get(j));
                    colors.set(j, temp2);

                    temp3 = price.get(i);
                    price.set(i, price.get(j));
                    price.set(j, temp3);
                }
            }
        }
        for(int i=0; i< percentage.size(); i++){
            System.out.println(names.get(i) + " " + colors.get(i) + " " + price.get(i) + " " + percentage.get(i));        }
    }

    public void print(){
        System.out.print("Names          ");
        for(int i=0; i< names.size(); i++){
            System.out.print(names.get(i) + "   ");
        }
        System.out.println();

        System.out.print("Colors         ");
        for(int i=0; i< colors.size(); i++){
            System.out.print(colors.get(i) + "    ");
        }
        System.out.println();

        System.out.print("Prices         ");
        for(int i=0; i< price.size(); i++){
            System.out.print(price.get(i) + "       ");
        }
        System.out.println();

        System.out.print("Percentages    ");
        for(int i=0; i< percentage.size(); i++){
            System.out.print(percentage.get(i) + "     ");
        }
        System.out.println();
    }
}
