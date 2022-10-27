public class Retangulo {
    float altura;
    float largura;
    float calcularPerimetro() {
        float pm;
        pm = 2 * altura + 2 * largura;
        return pm;
    }
    void imprimirDados() {
        float p;
        p = calcularPerimetro();
        System.out.println("Retângulo: ");
        System.out.println("- altura:    " + altura);
        System.out.println("- largura:   " + largura);
        System.out.println("- perímetro: " + p);
    }
    public static void main(String[] args) {
        System.out.println("Mundo dos Retângulos");
        Retangulo retg1;
        retg1 = new Retangulo();
        retg1.altura = 10;
        retg1.largura = 20;
        retg1.imprimirDados();
        Retangulo retg2;
        retg2 = new Retangulo();
        retg2.altura = 5;
        retg2.largura = 15;
        retg2.imprimirDados();
    }
}