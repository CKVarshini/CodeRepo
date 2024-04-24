/*
 Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.

 

Example 1:

Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.
Example 2:

Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
Example 3:

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 

Constraints:

1 <= path.length <= 3000
path consists of English letters, digits, period '.', slash '/' or '_'.
path is a valid absolute Unix path.
 */

//Method 1: Using Stack

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for (String str : p) {
            if (!str.isEmpty() && str.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop(); // Pop the previous directory if stack is not empty
                }
            } else if (!str.equals("") && !str.equals(".")) {
                s.push(str); // Push valid directory names onto the stack
            }
        }
        
        // Build the simplified path from the elements remaining in the stack
        while (!s.isEmpty()) {
            res.insert(0, "/" + s.pop());
        }
        
        // If the stack is empty, return "/"
        if (res.length() == 0) {
            return "/";
        }
        
        return res.toString();
    }
}


/*Method 2 : Using Deque 

class Solution {
    public String simplifyPath(String path) {
        Deque<String> s = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for(String str : p){
            if(!str.isEmpty() && str.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (!str.isEmpty() && !str.equals(".")) {
                s.push(str);
            }
        }
        
        while(!s.isEmpty()) {
            res.append("/").append(s.pollLast());
        }
        
        return res.length() == 0 ? "/" : res.toString();
    }
}
*/



