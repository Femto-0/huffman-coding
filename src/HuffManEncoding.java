public class HuffManEncoding {
    public String encoder(String num){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<=num.length()-1;i++){
            if(num.charAt(i)=='P'){
                sb.append("01");
            }else if(num.charAt(i)=='M'){
                sb.append("001");
            }else if(num.charAt(i)=='R'){
                sb.append("100");
            }else if(num.charAt(i)=='Q'){
                sb.append("000");
            }else if(num.charAt(i)=='S'){
                sb.append("101");
            }else if(num.charAt(i)=='E'){
                sb.append("11");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HuffManEncoding hme= new HuffManEncoding();
       System.out.println(hme.encoder("MEMRSQMPPQSEEEQRSMEE"));

    }
}
