public class BruttoNetto {
    public static void main(String[] args) {
        int nettoPreis = 200;
        // float floatSteuersatz = 0.05f;
        int teiler;
        teiler =105;
        int rest = nettoPreis % teiler;
        System.out.println (rest);
        double steuersatz = 0.05;
        double maxSteuersatz = 0.04;
        //float bruttoPreis;
        double bruttoPreis;
        bruttoPreis = nettoPreis * (1 + steuersatz);
        System.out.println("Ergebnis: " + bruttoPreis + "€");
        boolean zuHoch;
        zuHoch = steuersatz > maxSteuersatz;
        System.out.println("Zu hoch?" + zuHoch);
        return;
    }
}
