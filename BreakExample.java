public class BreakExample {
    public static void main(String[] args) {

        //break and continue example
        int i=0;
        while(true){   //infinite time run rakhxa
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;    //condition satisfy vayo vani loop bata baira niskinxa
            }

        }
    }
}
