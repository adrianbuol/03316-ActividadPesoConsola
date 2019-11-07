/* 
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
//      Constantes de peso
        final double PES_MIN = 0;
        final double PES_MAX = 250;
        int ndia;
//        Variable de error
        boolean error;
//        Variable de peso y peso total
        double p;
        double ptotal = 0;
        double media;

        // double media = p / 7;
        ndia = 1;
        do {
            try {
                System.out.printf("Peso dia %d .......: ", ndia);
                p = SCN.nextDouble();
                if (p <= PES_MAX && p >= PES_MIN) {
                    error = false;
                    ndia++;
                    ptotal += p;

                } else {
                    error = true;
                    System.out.println("ERROR: Entrada incorrecta.");
                }

            } catch (Exception e) {
                error = true;
                System.out.println("ERROR: Entrada incorrecta.");
            } finally {
                SCN.nextLine();
            }
        } while (ndia <= 7);
        media = ptotal / 7;
        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "Media del peso ...: %.2fkg%n", media);
        System.out.println("---");
        System.out.println("END");
    }
}
