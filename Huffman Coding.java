import java.util.*;

// Node class for Huffman Tree
class HuffmanNode implements Comparable<HuffmanNode> {
    char ch;
    int freq;
    HuffmanNode left, right;

    public HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        this.left = this.right = null;
    }

    // Compare nodes based on frequency (for priority queue)
    public int compareTo(HuffmanNode other) {
        return this.freq - other.freq;
    }
}

public class HuffmanEncoding {
    // Generate Huffman Codes (Recursive function)
    public static void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCode) {
        if (root == null) return;

        // If it's a leaf node, store the character and its code
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.ch, code);
        }

        generateCodes(root.left, code + "0", huffmanCode);
        generateCodes(root.right, code + "1", huffmanCode);
    }

    // Build Huffman Tree and generate codes
    public static Map<Character, String> buildHuffmanTree(String text) {
        // Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Priority Queue (Min-Heap) for building Huffman Tree
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        // Build the Huffman Tree
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            // Create a new internal node with combined frequency
            HuffmanNode parent = new HuffmanNode('-', left.freq + right.freq);
            parent.left = left;
            parent.right = right;

            pq.add(parent);
        }

        // Root of the Huffman Tree
        HuffmanNode root = pq.poll();

        // Generate Huffman Codes
        Map<Character, String> huffmanCode = new HashMap<>();
        generateCodes(root, "", huffmanCode);

        return huffmanCode;
    }

    // Encode the input text using Huffman Codes
    public static String encode(String text, Map<Character, String> huffmanCode) {
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(huffmanCode.get(c));
        }
        return encodedText.toString();
    }

    // Decode the encoded string back to original text
    public static String decode(String encodedText, Map<Character, String> huffmanCode) {
        // Reverse the Huffman Code map
        Map<String, Character> reverseHuffmanCode = new HashMap<>();
        for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
            reverseHuffmanCode.put(entry.getValue(), entry.getKey());
        }

        StringBuilder decodedText = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char bit : encodedText.toCharArray()) {
            temp.append(bit);
            if (reverseHuffmanCode.containsKey(temp.toString())) {
                decodedText.append(reverseHuffmanCode.get(temp.toString()));
                temp.setLength(0); // Clear the temp buffer
            }
        }
        return decodedText.toString();
    }

    public static void main(String[] args) {
        String text = "hello huffman";

        // Build Huffman Tree and generate codes
        Map<Character, String> huffmanCode = buildHuffmanTree(text);

        // Print Huffman Codes
        System.out.println("Huffman Codes:");
        for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Encode the text
        String encodedText = encode(text, huffmanCode);
        System.out.println("\nEncoded Text: " + encodedText);

        // Decode back to original text
        String decodedText = decode(encodedText, huffmanCode);
        System.out.println("\nDecoded Text: " + decodedText);
    }
}
