/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone.aparelhoTelefonico;

/**
 *
 * @author arthur
 */
public class AparelhoTelefonico implements IAparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
}
