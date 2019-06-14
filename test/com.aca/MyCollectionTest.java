package com.aca;

public class MyCollectionTest {
    private static MyCollection<Integer> values = new MyCollection<>();

    public static void main(String[] args) {
        MyCollectionTest ob = new MyCollectionTest();

        ob.testAddValue(10);
        ob.testAddValue(2);
        ob.testAddValue(-1);
        ob.testAddValue(2, 4);
        ob.testAddValue(10);
        ob.testAddValue(11);

        ob.testGet(0, 10);
        ob.testGet(4, 11);

        ob.testContains(-1);
        ob.testContains(4);

        ob.testRemove(10);
        ob.testRemoveAtIndex(0, 2);

        ob.testToString();
    }

    private void testAddValue(Integer value) {
        values.add(value);
        assert values.contains(value);
    }

    private void testAddValue(Integer index, Integer value) {
        values.add(index, value);
        assert values.get(index).equals(value);
    }

    private void testGet(Integer index, Integer expected) {
        assert values.get(index).equals(expected);
    }

    private void testContains(Integer value) {
        assert values.contains(value);
    }

    private void testRemove(Integer value) {
        values.remove(value);
        assert !values.contains(value);
    }

    private void testRemoveAtIndex(int index, Integer expected) {
        Integer temp = values.get(index);
        values.remove(index);
        assert !values.contains(temp);
        assert values.size() < index || !values.get(index).equals(expected);
    }

    private void testToString() {
        assert values.toString().equals("4, -1, 11");
    }
}
