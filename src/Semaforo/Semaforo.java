package Semaforo;

import java.util.Timer;
import java.util.TimerTask;

class Semaforo {
    String corAtual;

    Semaforo() {
        this.corAtual = "Vermelho";
    }

    void mudarCor() {
        switch (corAtual) {
            case "Vermelho":
                corAtual = "Verde";
                break;
            case "Verde":
                corAtual = "Amarelo";
                break;
            case "Amarelo":
                corAtual = "Vermelho";
                break;
        }
        System.out.println("Cor do semáforo alterada para: " + corAtual);
    }

    void mostrarCorAtual() {
        System.out.println("Cor atual do semáforo: " + corAtual);
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.mostrarCorAtual();

        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
           
            public void run() {
                semaforo.mudarCor();
                semaforo.mostrarCorAtual();
            }
        }, 30000, 30000); 
    }
}
