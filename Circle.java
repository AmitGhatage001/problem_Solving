package classes_and_Objects;

class Circle {
    // Define properties here

    float r;
    // Define constructor here
    Circle(float r){
        this.r=r;
    }

    float perimeter(){
        // Complete the function
        float peri=(float)(2*3.14*r);

        return peri;
    }

    float area(){
        // Complete the function
        float are=3.14f*r*r;

        return are;
    }
}


