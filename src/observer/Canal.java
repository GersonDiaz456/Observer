/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

class Canal {
    private List<Observer> suscriptores = new ArrayList<>();

    public void suscribir(Observer suscriptor) {
        suscriptores.add(suscriptor);  // Esta línea debe agregar el observador a la lista
    }

    public void notificar(String mensaje) {
        for (Observer suscriptor : suscriptores) {
            suscriptor.actualizar(mensaje);
        }
    }
}