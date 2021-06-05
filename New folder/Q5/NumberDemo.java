class  NumberDemo
{
    public static void main(String args[])
    {
        try {
            int num =      Integer.parseInt ("ejaz") ;              
			System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
