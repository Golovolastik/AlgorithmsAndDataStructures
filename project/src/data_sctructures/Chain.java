package data_sctructures;

class Chain {
    int element;
    Chain next;

    public Chain(int element, Chain next){
        this.element = element;
        this.next = next;
    }

    public void add(int element, Chain head){
        Chain temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Chain(element, null);
    }

    public void printChain(Chain head){
        Chain temp = head;
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
