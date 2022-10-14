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
            System.out.println("—умма траат за мес€ц составила" + sum + "рублей");
            System.out.println("ћинимальна€ сумма трат за день составила" + max + " рублей");
            System.out.println("ћаксимальна€ сумма трат за день составила" + min + "рублей" );
            System.out.println("—редн€€ сумма трат за мес€ц составила" + sum/30 + "рублей");

        }
    }
}