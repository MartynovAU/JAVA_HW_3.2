public class Main {
    public static void main(String[] args) {
        BodyIndexService service = new BodyIndexService();
        double growth = 185.0;
        double weight = 90.0;

        double index = service.calculate (growth, weight);

        System.out.println("Мой рост: " + growth + " см.");
        System.out.println("Мой вес: " + weight + " кг.");
        System.out.println("Индекс массы тела: " + index);
    }
}