package segurancadainformacao;

public class CifraCesar {

    public static void main(String[] args){
    	
    	String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String palavra = "ABC";
    	
    	char[] cifra = new char[alfabeto.length()];
    	char[] palavraCripto = new char[palavra.length()];
    	
    	int key = 3;
    	int count = 0;
    	int i = 0;
    	
    	System.out.println(alfabeto.indexOf("B"));
    	
    	while(count <= alfabeto.length() -1) {
    		if(count >= alfabeto.length() - key) {
    			cifra[count] = alfabeto.charAt(i);
    			i++;
    		} else {
    			cifra[count] = alfabeto.charAt(key + count);
    		}
    		System.out.println(cifra);
    		count++;
    	}    	
    }

}


