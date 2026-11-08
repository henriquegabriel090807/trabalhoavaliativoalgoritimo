# Validação das execuções

As três versões executaram sem erro e produziram exatamente os mesmos jogos, na mesma ordem.

| Times | Java ida e volta | C# ida e volta | Rust ida e volta | Java turno único | C# turno único | Rust turno único |
|---|---|---|---|---|---|---|
| 3 | 6 | 6 | 6 | 3 | 3 | 3 |
| 4 | 12 | 12 | 12 | 6 | 6 | 6 |
| 5 | 20 | 20 | 20 | 10 | 10 | 10 |

Foram conferidos os nomes com índices, a ordem dos times, todos os pares exibidos, a ausência de jogos contra o próprio time e a ausência de pares invertidos no turno único. O código padrão executa com quatro e cinco times. Para testar três, foram usadas cópias temporárias com os três primeiros nomes e apenas uma etapa, fora da entrega.

Saídas reais: [Java](java.txt), [C#](csharp.txt) e [Rust](rust.txt).

O arquivo [erro_ponto_virgula.txt](erro_ponto_virgula.txt) registra a reprodução de um erro de sintaxe em uma cópia temporária. O erro não está no programa entregue.
