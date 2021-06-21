package br.com.dimension.aplicacao;

import br.com.dimension.maquina.Maquina;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dimension {
    public static void main(String[] args) {
        
        Maquina maquina = new Maquina();
        Timer timer = new Timer();
        final long intervalo = (1000*5);
        
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                try {
                    maquina.memoria();
                } catch (IOException ex) {
                    Logger.getLogger(Dimension.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                    maquina.disco();
                } catch (IOException ex) {
                    Logger.getLogger(Dimension.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    maquina.placaVideo();
                } catch (IOException ex) {
                    Logger.getLogger(Dimension.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    maquina.processador();
                } catch (IOException ex) {
                    Logger.getLogger(Dimension.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    maquina.sistema();
                } catch (IOException ex) {
                    Logger.getLogger(Dimension.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    maquina.processos();
                    
//                System.exit(0); //To change body of generated methods, choose Tools | Templates.
                } catch (IOException ex) {
                    Logger.getLogger(Dimension.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0,intervalo);
    }
}