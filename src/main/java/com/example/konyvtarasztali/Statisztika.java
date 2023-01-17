package com.example.konyvtarasztali;

import java.sql.SQLException;
import java.util.List;

public class Statisztika {
    private static List<Konyv> konyvek;

    public static void main(String[] args) {
        try {
            beolvas();
            System.out.printf("500 oldalnál hosszabb könyvek száma: %d\b", get500oldalnalHosszabbKonyvekSzama());
        } catch (SQLException e) {
            System.err.println("Hiba történt az adatbázis kapcsolat kialakításakor, a hiba: "+e.getMessage());
        }
    }

    private static long get500oldalnalHosszabbKonyvekSzama() {
        return konyvek.stream().filter(konyv -> konyv.getPage_count() > 500).count();
    }



    private static void beolvas() throws SQLException {
        Adatbazis db = new Adatbazis();
        konyvek = db.readAllBook();
    }
}
