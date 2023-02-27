// 3.*Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class Ex_03HeapSort {
    public static void main(String[] args) {
        int[] array = {14, 11, 9, 5, 12, 7};
        int n = array.length;
        System.out.print("Исходный массив: \n");
        printArray(array);

        Ex_03HeapSort ob = new Ex_03HeapSort();
        ob.sort(array);

        System.out.print("Отсортированный массив: \n");
        printArray(array);
    }

    // Вывод массива
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    // Преобразование в двоичную кучу поддерева с корневым узлом i,
    // индексом в arr[]. n - размер кучи
    static void heapify(int arr[], int n, int i) {
        int largest = i; // Считаем, что в корне максимальный элемент
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2
        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        // Если правый дочерний элемент больше корня
        if (r < n && arr[l] > arr[largest]) {
            largest = r;
        }
        // Если самый большой элемент не корень
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
    // Реализация пирамидальной сортировки
    static void sort(int arr[]){
        int n = arr.length;
        // Строим кучу
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }
}
