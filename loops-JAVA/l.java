public class l {
    public static void main(String[] args) {
        // for loops ,do while loop ,while loops 
        //1.do while loop : first code then write conditon it execute atleast once..
        int i=1;
        do{
            System.out.println("hii");
            i++;
        }while(i>5); // it prints atleast once so ouput will be 1.hii ifu use i<5 then ouput is loops of hii
        //other way to wrtie do while loop in java is while(true)
       int p = 1;
       while (true) {
        System.out.println("nani");
        p++;
        if (p> 3) {
            break;
        }
    }
 
        /*
           while(true){
            System.out.println("kannah"); // infinite loop 
        } 

         */
        int x=4;

        while(x<=8){
            System.out.println("kannah "+x);
            x++;
        }
        System.out.println("end of loop "); // always runs in loop else condition
       
        //nested while loop
        int r=1;
        while(r<4){
            System.out.println("l1: " +r);
            int m=1;
            while(m<=3){
                System.out.println("LOOP2: "+m);
                m++;
            }
            r++;
        }

        // FOR LOOP 
        for(int o=1;o<5;o++){
            System.out.println("DAY  "+o);
            for(int h=9;h<18;h++){
                System.out.println(" "+(h) + "-" + (h+1));
            }
        }
    }
    
}
