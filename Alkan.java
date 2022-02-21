/*
* File: Alkan.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-02-21
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Alkan {
    public static void main(String[] args) {
        System.out.println("Balogh Csenge\nSzoft_I_N\n2022.02.21");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.print("Szénatomok száma > ");
        int coalAtoms = sc.nextInt();

        sc.close();

        int hydrogenAtoms = 2 * coalAtoms + 2;
        System.out.println(
            "Az alkánban a hidrogénatomok száma: " + hydrogenAtoms
        );

        if (coalAtoms > 10) {
            System.out.println("SOK");
        } else {
            System.out.println("NORMÁL");
        }
    }
}