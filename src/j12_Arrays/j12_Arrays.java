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
        System.out.println(Arrays.toString(temp.split(",")));
        //bu da boyle bisey iste
        }
    }

