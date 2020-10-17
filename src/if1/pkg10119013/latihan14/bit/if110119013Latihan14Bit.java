/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan14.bit;

/**
 *
 * @author Fiona Avila
 */


public class if110119013Latihan14Bit {

    public static void main(String[] args) {
        
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 - 0000 1101 */
        int c = 0;
        
        c = a & b;/* 12 = 0000 1100*/
        System.out.println("a & b = " + c);
        
        c = a | b; /* 61 = 0011 1101*/
        System.out.println("a | b = " + c);
        
        c = a ^ b; /* 49 = 1101 0011 */
        System.out.println("a ^ b = " + c);
        
        c = ~a; /* -61 = 1100 0011 */
        System.out.println("~a = " + c);
        
        c = a << 2; /* 240 = 1111 00008 */ 
        System.out.println("a << 2 = " + c);
        
        c = a >> 2; /* 15 = 0000 1111*/
        System.out.println("a >> 2 = " + c);
    }
    
}
