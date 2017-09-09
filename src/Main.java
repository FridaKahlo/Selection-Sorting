/**
 * Created by Liuda on 9/9/2017.
 */
public class Main {
    public static void main(String[] args){
        int[] myArray = {8,9,7,1};

        int temp;
        int min_position = 0; //the position of the minimum in the array
        for(int i=1;i<myArray.length;i++){

            if(myArray[min_position]>myArray[i]){
                temp = myArray[min_position];
                myArray[min_position]=myArray[i];
                myArray[i]=temp;
            }
        }
        System.out.println(java.util.Arrays.toString(myArray));
    }
}
