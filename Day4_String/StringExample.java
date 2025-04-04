public class StringExample {  // Đổi tên lớp thành StringExample
    public static void main(String[] args) {
        // String Manipulation (Xử lý chuỗi)**
        String morning = "Good Morning";
        System.out.println(morning);

        String night = new String("\nGood Night");
        System.out.println(night);

        String firstName = "Phan";
        String lastName = " Vinh Phu";
        System.out.println("\nMy full name is " + firstName + lastName);

        // length()
        String quote = "to be or not to be";
        int length = quote.length();
        System.out.println("\nThe length of " + quote + " is " + length);
    
        // charAt()
        char firstChar = quote.charAt(0);
        System.out.println("\nChar at index 0 : " + firstChar);
    
        // **3. So sánh chuỗi (String Comparison)**

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("java");

        // Comparing the reference
        System.out.println("\nComparing " + str1 + " and " + str2 + " using == " + (str1 == str2));
        System.out.println("\nComparing " + str1 + " and " + str3 + " using == " + (str1 == str3));
    
        // Comparing the value
        System.out.println("\nComparing " + str1 + " and " + str2 + " using equals " + (str1.equals(str2)));
        System.out.println("\nComparing " + str1 + " and " + str3 + " using equals " + (str1.equals(str3)));
        
        // Comparing the value ignore the case sensitivity
        System.out.println("\nComparing " + str1 + " and " + str4 + " using equalsIgnoreCase " + (str1.equalsIgnoreCase(str4)));

        
    }
}
