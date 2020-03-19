public class TestThree {
    public static void main(String args[]) {

        int[] array = {12, 1, 33, -9, 102, 58};

        System.out.println("Исходный массив : " );

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Значения масcива кратные трем : ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}