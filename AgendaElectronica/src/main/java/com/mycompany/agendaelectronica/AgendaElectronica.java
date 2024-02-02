package com.mycompany.agendaelectronica;

import com.mycompany.agendaelectronica.UI.Principal;

/**
 *
 * @author benja
 */
public class AgendaElectronica {

    public static void main(String[] args) {
        Principal prince = new Principal(); //Creamos la instancia de la interfaz gráfica
        prince.setVisible(true); //Seteamos para que aparezca la interfaz (pero va a aparecer en "cualquier lado")
        prince.setLocationRelativeTo(null); //Con esto hacemos que aparezca en el medio
    }
}
