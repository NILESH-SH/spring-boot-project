package com.project.health_logistics_management.user.config;

public class CustomHashingPassword {

    // Custom reversible hash function
    public static String customHash(String input) {
        StringBuilder hashedString = new StringBuilder();
        for (char c : input.toCharArray()) {
            hashedString.append((char) (c + 1)); // Simple shift by 1 for demonstration
        }
        return hashedString.toString();
    }

    // Custom reversible decode function
    public static String customDecode(String hashedInput) {
        StringBuilder originalString = new StringBuilder();
        for (char c : hashedInput.toCharArray()) {
            originalString.append((char) (c - 1)); // Reverse the shift
        }
        return originalString.toString();
    }

    // public static void main(String[] args) {
    //     String input = "Hello, World!";
    //     String hashedString = customHash(input);
    //     String decodedString = customDecode(hashedString);

    //     System.out.println("Input: " + input);
    //     System.out.println("Hashed String: " + hashedString);
    //     System.out.println("Decoded String: " + decodedString);
    // }
}


// public class SimpleHashingExample {

//     public static void main(String[] args) {
        // String input = "Hello, World!";
        // int hashCode = input.hashCode();
        // System.out.println("Input: " + input);
        // System.out.println("Hash Code: " + hashCode);
        // System.out.println("Decode: "+String.valueOf(input));

//         String input = "Hello, World!";
//         int hashCode = input.hashCode();
//         String hashCodeString = String.valueOf(hashCode);
        
//         System.out.println("Input: " + input);
//         System.out.println("Hash Code: " + hashCodeString);
//     }
// }
