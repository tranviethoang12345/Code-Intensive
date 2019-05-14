import game.Vector2D;

import java.util.ArrayList;

public class Employee extends Human {
    public static void main(String[] args) {
//        ArrayList<Vector2D> vectors = new ArrayList<>();
//        // .add(), remove(), size(), get()
//        vectors.add(new Vector2D(1, 2));
//        vectors.add(new Vector2D(3, 5));
//        vectors.add(new Vector2D(4, 3));
//        vectors.add(new Vector2D(6, 10));
//        vectors.add(new Vector2D(2, 9));
//        vectors.add(new Vector2D(2.5, 9));

//        double maxTotal = 0;
//        int indexMax = 0;
//        for (int i = 0; i < vectors.size(); i++) {
//            Vector2D vector = vectors.get(i);
//            if(vector.x + vector.y > maxTotal) {
//                maxTotal = vector.x + vector.y;
//                indexMax = 1;
//            }
//        }
//
//        System.out.println(vectors.get(indexMax).x + " " + vectors.get(indexMax).y);

//        for(Vector2D vector : vectors) {
//            System.out.println(vector.x + " " + vector.y);
//        }

//        for(Vector2D vector : vectors) {
//            if(vector.x == 2){
//                vectors.remove(vector);
//            }
//        }

        try {
            doSomeThing(1);
            doSomeThing(0);
            doSomeThing(-1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
//            ex.printStackTrace();
        }
        System.out.println("continue..");
        System.out.println("continue..");
    }

    public static void doSomeThing(int input) throws Exception{
        if(input > 0){
            System.out.println("okay");
        } else if (input == 0) {
            throw new Exception("Not okay");
        } else {
            System.out.println("okay");
        }

    }
//
//    public static void removeElement(ArrayList list, Object element) {
//        list.remove(element)
//    }
}