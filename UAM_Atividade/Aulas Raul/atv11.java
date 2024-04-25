public class atv11 {
    public static void main(String[] args){
        int count = 100;
        do {
            int rest = count %2;
            if (rest == 0){
                System.out.println(count);
            } else{
                System.out.println(count + " nao e par!!");
            }
            count++;
            
        }while(count <= 200);
    }
}
