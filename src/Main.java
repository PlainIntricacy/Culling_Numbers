/**
 * Culling Numbers
 * @author todyerutz@plainintricacy.wordpress.com
 *
 * Given a list of unsigned integers, "cull" the list by removing the duplicates and displaying the result.
 *
 * Based on this reddit daily challenge:
 * http://goo.gl/BhTt4F
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the list of numbers:");
        String in = input.nextLine().replaceAll(" " , "");
        input.close();

        List<Integer> numList = new ArrayList<Integer>();
        numList.add(Integer.parseInt(in.substring(0,1)));
        for(int i=0; i<in.length(); i++){
            if(numList.contains(Integer.parseInt(in.substring(i,i+1)))==false){
                numList.add(Integer.parseInt(in.substring(i,i+1)));
            }
        }
        System.out.println("Output:");
        for(int i=0; i<numList.size(); i++){
            System.out.print(numList.get(i));
        }
        System.out.println();
    }
}
