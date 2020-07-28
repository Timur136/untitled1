package StructuriDannihBazoviyCourse;

class DynamicArray {
    private int[] items;

    private int size = 0;

    public DynamicArray(int length) {
        items = new int[length];
    }

    public DynamicArray() {
        items = new int[0];
    }

    public String Print() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += items[i] + " ";
        }

        return result;
    }

    public int GetCount() {
        return size;
    }

    public int Get(int index) {
        if (index >= size || index < 0) {
            throw new Error("Индекс находится за пределами массива.");
        }

        return items[index];
    }

    public int Find(int key) {
        for (int i = 0; i < size; i++) {
            if (items[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private void IncreaseArray() {
        int newCount = size * 2;
        if (size == 0) {
            newCount = 4;
        }

        int[] newArray = new int[newCount];
        for (int i = 0; i < size; i++) {
            newArray[i] = items[i];
        }
        items = newArray;
    }

    public void PushBack(int item) {
        if (size == items.length) {
            IncreaseArray();
        }
        items[size] = item;
        size++;
    }

    public void Insert(int index, int item) {
        if (index < 0 || index > size) {
            throw new Error("Выход за пределами массива");
        }
        if (size == items.length) {
            IncreaseArray();
        }
        // сдвигаем все элементы вправо до нужного индекса
        for (int i = size - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        items[index] = item;
        size++;
    }

    public void PushFront(int item) {
        Insert(0, item);
    }

    public void PushBackRange(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (size == items.length) {
                IncreaseArray();
            }
            items[size] = array[i];
            size++;
        }
    }

    public void InsertRange(int index, int[] array) {
        size += array.length;
        if (index < 0 || index > size) {
            throw new Error("Выход за пределами массива");
        }
        for (int i = size - 1 - array.length; i >= index; i--) {
            items[i + array.length] = items[i];
        }
        for (int i = 0; i < array.length; i++) {
            items[index] = array[i];
            index++;
        }
        size++;
    }

    public void RemoveByIndex(int index) {
        if (size == 0) {
            throw new Error("Массив пустой!");
        }
        if (index < 0 || index >= size) {
            throw new Error("Выход за пределами массива");
        }
        for (int i = index + 1; i < size; i++) {
            items[i - 1] = items[i];
        }
        size--;
    }

    public boolean Remove(int item) {
        for (int i = 0; i < items.length; i++) {
            if (item == items[i]) {
                RemoveByIndex(i);
                return true;
            }
        }
        return false;
    }
}
