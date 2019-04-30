//Kyle Peterson and Lance Graham

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BinarySearch
 */
@WebServlet("/BinarySearch")
public class BinarySearch extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BinarySearch() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    public static boolean binarySearch(int[] numArray, int numSearch) {
    // Public static boolean method that takes in an int array and an int variable

        int numStart = 0;
        // Initializes numStart as an int and sets it to 0
        
        int numEnd = numArray.length - 1;
        // Initializes numEnd as an int and sets it to numArray.length - 1 to determin the length of the 
        // array


        while (numStart <= numEnd) {
        // While loop that loops through while numStart is less than or equal to numEnd
        	
            int numMiddle = (numStart + numEnd) / 2;
            // Initializes numMiddle as an int and sets it (numStart + numEnd) / 2 to find the middle of
            // numArray

            if (numArray[numMiddle] == numSearch) {
            // If statement to determine if the number at numArray[numMiddle] is equal to numSearch
            	
                return true;
                // If statement is true it returns true
                
            }            
            
            else if (numArray[numMiddle] < numSearch) {
            // Else if statement to determine if the number at numArray[numMiddle] is less than numSearch
            	
                numStart = numMiddle + 1;
            	// If statement is true it sets numStart to numMiddle + 1
                
            }

            else if (numArray[numMiddle] > numSearch) {
            // Else if statement that determines if the number at numArray[numMiddle] is greater than
            // numSearch
            	
                numEnd = numMiddle - 1;
            	// If statement is true it set numEnd to numMiddle - 1
                
            }
            
        }
        
         return false;
        // Returns false if numSearch wasn't found in numArray
        
    }

    public static void numberSwap(int numOne, int numTwo, int[] numArray) {
        // A public static void method that takes in two ints and an int array into the parameters

        int temp = numArray[numOne];
        // temp initialized as an int and set to the number at the index of numArray[numOne]

        numArray[numOne] = numArray[numTwo];
        // Sets the number at numArray[numOne] to the number at numArray[numTwo]

        numArray[numTwo] = temp;
        // Sets numArray[numTwo] to what was stored in temp effectively swapping numbers from
        // numArray[numOne] to numArray[numTwo] and vice versa

    }

    public static void sorting(int[] numArray) {
        // A public static void method that takes in an int array

        int l = numArray.length;
        // Initializes l as an int and sets it to the length of numArray

        int m;
        // Initializes m as an int but doesn't set it to anything

        for (int n = l; n >= 0; n--) {
            // For loop that initializes n as an int and sets it to l, argument is set to n >= 0, and
            // counts n down one for each time it loops through

            for (int i = 0; i < l - 1; i++) {
                // A nested for loop that initializes i as an int and sets it to 0, sets argument to i < l -1,
                // and counts i up one each time it loops through

                m = i + 1;
                // Sets m equal to i + 1

                if (numArray[i] > numArray[m]) {
                    // If statement that determines if numArray[i] is greater than numArray[m] if it returns
                    // true it runs through the statement

                    numberSwap(i, m, numArray);
                    // Calls numerSwap to switch the numbers at i and m in the array


                }

            }

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Initializes out as a PrintWriter to allow messages to be printed out to the webpage

        out.println("<h4>\n" +
                "    <a href=\"${pageContext.request.contextPath}/index.jsp\">[Home]</a>\n" +
                "\t<a href=\"${pageContext.request.contextPath}/RecursiveAdd.jsp\">[Triangular Number Calculator]</a>\n" +
                "\t<a href=\"${pageContext.request.contextPath}/RecursiveMult.jsp\">[Factorial Calculator]</a>\n" +
                "    <a href=\"${pageContext.request.contextPath}/BinarySearch.jsp\">[Binary Search]</a>\n" +
                "\t<a href=\"${pageContext.request.contextPath}/Calculator.jsp\">[Simple Math Calculator]</a>\n" +
                "\t<a href=\"${pageContext.request.contextPath}/Queue.jsp\">[Queue Implementation]</a>\n" +
                "</h4>");

        String oneSequence = request.getParameter("arr1");//save the numbers input by user as a string
        String[] arr = oneSequence.split(",");//save the numbers entered into an array, they will be split on a comma
        int[] numbers = new int[arr.length];//initialize new int array equal to the string array length
        for (int x = 0; x < arr.length; x++) {
            numbers[x] = Integer.parseInt(arr[x]);//save the string numbers from the string arr into the int array numbers as ints
        }
        out.print("<h1>You entered these unsorted numbers: </h1>");//print out the unsorted numbers to the web app
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                out.println(numbers[i]);
            } else {
                out.print(numbers[i] + ", ");
            }

        }
        out.println("<h1>The sorting method has sorted your numbers: </h1>");//print out the sorted numbers to the web app
        sorting(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                out.println(numbers[i]);
            } else {
                out.print(numbers[i] + ", ");
            }

        }

        int searchNum = Integer.parseInt(request.getParameter("number"));//get the search number inputed by the user
        out.println("<h1>The number was found: </h1>");
        out.println(binarySearch(numbers, searchNum));//call binarSearch method that returns true or false depending whether the element was in the array


    }

}
