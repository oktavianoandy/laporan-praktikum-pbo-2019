package andy.percobaan2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList1841720002Andy {

    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println(mListCountry);
        System.out.format("List index 0 = %s\n", mListCountry.get(0));
        System.out.format("List index 2 = %s\n", mListCountry.get(2));
        
        //penambahan kode program pada bagian pertanyaan
//        System.out.println(mListCountry);
//        Iterator mIterator = mListCountry.iterator();
//        while(mIterator.hasNext()){
//            Object element = mIterator.next();
//            System.out.format("%s ",element);
//        }
    }
}
