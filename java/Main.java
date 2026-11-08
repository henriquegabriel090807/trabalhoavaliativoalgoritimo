public class Main {
    public static void main(String[] args) {
        String[] times = {"Atlético-MG", "Cruzeiro", "América-MG", "Villa Nova"};

        // Primeiro gera com quatro times, depois com cinco.
        for (int etapa = 0; etapa < 2; etapa++) {
            System.out.println("\nTimes: " + times.length);
            for (int i = 0; i < times.length; i++) {
                System.out.println(i + " - " + times[i]);
            }

            int total = 0;
            System.out.println("Ida e volta:");
            for (int i = 0; i < times.length; i++) {
                for (int j = 0; j < times.length; j++) {
                    if (i != j) {
                        System.out.println(times[i] + " x " + times[j]);
                        total++;
                    }
                }
            }
            System.out.println("Total: " + total);

            total = 0;
            System.out.println("Turno único:");
            for (int i = 0; i < times.length; i++) {
                for (int j = i + 1; j < times.length; j++) {
                    System.out.println(times[i] + " x " + times[j]);
                    total++;
                }
            }
            System.out.println("Total: " + total);

            if (etapa == 0) {
                String[] novosTimes = new String[5];
                for (int i = 0; i < times.length; i++) {
                    novosTimes[i] = times[i];
                }
                novosTimes[4] = "Tombense";
                times = novosTimes;
            }
        }
    }
}
