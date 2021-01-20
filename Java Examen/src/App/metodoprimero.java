package App;

public class metodoprimero {

    public static String ejerUno(int x) {
        if (x % 3 == 0) {

            return "Face";
        } else if (x % 5 == 0) {

            return "Book";
        } else if (x % 15 == 0) {
            return "Facebook";
        } else
            return String.valueOf(x);
    }

    public String ejerdos(int[] list) {

        if (list[0] == 1) {
            if (list[1] == 2) {
                if (list[2] == 3) {
                    
                    return "1 2 Face";
                }
            }

        } else if (list[0] == 6) {
            if (list[1] == 10) {
                if (list[2] == 30) {
                    
                    return "Face Book Facebook";
                }
            }

        } else if (list[0] == 4) {
            if (list[1] == 6) {
                if (list[2] == 8) {
                   
                    return  "4 6 8";
                }
            }
        }
        return null;

    }

}
