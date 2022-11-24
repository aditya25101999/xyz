//NOTE-----ARRAYLIST AUR LINKED LIST BILKUL SAME HOTA BS KUCH EK DO FUNCTIONS USME JYADA HOTA HAI
// JAISE ADDLAST ADDFIRST NHI HOTA ETC

/*

LINKED LIST MEIN SARA ELEMENTS EK DUSRE SE JURA HOTA HAI TO 5TH ELEMNT KO ACCESS KRNE K LIYE
 PEHLA DUSRA TEESRA SE HOTE HUE 5VE TK PAHUCHNE PADEGA SO TIME TAKING HAI JBKI
 ARRAYLIST MEIN SEEDHE 100 WA ELEMENT V CALL KIYA JA SKTA HAI WO INDIVIDUAL HOTA HAI

 // PEHLE SE BNE HUE LINKED LIST MEIN BEECH M AGAR ADD KRNA PDA TO EASILY HO JATA HAI BAANKI ELEMENTS
  KO AAGE SHIFT NHI KRNA PDTA HAI JO KI ARRAYLIST MEIN KRNA PADTA HAI
*/

/*

Linked lists are preferred over the Array list because the insertion & deletion in the linked lists
 can be done in a constant time. But, in arrays, if we want to add or delete an element in between then,
  we need to shift all the other elements.
In a linked list, it is impossible to directly access an element because we need to traverse the whole
 linked list to get the desired element.
 */
import java.util.*;

public class  cwh15_LINKEDLIST {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();    //CREATING AN LINKEDLIST
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);        //ADDING ELEMENT TO THE ARRAYLIST L2
        l2.add(18);
        l2.add(19);
// AB TK KA L2 YE BNA 15, 18, 19
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        // AB TK KA L1 YE BNA 6, 7, 4, 6

        l1.add(0, 5);  //ADDING ELEMENT AT A SPECIFIED POSITION HERE AT 0TH POSITION
        // AUR ISKE PEHLE JO JO ELEMENTS ADD HUE HAI WO EK EK POSITION AAGE SHIFT HO JAEGA APNE AAP

        // NOW L1== 5,6,7,4,6
        l1.add(0, 1);  // PHIRSE ZEROTH POSITION PR 1 ADD HUA

        // NOW L1== 1,5,6,7,4,6

        l1.addAll(0, l2); //AB PURA KA PURA L2 L1 K SHURU MEIN ADD HO JAEGA

        //NOW L1==15, 18, 19,1,5,6,7,4,6
        l1.addLast(676); // AT THE END 676 ADD HO JAEGA
        l1.addFirst(788);// AT THE BEGINING ADD HO JAEGA

        //NOW L1==788, 15, 18, 19,1,5,6,7,4,6, 676
        System.out.println(l1.contains(27)); // WILL CHECKIF THE ELEMENT IS PRESENT OR NOT
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
        l1.set(1, 566);
        // NOW SET KA USE KRTE HAI TO JIS POSITION PR WO ADD KR RAHE HAI USKO REPLACE KR DEGA
        // PURANA WALA K UPAR OVERWRITE KR DEGA YA USKOHTA KR NAYA WALA AA JAEGA

        //NOW L1==788,566, 18, 19,1,5,6,7,4,6, 676

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)); // YHI METHOD USE KRTE HAI ITH ELEMNT KO PRINT KRNE K LIYE
            System.out.print(", ");
        }
    }
}
