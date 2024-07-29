package Exercise2;

public class SearchAlgorithms {
    public static Product linerSearch(Product [] products,int targetId){
        for(int i=0;i<products.length;i++){
            if(products[i].ProductId==targetId){
                return products[i];
            }
        }
        return null;
    }
    public static Product binarySearch(Product[]products, int targetId){
        int low = 0;
        int high = products.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(products[mid].ProductId == targetId){
                return products[mid];
            }
            else if(products[mid].ProductId < targetId){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return null;
    }
}
