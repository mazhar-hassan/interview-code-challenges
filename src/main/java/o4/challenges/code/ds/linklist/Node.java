package o4.challenges.code.ds.linklist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Node {
    private int data;
    private Node next;
    public static int count = 0;

    {
        count = count + 1;
    }


    public boolean hasNext() {
        return next != null;
    }
}
