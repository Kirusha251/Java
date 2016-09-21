package by.bstu.achramionok.basejava;

import com.sun.javafx.scene.layout.region.Margins;

import java.math.BigInteger;
import java.util.Random;

import static java.lang.Math.log;
import static java.lang.Math.random;

/**
 @author kirill
 @version 3.2.2
 */
public class JavaTestTepy {
    static int snit;
    final int q=0;
    public final int w=0;
    public static final int e=0;

    public static void main(String[] args) {
/**
 * @return someValuse
 * @param 123
 */
        char cval='a';
        int ival=4;
        short sval=1;
        byte byteVal=0;

        long lval=36;
        boolean bval=false;
        double dval = 2.1;
        String strval = "";
        System.out.println(strval+ival);
        System.out.println(strval+cval);
        System.out.println(strval+ival);
        //byteVal = byteVal +ival;
        //System.out.println(ival = dval + lval);
        lval = ival+2147483647;
        System.out.println(snit);
        bval = bval&&bval;
        bval =bval^bval;
       // bval=bval+bval;


        BigInteger bigInteger = new BigInteger("9223372036854775807");


        char a='a';
        char b='\u0061';
        char c= 97;
        System.out.println("a:"+a+"/b"+b+"/c"+c);
        System.out.println("a+b+c:"+a+b+c);
        System.out.println(3.45%2.4);
        System.out.println(1.0%0.0);
        System.out.println(0.0%0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.min(Math.PI,Math.E));
        Random r= new Random();
        System.out.println(r.nextInt(2));
        Boolean bool = new Boolean(true);
        Character charec = new Character('a');
        Integer inreg = new Integer(2);
        Byte bytee = new Byte("12");
        int [][] matr = new int[10][10];
        String s34 = "3456";
        int aasf = Integer.valueOf(s34);
        int aasff = Integer.parseInt("121");
        Integer.toHexString(1);
        Integer.compare(1,2);
        String s1="12";
        String s2="12";
        if(s1==s2)System.out.print(true);
        s1.equals(s2);
        s1.compareTo(s2);
        WrapperString ws = new WrapperString();
        ws.replace('1','2');
        new WrapperString(){
            public void replace(char oldchar,char newchar){
                System.out.println(oldchar+"-"+newchar);
            }
            public void delete(char del){
                System.out.println(del);
            }
        }.delete('1');

        System.out.println(Long.MAX_VALUE);






    }
}
