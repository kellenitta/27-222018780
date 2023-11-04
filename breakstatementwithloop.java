public class breakstatementwithloop {
    public static void main(String[] args) {
        for(int weight= 40;weight<=60;weight++){
            // weight is 40 while the weight cannot go above 60 to be approved
            if(weight==50){
                // Incase weight is 50
                break;
            }
            System.out.println("you're approved");
        }
    }
}
