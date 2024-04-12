package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample1 {
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if (destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source dose not fit in dest");
        }
        for (int i = 0; i < source.size(); i++) {
            destination.set(i, source.get(i));
        }
//        Collections.copy(destination,source);
    }

    public static void addAll(ArrayList<String> list,String...strings){
        for (String string : strings) {
            list.add(string);
        }
        Collections.addAll(list,strings);
    }

    public static void replaceAll(ArrayList<String> list,String oldValue,String newValue){
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if(string.equals(oldValue)){
                list.set(i,newValue);
            }
        }
        Collections.replaceAll(list,oldValue,newValue);
    }


}
