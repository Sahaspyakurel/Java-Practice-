import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DsaProjectSorting {

    private JFrame frame;
    private JTextField inputField;
    private JTextField outputField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DsaProjectSorting window = new DsaProjectSorting();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public DsaProjectSorting() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    insertionSwap(arr, j, j - 1);
                } else {

                    break;
                }
            }
        }
    }

    static void insertionSwap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap
            // with correct index

            int last = arr.length - i - 1;
            int maxIndex = selectionGetMaxIndex(arr, 0, last);
            selectionSwap(arr, maxIndex, last);
        }
    }

    static void selectionSwap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int selectionGetMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void bubbleSort(int[] arr) {

        boolean swapped;

        // run the steps n-1 time s
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the end
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than previous item

                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if swap do not occur than it is sorted so break
            if (!swapped) {
                break;
            }
        }
    }

    private void initialize() {
        frame = new JFrame("Sorting Algorithm Program 'Sahas Pyakurel' ");
        frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
        frame.setBounds(120, 120, 460, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        inputField = new JTextField();
        inputField.setBounds(156, 35, 106, 19);
        frame.getContentPane().add(inputField);
        inputField.setColumns(10);

        JLabel enterNumber = new JLabel("Enter number");
        enterNumber.setBounds(21, 36, 100, 20);
        frame.getContentPane().add(enterNumber);

        JLabel selectAlgorithm = new JLabel("Select algorithm");
        selectAlgorithm.setBounds(20, 10, 100, 15);
        frame.getContentPane().add(selectAlgorithm);

        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "Selection Sort", "Insertion Sort", "Bubble Sort" }));
        comboBox.setBounds(156, 8, 111, 21);
        frame.getContentPane().add(comboBox);

        JLabel algoText = new JLabel("");
        algoText.setFont(new Font("Calibri", Font.PLAIN, 12));
        algoText.setBounds(172, 141, 95, 27);
        frame.getContentPane().add(algoText);

        JButton sortButton = new JButton("Sort");
        sortButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String[] input = inputField.getText().split(" ");
                String output = "";
                int[] array = new int[input.length];
                for (int i = 0; i < input.length; i++) {
                    array[i] = Integer.parseInt(input[i]);
                }

                String value = comboBox.getSelectedItem().toString();

                if (value == "Insertion Sort") {

                    insertionSort(array);

                } else if (value == "Selection Sort") {

                    selectionSort(array);

                } else {

                    bubbleSort(array);

                }

                for (int i = 0; i < array.length; i++) {
                    output += array[i] + " ";
                }

                outputField.setText(output);
                algoText.setText(value);

            }
        });
        sortButton.setBounds(165, 60, 105, 30);
        frame.getContentPane().add(sortButton);

        JLabel sortedValue = new JLabel("Sorted value");
        sortedValue.setBounds(20, 105, 85, 15);
        frame.getContentPane().add(sortedValue);

        outputField = new JTextField();
        outputField.setBounds(155, 100, 105, 20);
        frame.getContentPane().add(outputField);
        outputField.setColumns(10);

        JLabel algorithmImpl = new JLabel("Algorithm Implemented");
        algorithmImpl.setBounds(20, 140, 135, 30);
        frame.getContentPane().add(algorithmImpl);

    }
}

