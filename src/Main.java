public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println();
        System.out.println("Индекс массы тела при росте 1.8 метра и массе 75 кг равен " + service.calculate(1.8, 75));

        System.out.println();
        System.out.println("Индекс массы тела при росте 2 метра и массе 90 кг равен " + service.calculate(2, 90));

        System.out.println();
        System.out.println("Индекс массы тела при росте 1.55 метра и массе 65 кг равен " + service.calculate(1.55, 65));
    }
}
