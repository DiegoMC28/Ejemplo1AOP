/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial.aop;

import tutorial.aop.dao.ClienteDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author DIEGO
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Leer la configuracion de Spring
        
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
        
        // Obtener el bean del contenedor de Spring
        
        ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
        
        // Llamar al metodo
        
        elCliente.insertaCliente();
        
        //Cerrar el contexto
        contexto.close();
    }
    
}
