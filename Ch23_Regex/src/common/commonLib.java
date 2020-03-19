package common;

public interface commonLib {
	public static String hr(char c, int n)
    {
        StringBuffer content = new StringBuffer();
        for(int i=0; i<n; i++)
        {
            content.append(c);
        }
        return content.toString();
    }

	public static void print_hr(char c, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(c);
        }
        System.out.println();
    }

}
