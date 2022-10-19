public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 64;
        float height = 1.62F;
        float bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела = " + bmi);
    }
}