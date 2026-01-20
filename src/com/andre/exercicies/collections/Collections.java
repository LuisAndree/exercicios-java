package com.andre.exercicies.collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // Exercício 1 — Lista de nomes (List)
        //Objetivo: aprender operações básicas com List.
        //Crie um programa que:
        //Crie uma List<String> com nomes de pessoas
        //Adicione 5 nomes
        //Remova um nome
        //Verifique se um nome existe
        //Imprima todos os nomes
        List<String> pessoas = new ArrayList<String>();

        pessoas.add("Andre");
        pessoas.add("Rafael");
        pessoas.add("Antonio");
        pessoas.add("Luca");
        pessoas.add("Pedro");
        pessoas.add("Hyerro");
        System.out.println("Pessoas: " + pessoas);

        pessoas.remove(("Antonio"));
        System.out.println("Pessoas: " + pessoas);

        boolean temPessoa = pessoas.contains("Luca");
        System.out.println("Pessoas: " + temPessoa);

        pessoas.forEach(System.out::println);

        //Exercício 2 — Evitando duplicatas (Set)
        //Objetivo: entender quando usar Set.
        //Crie uma lista com nomes duplicados
        //Converta para um Set
        //Mostre a diferença de tamanho entre a List e o Set
        // Lista com nomes duplicados
        pessoas.add("Andre");
        pessoas.add("Rafael");
        pessoas.add("Antonio");
        pessoas.add("Luca");
        pessoas.add("Pedro");
        pessoas.add("Hyerro");
        pessoas.add("Andre");
        pessoas.add("Rafael");
        pessoas.add("Antonio");
        pessoas.add("Luca");
        pessoas.add("Pedro");
        pessoas.add("Hyerro");
        System.out.println("Pessoas: " + pessoas);

        Set<String> pessoasSet = new HashSet<>(pessoas);
        System.out.println("Tamanho Set: " + pessoasSet.size());
        System.out.println("Pessoas Set: " + pessoasSet);
        System.out.println("Tamanho: " + pessoas.size());
        System.out.println("Pessoas: " + pessoas);

        //Exercício 3 — Cadastro simples (Map)
        //Objetivo: usar Map como estrutura de dados.
        //Crie um sistema de usuários:
        //Map<Integer, String> (id → nome)
        //Cadastre 5 usuários
        //Busque um usuário pelo id
        //Remova um usuário
        //Liste todos os usuários

        Map<Integer, String> cadastros = new TreeMap<>();
        cadastros.put(1, "Andre");
        cadastros.put(2, "Rafael");
        cadastros.put(3, "Antonio");
        cadastros.put(4, "Luca");
        cadastros.put(5, "Pedro");
        cadastros.put(6, "Hyerro");

        System.out.println(cadastros.get(3));
        cadastros.remove(3);
        cadastros.entrySet().forEach(System.out::println);

        class Produto {
            String nome;
            double valor;

            List<Produto> produtos = new ArrayList<Produto>();



        }

    }
}
