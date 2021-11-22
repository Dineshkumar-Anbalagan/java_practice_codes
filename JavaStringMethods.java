public class JavaStringMethods {
    public static void main(String[] args){
        String name = "Dinesh";
        boolean result1 = name.equals("dinesh"); // equals ==> comparing by considering cases
        System.out.println(name+" and "+" dinesh "+" = "+result1);
        boolean result2 = name.equalsIgnoreCase("dinesh"); // equalsIgnoreCase ==> comparing without considering cases
        System.out.println(name+" and "+" dinesh "+" = "+result2);
        int name_len = name.length(); // length ==> finding the length of the character
        System.out.println("The length of my name "+name+" is "+name_len);
        char character = name.charAt(0); // charAt ==> it return the char by taking index as an input
        System.out.println("The character present in a location 0 is "+character);
        int index = name.indexOf("i"); // indexOf ==> it returns the index value by taking char as an input. 
        System.out.println("The index of the character 'i' in a name 'Dinesh' is : "+index);
        boolean present = name.isEmpty(); // isEmpty ==> it returns true if a string is empty and vice versa.
        System.out.println("The string name is empty : "+present);
        String upper = name.toUpperCase(); // toUpperCase ==> converts a string to uppercase
        String lower = name.toLowerCase(); // toLowerCase ==> converts a string to lowercase
        System.out.println("uppercased name : "+upper);
        System.out.println("Lowercased name : "+lower);
        String str = "  Dinesh  ";
        String str_trimmed = str.trim(); // trim ==> trims all the empty spaces in a string
        System.out.println("Trimmed string : "+str_trimmed);
        String replace = name.replace("esh", "ijk"); // replace ==> replace old character with a new characters.
        System.out.println("replaced 'esh' in a name with 'ijk' : "+replace);

        /*

            1. name.equals("dinesh")
            2. name.equalsIgnoreCase("dinesh")
            3. name.length()
            4. name.charAt(0)
            5. name.indexOf("i")
            6. name.isEmpty()
            7. name.toUpperCase()
            8. name.toLowerCase
            9. str.trim()
           10. name.replace("esh", "ijk")
        */
    }
    
}
