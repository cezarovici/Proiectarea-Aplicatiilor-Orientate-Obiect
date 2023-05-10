public class Main {
    public static class InvalidRadiusException extends Exception{
        public InvalidRadiusException(){
            System.out.println("Invalid Radius");
        }
    }
    public static class Circle{
       public static int member;
       private double radius ;
       public Circle(double radius) throws InvalidRadiusException {
            this.setRadius(radius);
            member++;
       }
       public void setRadius(double newRadius) throws InvalidRadiusException {
           if (newRadius < 0){
               throw new InvalidRadiusException();
           }
           this.radius = newRadius;
       }

       private double getArea(){
           return Math.PI*(radius*radius);
       }

       private int getNOInstances(){
           return member;
       }

       public void getInfos(){
           System.out.println("Area is: "+getArea());
           System.out.println("There are "+getNOInstances()+" circles");
       }
   }
    public static class Binary{
        private int value;
        public  Binary( String binaryString) throws NumberFormatException{
            try{
                value = Integer.parseInt(binaryString,2);
            }
            catch (NumberFormatException e){
                System.out.println("invalid string, not binary");
            }
        }
        public void print(){
            System.out.println("Value is: "+value);
        }
    }


   public static void main(String []args) throws InvalidRadiusException {
//       try{
//           Circle cerc1 = new Circle(2);
//           Circle cerc2 = new Circle(-4);
//           Circle cerc3 = new Circle(6);
//
//           cerc1.getInfos();
//           cerc2.getInfos();
//           cerc3.getInfos();
//       }
//       catch (InvalidRadiusException exception){
//           System.out.println("Am prins exceptia");
//       }

       Binary binary = new Binary("10101010");
       binary.print();
       Binary binar1 = new Binary("101");
       binar1.print();
       Binary binar2 = new Binary("102");
       binar2.print();
   }
}