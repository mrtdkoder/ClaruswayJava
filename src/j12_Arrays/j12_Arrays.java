package j12_Arrays;

import java.util.Arrays;

public class j12_Arrays {
    public static void main(String[] args) {
        String[] isimArr = {"John", "Janexxxx", "Marxxxxy", "Mike", "ali"};
        String temp = "";
        for (int i=0; i < isimArr.length; i++) {
            if(isimArr[i].length() > 5){
                temp += isimArr[i] +",";
            }
        }
        String tempStr = Arrays.toString(temp.split(","));
        System.out.println(tempStr); // Print
        //bu da boyle bisey iste
        }
    }

