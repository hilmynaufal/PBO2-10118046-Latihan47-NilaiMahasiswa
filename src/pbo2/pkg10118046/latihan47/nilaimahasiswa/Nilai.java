/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan47.nilaimahasiswa;

/**
 *
 * @author ASUS
 */
public class Nilai {
    private double quiz, uts, uas;

    public Nilai(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
    
    public double hitungNilaiAkhir(double quiz, double uts, double uas) {
        return quiz*0.2 + uts*0.3 + uas*0.5;
    }
    
    public char tampilIndex(double na) {
        if (na>=80) return 'A';
        else if ((na>=68) && (na<=80)) return 'B';
        else if ((na>=56) && (na<=68)) return 'C';
        else if ((na>=45) && (na<=56)) return 'D';
        else return 'E';
    }
    
    public String tampilKeterangan(char index) {
        switch (index) {
            case 'A':
                return "Sangat Baik";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            default:
                return "Sangat Kurang";
        }
        
    }
}
