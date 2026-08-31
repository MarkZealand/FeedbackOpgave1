import java.util.Scanner;

void main() {

    //Trin 1
    Scanner input = new Scanner(System.in);
    System.out.println("Indtast venligst navn på din karakter:");
    String karakterNavn = input.nextLine();
    System.out.println("Din karakter er blevet navngivet: " + karakterNavn);

    //Trin 1.5 - Oprydning af output
    System.out.println("Vil du gerne se konsol output løbende? (true/false)");
    boolean seOutput = input.nextBoolean();

    //Trin 2
    System.out.println("Indtast venligst alder på din karakter:");
    int karakterAlder = input.nextInt();
    if(seOutput)
        System.out.println("Din karakter, " + karakterNavn + " er " + karakterAlder + " år gammel");

    System.out.println("Indtast venligst styrke på din karakter:");
    int karakterStyrke = input.nextInt();
    if(seOutput)
        System.out.println("Din karakter, " + karakterNavn + " har " + karakterStyrke + " i styrke");

    System.out.println("Indtast venligst intelligens på din karakter:");
    int karakterIntelligens = input.nextInt();
    if(seOutput)
        System.out.println("Din karakter, " + karakterNavn + " har " + karakterIntelligens + " i intelligens");

    System.out.println("Indtast venligst level på din karakter:");
    int karakterLevel = input.nextInt();
    if(seOutput)
        System.out.println("Din karakter, " + karakterNavn + " er level " + karakterLevel);

    //Trin 3
    //Der er parantes i power beregningen, for at skalere poweren med level, så en karakter med højere level vil have mere power end en karakter med lavere level, selvom de har samme styrke og intelligens.
    //Hvis man fjerner parantesen, vil poweren kun være summen af styrke og intelligens, og level vil ikke have nogen effekt på poweren.
    int power = (karakterStyrke + karakterIntelligens) * karakterLevel;
    if(seOutput)
        System.out.println("Din karakter, " + karakterNavn + " har " + power + " i power");

    //Trin 4
    boolean ungHelt =  karakterAlder < 25;
    if(seOutput)
        System.out.println("Din karakter, " + karakterNavn + " er en ung helt? " + ungHelt);;

    //Trin 5
    //Vi vælger den første karakter i strengen karakterNavn, hvilket altid starter på 0 og ikke 1.
    char initial = karakterNavn.charAt(0);
    if(seOutput)
        System.out.println("Din karakter, " + karakterNavn + " har initialen: " + initial);

    //Trin 7 (Indsat før Trin 6 i koden, for at inkludere den unikke udvidelse i character sheet uden gentagelse)

    int health = (karakterStyrke * 10) + karakterLevel * 5;
    if (ungHelt) {
        health += 20;
    }
    //Trin 6 - Character sheet
    System.out.println("====================================");
    System.out.println("Karakter Sheet");
    System.out.println("====================================");
    System.out.println("Navn: " + karakterNavn);
    System.out.println("Initial: " + initial);
    System.out.println("Alder: " + karakterAlder);
    System.out.println("Styrke: " + karakterStyrke);
    System.out.println("Intelligens: " + karakterIntelligens);
    System.out.println("Level: " + karakterLevel);
    System.out.println("====================================");
    System.out.println("Power: " + power);
    System.out.println("Health: " + health);
    System.out.println("Ung helt: " + ungHelt);
    System.out.println("====================================");
}
