package com.company.Basics_of_software_code_development.Сycles;
// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task5 {
    public static void main(String[] args) {
                System.out.print("ASCII символы и коды:\n № символ OCT  HEX\n");
                for (int i = 33; i < 256; i++) {
                    char ch = (char) i;
                    String tempOct = Integer.toOctalString(i);
                    String tempHex = Integer.toHexString(i);
                    System.out.printf("%03d %3s %5s %4s%n", i, ch, tempOct, tempHex);
                }
            }
        }
