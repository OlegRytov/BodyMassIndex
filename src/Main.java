public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 98;
        double h = 1.87;
        int bmi = (int) service.calculate(m, h);
        System.out.println("Индекс массы тела = " + bmi);
    }
}
