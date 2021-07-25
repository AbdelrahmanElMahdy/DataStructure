import java.util.LinkedList;

public class HashTable {
    private class Entery{
        public int key;
        public String value;

        public Entery(int key,String value) {
            this.key = key;
            this.value=value;
        }
    }
    public LinkedList<Entery>[] lst =new LinkedList[5];

        public void put(int key, String value){

            int index=hashFunction(key);

            if(lst[index]==null)
                lst[index]=new LinkedList<>();

            lst[index].add(new Entery(key,value));//here i supposed that user will always supply distinct key but however we should search if that
            // is exist or not and if we will update its value
    }
        public String get(int key){
             String value="not Exist";
              int index=hashFunction(key);
               if(lst[index]==null)
                   throw new NullPointerException("empty key place");

                int current;
                for(current=0 ; current<lst[index].size() ; current++) {
                    if (lst[index].get(current).key == key)
                        return lst[index].get(current).value;
                }

             return value;
    }
        public void remove(int key){
            int index=hashFunction(key);

            if(lst[index]==null)
                throw new NullPointerException("empty key place");

            int current;
                for(current=0 ; current<lst[index].size() ; current++) {
                if (lst[index].get(current).key == key){
                     lst[index].remove(current);
                        break;
                }
    }


}

        private int hashFunction(int key) {
            return key%lst.length;
    }


}
