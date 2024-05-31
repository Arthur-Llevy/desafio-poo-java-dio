/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone.reprodutorMusical;

/**
 *
 * @author arthur
 */
public class ReprodutorMusical implements IReprodutorMusical {

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }
}
