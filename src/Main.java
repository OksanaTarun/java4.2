public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(84.5, 1.86);
        System.out.println(BMI);

    }
}
