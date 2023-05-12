package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int birth_mounth,birth_day;
        String horoscope = "";
        boolean isError = false;

        System.out.print("Doğum ayınızı giriniz : ");
        birth_mounth = input.nextInt();

        System.out.print("Doğum gününüzü giriniz : ");
        birth_day = input.nextInt();

        switch (birth_mounth) {
            case 1 :
                if ((birth_day >= 1 )&&(birth_day <= 31)){
                    if (birth_day < 22){
                        horoscope = "Oğlak";
                    }else {
                        horoscope = "Kova";
                    }
                }else {
                    isError = true;
                }
                break;
            case 2 :
                if ((birth_day >= 1 )&&(birth_day <= 28)){
                    if (birth_day < 20){
                        horoscope = "Kova";
                    }else {
                        horoscope = "Balık";
                    }
                }else {
                    isError = true;
                }
                break;
            case 3 :
                if ((birth_day >= 1 )&&(birth_day <= 30)){
                    if (birth_day < 20){
                        horoscope = "Balık";
                    }else {
                        horoscope = "Koç";
                    }
                }else {
                    isError = true;
                }
                break;
            case 4 :
                if ((birth_day >= 1 )&&(birth_day <= 31)){
                    if (birth_day < 21){
                        horoscope = "Koç";
                    }else {
                        horoscope = "Boğa";
                    }
                }else {
                    isError = true;
                }
                break;
            case 5 :
                if ((birth_day >= 1 )&&(birth_day <= 30)){
                    if (birth_day < 21){
                        horoscope = "Boğa";
                    }else {
                        horoscope = "İkizler";
                    }
                }else {
                    isError = true;
                }
                break;
            case 6 :
                if ((birth_day >= 1 )&&(birth_day <= 31)){
                    if (birth_day < 22){
                        horoscope = "İkizler";
                    }else {
                        horoscope = "Yengeç";
                    }
                }else {
                    isError = true;
                }
                break;
            case 7 :
                if ((birth_day >= 1 )&&(birth_day <= 30)){
                    if (birth_day < 23){
                        horoscope = "Yengeç";
                    }else {
                        horoscope = "Aslan";
                    }
                }else {
                    isError = true;
                }
                break;
            case 8 :
                if ((birth_day >= 1 )&&(birth_day <= 31)){
                    if (birth_day < 23){
                        horoscope = "Aslan";
                    }else {
                        horoscope = "Başak";
                    }
                }else {
                    isError = true;
                }
                break;
            case 9 :
                if ((birth_day >= 1 )&&(birth_day <= 30)){
                    if (birth_day < 23){
                        horoscope = "Başak";
                    }else {
                        horoscope = "Terazi";
                    }
                }else {
                    isError = true;
                }
                break;
            case 10 :
                if ((birth_day >= 1 )&&(birth_day <= 31)){
                    if (birth_day < 23){
                        horoscope = "Terazi";
                    }else {
                        horoscope = "Akrep";
                    }
                }else {
                    isError = true;
                }
                break;
            case 11 :
                if ((birth_day >= 1 )&&(birth_day <= 30)){
                    if (birth_day < 23){
                        horoscope = "Akrep";
                    }else {
                        horoscope = "Yay";
                    }
                }else {
                    isError = true;
                }
                break;
            case 12 :
                if ((birth_day >= 1 )&&(birth_day <= 31)){
                    if (birth_day < 22){
                        horoscope = "Yay";
                    }else {
                        horoscope = "Oğlak";
                    }
                }else {
                    isError = true;
                }
                break;
            default:
                isError= true;
        }
        if (isError){
            System.out.println("Hatalı işlem yaptınız");
        }else {
            System.out.println("Burcunuz "+ horoscope);
        }

}
}