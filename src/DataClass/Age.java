/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass;

/**
 *
 * @author RYP
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red = "\u001B[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return getYearNow() - getYearBirth();
    }
    
    public String tandanyaKamu(int umur){
        if (umur>=0 && umur<=5){
            return red+"LAGI LUCU-LUCUNYA";
        } else if (umur>=5 && umur<=10){
            return red+"MASIH ANAK-ANAK";
          } else if (umur>=10 && umur<=13){
                return red+"MASIH REMAJA";
            } else if (umur>=13 && umur<=19){
                return red+"ALAY";
              } else if (umur>=19 && umur<=29){
                    return red+"LAGI GALAU NYARI JODOH";
                } else if (umur>=29 && umur<=35){
                    return red+"LAGI SIBUK NYARI UANG";
                  } else if (umur>=35 && umur<=150){
                        return red+"SUDAH TUA";
                     } else {
                        return red+"TIDAK TERDETEKSI DI KEHIDUPAN";
                       }
    }
}
