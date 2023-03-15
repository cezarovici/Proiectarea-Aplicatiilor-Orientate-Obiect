public class Stack {
    private int[] vector;
    private int top;

      Stack(){
         top = 0;
         vector = new int[100];
      }

      Stack(int length){
          this.vector = new int[length];
          top = 0;
      }

      public void Push(int element){
          if (top < (vector.length-1)){
          vector[top++] = element;
          }
      }

      public int Pop(){
          if (!this.IsEmpty()) {
              int val = vector[top];

              vector[top--] = 0;
              return val;
          }

          return 0;
      }

      public boolean IsEmpty(){
          return top==0;
      }

      public void Print(){
          for (int i = 0 ; i < top; i++){
              System.out.println(vector[i]);
          }
      }

}
