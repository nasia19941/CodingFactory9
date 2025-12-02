package gr.aeub.cf.cf9.ch6;

/**
 * otan kanoume cory references tote
 * to copy onomazetai shalow kai exei
 * side effects
 */
public class ArrayShallowCopy {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 ,5};
        int[] arrCopy = arr; //shallow copy

        arrCopy[0] = 1000;
        System.out.println(arr[0]);  //

    }
}
