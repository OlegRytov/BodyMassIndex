public class BmiService {
    public double calculate(int weight, double height) {
        double result;
        result = weight / (Math.pow(height, 2));
        return result;
    }
}
