public class weight {
    public static void main(String args[]){
        int weight = 40;// weight of the entrant who wants to join the agency
        if (weight < 40) {
            System.out.println("You are approved");
        }else if( weight >= 40 && weight < 45){
            // entrants with weight between 40-45 are approved
            System.out.println(" You're approved");
        }else if (weight >=45 && weight > 50){
            // entrants with weight between 45-50 are approved
            System.out.println("You're approved");
        }else if (weight >= 50 && weight < 60){
            // entrants with weight between 50-60 are approved
            System.out.println("You're approved");
        }else {
            System.out.println("You're not allowed");
            // entrants with weight not mentioned above are not allowed orapproved
        }
    }
    
}
