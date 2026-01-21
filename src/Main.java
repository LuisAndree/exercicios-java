import com.andre.exercicies.collections.Pessoa;
import com.andre.exercicies.collections.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("bolacha", 2.5, 10));
        produtos.add(new Produto("azulejo", 7.99, 7));
        produtos.add(new Produto("fone", 160.50, 17));
        produtos.add(new Produto("mouse", 150, 15));
        produtos.add(new Produto("teclado", 174.99, 13));

        produtos.forEach(p -> System.out.println(p.nome + " = " + p.preco));

        Map<String, Integer> estoque = new HashMap<>();

        for (Produto p : produtos) {
            estoque.put(p.nome, (int) p.quantidade);
        }

        System.out.println("produtos: " + estoque);

        int quantidadeTotal = estoque.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(quantidadeTotal);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<String> maiores100 = produtos
                .stream()
                .filter(p -> p.getPreco() > 100)
                .map(Produto::getNome)
                .toList();
        System.out.println(maiores100);


        List<Double> aumentados = produtos
                .stream()
                .map(p -> p.getPreco() * 1.10)
                .toList();
        System.out.println(aumentados);

        double media = produtos
                .stream()
                .mapToDouble(p -> p.preco)
                .average()
                .orElse(0);
        System.out.println(media);

        double maioresQue50 = produtos
                .stream()
                .filter(p -> p.getPreco() > 50)
                .count();
        System.out.println(maioresQue50);

        Map<String, Double> viraMap = produtos
                .stream()
                .collect(Collectors.toMap(Produto::getNome, Produto::getPreco));
        System.out.println(viraMap);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Andre", "Austin"));
        pessoas.add(new Pessoa("Leticia", "Austin"));
        pessoas.add(new Pessoa("Maria", "Slz"));
        pessoas.add(new Pessoa("Marta", "Slz"));
        pessoas.add(new Pessoa("Luis", "Little japan"));
        pessoas.add(new Pessoa("Cely", "Little japan"));
        pessoas.add(new Pessoa("Florisbella", "Little japan"));

        Map<String, List<Pessoa>> pessoasPorCidade =
                pessoas.stream()
                        .collect(Collectors.groupingBy(Pessoa::getCidade));

        pessoasPorCidade.forEach((cidade, pessoas2) -> {
            System.out.println("Cidade: " + cidade);
            pessoas2.forEach(pessoa -> System.out.println(pessoa.getNome())
            );
        });




    }
}