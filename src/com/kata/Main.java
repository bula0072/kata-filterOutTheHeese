package com.kata;

public class Main {

    public static void main(String[] args) {
	String sample[] = new String[]{"Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"};
	String filter[] = new String[]{"African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"};
	String newArray[] = gooseFilter(sample, filter);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static String[] gooseFilter(String[] geese, String[] filter){
        int buffer = 0;
        for(int i = 0; i < geese.length; i++){
            for (int j = 0; j < filter.length; j++) {
                if(geese[i].equals(filter[j])){
                    geese[i] = "";
                    buffer++;
                }
            }
        }
        String tmp[] = new String[geese.length - buffer];
        int j = 0;

        for (int i = 0; i < geese.length; i++) {
            if(!geese[i].isEmpty())
                tmp[j++] = geese[i];
        }


        return tmp;
    }
}
