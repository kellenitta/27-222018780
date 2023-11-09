class academicyear{
    void year(){
        System.out.println("2023/2024");   
    }
    }
     class academicyear extends course{
        void genre(){
            System.out.println("BIT");
        }
    }
     class regnumber extends course{
        void idade(){
            System.out.println("222018780");
        }
     }
     interface keva{
        void IK();
     }
     class t extends academicyear implements keva{
    public void IK(){
        System.out.println("UR student");
    }
    }
    public class inheritance{
        public static void main(String[] args) {
            course I = new academicyear();
            I.year();
            I.genre();
            I.idade();
            
    
            
    
        }
    }

