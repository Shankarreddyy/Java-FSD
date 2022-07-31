package DataStructures;
public class KthSmallEle {
	
static int KthSE(int a[], int l, int r, int k) {
		
		if (k > 0 && k <= r - l + 1) {
			int pos = randomPartition(a, l, r);
			if (pos - l == k - 1)
				return a[pos];//if the index is same as k  then we found the smallest element
			if (pos - l > k - 1)//if index of partitioned element is more then k, then recur for left part,
				return KthSE(a, l, pos - 1, k);
				//changed right=pos-1
			
			return KthSE(a, pos + 1, r, k - pos + l - 1); 
			//if index is less that k then recur only its right part
			//changed left= pos+1
		}
		return Integer.MAX_VALUE;
	}

	static void swaping(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	//adjust value in ascending order
	static int partition(int a[], int l, int r) {
		int x = a[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (a[j] <= x) {
				swaping(a, i, j);
				i++;
			}
		}
		swaping(a, i, r);
		return i; //return index
	}

	//partition
	static int randomPartition(int a[], int l, int r) {
		int n = r - l + 1; //length of aay
		int pivot = (int) (Math.random()) * (n - 1);
		swaping(a, l + pivot, r);
		return partition(a, l, r);
	}

	public static void main(String[] args) {
		
//		KthSmallst ob = new KthSmallst(); 
		
        int a[] = { 50,4,75,8,66,2,45,33,55}; 
        
        int left=0;//first index
        
        int n = a.length;
        
        int right= n-1; //last index
        
        int k = 4; 
//        
        System.out.println("Kth smallest element is "+ KthSE(a, left, right, k)); 
    }
}