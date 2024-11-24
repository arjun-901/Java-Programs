class Rectangle { // Corrected class name
    int width, length; // Declaration of instance variables

    void getData(int x, int y) { // Method to set dimensions
        length = x;
        width = y;
    }

    int rectArea() { // Method to calculate and return area
        return length * width;
    }
}

class createmethod { // Class containing the main method
    public static void main(String[] args) { // Main method starts here
        Rectangle rect1 = new Rectangle(); // Instantiate first rectangle
        Rectangle rect2 = new Rectangle(); // Instantiate second rectangle

        // Set dimensions for rect1
        rect1.getData(10, 20);
        // Calculate area using rectArea method
        int area1 = rect1.rectArea(); 
        System.out.println("Area of rect1: " + area1); // Output for rect1

        // Set dimensions for rect2 and calculate its area
        rect2.getData(5, 15);
        int area2 = rect2.rectArea();
        System.out.println("Area of rect2: " + area2); // Output for rect2
    }
}
