    
public class pijiu {
	public static void main(String[] args){
		int i=99;
				do{if(i>2){
					System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer\nTake one down\npass it around\n"+(i-1)+" bottles of beer on the wall\n");
					--i;
					}else if(i==2){
					System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer\nTake one down\npass it around\n"+(i-1)+" bottle of beer on the wall\n");
					--i;
					}else{
					System.out.println(i+" bottle of beer on the wall,"+i+" bottle of beer\nTake one down\npass it around\n"+(i-1)+" bottle of beer on the wall\n\nNo more bottles of beer on the wall");
					--i;
				}
			}while(i>0);
		}
}