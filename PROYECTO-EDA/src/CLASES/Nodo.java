/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author manut
 * @param <T>
 */
public class Nodo<T> {
    private T elemento;
    private Nodo sgteNodo;

    public Nodo() {
        elemento = null;
        sgteNodo = null;
    }

    public Nodo(T pElemento, Nodo pSgteNodo) {
        elemento = pElemento;
        sgteNodo = pSgteNodo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
}
