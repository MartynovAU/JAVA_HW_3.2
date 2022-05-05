public class Main {
    public static void main(String[] args) {
        BodyIndexService service = new BodyIndexService();
        double growth = 185.0;
        double weight = 90.0;

        double Index = service.calculate (growth, weight);
        System.out.println(Index);
    }
}