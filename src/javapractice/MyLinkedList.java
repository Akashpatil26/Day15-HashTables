package javapractice;

public class MyLinkedList {
    public INode head;
    public INode tail;


    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void add(INode<K> newNode) {
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else {
            INode<K> tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);

        }
    }
    public void append(INode<K> myNode){
        if (this.head==null){
            this.head=myNode;
        }
        if(this.tail==null){
            this.tail=myNode;
        }else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    public void insert(INode myNode , INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode<K> search(K key){
        INode<K> tempNode =head;
        while (tempNode!=null && tempNode.getNext()!=null){
            if (tempNode.getkey().equals(key)){
                return tempNode;
            }
            tempNode=tempNode.getNext();
        }
        return null;
    }

    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode=head;
        while(tempNode.getNext() !=null){
            myNodes.append(tempNode.getkey());
            if (!tempNode.equals(tail)) myNodes.append("-->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getkey());
        System.out.println(myNodes);
    }
    public String toString(){
        return "MyLinkedListNodes{" +head+'}';
    }


}
