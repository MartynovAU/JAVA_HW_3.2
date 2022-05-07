public class BodyIndexService {

    public double calculate(double growth, double weight) {

        double inMetres = growth / 100;
        double squaring = inMetres * inMetres;
        double bodyIndex = weight / squaring;

        return bodyIndex;
    }
}
