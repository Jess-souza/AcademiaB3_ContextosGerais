public class CalculoArea {
    public static void main(String[] args) {
        double area;
        double raio = 0;
        raio = 5;

        area = raio * raio * Math.PI;

        System.out.println("O valor da área é de: " + area);
        System.out.printf("O valor da área é de: %.2f", area);
    }
}
