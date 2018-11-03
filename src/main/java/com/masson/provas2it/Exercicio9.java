package com.masson.provas2it;

public class Exercicio9 {

    public static void main(String[] args) {
        BinaryTree r1e2r3 = new BinaryTree(17, null, null);
        BinaryTree r1r2 = new BinaryTree(14, null, null);
        BinaryTree r1e2 = new BinaryTree(13, r1e2r3, null);
        BinaryTree r1 = new BinaryTree(10, r1e2, r1r2);

        BinaryTree e1r2r3 = new BinaryTree(21, null, null);
        BinaryTree e1r2 = new BinaryTree(15, null, e1r2r3);
        BinaryTree e1e2 = new BinaryTree(12, null, null);
        BinaryTree e1 = new BinaryTree(10, e1e2, e1r2);

        BinaryTree root = new BinaryTree(5, e1, r1);

        Exercicio9 e = new Exercicio9();
        int soma = e.somar(root);
        System.out.println("Soma: " + soma);
    }

    public int somar(BinaryTree binaryTree) {
        if (binaryTree != null) {
            int soma = binaryTree.valor;
            soma = soma + somar(binaryTree.left);
            soma = soma + somar(binaryTree.right);
            return soma;
        } else {
            return 0;
        }
    }

}

class BinaryTree {

    int valor;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
        this.valor = valor;
        this.left = left;
        this.right = right;
    }

    public int getValor() {
        return valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

}