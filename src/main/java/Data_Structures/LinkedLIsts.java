package Data_Structures;

import java.util.*;
import java.util.function.Predicate;

public class LinkedLIsts {
private final LinkedList<String> linkedList;
private final PriorityQueue<String> myPriority;
private  final Scanner scanner = new Scanner(System.in);
public LinkedLIsts(){
    linkedList= new LinkedList<>();
    myPriority = new PriorityQueue<>();
}
/*
private void init_List(){
    linkedList.add(1);
    linkedList.add(2);

}

public void updatePos(int value,int pos,int update_value){
    init_List();
    System.out.println("This is the order of priority "+myPriority.removeIf(Predicate.isEqual("a")));
    linkedList.add(pos,value);

    System.out.println(myPriority);
    linkedList.set(pos,update_value);
    System.out.println(linkedList);
}
*/

            /**********************TESTING THE LINKED LIST WITH A NAME MANAGEMENT PROGRAM**************************/
public void hud(){
    System.out.println("Choose Option: press any other key to list names,[d] list in descending order ,[n]o duplicate list, [a]dd Name,[m]any to add, [u]pdate Name, [r]emove Name, [e]nd,");
    String opt = scanner.next();
    try {

        if (opt.equals("a")) {
            System.out.println("Enter name");
            String name = scanner.next();
            addName(name);
        } else if (opt.equals("u")) {
            System.out.println("Enter Old name");
            String oldName = scanner.next();
            System.out.println("Enter New name");
            String newName = scanner.next();
            updateName(oldName, newName);
        } else if (opt.equals("r")) {
            System.out.println("Enter name to remove");
            String nameToRemove = scanner.next();
            removeName(nameToRemove);
        } else if (opt.equals("m")) {
            System.out.println("Enter total number of names to add");
            int totalNames = scanner.nextInt();
            ArrayList<String> nameList = new ArrayList<>();
            while (nameList.size() != totalNames) {
                System.out.println("Enter list of names");
                String collectionName = scanner.next();
                nameList.add(collectionName);
            }
            addMany(nameList);
        } else if (opt.equals("d")) {
            descendingOrderList();
        } else if (opt.equals("n")) {
            System.out.println("Enter duplicate name");
            String duplicateName = scanner.next();
            removeDuplicate(duplicateName);
        } else if (opt.equals("e")) {
            System.exit(0);
        } else {
            System.out.println("List of Names: " + linkedList);
            hud();
        }
    } catch(InputMismatchException e){
        System.err.println("invalid input");
        hud();
        throw new RuntimeException(e);
    }
}
private void addName(String name){
    linkedList.add(name);
    System.out.println("Name added");
    hud();
}
private void removeName(String name){
    linkedList.remove(name);
    System.out.println("Name removed");
    hud();}
private void updateName(String oldName, String newName){

    try {
        linkedList.set(linkedList.indexOf(oldName),newName);
        System.out.println("Name updated");
        hud();
    } catch (IndexOutOfBoundsException e) {
        System.err.println("invalid Name");
        hud();
        throw new RuntimeException(e);
    }
}
private void viewAll(){
    System.out.println(linkedList);
    hud();
}
private void addMany(Collection<String> manyNames){
  try {
      if (linkedList.addAll(manyNames)){
          System.out.println("Names added");
          hud();
      }
      else {
          System.out.println("No names added");
          hud();
      }
  }catch (NullPointerException e){
      System.err.println("Names failed to add list emp");
      hud();
      throw new RuntimeException(e);
  }
}
private void descendingOrderList(){
    Collection<String> listOfDescendingElements = new LinkedList<>();
    Iterator<String> descendingList = linkedList.descendingIterator();
    while (descendingList.hasNext()) {
        listOfDescendingElements.add(descendingList.next());
    }
    System.out.println(listOfDescendingElements);
        hud();
}
private void removeDuplicate(String duplicateName){
     Iterator<String> It = linkedList.iterator();
     Collection<String> noDuplicateList = new LinkedList<>();
     Collection<String> duplicateList = new LinkedList<>();
     while (It.hasNext()){
         String duplicateListElement = It.next();
         noDuplicateList.add(duplicateListElement);
     }
    Iterator<String> removeIt = noDuplicateList.iterator();
    while(removeIt.hasNext()) {
        String removeDuplicate = removeIt.next();
        if (removeDuplicate.equals(duplicateName) || removeDuplicate.equals(duplicateName.toLowerCase()) || removeDuplicate.equals(duplicateName.toUpperCase())) {
            removeIt.remove();
            duplicateList.add(removeDuplicate);
        }
    }
     System.out.println(noDuplicateList);
    System.out.println("Duplicates: "+duplicateList);
     hud();
}
}
