package javapractice;

public interface INode<K> {
    K getkey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);



}