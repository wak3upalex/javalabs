import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection <Chordal> test1 = Arrays.asList(new Lynx(),
                new Manul(),
                new CommonHedgehog(),
                new Manul(),
                new CommonHedgehog());

        Collection <Chordal> test2 = Arrays.asList(new Lynx(),
                new Manul(),
                new Feline());

        Collection <Chordal> test3 = Arrays.asList(new CommonHedgehog(),
                new CommonHedgehog());

        Collection<Hedgehog> animal1 = new ArrayList<>();
        Collection<Feline> animal2 = new ArrayList<>();
        Collection<Predatory> animal3 = new ArrayList<>();

        segregate(test1, animal1, animal2, animal3);
        System.out.println("Type 1: " + animal1.size());
        System.out.println("Type 2: " + animal2.size());
        System.out.println("Type 3: " + animal3.size());
    }

    static public void segregate(Collection<? extends Chordal> src,
                                 Collection<? super CommonHedgehog> collection1, //почему type CommonHedgehog
                                 Collection<? super Manul> collection2,
                                 Collection<? super Lynx> collection3)
    {
        for (Chordal animal : src) {
            if (animal instanceof CommonHedgehog)
                collection1.add((CommonHedgehog) animal);
            if (animal instanceof Manul)
                collection2.add((Manul) animal);
            if (animal instanceof Lynx)
                collection3.add((Lynx) animal);
        }
    }
}