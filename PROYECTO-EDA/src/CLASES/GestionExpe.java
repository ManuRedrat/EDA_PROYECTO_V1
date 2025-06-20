/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CLASES;

/**
 *
 * @author jparedes
 */
public class GestionExpe {

    private Nodo primero;

    public GestionExpe() {
        primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void AgregarPrimero(Nodo pNuevo) {
        if (primero == null) //esta vacía
        {
            primero = pNuevo;
        } else {
            pNuevo.setSgteNodo(primero);
            primero = pNuevo;
        }
    }

    public void MostrarLista() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getElemento() + " -> ");
            actual = actual.getSgteNodo();
        }
        System.out.println("");
    }

    

    public void AgregarUltimo(Nodo pNuevo) {
        if (primero == null) //esta vacía
        {
            primero = pNuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSgteNodo() != null) {
                actual = actual.getSgteNodo();
            }
            actual.setSgteNodo(pNuevo);
        }
    }
    
    public int NumeroElementos() {
        int cont = 0;
        Nodo actual = primero;
        while (actual != null) {
            cont++;
            actual = actual.getSgteNodo();
        }
        return cont;
    }
    
    public void EliminarPrimero(){
        if (primero == null || primero.getSgteNodo()==null) {
            primero = null;
        }
        else
        {
            primero = primero.getSgteNodo();
        }
    }
    
    public void EliminarUltimo(){
        if (primero == null || primero.getSgteNodo()==null) {
            primero = null;
        }
        else
        {
            Nodo actual = primero;
            while (actual.getSgteNodo().getSgteNodo() != null) {
                actual = actual.getSgteNodo();
            }
            actual.setSgteNodo(null);
        }
    }
}
