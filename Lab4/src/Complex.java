public class Complex {
    private float real,imaginar;
    Complex(){
        real = imaginar = 0;
    }

    Complex(float Real,float Imaginar){
        this.real = Real;
        this.imaginar = Imaginar;
    }

    public void Add(Complex x1){
            this.real += x1.real;
            this.imaginar += x1.imaginar;
    }

    public void Multiply(Complex x1){
        Complex res = new Complex();

        res.real = this.real * x1.real - this.imaginar*x1.imaginar;
        res.imaginar = this.real * x1.imaginar + this.imaginar*x1.real;

        this.real = res.real;
        this.imaginar = res.imaginar;
    }

    public void RaiseTo(int power){
        while(power--!=1){
            this.Multiply(this);
        }
    }

    public boolean Equals(Complex x1){
        return (this.real == x1.real && this.imaginar == x1.imaginar);
    }

    @Override
    public String toString() {
        return ("Real = "+ real+ " Imaginar = "+ imaginar);
    }
}
