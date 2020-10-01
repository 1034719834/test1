import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception,NumberFormatException{
       /* InputStream is = System.in;
        int l;
        byte[] by = new byte[1024];
        while((l=is.read(by))>0){
            String str = new String(by,0,l-1);
            if(str!=null && str!=""&& str.length()<3){
                int n=Integer.valueOf(str);
                System.out.println(get(n));
            }

        }*/

        int n = 59; // 空瓶
        int keh=0; // 汽水数
        while(n>2){
            int y=n/3;//汽水
            keh += n/3;
            n= n-3*y+y;//剩余空瓶数
            if(n==2){
                keh +=1;
                break;
            }
        }
        System.out.println(keh);
    }

}
