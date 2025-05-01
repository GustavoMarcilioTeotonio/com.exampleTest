package com.example;

public class Calculadora {

    public int somar (int a, int b) {
        return a + b;
    }

    public  String classificarAluno(double nota) {
        String classificação;

        if (nota < 5) {
            classificação = "Reprovado";
        } else if (nota >= 5 && nota < 7) {
            classificação = "Recuperação";
        } else {
            classificação = "Aprovado";
        }

        return classificação;
    }

    public Double CalcularQuadrado (double a, double b) {
        double area;

        area = a * b;

        return area;
    }

    public double CalcularTrinangulo (double a, double b) {
        double area;

        area = (a * b) / 2;

        return area;
    }




}