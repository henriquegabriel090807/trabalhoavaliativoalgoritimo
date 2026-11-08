using System;
using System.Collections.Generic;

class Program {
    static void Main() {
        List<string> times = new List<string> {
            "Atlético-MG", "Cruzeiro", "América-MG", "Villa Nova"
        };

        for (int etapa = 0; etapa < 2; etapa++) {
            Console.WriteLine("\nTimes: " + times.Count);
            for (int i = 0; i < times.Count; i++) {
                Console.WriteLine(i + " - " + times[i]);
            }

            int total = 0;
            Console.WriteLine("Ida e volta:");
            for (int i = 0; i < times.Count; i++) {
                for (int j = 0; j < times.Count; j++) {
                    if (i != j) {
                        Console.WriteLine(times[i] + " x " + times[j]);
                        total++;
                    }
                }
            }
            Console.WriteLine("Total: " + total);

            total = 0;
            Console.WriteLine("Turno único:");
            for (int i = 0; i < times.Count; i++) {
                for (int j = i + 1; j < times.Count; j++) {
                    Console.WriteLine(times[i] + " x " + times[j]);
                    total++;
                }
            }
            Console.WriteLine("Total: " + total);

            if (etapa == 0) {
                times.Add("Tombense");
            }
        }
    }
}
