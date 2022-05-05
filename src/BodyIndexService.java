public class BodyIndexService {

    public double calculate(double growth, double weight) {

        double InMetres = growth / 100;
        double Squaring = InMetres * InMetres;
        double BodyIndex = weight / Squaring;

        return BodyIndex;
    }
}
