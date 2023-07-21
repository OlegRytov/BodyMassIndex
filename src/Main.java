public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 98; // масса тела
        double h = 1.87; // рост в метрах
        int bmi = (int) service.calculate(m, h);
        System.out.println("Индекс массы тела = " + bmi);
    }
}
