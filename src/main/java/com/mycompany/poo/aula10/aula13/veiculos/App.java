public class App {
    public static void main(String[] args) {
        System.out.println("---- Interfaces ----");

        CarroManual manual = new CarroManual();
        manual.seguirEmFrente();
        manual.estacionar();
        manual.re();

        CarroAutomatico automatico = new CarroAutomatico();
        automatico.seguirEmFrente();
        automatico.estacionar();
        automatico.re();
    }
}