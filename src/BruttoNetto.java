public class BruttoNetto {
    public static void main(String[] args) {
        int nettoPreis = 200;
        // float floatSteuersatz = 0.05f;
        double steuersatz = 0.05;
        //float bruttoPreis;
        double bruttoPreis;
        bruttoPreis = nettoPreis * (1 + steuersatz);
        System.out.println("Ergebnis: " + bruttoPreis + "€");
    return;
    }
}
