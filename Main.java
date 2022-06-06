import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Calculator();
    }
    public  static void Calculator(){
        int turtle=0;
        int rabbit=0;
        char  [] yol={'_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_'};
        do{
            Random rnd = new Random();
            int a = rnd.nextInt(10)+1;

            if (1==a||2==a) {
                rabbit += 0;
                turtle += 3;
                // System.out.println(a);


            }  else if (3==a||a==4) {
                rabbit += 9;
                turtle += 3;
                // System.out.println(a);
            }
            else if (a==5) {
                rabbit =rabbit-12;
                turtle += 3;
                // System.out.println(a);

            }else if (6 == a || a==7) {
                rabbit += 1;
                turtle = turtle- 6;
                //  System.out.println(a);
            } else if (8 == a) {
                rabbit += 1;
                turtle += 1;
                // System.out.println(a);
            } else if (9 == a || a==10) {
                rabbit =rabbit-2;
                turtle += 1;
                // System.out.println(a);
            }
            if (rabbit<0){
                rabbit=1;


            } else if (turtle<0) {
                turtle=1;

            }
            if (turtle==rabbit) {
                // yol[turtle]='O';
                yol[turtle+1]='u';
                yol[turtle+2]='c';
                yol[turtle+3]='h';


            }

            yol[rabbit] = 'R';
            if(turtle!=rabbit){ yol[turtle] = 'T';}
            else yol[turtle]='O';
            System.out.println(yol);

            for(int i =0 ;i<30 ;i++){
                yol[i]='_';
            };

        }
        while(turtle<=20&&rabbit<=20);
        if(turtle>rabbit){
            System.out.println("Turtle win olley"+turtle);
        }
        else if(rabbit>turtle) {
            System.out.println("Rabbit win, yuh!"+rabbit);
        } else
            System.out.println("Draw"+rabbit+turtle);





    }




}