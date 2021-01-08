package project9;
import java.util.Scanner;
public class T10 {
	public static void main(String[] args) {
        try{
            int maxL = Integer.MAX_VALUE;
            int a[] = new int[maxL];
            System.out.println(maxL);
        }catch (OutOfMemoryError e){
            System.out.println("OutOfMemoryError!");
        }
    }
}
