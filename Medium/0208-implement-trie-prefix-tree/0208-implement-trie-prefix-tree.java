class Trie {

    List<String> storage;
    
    public Trie() {
        //initialize the trie object
        storage = new ArrayList<>();
    }
    
    public void insert(String word) {
        //inserts the string word into the trie
        storage.add(word);
    }
    
    public boolean search(String word) {
        //return true if the word is in the trie, and false otherwise
        for(String value: storage){
            if(value.equals(word))
                return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        //returns true if there is a previously inserted 'word' that has the 'prefix', and false otherwise
        for(String value: storage){
            if(value.startsWith(prefix))
                return true;
        }
        return false;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */