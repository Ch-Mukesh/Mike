public class Test {
    public static void main(String[] args) {
        outer:for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                if( i == 4 ) break outer;
                System.out.println(i+":i j:"+j);
            }
        }
    }
}
