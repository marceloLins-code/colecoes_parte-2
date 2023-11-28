package com.lins.programa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, String> pessoas = new HashMap<>();
        
        System.out.print("Quantas pessoas deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        System.out.println("Cadastre as pessoas:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();
            
            pessoas.put(nome, sexo);
        }
        
        System.out.println("=== Pessoas do sexo Masculino ===");
        pessoas.forEach((nome, sexo) -> {
            if (sexo.equals("M")) {
                System.out.println(nome + " é do sexo Masculino");
            }
        });
        
        System.out.println("=== Pessoas do sexo Feminino ===");
        pessoas.forEach((nome, sexo) -> {
            if (sexo.equals("F")) {
                System.out.println(nome + " é do sexo Feminino");
            }
        });
    }
}
