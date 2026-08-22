class Solution {
    public String multiply(String num1, String num2) {
        java.math.BigInteger a = new java.math.BigInteger(num1);     //biggest Integer
        java.math.BigInteger b = new java.math.BigInteger(num2);    
        java.math.BigInteger c = a.multiply(b);            
        
        return c.toString();

    }
}
//BigInteger is an object not a data type
//so multiply it like an object