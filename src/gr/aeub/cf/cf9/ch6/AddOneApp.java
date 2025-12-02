package gr.aeub.cf.cf9.ch6;

/**
 * esto oti anuparistoume megalous akeraious se morfi pinaka ,
 * ueloume na prosthesoume ti monada
 */
public class AddOneApp {
    public static void main(String[] args) {

    }

    /**
     * prosthetei th monada se ena pinaka pou
     * anaparista ena akeraio
     * @param arr  o input pinakas
     * @return   ena array me to apotelesma
     */
    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];
        int[] arrOut = new int[arr.length +1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--){
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrOut[0] = 1;
        }
        return arrOut;

    }
}
