public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = height/(weight*weight);
        return bmi;
    }

}