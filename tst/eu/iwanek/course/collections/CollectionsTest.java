package eu.iwanek.course.collections;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * Created by Wojtek on 28/10/2015.
 */
public class CollectionsTest {
    @Test
    public void test1() throws Exception {
        Collection<String> set = new HashSet<>();
        Collection<String> list = new LinkedList<>();

        // TODO: Add Strings: "a", "a", "b" to list

        // TODO: Add to set all elements from list

        assertThat(list, contains("a", "a", "b"));
        // TODO: Create assert for set
    }

    @Test
    public void test2() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // TODO: Implement isEven()
        list.removeIf(this::isEven);

        assertThat(list, contains(1, 3, 5));

        // TODO: add 2 and 4 to list

        assertThat(list, containsInAnyOrder(1, 2, 3, 4, 5));

        // TODO: Implement removing even numbers using lambda expression
        list.removeIf(integer -> false);

        assertThat(list, contains(1, 3, 5));
    }

    @Test
    public void test3() throws Exception {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        // TODO: Initialize properly
        Collection<String> upper = null;

        // TODO: Rewrite items from list to upper and convert them to upper case (there is method in String class to convert to upper case)
        //list.forEach(s -> );

        assertThat(upper, contains("A", "B", "C"));

    }

    private boolean isEven(int val) {
        return false;
    }
}
