public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        {

            int[] weights = new int[12];
            weights[0] = 90;
            int januaryWeight = weights[0];
            System.out.println(januaryWeight);
            System.out.println(weights[0]);
        }
        System.out.println();
        int[] numbers = new int[5];
        for (int i = 0; i<numbers.length; i++){
            numbers [i] = i*10;
        }
        for(int i = 0 ; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();


        int[] arr = new int[30];
        int sum = 0;
        int min = 100_000;
        int max = 200_000;
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int)(Math.random() * 10_000) + 10_000;
            sum += arr[i];
            if (arr[i] <= max) {
                max = arr[i];
            }
            if (arr[i] >= min) {
                min = arr[i];
            }
            System.out.println("����� ����� �� ����� ���������" + sum + "������");
            System.out.println("����������� ����� ���� �� ���� ���������" + max + " ������");
            System.out.println("������������ ����� ���� �� ���� ���������" + min + "������" );
            System.out.println("������� ����� ���� �� ����� ���������" + sum/30 + "������");

        }
    }
}