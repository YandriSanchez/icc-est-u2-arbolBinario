package controllers;

import models.*;

public class ArbolBinario{

    private Node root;

    public ArbolBinario() {

        this.root = null;
    }

    public void insert(int value){
        root = insertRec(root, value);
    }

    private Node insertRec(Node padre, int value){
        if(padre==null){
            return new Node(value);
        }

        if(value < padre.getValue()){
            //me voy a la izquierda
            padre.setLeft(insertRec(padre.getLeft(), value));
        }else if(value > padre.getValue()){
            //me voy a la derecha
            padre.setRight(insertRec(padre.getRight(), value));
        }
        return padre;
    }

    public void imprimirArbolInorden() {
        printTreeIn(root);
    }

    private void printTreeIn(Node padre) {
        if (padre != null) {
            printTreeIn(padre.getLeft());
            System.out.print(padre.getValue() + " ");
            printTreeIn(padre.getRight());
        }
    }

    public void imprimirArbolPreorden() {
        printTreePre(root);
    }

    private void printTreePre(Node padre) {
        if (padre != null) {
            System.out.print(padre.getValue() + " ");
            printTreePre(padre.getLeft());
            printTreePre(padre.getRight());
        }
    }

    public void imprimirArbolPosorden() {
        printTreePos(root);
    }

    private void printTreePos(Node padre) {
        if (padre != null) {
            printTreePos(padre.getLeft());
            printTreePos(padre.getRight());
            System.out.print(padre.getValue() + " ");
        }
    }

    public boolean buscar(int value){
        return buscarRec(root, value);
    }

    private boolean buscarRec(Node padre, int value){
        if(padre == null){
            return false;
        }
        if(padre.getValue()==value){
            return true;
        }

        if(value < padre.getValue()){
            //me voy a la izquierda
            return buscarRec(padre.getLeft(), value);
        }else{
            //me voy a la derecha
            return buscarRec(padre.getRight(), value);
        }
    }
}