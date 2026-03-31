public class Main {
    public static void main(String[] args) {
        //यामध्ये आपण class, method किंवा interface मध्ये type parameter (<T>) वापरतो.
        //Generics म्हणजे Java मधील एक feature आहे ज्यामुळे आपण type-safe (प्रकार सुरक्षित) आणि reusable (पुन्हा वापरता येणारा) code लिहू शकतो.


        Product<String, Double> product = new Product<>("apple",0.50);

        System.out.println(product.getPrices());
        System.out.println(product.getItems());
    }
}
