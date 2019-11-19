/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author !$#aAn pA$r!Ja
 */
public class removeDuplicate 
{
    private node head;
    private static class node
    {
        private int data;
        private node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    public void display(node head)
    {
        if(head==null)
        {
            return ;
        }
        node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        //System.out.println(current);
        
    }
    
    public void remove()
    {
        if(head==null)
        {
            return ;
        }
        node current=head;
        while(current!=null && current.next!=null)
        {
            if(current.data==current.next.data)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }
    }
    
    
    
    public static void main(String[] args) 
    {
        node head=new node(24);
        node first=new node(24);
        node second=new node(26);
        node third=new node(4);
        node fourth=new node(4);
        
        head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        
        removeDuplicate rd = new removeDuplicate();
        rd.display(head);
        System.out.println();
        rd.remove();
        System.out.println();
        rd.display(head);
        
        
    }
}
