class Node {
    
    public Node prev;
    public Node next;
    public final String url;
    
    public Node(final String url) {
      this.url = url;
  }
}

class BrowserHistory {

    private Node curr;
    
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    //adding new URl to the history
    public void visit(String url) {
        curr.next = new Node(url);
        
        curr.next.prev = curr;
        
        curr = curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev != null && steps-- > 0){
            curr = curr.prev;
        }
        return curr.url;
        
    }
    
    public String forward(int steps) {
        while(curr.next != null && steps-- > 0){
            curr = curr.next;
        }
        
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */