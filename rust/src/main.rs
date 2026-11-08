fn main() {
    let mut times: Vec<String> = vec![
        String::from("Atlético-MG"),
        String::from("Cruzeiro"),
        String::from("América-MG"),
        String::from("Villa Nova"),
    ];

    for etapa in 0..2 {
        println!("\nTimes: {}", times.len());
        for i in 0..times.len() {
            println!("{} - {}", i, times[i]);
        }

        let mut total = 0;
        println!("Ida e volta:");
        for i in 0..times.len() {
            for j in 0..times.len() {
                if i != j {
                    println!("{} x {}", times[i], times[j]);
                    total += 1;
                }
            }
        }
        println!("Total: {}", total);

        total = 0;
        println!("Turno único:");
        for i in 0..times.len() {
            for j in (i + 1)..times.len() {
                println!("{} x {}", times[i], times[j]);
                total += 1;
            }
        }
        println!("Total: {}", total);

        if etapa == 0 {
            times.push(String::from("Tombense"));
        }
    }
}
