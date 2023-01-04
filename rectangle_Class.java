package classes_and_Objects;

class Rectangle {
    // Define properties here

    int l;
    int b;
    // Define constructor here
    Rectangle(int l , int b){
        this.l=l;
        this.b=b;
    }

    int perimeter(){
        // Complete the function
        int peri=2*(l+b);
        return peri;
    }

    int area(){
        // Complete the function
        int are=l*b;
        return are;
    }
}

/*
    Rectangle a = new Rectangle(2, 3)  // Length = 2, Breadth = 3
	a.perimeter() // Should give 10
    a.area() // Should give 6
*/
