/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();
        Usuario usuario1 = new Usuario("Gerson");
        Usuario usuario2 = new Usuario("Lester");

        canal.suscribir(usuario1);
        canal.suscribir(usuario2);

        canal.notificar("Nuevo video disponible");
    }
}
