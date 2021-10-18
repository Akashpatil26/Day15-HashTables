package javapractice;

import org.testng.annotations.Test;

import java.util.Locale;

public class MyHashMapTest {
    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency(){
        String sentence ="To be or not to be ";
        MyHashMap<String , Integer> myHashMap=new MyHashMap();
        String[] words = sentence.toLowerCase().split("");
        for (String word: words) {
            Integer value=myHashMap.get(word);
            if (value==null)value=1;
            else value=value+1;
            myHashMap.add(word,value);

        }
    }


}
