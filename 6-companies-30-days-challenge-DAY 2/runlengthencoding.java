/*
 Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.
 */

class GfG {
    String encode(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                encodedString.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        encodedString.append(str.charAt(str.length() - 1)).append(count);

        return encodedString.toString();
    }
}