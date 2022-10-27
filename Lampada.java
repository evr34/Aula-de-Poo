public class Lampada {
    private boolean acesa;
    public void acender() {
        this.acesa = true;
    }
    public void apagar() {
        this.acesa = false;
    }
    public Lampada(boolean acesa) {
        this.acesa = acesa;
    }
    public boolean isAcesa() {
        return acesa;
    }
    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }
    public static void main(String[] args) {
        int cont = 1;
        Lampada lamp1 = new Lampada(true);
        Lampada lamp2 = new Lampada(false);
    }
    while(cont < 5) {
        System.out.println("-- Iteração (repetição): " + cont);
        System.out.println("Lâmpada [lamp1] = " + (lamp1.isAcesa()?"acesa":"apagada"));
    }    
}
