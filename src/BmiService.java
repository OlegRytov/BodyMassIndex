public class BmiService {
    public double calculate(int weight, double height) {
        double result;
        result = weight / (height * height);
        return result;
    }
}
